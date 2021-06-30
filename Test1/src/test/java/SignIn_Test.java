import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test {

    private WebDriver driver;
    SignInPage singInPage;

    @BeforeAll
    public void setUp() throws Exception {
        singInPage = new SignInPage(driver);
        driver = singInPage.chromeDriverConnection();
        singInPage.visit("http://demo.guru99.com/test/newtours/index.php");
    }

    @AfterAll
    public void tearDown() throws Exception {
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        singInPage.singIn();
        Assertions.assertEquals("Thank you for Loggin.",singInPage.homePageLocator());
    }
}
