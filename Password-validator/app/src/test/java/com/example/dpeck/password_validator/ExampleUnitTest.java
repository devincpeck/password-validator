package com.example.dpeck.password_validator;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    PasswordCheck pw = new PasswordCheck("password9*");
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

    @Test
    public void containsNumber() throws Exception {
        assertTrue(pw.getPassword().matches(".*\\d.*"));
    }

    @Test
    public void passwordTooLong() throws Exception {
        assertTrue(pw.getPassword().length()<=25);
    }

    @Test
    public void containsSpecialChar() throws Exception {
        //using solution from https://stackoverflow.com/questions/1795402/java-check-a-string-if-there-is-a-special-character-in-it
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(pw.getPassword());
        boolean b = m.find();
        assertTrue(b);
    }
}

