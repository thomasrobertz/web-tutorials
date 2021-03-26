package com.laurentiuspilca.webscopes.services;

import java.util.Random;

public class RandomNumberService {
    private final int randomNumber;
    public RandomNumberService() {
        randomNumber = new Random().nextInt(1000);
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
