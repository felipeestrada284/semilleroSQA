package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StudentFormPage {
    public static String URL = "https://www.demoqa.com/automation-practice-form";
    //Se importa el target de Screenplay
    public static final Target FIRST_NAME = Target.the("").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER_BUTTON = Target.the("").located(By.id("gender-radio-1"));
    public static final Target MOBILE = Target.the("").located(By.id("userNumber"));
    public static final Target DATE_OF_BIRTH = Target.the("").located(By.id("dateOfBirthInput"));
    public static final Target SUBJECTS = Target.the("").located(By.id("subjectsInput"));
    public static final Target HOBBIES = Target.the("").located(By.id("hobbies-checkbox-3"));
    public static final Target UPLOAD_PICTURE = Target.the("").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS = Target.the("").located(By.id("currentAddress"));
    public static final Target SELECT_STATE = Target.the("").located(By.id("react-select-3-input"));
    public static final Target SELECT_CITY = Target.the("").located(By.id("react-select-4-input"));
    public static final Target CLICK_SUBMIT = Target.the("").located(By.id("submit"));

    public static final Target TITLE_TEXT_VALIDATION = Target.the("").located(By.id("example-modal-sizes-title-lg"));
    public static final Target STUDENT_NAME_VALIDATION = Target.the("").locatedBy("//tr[1]//td[2]");
    public static final Target STUDENT_EMAIL_VALIDATION = Target.the("").locatedBy("//tr[2]//td[2]");
    public static final Target GENDER_VALIDATION = Target.the("").locatedBy("//tr[3]//td[2]");
    public static final Target MOBIL_VALIDATION = Target.the("").locatedBy("//tr[4]//td[2]");
    public static final Target DATE_BIRTH_VALIDATION = Target.the("").locatedBy("//tr[5]//td[2]");
    public static final Target SUBJECTS_VALIDATION = Target.the("").locatedBy("//tr[6]//td[2]");
    public static final Target HOBBIES_VALIDATION = Target.the("").locatedBy("//tr[7]//td[2]");
    public static final Target UPLOAD_PICTURE_VALIDATION = Target.the("").locatedBy("//tr[8]//td[2]");
    public static final Target ADDRESS_VALIDATION = Target.the("").locatedBy("//tr[9]//td[2]");
    public static final Target STATE_AND_CITY_VALIDATION = Target.the("").locatedBy("//tr[10]//td[2]");

}
