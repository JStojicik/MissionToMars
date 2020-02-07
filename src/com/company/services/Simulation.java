package com.company.services;

import com.company.models.Item;
import com.company.models.Rocket;
import com.company.models.U1;
import com.company.models.U2;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public Simulation() {}

    public ArrayList<Item> LoadItems(Scanner FileScanner) {
        ArrayList<Item> ItemsList = new ArrayList<Item>();
        do {
            String[] line = FileScanner.nextLine().split("=");
            Item item = new Item(line[0], Integer.parseInt(line[1]));
            ItemsList.add(item);
        }
        while (FileScanner.hasNextLine());
        return ItemsList;
    }

    public ArrayList<Rocket> LoadU1(ArrayList<Item> ItemsList) {
        return rocketLoader(ItemsList, new U1());
    }

    public ArrayList<Rocket> LoadU2(ArrayList<Item> ItemsList) {
        return rocketLoader(ItemsList, new U2());
    }

    private ArrayList<Rocket> rocketLoader(ArrayList<Item> ItemsList, Rocket rocket) {
        ArrayList<Rocket> rocketList = new ArrayList<Rocket>();
        for (Item i : ItemsList) {
            if (rocket.CanCarry(i)) {
                rocket.Carry(i);
            } else {
                rocketList.add(rocket);
                if (rocket instanceof U1) {
                    rocket = new U1();
                } else if (rocket instanceof U2) {
                    rocket = new U2();
                }
                rocket.Carry(i);
            }
        }
        rocketList.add(rocket);
        return rocketList;
    }

    public int runSimulation(ArrayList<Rocket> RocketList) {
        int budget = 0;
        for (int i = 0; i < RocketList.size(); i++) {
            if (RocketList.get(i).Launch() && RocketList.get(i).Land()) {
                budget += RocketList.get(i).getRocketCost();
            } else {
                budget += RocketList.get(i).getRocketCost();
                i--;
            }
        }
        return budget;
    }
}
