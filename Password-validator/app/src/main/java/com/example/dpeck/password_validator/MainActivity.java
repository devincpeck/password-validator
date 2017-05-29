package com.example.dpeck.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;

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

        if (pw.equalsIgnoreCase("password") | pw.length() < 8) {
            System.out.println("invalid password");
        }
        else {
            password = new PasswordCheck(pw);
        }
    }
}
