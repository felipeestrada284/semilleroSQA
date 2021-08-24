package com.advantageshopping.automation.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegisterNewUserStepDefinitions {
    public WebDriver driver;


    String user = "FelipeEstrada24";
    String password = "Felipe123";

    @Given("^that a web user wants to register in advantage shopping online$")
    public void thatAWebUserWantsToRegisterInAdvantageShoppingOnline() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().getSize();
        driver.get("https://www.advantageonlineshopping.com/#/");
        driver.navigate().refresh();
        //Esperar hasta que los elementos carguen
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
    }


    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields() throws InterruptedException {

        driver.findElement(By.id("menuUser")).click();
        
        WebDriverWait ewait = new WebDriverWait(driver, 5);
        ewait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[@class='create-new-account ng-scope']"), "CREATE NEW ACCOUNT"));

        driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
        //Thread.sleep(2000);

        //WebDriverWait ewait = new WebDriverWait(driver, 5);
        //ewait.until(ExpectedConditions.titleContains("CREATE ACCOUNT"));

        Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='CREATE ACCOUNT']")).getText(),"CREATE ACCOUNT");
        driver.findElement(By.name("usernameRegisterPage")).sendKeys(""+user);
        driver.findElement(By.name("emailRegisterPage")).sendKeys("felipeestrada284@gmail.com");
        driver.findElement(By.name("passwordRegisterPage")).sendKeys(""+password);
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(""+password);

        driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Felipe");
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Estrada");
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("3008832714");

        driver.findElement(By.name("countryListboxRegisterPage")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.linkText("Colombia")).click();
        //Se crea un nuevo objeto de la clase Select para que me selecione el elemento que se espera
        Select country = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
        country.selectByVisibleText("Colombia");

        driver.findElement(By.name("cityRegisterPage")).sendKeys("Medellin");
        driver.findElement(By.name("addressRegisterPage")).sendKeys("CR 84#37");
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Antioquia");
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("554864");
        driver.findElement(By.name("i_agree")).click();
        driver.findElement(By.id("register_btnundefined")).click();

        Assert.assertEquals(driver.findElement(By.linkText("FelipeEstrada24")).getText(), "" +user);


    }

    @Then("^he should see him username in yhe homepages$")
    public void heShouldSeeHimUsernameInYheHomepages() throws InterruptedException {

        driver.get("https://www.advantageonlineshopping.com/#/");
        driver.findElement(By.id("menuUser")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(""+user);
        driver.findElement(By.name("password")).sendKeys(""+password);
        driver.findElement(By.id("sign_in_btnundefined")).click();



        //driver.quit();
    }
}
