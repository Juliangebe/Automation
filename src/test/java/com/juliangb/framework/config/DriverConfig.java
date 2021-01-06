package com.juliangb.framework.config;

import com.juliangb.framework.enums.Browser;
import com.juliangb.framework.util.drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.Duration;

@Configuration
@ComponentScan(basePackages = "com.juliangb.framework")
@PropertySource("classpath:application.properties")
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Value("${element.timeout.wait.seconds}")
    private int webDriverTimeOut;

    @Bean
    public WebDriver webDriver() throws IllegalAccessException {

        return DriverFactory.get(driverType);
    }

    @Bean
    public WebDriverWait waitFor() throws IllegalAccessException {
        return new WebDriverWait(webDriver(), Duration.ofSeconds(webDriverTimeOut));


    }
}
