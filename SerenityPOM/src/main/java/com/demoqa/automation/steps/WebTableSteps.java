package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.WebTablePage;
import com.demoqa.automation.utils.Javascript;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import java.util.concurrent.TimeUnit;

public class WebTableSteps {

    WebTablePage webTablePage = new WebTablePage();
    DataInjection dataInjection = new DataInjection();
    public static String lastName, email, age, salary, department;

    @Step
    public void openBrowser(){
        webTablePage.open();
    }

    @Step
    public void fillFieldsInWebTable() throws InterruptedException {

        webTablePage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Javascript.clickJS(webTablePage.getDriver(), webTablePage.elementsClick);
        Thread.sleep(2000);
        Javascript.clickJS(webTablePage.getDriver(), webTablePage.webTablesClick);
        webTablePage.clickAdd();
        webTablePage.setFirstName(dataInjection.getFirstName());
        webTablePage.setLastName(dataInjection.getLastName());
        webTablePage.setEmail(dataInjection.getEmail());
        webTablePage.setAge(dataInjection.getAge());
        webTablePage.setSalary(dataInjection.getSalary());
        webTablePage.setDepartment(dataInjection.getDepartment());
        webTablePage.clickButton();

    }


    @Step
    public void validationsWebTablePage(){
        webTablePage.validationLastName(dataInjection.getLastName());
        webTablePage.validationAge(dataInjection.getAge());
        webTablePage.validationEmail(dataInjection.getEmail());
        webTablePage.validationSalary(dataInjection.getSalary());
        webTablePage.validationDepartment(dataInjection.getDepartment());
    }

    @Step
    public void newUser() throws InterruptedException {
        webTablePage.clickAdd();
        webTablePage.setFirstName(dataInjection.getFirstName());
        webTablePage.setLastName(dataInjection.getLastName());
        webTablePage.setEmail(dataInjection.getEmail());
        webTablePage.setAge(dataInjection.getAge());
        webTablePage.setSalary(dataInjection.getSalary());
        webTablePage.setDepartment(dataInjection.getDepartment());
        webTablePage.clickButton();
    }
}
