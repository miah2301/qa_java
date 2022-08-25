package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class NutritionParameterizedTest {
    private final List<String> Nutrition;
    private final String typeAnimal;

    public NutritionParameterizedTest(List<String> nutrition, String typeAnimal) {
        Nutrition = nutrition;
        this.typeAnimal = typeAnimal;
    }

    @Parameterized.Parameters
    public static Object[][] getTestGender() {
        return new Object[][]{
                {List.of("Животные", "Птицы", "Рыба"), "Хищник"},
                {List.of("Трава", "Различные растения"), "Травоядное"}
        };
    }

    @Test
    public void getNutritionFeline() throws Exception {
        Feline feline = new Feline();
        List<String> actualVeganEat = feline.getFood(typeAnimal);
        Assert.assertEquals(Nutrition, actualVeganEat);
    }
}
