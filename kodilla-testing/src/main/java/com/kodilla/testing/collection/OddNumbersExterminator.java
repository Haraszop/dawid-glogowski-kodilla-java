package com.kodilla.testing.collection;


import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        ArrayList<Integer>oddNumbersList = new ArrayList<>();

        for(int number : numbers){
            if (number%2==0){
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}
