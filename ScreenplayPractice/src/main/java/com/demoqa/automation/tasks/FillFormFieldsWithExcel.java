package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.StudentFormPage;
import com.demoqa.automation.utils.ExcelUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFormFieldsWithExcel implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(), 1, 0)).into(StudentFormPage.FIRST_NAME),
                    Enter.theValue(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(), 1, 1)).into(StudentFormPage.LAST_NAME),
                    Enter.theValue(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(), 1, 2)).into(StudentFormPage.EMAIL),
                    JavaScriptClick.on(StudentFormPage.GENDER_BUTTON),
                    Enter.theValue(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1, 3)).into(StudentFormPage.MOBILE),
                    Enter.keyValues(Keys.CONTROL,"a").into(StudentFormPage.DATE_OF_BIRTH),
                    Enter.keyValues(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1, 4)).into(StudentFormPage.DATE_OF_BIRTH),
                    Enter.keyValues(Keys.ENTER).into(StudentFormPage.DATE_OF_BIRTH),
                    Enter.keyValues(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1, 5)).into(StudentFormPage.SUBJECTS),
                    Enter.keyValues(Keys.ENTER).into(StudentFormPage.SUBJECTS),

                    Enter.keyValues(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),2, 5)).into(StudentFormPage.SUBJECTS),
                    Enter.keyValues(Keys.ENTER).into(StudentFormPage.SUBJECTS),
                    Scroll.to(StudentFormPage.CURRENT_ADDRESS),
                    JavaScriptClick.on(StudentFormPage.HOBBIES),
                    Enter.keyValues(dataInjection.getPath()).into(StudentFormPage.UPLOAD_PICTURE),
                    Enter.keyValues(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1, 6)).into(StudentFormPage.CURRENT_ADDRESS),
                    Enter.keyValues(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1, 7)).into(StudentFormPage.SELECT_STATE),
                    Enter.keyValues(Keys.ENTER).into(StudentFormPage.SELECT_STATE),
                    Enter.keyValues(ExcelUserData.getCellValue(dataInjection.getFilepathExcel(),dataInjection.getUserDataExcel(),1, 8)).into(StudentFormPage.SELECT_CITY),
                    Enter.keyValues(Keys.ENTER).into(StudentFormPage.SELECT_CITY),
                    JavaScriptClick.on(StudentFormPage.CLICK_SUBMIT)

                    );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static FillFormFieldsWithExcel completeFormExcel() {
        return instrumented(FillFormFieldsWithExcel.class);
    }
}
