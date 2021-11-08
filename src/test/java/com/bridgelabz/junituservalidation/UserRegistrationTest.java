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
}