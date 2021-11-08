package com.bridgelabz.junituservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Pavani");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Pa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Pavan1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Pavani@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
        boolean result = userRegistration.validateLastName("Kempula");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Ke");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Kempula1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Kempula@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.valudateEmailId("abc.syz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
        boolean result = userRegistration.validateMobileNum("91 9960077482");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNum("919960077482");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNum("9960077482");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNum("1234507748");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("nDj1k2*jf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("Kd1%f");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("3Rmdg*nK");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("Mas1bt&Bx");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("mDkk%fDB");
        Assert.assertFalse(result);
    }
}