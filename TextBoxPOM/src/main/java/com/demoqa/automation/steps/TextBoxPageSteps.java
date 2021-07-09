package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.TextBoxPage;
import com.demoqa.automation.utils.Javascript;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TextBoxPageSteps {

    TextBoxPage textBoxPage = new TextBoxPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser(){
        textBoxPage.open();
    }

    @Step
    public void registerInTextBoxPage() throws InterruptedException {

        textBoxPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(textBoxPage.getDriver(), 2);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(textBoxPage.clickElements, "Elements"));

        Javascript.clickJS(textBoxPage.getDriver(), textBoxPage.clickElements);
        Javascript.clickJS(textBoxPage.getDriver(), textBoxPage.clickTextBox);
        textBoxPage.setUserName(dataInjection.getName());
        textBoxPage.setEmail(dataInjection.getEmail());
        textBoxPage.setCurrentAddress(dataInjection.getCurrentAddress());
        textBoxPage.setPermanentAddress(dataInjection.getPermanentAddress());
        Javascript.clickJS(textBoxPage.getDriver(), textBoxPage.clickButton);
        Thread.sleep(5000);

    }
}
