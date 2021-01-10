package com.juliangb.framework.builders.data;

import com.juliangb.framework.enums.Gender;
import com.juliangb.framework.models.User;

public class UserBuilder {
    private User user;

    public static UserBuilder anUser() {
        return new UserBuilder();

    }

    public UserBuilder but(){
        return withDefaultInfo();


    }

    public UserBuilder withDefaultInfo() {
        this.user = User.builder()
                .firstName("Julian")
                .lastName("Galeano")
                .email("juliangb@autmator.com")
                .gender(Gender.Male)
                .country("Colombia")
                .birthDay("25")
                .birthMonth("June")
                .birthYear("1996")
                .phone("3002145236")
                .password("w_Qas!2")
                .passwordConfirmation("w_Qas!2")
                .build();
        return this;
    }

    public UserBuilder witouthPassword(){
        user.setPassword("");
        return this;
    }

    public User build(){

        return this.user;
    }
}
