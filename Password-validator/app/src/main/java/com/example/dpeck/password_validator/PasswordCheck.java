package com.example.dpeck.password_validator;

import java.util.*;

/**
 * Created by dpeck on 2017-05-27.
 */

public class PasswordCheck {

    public static String password;

    public PasswordCheck(String password){
        this.password = password;
    }

    public static void setPassword(String pw) {
        password = pw;
    }

    public String getPassword() {
        return password;
    }
}
