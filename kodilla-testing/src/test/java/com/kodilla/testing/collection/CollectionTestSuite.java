package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;


import java.util.*;

public class CollectionTestSuite {


    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test case:  end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }


    @DisplayName("when create empty list,"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given

        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);

    }

    @DisplayName("when create normal list, " + "then result list should be equal to expected result list")

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> normalList = Arrays.asList(31,22,54,22,11,44,130);


        List<Integer>expectedResultList = Arrays.asList(22,54,22,44,130);

        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}
