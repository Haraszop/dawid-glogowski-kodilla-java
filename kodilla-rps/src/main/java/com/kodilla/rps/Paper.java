package com.kodilla.rps;

public class Paper implements Pick{

    public String getPickName() {
        return "Zagrywa 2 - Paper";
    }

    @Override
    public String toString() {
        return getPickName();
    }
}