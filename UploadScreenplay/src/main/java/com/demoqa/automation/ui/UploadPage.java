package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UploadPage {

    public static String URL = "https://www.demoqa.com/upload-download";

    public static final Target SELECT_FILE = Target.the("").located(By.id("uploadFile"));

}
