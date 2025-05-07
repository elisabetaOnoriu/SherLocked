package com.example.SherLocked.Entity;

public enum BloodType {
    A_POS('+'),
    A_NEG('-'),
    B_POS('+'),
    B_NEG('-'),
    AB_POS('+'),
    AB_NEG('-'),
    O_POS('+'),
    O_NEG('-');

    private final char rh;

    BloodType(char rh) {
        this.rh = rh;
    }

    public char getRh() {
        return rh;
    }
}
