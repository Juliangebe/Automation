package com.juliangb.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpServices {

    private WebDriver driver;
    private SignUpPageObject signUpPageObject = new SignUpPageObject(this.driver);

    SignUpServices signUpServices;

    public SignUpServices(WebDriver driver) {
        this.driver = driver;
        signUpPageObject = new SignUpPageObject(driver);

    }

    public void goTo(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstName) {
        this.signUpPageObject.g



    }

    public void submitForm(){
        this.driver.findElement(this.submitButton).click();
    }

    public void writeLastName(String lastName) {
        this.driver.findElement(this.lastNameTextBox).sendKeys(lastName);


    }

    public void selectCountry(String country){
        new Select(this.driver.findElement(this.countryList)).selectByValue(country);



    }
    public void selectMaleGender() {
        this.driver.findElement(this.maleRadioButton).click();
    }

    public void writeEmailAddress(String email) {
        this.driver.findElement(this.emailAddressTextBox).sendKeys(email);


    }

    public void writePhone(String phone) {
        this.driver.findElement(this.phoneTextBox).sendKeys(phone);


    }
    public void selectYear(String year){
        new Select(this.driver.findElement(dateOfBirthYear)).selectByValue(year);
    }

    public void selectMonth(String month){
        new Select(this.driver.findElement(dateOfBirthMonth)).selectByValue(month);
    }

    public void selectDay(String day){
        new Select(this.driver.findElement(dateOfBirthDay)).selectByValue(day);
    }

    public void writePassword(String password) {
        this.driver.findElement(this.passwordTextBox).sendKeys(password);


    }

    public void writeConfirmPassword(String confirmPassword) {
        this.driver.findElement(this.confirmPasswordTextBox).sendKeys(confirmPassword);


    }
}
