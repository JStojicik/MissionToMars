package com.company.models;

import com.company.models.Item;

public interface SpaceShip {
    boolean Launch();

    boolean Land();

    void Carry(Item item);

    boolean CanCarry(Item item);
}
