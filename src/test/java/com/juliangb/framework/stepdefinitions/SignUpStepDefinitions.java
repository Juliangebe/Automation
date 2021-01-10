package com.juliangb.framework.stepdefinitions;


import com.juliangb.framework.builders.data.UserBuilder;
import com.juliangb.framework.config.DriverConfig;
import com.juliangb.framework.models.User;
import com.juliangb.framework.pageobjects.SignUpServices;
import com.juliangb.framework.tasks.NavigateTo;
import com.juliangb.framework.tasks.UserSignUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefinitions {
    @Autowired
    private SignUpServices signUp;
    @Autowired
    NavigateTo navigateTo;
    @Autowired
    UserSignUp userSignUp;


    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws InterruptedException {

        navigateTo.signUpPage();


    }

    @When("^he send required information to get the account$")
    public void he_send_required_information_to_get_the_account() {

        userSignUp.withInfo(
                UserBuilder.anUser().withDefaultInfo()
                        .build()
        );
    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }

}
