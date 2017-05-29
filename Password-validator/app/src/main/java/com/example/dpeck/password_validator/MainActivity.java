package com.example.dpeck.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);
        String pw;
        System.out.println("password?");
        pw = kbd.next();
        PasswordCheck password;

        //using solution from https://stackoverflow.com/questions/1795402/java-check-a-string-if-there-is-a-special-character-in-it
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(pw);
        boolean b = m.find();

        if (pw.equalsIgnoreCase("password") | pw.length() < 8) {
            System.out.println("invalid password");
        }
        //using the solution given on https://stackoverflow.com/questions/6344867/checking-whether-a-string-contains-a-number-value-in-java
        else if (!pw.matches(".*\\d.*")) {
            System.out.println("invalid password - needs a number");
        }
        else if (pw.length() >= 25) {
            System.out.println("invalid password - password too long");
        }
        //using solution from https://stackoverflow.com/questions/1795402/java-check-a-string-if-there-is-a-special-character-in-it
        else if (!b) {
            System.out.println("invalid password - needs a special character");
        }
        else {
            password = new PasswordCheck(pw);
        }
    }
}
