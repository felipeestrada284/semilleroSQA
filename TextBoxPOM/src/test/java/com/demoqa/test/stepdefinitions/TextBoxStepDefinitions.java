package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.TextBoxPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TextBoxStepDefinitions {

    @Steps
    TextBoxPageSteps textBoxPageSteps;

    @Given("^that a web user wants to practice text box in demoqa$")
    public void thatAWebUserWantsToPracticeTextBoxInDemoqa() {
        textBoxPageSteps.openBrowser();
    }

    @When("^he fills all the requested fields in text box section$")
    public void heFillsAllTheRequestedFieldsInTextBoxSection() throws InterruptedException {
        textBoxPageSteps.registerInTextBoxPage();
    }

    @Then("^he should see him data down\\.$")
    public void heShouldSeeHimDataDown() {
    }
}
