package com.laurentiuspilca.webscopes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnglishRandomNameProvider implements RandomNameProvider {
    @Autowired RandomNumberService randomNumberService;
    @Override
    public String next() {
        int randomNumber= randomNumberService.getRandomNumber();
        if(randomNumber < 333) {
            return "Steve";
        }
        if(randomNumber >= 333 && randomNumber < 666) {
            return "Will";
        }
        return "Jim";
    }
}
