package com.javarush.island.torkel.entity.plant;

import com.javarush.island.torkel.entity.Entity;
import com.javarush.island.torkel.entity.EntityType;

public class Plant extends Entity {

    public Plant() {
        super(EntityType.PLANT);
    }

    @Override
    public void multiply() {

    }

    @Override
    public boolean eat() {
        return false;
    }

    @Override
    public void move() {

    }
}
