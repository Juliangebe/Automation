package com.juliangb.framework.pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SignUpPageObject {


    public SignUpPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @Getter
    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private By firstNameTextBox;
    @FindBy(xpath = "//input[@ng-model='LastName']")
    private By lastNameTextBox;
    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    private By emailAddressTextBox;
    @FindBy(xpath = "//input[@ng-model='Phone']")
    private By phoneTextBox;
    @FindBy(xpath = "//input[@value='Male']")
    private By maleRadioButton;
    @FindBy(xpath = "//input[@value='FeMale']")
    private By femaleRadioButton;
    @FindBy(id = "yearbox")
    private By dateOfBirthYear;
    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private By dateOfBirthMonth;
    @FindBy(id = "daybox")
    private By dateOfBirthDay;
    @FindBy(id = "countries")
    private By countryList;
    @FindBy(id = "firstpassword")
    private By passwordTextBox;
    @FindBy(id = "secondpassword")
    private By confirmPasswordTextBox;
    @FindBy(id = "submitbtn")
    private By submitButton;


}
