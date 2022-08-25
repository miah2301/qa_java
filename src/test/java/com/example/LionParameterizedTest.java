package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest{
    private final Boolean expected;
    private final String gender;

    public LionParameterizedTest(String gender, Boolean expected) {
        this.gender = gender;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getTestGender() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void lionTest() throws Exception {
        Lion lion = new Lion(gender);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
    }
}