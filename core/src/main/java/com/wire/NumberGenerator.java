package com.wire;

import java.util.Random;

public class NumberGenerator {

    int bound = 2;

    public void setBound(int bound) {
        this.bound = bound;
    }

    public int getBound() {
        return bound;
    }

    public int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(bound);
        return randomNumber;
    }
}
