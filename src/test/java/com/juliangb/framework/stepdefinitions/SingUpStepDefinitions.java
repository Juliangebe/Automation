package com.juliangb.framework.stepdefinitions;


import com.juliangb.framework.config.DriverConfig;
import com.juliangb.framework.pageobjects.SignUpServices;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SingUpStepDefinitions {
    @Autowired
    private SignUpServices signUp;
    @Value("${url}")
    private String url;

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws InterruptedException {


        signUp.goTo(url);
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


    }

    @When("^he send required information to get the account$")
    public void he_send_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }

}
