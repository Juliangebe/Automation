package com.juliangb.framework.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NavigateTo {

    @Autowired
    WebDriver webDriver;

    @Value("${url}")
    private String url;

    public void signUpPage(){
        this.webDriver.get(url);

    }



}
