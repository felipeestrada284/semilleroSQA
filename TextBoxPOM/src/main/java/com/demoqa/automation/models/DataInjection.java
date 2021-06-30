package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("es-Es"));

    private String name, email, currentAddress, permanentAddress;

    public DataInjection() {
        this.name = faker.name().name();
        this.email = faker.internet().emailAddress();
        this.currentAddress = faker.address().streetAddress();
        this.permanentAddress = faker.address().fullAddress();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
}
