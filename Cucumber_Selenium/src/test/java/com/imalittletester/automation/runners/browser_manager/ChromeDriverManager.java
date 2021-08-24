package com.imalittletester.automation.runners.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }
}
