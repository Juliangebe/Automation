package com.juliangb.framework.util.drivers;

import com.juliangb.framework.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static String path = System.getProperty("user.dir") + "/src/test/resources/drivers/%s";

public static WebDriver get(Browser browser) throws IllegalAccessException {
    if (Browser.chrome == browser) {
        System.setProperty("webdriver.chrome.driver",
               String.format(path,"chromedriver.exe"));
        return new ChromeDriver();

    }
    if (Browser.firefox == browser) {
        System.setProperty("webdriver.gecko.driver",
                String.format(path,"geckodriver.exe"));
        return new FirefoxDriver();

    }

    throw new IllegalAccessException("Driver not found for browser "+browser);

}

}
