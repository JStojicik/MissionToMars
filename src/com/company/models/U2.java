package com.company.models;

import com.company.models.Rocket;

import java.util.Random;

public class U2 extends Rocket {
    public U2() {
        super(120, 18, 18, 29);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean Launch() {
        Random rand = new Random();
        int rnd = rand.nextInt(100);
        return rnd > 4;
    }

    @Override
    public boolean Land() {
        Random rand = new Random();
        int rnd = rand.nextInt(100);
        return rnd > 8;
    }
}
