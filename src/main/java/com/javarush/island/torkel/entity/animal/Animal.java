package com.javarush.island.torkel.entity.animal;

import com.javarush.island.torkel.entity.Entity;
import com.javarush.island.torkel.entity.EntityType;

public abstract class Animal extends Entity {
    public Animal(EntityType type) {
        super(type);
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
