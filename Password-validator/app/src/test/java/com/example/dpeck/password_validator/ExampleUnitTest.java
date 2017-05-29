package com.example.dpeck.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    String password = "password";

    PasswordCheck pw = new PasswordCheck("Password");
    //PasswordCheck pw2 = new PasswordCheck("test");


    @Test
    public void passwordMatch() throws Exception {

        assertFalse("password".equalsIgnoreCase(pw.getPassword()));
        //assertFalse("password".equalsIgnoreCase(pw2.getPassword()));

    }

    @Test
    public void passwordLengthCheck() throws Exception {
        assertTrue(pw.getPassword().length()>=8);
        //assertTrue(pw2.getPassword().length()>=8);

    }
}

