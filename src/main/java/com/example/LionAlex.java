package com.example;

import java.util.List;

public class LionAlex extends Lion{

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

    @Override
    public boolean doesHaveMane(){
        return hasMane = true;
    }
}
