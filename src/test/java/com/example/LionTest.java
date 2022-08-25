package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
    private final List<String> expectedVeganFood = List.of("Трава", "Различные растения");
    @Mock
    Predator feline = new Feline();
    Lion lion = new Lion(feline);

    @Test
    public void lionGetKittens(){
        int kittensActual = lion.getKittens();
        int expectedKittens = 1;
        Assert.assertEquals(expectedKittens, kittensActual);
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void lionVeganTest() throws Exception{
        Lion lion = new Lion(feline);
        Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Трава", "Различные растения"));
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedVeganFood, actualFood);
    }

    //@Before
    //public void init() {
    //    MockitoAnnotations.initMocks(this);
    //}

}