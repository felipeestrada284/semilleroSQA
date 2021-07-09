package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.questions.GetDataStudentQuestion;
import com.demoqa.automation.ui.StudentFormPage;
import com.demoqa.automation.utils.ExcelUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class FillFieldsExcelValidation implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.should(
                    seeThat(GetDataStudentQuestion.in(StudentFormPage.STUDENT_NAME_VALIDATION),equalToIgnoringCase(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1,0)+" "+ ExcelUserData.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getUserDataExcel(),1,1))),
                    seeThat(GetDataStudentQuestion.in(StudentFormPage.STUDENT_EMAIL_VALIDATION),equalToIgnoringCase(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1,2))),
                    seeThat(GetDataStudentQuestion.in(StudentFormPage.MOBIL_VALIDATION),equalToIgnoringCase(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1,3))),
                    seeThat(GetDataStudentQuestion.in(StudentFormPage.DATE_BIRTH_VALIDATION),equalToIgnoringCase(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1,4))),
                    seeThat(GetDataStudentQuestion.in(StudentFormPage.SUBJECTS_VALIDATION),equalToIgnoringCase(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1,5)+", "+ ExcelUserData.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getUserDataExcel(),2,5))),
                    seeThat(GetDataStudentQuestion.in(StudentFormPage.ADDRESS_VALIDATION),equalToIgnoringCase(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1,6))),
                    seeThat(GetDataStudentQuestion.in(StudentFormPage.STATE_AND_CITY_VALIDATION),equalToIgnoringCase(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1,7)+" "+ ExcelUserData.getCellValue(dataInjection.getFilepathExcel(), dataInjection.getUserDataExcel(),1,8)))

            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static FillFieldsExcelValidation validationExcel(){
        return instrumented(FillFieldsExcelValidation.class);
    }
}
