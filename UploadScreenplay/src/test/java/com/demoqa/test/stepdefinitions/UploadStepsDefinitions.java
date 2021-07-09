package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.OpenBrowser;
import com.demoqa.automation.tasks.UploadFile;
import com.demoqa.automation.ui.UploadPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UploadStepsDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Felipe").can(BrowseTheWeb.with(driver));
    }

    @Given("^practice upload file$")
    public void practiceUploadFile() {
        theActorInTheSpotlight().attemptsTo(OpenBrowser.on(UploadPage.URL));
    }

    @When("^upload the file in page$")
    public void uploadTheFileInPage() {
        theActorInTheSpotlight().attemptsTo(UploadFile.fileUpload());
    }

    @Then("^see the uploaded file$")
    public void seeTheUploadedFile() {
    }
}
