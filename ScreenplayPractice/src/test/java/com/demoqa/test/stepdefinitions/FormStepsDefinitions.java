package com.demoqa.test.stepdefinitions;


import com.demoqa.automation.interactions.OpenBrowser;
import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.tasks.*;
import com.demoqa.automation.ui.StudentFormPage;
import com.demoqa.automation.utils.Screenshot;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormStepsDefinitions {

    DataInjection dataInjection = new DataInjection();

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Felipe").can(BrowseTheWeb.with(driver));
    }

    @Given("^the student wants to practice forms on the demoqa page$")
    public void theStudentWantsToPracticeFormsOnTheDemoqaPage() {
        theActorInTheSpotlight().attemptsTo(OpenBrowser.on(StudentFormPage.URL));
    }

    @When("^He must fill in all the fields of the form$")
    public void heMustFillInAllTheFieldsOfTheForm() throws IOException {
        theActorInTheSpotlight().attemptsTo(FillFormFields.completeForm());
        Screenshot.screenshotValidation(driver, dataInjection.getFakerScreenshot());
    }

    @When("^He must fill in all the fields of the form with the excel data$")
    public void heMustFillInAllTheFieldsOfTheFormWithTheExcelData() throws IOException {
        theActorInTheSpotlight().attemptsTo(FillFormFieldsWithExcel.completeFormExcel());
        Screenshot.screenshotValidation(driver, dataInjection.getExcelScreenshot());
    }

    @When("^He must fill in all the fields of the form with setting properties$")
    public void heMustFillInAllTheFieldsOfTheFormWithSettingProperties() throws IOException {
        theActorInTheSpotlight().attemptsTo(StudentRegistrationForm.studentRegister());
        Screenshot.screenshotValidation(driver, dataInjection.getSettingScreenshot());
    }

    @Then("^He should see the form with the data entered with faker$")
    public void heShouldSeeTheFormWithTheDataEnteredWithFaker() {
        theActorInTheSpotlight().attemptsTo(FillFieldsFakerValidation.fakerValidation());
    }

    @Then("^He should see the form with the data entered with excel$")
    public void heShouldSeeTheFormWithTheDataEnteredWithExcel() {
        theActorInTheSpotlight().attemptsTo(FillFieldsExcelValidation.validationExcel());
    }

    @Then("^He should see the form with the data entered$")
    public void heShouldSeeTheFormWithTheDataEntered() {
        theActorInTheSpotlight().attemptsTo(StudentRegistrationValidation.validationStudent());
    }
}
