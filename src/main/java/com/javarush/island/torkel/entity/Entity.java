package com.javarush.island.torkel.entity;

import com.javarush.island.torkel.entity.animal.herbivore.Boar;
import com.javarush.island.torkel.entity.animal.predator.*;
import com.javarush.island.torkel.entity.EntityType;
import com.javarush.island.torkel.entity.plant.*;

public abstract class Entity {
    private final EntityType type;

    public abstract void multiply();
    public abstract boolean eat();
    public abstract void move();

    public static Entity returnNewEntity(int random) {
        return switch (random) {
            case 0 -> new Bear();
            case 1 -> new Boa();
            case 2 -> new Eagle();
            case 3 -> new Fox();
            case 4 -> new Wolf();
            default -> new Plant();
        };
    }

    public Entity(EntityType type) {
        this.type = type;
    }
}
