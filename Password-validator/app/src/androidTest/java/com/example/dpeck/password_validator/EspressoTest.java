package com.example.dpeck.password_validator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by dpeck on 2017-05-28.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {

    private String inputField;
    private String buttonText;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initString()
    {
        inputField = "enter a password";
        buttonText = "VALIDATE";
    }

    @Test
    public void findInputField() {
        onView(withId(R.id.editText));
    }

    @Test
    public void findInputText()
    {
        //Tries to find the text on the screen
        //Return true if it matches the expected test
        onView(withId(R.id.editText)).check(matches(withText(inputField)));

    }

    @Test
    public void findButton() {
        onView(withId(R.id.button));
    }

    @Test
    public void findButtonText()
    {
        //Tries to find the text on the screen
        //Return true if it matches the expected test
        onView(withId(R.id.button)).check(matches(withText(buttonText)));

    }

}