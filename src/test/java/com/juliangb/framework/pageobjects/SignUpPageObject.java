package com.juliangb.framework.pageobjects;

import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class SignUpPageObject {


    public SignUpPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstNameTextBox;
    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastNameTextBox;
    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    private WebElement emailAddressTextBox;
    @FindBy(xpath = "//input[@ng-model='Phone']")
    private WebElement phoneTextBox;
    @FindBy(xpath = "//input[@value='Male']")
    private WebElement maleRadioButton;
    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement femaleRadioButton;
    @FindBy(id = "yearbox")
    private WebElement dateOfBirthYear;
    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private WebElement dateOfBirthMonth;
    @FindBy(id = "daybox")
    private WebElement dateOfBirthDay;
    @FindBy(id = "countries")
    private WebElement countryList;
    @FindBy(id = "firstpassword")
    private WebElement passwordTextBox;
    @FindBy(id = "secondpassword")
    private WebElement confirmPasswordTextBox;
    @FindBy(id = "submitbtn")
    private WebElement submitButton;


}
