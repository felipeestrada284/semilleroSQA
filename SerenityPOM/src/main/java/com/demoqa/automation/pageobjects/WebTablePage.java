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

    public By lastNameValidation = By.xpath("//div[3]//div[4]//div[1]//div[2]");
    public By ageValidation = By.xpath("//div[3]//div[4]//div[1]//div[3]");
    public By emailValidation =By.xpath("//div[3]//div[4]//div[1]//div[4]");
    public By salaryValidation = By.xpath("//div[3]//div[4]//div[1]//div[5]");
    public By departmentValidation = By.xpath("//div[3]//div[4]//div[1]//div[6]");



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

    public void validationLastName(String expectedString) {
        assertEquals(getDriver().findElement(lastNameValidation).getText(), expectedString);
    }
    public void validationAge(String expectedString){

        assertEquals(getDriver().findElement(ageValidation).getText(), expectedString);
    }
    public void validationEmail(String expectedString){
        assertEquals(getDriver().findElement(emailValidation).getText(), expectedString);
    }
    public void validationSalary(String expectedString){
        assertEquals(getDriver().findElement(salaryValidation).getText(), expectedString);
    }
    public void validationDepartment(String expectedString){
        assertEquals(getDriver().findElement(departmentValidation).getText(), expectedString);
    }


}
