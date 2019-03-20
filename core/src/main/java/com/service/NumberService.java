package com.service;

import com.wire.GameResult;
import com.wire.NumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    NumberGenerator numberGenerator;

    @Autowired
    public NumberService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public GameResult game(int guess) {
        int programNumber = numberGenerator.generateRandomNumber();
        if (guess == programNumber)
            return new GameResult("Winner!");
        else {
            return new GameResult("Looser!");
        }
    }


}
