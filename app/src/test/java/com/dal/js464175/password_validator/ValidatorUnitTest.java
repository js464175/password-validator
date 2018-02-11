package com.dal.js464175.password_validator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorUnitTest {

    @Test
    public void password_isNotPassword() throws Exception {
        assertEquals(Validator.validatePassword("password"), false);
    }
    @Test
    public void password_isLongEnough() throws Exception {
        assertEquals(Validator.validatePassword("1234567"), false);
    }
    @Test
    public void password_GenericTest() throws Exception {
        assertEquals(Validator.validatePassword("TestingPass"), true);
    }

    // stage 2
    @Test
    public void password_notAllLowerCase() throws Exception {
        assertEquals(Validator.validatePassword("lowercasetest"), false);
    }
    @Test
    public void password_hasNoDolla() throws Exception {
        assertEquals(Validator.validatePassword("Test$$$Pass"), false);
    }
    @Test
    public void password_notAllUpperCase() throws Exception {
        assertEquals(Validator.validatePassword("UPPERCASETEST"), false);
    }
}