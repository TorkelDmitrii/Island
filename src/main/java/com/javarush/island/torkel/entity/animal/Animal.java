package com.javarush.island.torkel.entity.animal;

import com.javarush.island.torkel.entity.Entity;
import com.javarush.island.torkel.entity.EntityType;

public abstract class Animal extends Entity {

    public Animal(EntityType type) {
        super(type);
    }

    public boolean eat(Entity entity) {
        double eatenAnimalWeight = entity.getCurrentWeight();
        double maxFood = this.getType().getMaxFood();
        double countOfEaten = this.getCountOfEaten();
        if ((countOfEaten + eatenAnimalWeight) < maxFood) {
            currentWeight += eatenAnimalWeight;
            this.setCountOfEaten(countOfEaten + eatenAnimalWeight);

        } else {
            currentWeight += maxFood - countOfEaten;
            this.setCountOfEaten(maxFood);
        }

        if (currentWeight > maxFood) {
            currentWeight = maxFood;
            return true;
        }
        if (currentWeight > maxFood) {
            currentWeight = maxFood;
            return true;
        }
        if (this.getCountOfEaten() == maxFood) {
            return true;
        }
        return false;
    }

    @Override
    public void changeWeight() {
        currentWeight -= currentWeight / 100;
    }


}
