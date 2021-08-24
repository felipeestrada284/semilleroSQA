package com.imalittletester.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.ComicsPages;
import pom.HomePage;

public class TestBase {

    //inicicaliza el driver y crea todas las instancias de las paginas
    protected WebDriver driver = Hooks.getDriver();

    //inicializar las paginas con PageFactory
    //protected HomePage homePage = new HomePage(driver);
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    //protected ComicsPages comicsPages = new ComicsPages(driver);
    protected ComicsPages comicsPages = PageFactory.initElements(driver, ComicsPages.class);


}
