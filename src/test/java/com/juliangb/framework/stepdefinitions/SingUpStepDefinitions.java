package com.juliangb.framework.stepdefinitions;

import com.juliangb.framework.HookDriver;
import com.juliangb.framework.pageobjects.SignUpServices;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SingUpStepDefinitions {

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws InterruptedException {

        SignUpServices signUp = new SignUpServices(HookDriver.driver);
        signUp.goTo("http://demo.automationtesting.in/Register.html");
        signUp.writeFirstName("Julian");
        signUp.writeLastName("Galeano B");
        signUp.writeEmailAddress("julian@correo.com");
        signUp.selectMaleGender();
        signUp.writePhone("1234523652");
        signUp.selectCountry("Colombia");
        signUp.writePassword("123Asc");
        signUp.writeConfirmPassword("123Asc");
        signUp.selectYear("1996");
        signUp.selectDay("25");
        signUp.selectMonth("June");
        signUp.submitForm();
        Thread.sleep(4000);


    }

    @When("^he send required information to get the account$")
    public void he_send_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }

}
