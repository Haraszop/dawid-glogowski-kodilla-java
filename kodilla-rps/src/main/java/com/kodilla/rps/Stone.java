package com.kodilla.rps;

public class Stone implements Pick {
    //String name;
    public String getPickName() {
        return "Zagrywa 1 - Stone";
    }

    @Override
    public String toString() {
        return getPickName();
    }
}