package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.StudentFormPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.model.screenshots.Screenshot;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


import java.io.File;
import java.net.URL;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFormFields implements Task {

    DataInjection dataInjection = new DataInjection();

    public static String firstName, lastName, email, mobile, currentAddress;

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(dataInjection.getFirstName()).into(StudentFormPage.FIRST_NAME));
        actor.attemptsTo(Enter.theValue(dataInjection.getLastName()).into(StudentFormPage.LAST_NAME));
        actor.attemptsTo(Enter.theValue(dataInjection.getEmail()).into(StudentFormPage.EMAIL));
        actor.attemptsTo(JavaScriptClick.on(StudentFormPage.GENDER_BUTTON));
        actor.attemptsTo(Enter.theValue(dataInjection.getMobile()).into(StudentFormPage.MOBILE));
        actor.attemptsTo(Click.on(StudentFormPage.DATE_OF_BIRTH));
        actor.attemptsTo(Enter.keyValues(Keys.CONTROL,"a").into(StudentFormPage.DATE_OF_BIRTH));
        actor.attemptsTo(Enter.keyValues(dataInjection.getBirthday()).into(StudentFormPage.DATE_OF_BIRTH));

        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(StudentFormPage.DATE_OF_BIRTH));

        actor.attemptsTo(Enter.keyValues(dataInjection.getSubjects()).into(StudentFormPage.SUBJECTS));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(StudentFormPage.SUBJECTS));
        actor.attemptsTo(Scroll.to(StudentFormPage.CURRENT_ADDRESS));
        actor.attemptsTo(JavaScriptClick.on(StudentFormPage.HOBBIES));
        actor.attemptsTo(Enter.keyValues(dataInjection.getPath()).into(StudentFormPage.UPLOAD_PICTURE));

        actor.attemptsTo(Enter.theValue(dataInjection.getCurrentAddress()).into(StudentFormPage.CURRENT_ADDRESS));
        actor.attemptsTo(Enter.keyValues(dataInjection.getSelectState()).into(StudentFormPage.SELECT_STATE));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(StudentFormPage.SELECT_STATE));

        actor.attemptsTo(Enter.keyValues(dataInjection.getSelectCity()).into(StudentFormPage.SELECT_CITY));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(StudentFormPage.SELECT_CITY));
        actor.attemptsTo(JavaScriptClick.on(StudentFormPage.CLICK_SUBMIT));
        Serenity.takeScreenshot();


        firstName = dataInjection.getFirstName();
        lastName = dataInjection.getLastName();
        email = dataInjection.getEmail();
        mobile = dataInjection.getMobile();
        currentAddress = dataInjection.getCurrentAddress();

    }



    //por patron de diseño las tareas que se realicen siempre van a retornar el instrumented
    public static FillFormFields completeForm(){
        return instrumented(FillFormFields.class);
    }

}
