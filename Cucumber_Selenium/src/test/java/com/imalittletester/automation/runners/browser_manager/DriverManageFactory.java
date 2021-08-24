package com.imalittletester.automation.runners.browser_manager;


public class DriverManageFactory {

    public static DriverManager getManager(DriverType type){
        DriverManager driverManager = null;

        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;

            case FIREFOX:
                driverManager = new FireFoxDriverManager();
                break;
            default:
                System.out.println("Invalid browser selected");
        }

        return driverManager;

    }

}
