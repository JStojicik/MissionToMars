package com.company;

import com.company.models.Item;
import com.company.models.Rocket;
import com.company.services.Simulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("Phase-1.txt");
        File file2 = new File("Phase-2.txt");
        Scanner FileScanner1 = new Scanner(file1);
        Scanner FileScanner2 = new Scanner(file2);
        Simulation sim = new Simulation();
        ArrayList<Item> ItemsList1 = sim.LoadItems(FileScanner1);
        ArrayList<Item> ItemsList2 = sim.LoadItems(FileScanner2);
        ArrayList<Rocket> U1rockets1 = sim.LoadU1(ItemsList1);
        ArrayList<Rocket> U1rockets2 = sim.LoadU1(ItemsList2);
        ArrayList<Rocket> U2rockets1 = sim.LoadU2(ItemsList1);
        ArrayList<Rocket> U2rockets2 = sim.LoadU2(ItemsList2);

        int a1 = sim.runSimulation(U1rockets1);
        int b1 = sim.runSimulation(U1rockets2);
        int budget1 = a1 + b1;

        int a2 = sim.runSimulation(U2rockets1);
        int b2 = sim.runSimulation(U2rockets2);
        int budget2 = a2 + b2;
        System.out.println("With the U1 rocket Phase 1 costs " + a1 + " Million Phase 2 Costs " + b1 + " Million and the total cost is " + budget1 + " Million");
        System.out.println("With the U2 rocket Phase 1 costs " + a2 + " Million Phase 2 Costs " + b2 + " Million and the total cost is " + budget2 + " Million");
        if (budget1 > budget2) {
            System.out.println("The U2 Rocket is cheaper and more reliable for use");
        } else System.out.println("The U1 Rocket is cheaper and more reliable for use int the project Mission to Mars");

    }
}
