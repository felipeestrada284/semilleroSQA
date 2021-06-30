import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignInPage extends Base {

    By userLocator = By.name("userName");
    By passLocator = By.name("password");
    By signInBtnLocator = By.name("submit");

    By homePageLocator = By.tagName("font");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void singIn(){
        if (isDisplayed(userLocator)){
            type("qualityadmi", userLocator);
            type("pass1", passLocator);
            click(signInBtnLocator);
        } else{
            System.out.println("username textbox was not present");
        }
    }

    public String homePageLocator(){
        List<WebElement> fonts = findElements(homePageLocator);
        return getText(fonts.get(3));
    }
}
