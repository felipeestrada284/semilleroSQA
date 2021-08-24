package com.imalittletester.automation.stepdefinitions;

import com.imalittletester.automation.runners.browser_manager.DriverManageFactory;
import com.imalittletester.automation.runners.browser_manager.DriverManager;
import com.imalittletester.automation.runners.browser_manager.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private static WebDriver driver;
    //mostrar por pantalla el numero de escenario que se esta probando
    //esta variable pertenece a la clase y no a un objeto en particular
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase ++;
        System.out.println("Se esta ejecuntando el escenario numero: " + numberOfCase);
        driverManager = DriverManageFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        System.out.println("El escenario numero: " +numberOfCase + " se ejecuto correctamente");
        driverManager.quitDriver();
    }

    //va ser un metodo de la clase y no de la instancia
    public static WebDriver getDriver(){
        return driver;
    }

}
