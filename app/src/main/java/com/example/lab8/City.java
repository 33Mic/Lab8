package com.example.lab8;

public class City implements Comparable<City>{

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares two cities based on their names
     * @param city
     *  the new city to compare against the original city
     * @return
     *  an integer indicating the order of the cities (-1, 0, 1)
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName()); // compare city names
    }
}
