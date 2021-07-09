package com.demoqa.automation.tasks;

import com.demoqa.automation.ui.UploadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UploadFile implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String fileLocation = ("C:\\Users\\felip\\Pictures\\Saved Pictures\\flip.jpg");
        StringSelection filepath = new StringSelection(fileLocation);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Click.on(UploadPage.SELECT_FILE));

    }

    public static UploadFile fileUpload(){
        return instrumented(UploadFile.class);
    }
}
