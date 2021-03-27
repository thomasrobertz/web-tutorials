package com.laurentiuspilca.webscopes.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.Random;

@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RandomNumberService {
    private final int randomNumber;
    public RandomNumberService() {
        randomNumber = new Random().nextInt(1000);
    }
    public int getRandomNumber() {
        //new RuntimeException().printStackTrace();
        return randomNumber;
    }
}
