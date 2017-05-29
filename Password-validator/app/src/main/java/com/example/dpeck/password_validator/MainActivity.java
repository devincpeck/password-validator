package com.example.dpeck.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dpeck.password_validator.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dpeck on 2017-05-28.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }


    public void buttonClick() {
        final TextView textView = (TextView)findViewById(R.id.textView);
        final Button button = (Button) findViewById(R.id.button);
        final EditText inputText = (EditText)findViewById(R.id.editText);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                final String password = inputText.getText().toString();
                Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
                Matcher m = p.matcher(password);
                boolean b = m.find();


                if (password.equalsIgnoreCase("password") | password.length() < 8) {
                    textView.setText("weak password");
                }
                //using the solution given on https://stackoverflow.com/questions/6344867/checking-whether-a-string-contains-a-number-value-in-java
                else if (!password.matches(".*\\d.*")) {
                    textView.setText("weak password - needs a number");
                }
                else if (password.length() >= 25) {
                    textView.setText("weak password - password too long");
                }
                //using solution from https://stackoverflow.com/questions/1795402/java-check-a-string-if-there-is-a-special-character-in-it
                else if (!b) {
                    textView.setText("weak password - needs a special character");
                }
                else {
                    textView.setText("strong password!");
                }

            }
        });
    }
}
