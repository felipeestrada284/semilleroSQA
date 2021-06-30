package com.demoqa.automation.models;

import com.github.javafaker.Faker;
import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("en-US"));

    private String firstName, lastName, email, age, salary, department;

    public DataInjection() {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.age = String.valueOf(faker.number().numberBetween(18, 70));
        this.salary = String.valueOf(faker.random().nextInt(1500,3500));
        this.department = faker.country().capital();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
