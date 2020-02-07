package com.company.models;

import com.company.models.Rocket;

import java.util.Random;

public class U1 extends Rocket {
    public U1() {
        super(100, 10, 10, 18);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean Launch() {
        Random rand = new Random();
        int rnd = rand.nextInt(100);
        return rnd > 5;
    }

    @Override
    public boolean Land() {
        Random rand = new Random();
        int rnd = rand.nextInt(100);
        return rnd > 1;
    }
}
