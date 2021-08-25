package com.trivago.automation.tasks;

import com.trivago.automation.models.DataInjection;
import com.trivago.automation.ui.ReservationTrivagoPage;
import cucumber.api.java.et.Ja;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFieldsOnThePage implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                JavaScriptClick.on(ReservationTrivagoPage.ONE_WAY_BUTTON),
                Enter.theValue(dataInjection.getCityOrigin()).into(ReservationTrivagoPage.ORIGEN_INPUT),
                Enter.theValue(dataInjection.getCityDestination()).into(ReservationTrivagoPage.DESTINATION_INPUT),
                //Enter.keyValues(Keys.ENTER).into(ReservationTrivagoPage.DESTINATION_INPUT),
                //JavaScriptClick.on(ReservationTrivagoPage.DEPARTURE_DATE_CLICk),
                //JavaScriptClick.on(ReservationTrivagoPage.DEPARTURE_DATE_INPUT),
                JavaScriptClick.on(ReservationTrivagoPage.ADULT_INPUT),
                Enter.theValue(dataInjection.getAdult()).into(ReservationTrivagoPage.ADULT_INPUT)

        );

    }

    public static FillFieldsOnThePage completeForm(){
        return instrumented(FillFieldsOnThePage.class);
    }

}
