package com.company.models;

public class Rocket implements SpaceShip {

    private int RocketCost;
    private int RocketWeight;
    private int CurrentWeight;
    private int MaxWeight;

    public Rocket(int rocketCost, int rocketWeight, int currentWeight, int maxWeight) {
        RocketCost = rocketCost;
        RocketWeight = rocketWeight;
        CurrentWeight = currentWeight;
        MaxWeight = maxWeight;
    }

    public int getRocketCost() {
        return RocketCost;
    }

    public void setRocketCost(int rocketCost) {
        RocketCost = rocketCost;
    }

    public int getRocketWeight() {
        return RocketWeight;
    }

    public void setRocketWeight(int rocketWeight) {
        RocketWeight = rocketWeight;
    }

    public int getCurrentWeight() {
        return CurrentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        CurrentWeight = currentWeight;
    }

    public int getMaxWeight() {
        return MaxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        MaxWeight = maxWeight;
    }

    @Override
    public boolean Launch() {
        return true;
    }

    @Override
    public boolean Land() {
        return true;
    }

    @Override
    public boolean CanCarry(Item item) {
        if ((CurrentWeight + (item.getWeight() / 1000)) > MaxWeight)
            return false;
        else
            return true;
    }

    @Override
    public void Carry(Item item) {
        CurrentWeight = CurrentWeight + (item.getWeight() / 1000);
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "RocketCost=" + RocketCost +
                ", RocketWeight=" + RocketWeight +
                ", CurrentWeight=" + CurrentWeight +
                ", MaxWeight=" + MaxWeight +
                '}';
    }
}
