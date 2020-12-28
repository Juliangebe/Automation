package com.juliangb.framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageObject {

    private WebDriver driver;

    public SignUpPageObject(WebDriver driver) {
        this.driver = driver;

    }

    private By firstNameTextBox = By.xpath("//input[@ng-model='FirstName']");
    private By lastNameTextBox = By.xpath("//input[@ng-model='LastName']");
    private By emailAddressTextBox = By.xpath("//input[@ng-model='EmailAdress']");
    private By phoneTextBox = By.xpath("//input[@ng-model='Phone']");
    private By maleRadioButton = By.xpath("//input[@value='Male']");
    private By femaleRadioButton = By.xpath("//input[@value='FeMale']");
    private By dateOfBirthYear = By.id("yearbox");
    private By dateOfBirthMonth = By.id("monthbox");
    private By dateOfBirthDay = By.id("daybox");
    private By countryList = By.id("countries");
    private By passwordTextBox = By.id("firstpassword");
    private By confirmPasswordTextBox = By.id("secondpassword");
    private By submitButton = By.id("submitbtn");

    public void goTo(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstName) {
        this.driver.findElement(this.firstNameTextBox).sendKeys(firstName);


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

    public void writePassword(String password) {
        this.driver.findElement(this.passwordTextBox).sendKeys(password);


    }

    public void writeConfirmPassword(String confirmPassword) {
        this.driver.findElement(this.confirmPasswordTextBox).sendKeys(confirmPassword);


    }

}
