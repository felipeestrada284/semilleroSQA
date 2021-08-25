package com.trivago.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationTrivagoPage {

    public static String URL = "https://www.tiquetesbaratos.com/";
    public static final Target ONE_WAY_BUTTON = Target.the("solo ida").located(By.id("unavia"));
    public static final Target ORIGEN_INPUT = Target.the("origen").located(By.id("ptags1"));
    public static final Target DESTINATION_INPUT = Target.the("destination").located(By.id("ptags2"));
    public static final Target DEPARTURE_DATE_CLICk = Target.the("Fecha de salida").located(By.id("from"));
    public static final Target DEPARTURE_DATE_INPUT = Target.the("30").located(By.xpath("//div[1]//*[@class='ui-datepicker-calendar']//tr[5]//td[2]//a"));
    //private static final Target RETURN_DATE_INPUT = Target.the("").located(By.id("to"));
    public static final Target ADULT_INPUT = Target.the("").located(By.id("adultos"));
    public static final Target KIDS_INPUT = Target.the("").located(By.id("ninos"));
    public static final Target SEARCH_BUTTON = Target.the("").located(By.id("btn_buscarmotor"));

}
