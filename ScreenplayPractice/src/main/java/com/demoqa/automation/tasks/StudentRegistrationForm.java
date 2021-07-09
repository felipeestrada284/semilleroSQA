package com.demoqa.automation.tasks;

import com.demoqa.automation.ui.StudentFormPage;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StudentRegistrationForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        SpecialMethods.settingProperties();

        actor.attemptsTo(
                Enter.theValue(SpecialMethods.properties.getProperty("firstName")).into(StudentFormPage.FIRST_NAME),
                Enter.theValue(SpecialMethods.properties.getProperty("lastName")).into(StudentFormPage.LAST_NAME),
                Enter.theValue(SpecialMethods.properties.getProperty("email")).into(StudentFormPage.EMAIL),
                JavaScriptClick.on(StudentFormPage.GENDER_BUTTON),
                Enter.theValue(SpecialMethods.properties.getProperty("mobile")).into(StudentFormPage.MOBILE),
                Enter.keyValues(Keys.CONTROL,"a").into(StudentFormPage.DATE_OF_BIRTH),
                Enter.keyValues(SpecialMethods.properties.getProperty("dateOfBirth")).into(StudentFormPage.DATE_OF_BIRTH),
                Enter.keyValues(Keys.ENTER).into(StudentFormPage.DATE_OF_BIRTH),
                Enter.keyValues(SpecialMethods.properties.getProperty("subjects")).into(StudentFormPage.SUBJECTS),
                Enter.keyValues(Keys.ENTER).into(StudentFormPage.SUBJECTS),
                JavaScriptClick.on(StudentFormPage.HOBBIES),
                Scroll.to(StudentFormPage.CURRENT_ADDRESS),
                Enter.keyValues(SpecialMethods.properties.getProperty("picture")).into(StudentFormPage.UPLOAD_PICTURE),
                Enter.theValue(SpecialMethods.properties.getProperty("currentAddress")).into(StudentFormPage.CURRENT_ADDRESS),
                Enter.keyValues(SpecialMethods.properties.getProperty("state")).into(StudentFormPage.SELECT_STATE),
                Enter.keyValues(Keys.ENTER).into(StudentFormPage.SELECT_STATE),
                Enter.keyValues(SpecialMethods.properties.getProperty("city")).into(StudentFormPage.SELECT_CITY),
                Enter.keyValues(Keys.ENTER).into(StudentFormPage.SELECT_CITY),
                JavaScriptClick.on(StudentFormPage.CLICK_SUBMIT)

        );
    }

    public static StudentRegistrationForm studentRegister(){
        return instrumented(StudentRegistrationForm.class);
    }
}
