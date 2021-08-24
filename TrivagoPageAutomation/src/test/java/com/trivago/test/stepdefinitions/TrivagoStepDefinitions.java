package com.trivago.test.stepdefinitions;

import com.trivago.automation.interactions.OpenBrowser;
import com.trivago.automation.ui.ReservationTrivagoPage;
import cucumber.api.PendingException;
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

public class TrivagoStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Felipe").can(BrowseTheWeb.with(driver));
    }


    @Given("^the user enters the trivago page$")
    public void theUserEntersTheTrivagoPage() {
        theActorInTheSpotlight().attemptsTo(OpenBrowser.on(ReservationTrivagoPage.URL));
    }

    @When("^he will make a reservation on the page for a round trip flight$")
    public void heWillMakeAReservationOnThePageForARoundTripFlight() {
    }

    @Then("^he must validate that the reservation was made correctly with the data entered$")
    public void heMustValidateThatTheReservationWasMadeCorrectlyWithTheDataEntered() {
    }
}
