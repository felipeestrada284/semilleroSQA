package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("es-Es"));

    private String firstName, lastName, email, mobile, birthday, subjects, path, currentAddress, selectState, selectCity,
            filepathExcel, userDataExcel, fakerScreenshot, excelScreenshot, settingScreenshot;



    public DataInjection() {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobile = faker.phoneNumber().subscriberNumber(10);
        this.birthday = "18-jul-1995";
        this.subjects = "Commerce";
        this.path = "C:\\Users\\felip\\Pictures\\Saved Pictures\\flip.jpg";
        this.currentAddress = faker.address().streetAddress();
        this.selectState = "Haryana";
        this.selectCity = "Panipat";
        this.filepathExcel = "resources/ExcelUserData.xlsx";
        this.userDataExcel = "userData";
        this.fakerScreenshot = "C:\\Users\\felip\\Desktop\\TestAutmoation\\ScreenplayPractice\\faker.jpg";
        this.excelScreenshot = "C:\\Users\\felip\\Desktop\\TestAutmoation\\ScreenplayPractice\\excel.jpg";
        this.settingScreenshot = "C:\\Users\\felip\\Desktop\\TestAutmoation\\ScreenplayPractice\\setting.jpg";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getPath(){
        return path;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getSelectState() {
        return selectState;
    }

    public String getSelectCity() {
        return selectCity;
    }

    public String getFilepathExcel() {
        return filepathExcel;
    }

    public String getUserDataExcel() {
        return userDataExcel;
    }

    public String getFakerScreenshot() {
        return fakerScreenshot;
    }

    public String getExcelScreenshot() {
        return excelScreenshot;
    }

    public String getSettingScreenshot() {
        return settingScreenshot;
    }
}
