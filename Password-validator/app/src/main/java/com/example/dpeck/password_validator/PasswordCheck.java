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

    /*
    public static void passwordCheck() {
        Scanner kbd = new Scanner(System.in);
        String pw;
        System.out.println("password?");
        pw = kbd.next();

        if (pw.equalsIgnoreCase("password") | pw.length() < 8) {
            System.out.println("invalid password");
        }
        else {
            setPassword(pw);
        }
    }
*/
    public static void setPassword(String pw) {
        password = pw;
    }

    public String getPassword() {
        return password;
    }
}
