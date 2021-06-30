package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoqa.com/")
public class TextBoxPage extends PageObject {

    public By clickElements = By.xpath("//*[text()='Elements']");
    public By clickTextBox = By.xpath("//*[text()='Text Box']");
    public By userName = By.id("userName");
    public By email = By.id("userEmail");
    public By currentAddress = By.id("currentAddress");
    public By permanentAddress = By.id("permanentAddress");
    public By clickButton = By.id("submit");


    public void setUserName(String string) {
        getDriver().findElement(userName).sendKeys(string);
    }

    public void setEmail(String string) {
        getDriver().findElement(email).sendKeys(string);
    }

    public void setCurrentAddress(String string) {
        getDriver().findElement(currentAddress).sendKeys(string);
    }

    public void setPermanentAddress(String string) {
        getDriver().findElement(permanentAddress).sendKeys(string);
    }
}
