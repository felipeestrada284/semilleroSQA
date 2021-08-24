package com.trivago.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationTrivagoPage {

    public static String URL = "https://www.tiquetesbaratos.com/";
    private static final Target ORIGEN_INPUT = Target.the("origen").located(By.id("ptags1"));
    private static final Target DESTINATION_INPUT = Target.the("destination").located(By.id("ptags2"));
    private static final Target DEPARTURE_DATE_INPUT = Target.the("").located(By.id("from"));
    private static final Target RETURN_DATE_INPUT = Target.the("").located(By.id("to"));
    private static final Target ADULT_INPUT = Target.the("").located(By.id("adultos"));
    private static final Target KIDS_INPUT = Target.the("").located(By.id("ninos"));
    private static final Target SEARCH_BUTTON = Target.the("").located(By.id("btn_buscarmotor"));

}
