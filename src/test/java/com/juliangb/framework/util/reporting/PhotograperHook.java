package com.juliangb.framework.util.reporting;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

public class PhotograperHook {
    @Autowired
    private WebDriver webDriver;

    @Value("${take.screen.condition:everyStep}")
    private TakeScreenShotCondition takeScreenShotCondition;


        public void takeScreenshot(Scenario scenario) {


        try {


            final byte[] screenshot = ((TakesScreenshot) webDriver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", UUID.randomUUID().toString());

        } catch (WebDriverException wde) {
            System.out.println("There was an error taking the screenshot: " + wde.getMessage());
        }


    }

    @After
    public void takeScreenshotAfterScenario(Scenario scenario){
        if (TakeScreenShotCondition.everyStep==takeScreenShotCondition){
            takeScreenshot(scenario);
        }



    }

    @AfterStep
    public void takeScreenshotAfterEveryStep(Scenario scenario){
        if (TakeScreenShotCondition.everyStep==takeScreenShotCondition){
            takeScreenshot(scenario);
        }



    }

    @After
    public void takeScreenshotAfterFailingScenario(Scenario scenario){
        if (scenario.isFailed() && TakeScreenShotCondition.failingScenario ==takeScreenShotCondition){
            takeScreenshot(scenario);
        }


    }

}
