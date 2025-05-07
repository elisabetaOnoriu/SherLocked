package com.example.SherLocked.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Evidence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "case_id")
    private Case relatedCase;
}

