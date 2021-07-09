package com.demoqa.automation.tasks;

import com.demoqa.automation.questions.GetDataStudentQuestion;
import com.demoqa.automation.ui.StudentFormPage;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class StudentRegistrationValidation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.settingProperties();
        actor.should(
                seeThat(GetDataStudentQuestion.in(StudentFormPage.TITLE_TEXT_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("titleText"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.STUDENT_NAME_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("studentNameValidation"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.STUDENT_EMAIL_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("email"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.GENDER_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("genderValidation"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.MOBIL_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("mobile"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.DATE_BIRTH_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("dateOfBirthValidation"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.SUBJECTS_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("subjects"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.HOBBIES_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("hobbiesValidation"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.UPLOAD_PICTURE_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("pictureValidation"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.ADDRESS_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("currentAddress"))),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.STATE_AND_CITY_VALIDATION), equalToIgnoringCase(SpecialMethods.properties.getProperty("stateAndCityValidation")))


        );

    }

    public static StudentRegistrationValidation validationStudent() {
        return instrumented(StudentRegistrationValidation.class);
    }
}
