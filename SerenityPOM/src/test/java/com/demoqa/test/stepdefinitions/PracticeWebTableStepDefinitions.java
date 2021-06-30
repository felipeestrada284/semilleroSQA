package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.WebTableSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PracticeWebTableStepDefinitions {

    @Steps
    WebTableSteps webTableSteps;

    @Given("^that a web user to practice web table in demoqa$")
    public void thatAWebUserToPracticeWebTableInDemoqa() {
        webTableSteps.openBrowser();
    }

    @When("^he fills all the requested fields in web table sections$")
    public void heFillsAllTheRequestedFieldsInWebTableSections() throws InterruptedException{
        webTableSteps.fillFieldsInWebTable();
        webTableSteps.newUser();
    }

    @Then("^He should see the registered users in the table$")
    public void heShouldSeeTheRegisteredUsersInTheTable() {
    }

}
