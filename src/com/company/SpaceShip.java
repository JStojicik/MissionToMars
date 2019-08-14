package com.company;

public interface SpaceShip {
    boolean Launch();

    boolean Land();

    void Carry(Item item);

    boolean CanCarry(Item item);
}
