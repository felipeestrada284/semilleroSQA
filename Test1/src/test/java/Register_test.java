import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Register_test {

    private WebDriver driver;
    RegisterPage registerPage;

    @BeforeAll
    public void setUp() throws Exception {
        registerPage = new RegisterPage(driver);
        driver = registerPage.chromeDriverConnection();
        registerPage.visit("http://demo.guru99.com/test/newtours/index.php");
    }

    @AfterAll
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        registerPage.registerUser();
        Assertions.assertEquals("Note: Your user name is qualityadmi.", registerPage.registeredMessage());
    }
}
