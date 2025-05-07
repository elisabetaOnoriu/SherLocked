package com.example.SherLocked.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Suspect extends PersonInvolved {
    private String Description;
    private List<Evidence> evidence;

}
