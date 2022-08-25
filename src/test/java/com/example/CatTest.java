package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatTest {
    private final List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

    Predator feline = new Feline();
    Cat cat = new Cat(feline);
    @Test
    public void catGetSoundTest(){
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void catGetFoodTest() throws Exception {
        List<String> actualFood = cat.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }


}