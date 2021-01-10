package com.juliangb.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {


    @Autowired
    private SignUpPageObject signUpPageObject;
    @Autowired
    private WebDriver driver;
    @Autowired
    WebDriverWait wait;


    public void goTo(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstName) {
        this.wait.until(ExpectedConditions.visibilityOf(this.signUpPageObject.getFirstNameTextBox()));
        this.signUpPageObject.getFirstNameTextBox().sendKeys(firstName);


    }

    public void submitForm() {
        this.signUpPageObject.getSubmitButton().click();
    }

    public void writeLastName(String lastName) {
        this.signUpPageObject.getLastNameTextBox().sendKeys(lastName);


    }

    public void selectCountry(String country) {
        new Select(this.signUpPageObject.getCountryList()).selectByValue(country);


    }

    public void selectMaleGender() {
        this.signUpPageObject.getMaleRadioButton().click();
    }

    public void writeEmailAddress(String email) {
        this.signUpPageObject.getEmailAddressTextBox().sendKeys(email);


    }

    public void writePhone(String phone) {
        this.signUpPageObject.getPhoneTextBox().sendKeys(phone);


    }

    public void selectYear(String year) {
        new Select(this.signUpPageObject.getDateOfBirthYear()).selectByValue(year);
    }

    public void selectMonth(String month) {
        new Select(this.signUpPageObject.getDateOfBirthMonth()).selectByValue(month);
    }

    public void selectDay(String day) {
        new Select(this.signUpPageObject.getDateOfBirthDay()).selectByValue(day);
    }

    public void writePassword(String password) {
        this.signUpPageObject.getPasswordTextBox().sendKeys(password);


    }

    public void writeConfirmPassword(String confirmPassword) {
        this.signUpPageObject.getConfirmPasswordTextBox().sendKeys(confirmPassword);


    }
}
