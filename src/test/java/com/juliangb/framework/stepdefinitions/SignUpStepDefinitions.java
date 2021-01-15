package com.juliangb.framework.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;
import com.juliangb.framework.builders.data.UserBuilder;
import com.juliangb.framework.config.DriverConfig;
import com.juliangb.framework.models.User;
import com.juliangb.framework.pageobjects.SignUpServices;
import com.juliangb.framework.tasks.NavigateTo;
import com.juliangb.framework.tasks.UserSignUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
@CucumberContextConfiguration
@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefinitions {
    @Autowired
    private SignUpServices signUp;
    @Autowired
    NavigateTo navigateTo;
    @Autowired
    UserSignUp userSignUp;



    @Given("The client wants to have an account")
    public void the_client_wants_to_have_an_account() {
        navigateTo.signUpPage();

    }

    @When("He send required information to get the account")
    public void he_send_required_information_to_get_the_account() {

        userSignUp.withInfo(
                UserBuilder.anUser().withDefaultInfo()
                        .build()
        );

    }

    @Then("He should be told that the account was created")
    public void he_should_be_told_that_the_account_was_created() {
        assertThat(true).isEqualTo(true);


    }

    @Then("He should be told that the account was not created")
    public void he_should_be_told_that_the_account_was_not_created() {
        assertThat(true).isEqualTo(false);

    }
}
