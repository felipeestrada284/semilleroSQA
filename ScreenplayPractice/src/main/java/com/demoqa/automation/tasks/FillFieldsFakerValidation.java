package com.demoqa.automation.tasks;

import com.demoqa.automation.questions.GetDataStudentQuestion;
import com.demoqa.automation.ui.StudentFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class FillFieldsFakerValidation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(GetDataStudentQuestion.in(StudentFormPage.STUDENT_NAME_VALIDATION),equalToIgnoringCase(FillFormFields.firstName+" "+FillFormFields.lastName)),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.STUDENT_EMAIL_VALIDATION),equalToIgnoringCase(FillFormFields.email)),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.MOBIL_VALIDATION),equalToIgnoringCase(FillFormFields.mobile)),
                seeThat(GetDataStudentQuestion.in(StudentFormPage.ADDRESS_VALIDATION),equalToIgnoringCase(FillFormFields.currentAddress))
        );

    }

    public static FillFieldsFakerValidation fakerValidation(){
        return instrumented(FillFieldsFakerValidation.class);

    }
}
