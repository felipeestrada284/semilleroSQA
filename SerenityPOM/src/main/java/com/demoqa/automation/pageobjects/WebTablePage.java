package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import static org.junit.Assert.*;

@DefaultUrl("https://www.demoqa.com")
public class WebTablePage extends PageObject {

    public By elementsClick = By.xpath("//*[text()='Elements']");
    public By webTablesClick = By.xpath("//*[text()='Web Tables']");
    public By addClick = By.id("addNewRecordButton");

    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By emailInput = By.id("userEmail");
    public By ageInput = By.id("age");
    public By salaryInput = By.id("salary");
    public By departmentInput = By.id("department");
    public By buttonSubmit = By.id("submit");



    public void clickAdd(){
        getDriver().findElement(addClick).click();
    }
    public void setFirstName(String string) {
        getDriver().findElement(firstNameInput).sendKeys(string);
    }
    public void setLastName(String string) {
        getDriver().findElement(lastNameInput).sendKeys(string);
    }
    public void setEmail(String string) {
        getDriver().findElement(emailInput).sendKeys(string);
    }
    public void setAge(String string) {
        getDriver().findElement(ageInput).sendKeys(string);
    }
    public void setSalary(String string) {
        getDriver().findElement(salaryInput).sendKeys(string);
    }
    public void setDepartment(String string) {
        getDriver().findElement(departmentInput).sendKeys(string);
    }
    public void clickButton(){
        getDriver().findElement(buttonSubmit).click();
    }

    public void validationsUser(String expectedString){
        assertEquals(getDriver().findElement(firstNameInput).isDisplayed(), expectedString);
    }

}
