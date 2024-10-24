package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList MockCityList() {
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;

    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should be 0 before adding cities");

        City cityToAdd = new City("Edmonton", "Alberta");
        list.add(cityToAdd);

        // Check that the count has been incremented after adding a city
        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "Count should be 1 after adding a city");
    }
}
