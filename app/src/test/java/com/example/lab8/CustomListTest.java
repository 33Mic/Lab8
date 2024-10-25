package com.example.lab8;


import static org.junit.jupiter.api.Assertions.*;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList MockCityList() {
        return new CustomList(null, new ArrayList<>());

    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should be 0 before adding cities");

        City cityToAdd = new City("Edmonton", "Alberta");
        list.addCity(cityToAdd);

        // Check that the count has been incremented after adding a city
        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "Count should be 1 after adding a city");
    }

    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        City cityToAdd = new City("Edmonton", "Alberta");

        assertFalse(list.hasCity(cityToAdd), "List should not contain the city before adding it");

        list.addCity(cityToAdd);
        assertTrue(list.hasCity(cityToAdd), "List should contain the city after adding it");
    }
}
