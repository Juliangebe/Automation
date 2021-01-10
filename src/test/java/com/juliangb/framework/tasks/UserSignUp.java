package com.juliangb.framework.tasks;

import com.juliangb.framework.enums.Gender;
import com.juliangb.framework.models.User;
import com.juliangb.framework.pageobjects.SignUpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {
    @Autowired
    SignUpServices signUp;

    @Autowired
    private SignUpServices signUpServices;

    public void withInfo(User user) {

        signUp.writeFirstName(user.getFirstName());
        signUp.writeLastName(user.getLastName());
        signUp.writeEmailAddress(user.getEmail());
        signUp.selectGender(user.getGender());
        signUp.selectMaleGender();
        signUp.writePhone(user.getPhone());
        signUp.selectCountry(user.getCountry());
        signUp.writePassword(user.getPassword());
        signUp.writeConfirmPassword(user.getPasswordConfirmation());
        signUp.selectYear(user.getBirthYear());
        signUp.selectDay(user.getBirthDay());
        signUp.selectMonth(user.getBirthMonth());
        signUp.submitForm();


    }
}
