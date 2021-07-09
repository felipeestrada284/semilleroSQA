package com.demoqa.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

//Siempre debe implemetar interaction de screenplay
public class OpenBrowser implements Interaction {

    private String url;

    //constructor for url
    public OpenBrowser(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    //Metodo que se utilizara para nuestro navegador
    public static OpenBrowser on (String url){
        return new OpenBrowser(url);
    }
}
