package com.demoqa.automation.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SpecialMethods {

    public static Properties properties;

    public static void settingProperties() {
        properties = new Properties();
        try {
            properties.load(new FileReader("setting.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
