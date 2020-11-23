package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator (234,324);

        System.out.println("Test - pierwszy test jednostkowy");

        int result1 = calculator.add();

        if (result1 == (234 + 324)) {
            System.out.println("test 1 OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test- drugie test jednostkowy");

        int result2 = calculator.subtract();

        if (result2 == (234 - 324)) {
            System.out.println("test 2 OK");
        } else {
            System.out.println("Error!");
        }

    }
}