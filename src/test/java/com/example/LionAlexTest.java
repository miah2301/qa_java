package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class LionAlexTest {
    private final List<String> friends = List.of("Марти", "Глория", "Мелман");
    LionAlex lionAlex = new LionAlex();
    @Test
    public void getPlaceOfLivingTest(){
        String actualPlace = lionAlex.getPlaceOfLiving();
        String expectedPlace = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expectedPlace, actualPlace);
    }
    @Test
    public void getFriendsTest(){
        List<String> actualListFrinds = lionAlex.getFriends();
        Assert.assertEquals(friends, actualListFrinds);
    }
    @Test
    public void getKittensTest(){
        int actualKittens = lionAlex.getKittens();
        int countKittens = 0;
        Assert.assertEquals(countKittens,actualKittens);
    }
    @Test
    public void doesHaveManeTest(){
        boolean actualGender = lionAlex.doesHaveMane();
        boolean expectedGender = true;
        Assert.assertEquals(expectedGender,actualGender);
    }

}