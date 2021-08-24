package com.imalittletester.automation.runners.browser_manager;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    //la puede ver su misma clase o las clases hijas
    protected WebDriver driver;

    //un metodo abstracto no esta definido en la clase sino que lo tiene que definir las clases hijas
    protected  abstract void createDriver();

    //cerrar la instancia del navegador
    public void quitDriver(){
        if (driver != null){
            //driver.quit();
            driver = null;
        }
    }

    //obtener la instancia del driver del navegador
    public WebDriver getDriver(){
        if (driver == null){
            createDriver();
        }
        return driver;
    }

}
