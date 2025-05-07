package com.example.SherLocked.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Case {
    String title;
    String description;
    @Id
    int id;
    @Enumerated(EnumType.STRING)
    Status status;

    @OneToMany(mappedBy = "relatedCase", cascade = CascadeType.ALL)
    List<Suspect> suspects;

    @OneToMany(mappedBy = "relatedCase", cascade = CascadeType.ALL)
    List<Evidence> evidence;
    String country;
    String town;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
