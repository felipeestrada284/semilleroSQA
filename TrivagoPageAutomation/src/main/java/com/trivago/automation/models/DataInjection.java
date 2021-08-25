package com.trivago.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("es-Es"));

    private String cityOrigin, cityDestination,adult;

    public DataInjection(){
        this.cityOrigin = "Medellin";
        this.cityDestination = "Cartagena";
        this.adult = "2";
    }

    public String getCityOrigin() {
        return cityOrigin;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public String getAdult() {
        return adult;
    }
}
