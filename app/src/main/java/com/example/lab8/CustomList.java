package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    public int getCount(){
        return cities.size();
    }

    public void addCity(City city){
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *  Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a city is in the list
     * @param city
     *   the city to check against the list of cities
     * @return
     *  Return boolean indicating if the city is in the list
     */
    public boolean hasCity(City city){
        List<City> cityList = getCities();
        for(int i = 0; i < cityList.size(); i++) {
            if(cityList.get(i).getCityName().equals(city.getCityName()) && cityList.get(i).getProvinceName().equals(city.getProvinceName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * This removes a city from the list
     */
    public int removeCity(City city) {
        List<City> cityList = getCities();

        for(int i = 0; i < cityList.size(); i++) {
            if(cityList.get(i).getCityName().equals(city.getCityName()) && cityList.get(i).getProvinceName().equals(city.getProvinceName())) {
                cityList.remove(i);
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * This returns how many cities are in the list
     */
    public int countCities() {
        return cities.size();
    }


}
