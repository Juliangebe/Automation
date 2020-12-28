package com.juliangb.framework.stepdefinitions;

import com.juliangb.framework.pageobjects.SignUpPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingUpStepDefinitions {

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account()  {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"src/test/resources/drivers/chromedriver.exe");
        SignUpPageObject signUpPageObject= new SignUpPageObject(driver);
        signUpPageObject.goTo("http://demo.automationtesting.in/Register.html");
        signUpPageObject.writeFirstName("Julian");
        signUpPageObject.writeLastName("Galeano B");
        signUpPageObject.writeEmailAddress("julian@correo.com");
        signUpPageObject.selectMaleGender();
        signUpPageObject.writePhone("884654652525");
        signUpPageObject.selectCountry("Colombia");
        signUpPageObject.writePassword("123Asc");
        signUpPageObject.writeConfirmPassword("123Asc");
        signUpPageObject.submitForm();
        //driver.quit();

    }

    @When("^he send required information to get the account$")
    public void he_send_required_information_to_get_the_account()  {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created()  {

    }

}
