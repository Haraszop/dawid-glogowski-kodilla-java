package com.kodilla.rps;

public class Scissors implements Pick {
    public String getPickName() {
        return "Zagrywa 3 - Scissors";
    }

    @Override
    public String toString() {
        return getPickName();
    }

}