package com.javarush.island.torkel;

import com.javarush.island.torkel.entity.EntityType;

public final class Config {
    public static final int COLUMNS = 5;
    public static final int ROWS = 5;

    public static final int[][] probabilityOfEat = new int[EntityType.values().length][EntityType.values().length];

    static {
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.HORSE.ordinal()] = 10;
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.DEER.ordinal()] = 15;
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.RABBIT.ordinal()] = 60;
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.MOUSE.ordinal()] = 80;
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.GOAT.ordinal()] = 60;
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.SHEEP.ordinal()] = 70;
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.BOAR.ordinal()] = 15;
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.BUFFALO.ordinal()] = 10;
        probabilityOfEat[EntityType.WOLF.ordinal()][EntityType.DUCK.ordinal()] = 40;

        probabilityOfEat[EntityType.BOA.ordinal()][EntityType.FOX.ordinal()] = 15;
        probabilityOfEat[EntityType.BOA.ordinal()][EntityType.RABBIT.ordinal()] = 20;
        probabilityOfEat[EntityType.BOA.ordinal()][EntityType.MOUSE.ordinal()] = 40;
        probabilityOfEat[EntityType.BOA.ordinal()][EntityType.BUFFALO.ordinal()] = 0;
        probabilityOfEat[EntityType.BOA.ordinal()][EntityType.DUCK.ordinal()] = 10;

        probabilityOfEat[EntityType.FOX.ordinal()][EntityType.RABBIT.ordinal()] = 70;
        probabilityOfEat[EntityType.FOX.ordinal()][EntityType.MOUSE.ordinal()] = 90;
        probabilityOfEat[EntityType.FOX.ordinal()][EntityType.DUCK.ordinal()] = 60;
        probabilityOfEat[EntityType.FOX.ordinal()][EntityType.CATERPILLAR.ordinal()] = 40;

        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.BOA.ordinal()] = 80;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.HORSE.ordinal()] = 40;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.DEER.ordinal()] = 80;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.RABBIT.ordinal()] = 80;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.MOUSE.ordinal()] = 90;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.GOAT.ordinal()] = 70;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.SHEEP.ordinal()] = 70;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.BOAR.ordinal()] = 50;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.BUFFALO.ordinal()] = 20;
        probabilityOfEat[EntityType.BEAR.ordinal()][EntityType.DUCK.ordinal()] = 10;

        probabilityOfEat[EntityType.EAGLE.ordinal()][EntityType.FOX.ordinal()] = 10;
        probabilityOfEat[EntityType.EAGLE.ordinal()][EntityType.RABBIT.ordinal()] = 90;
        probabilityOfEat[EntityType.EAGLE.ordinal()][EntityType.MOUSE.ordinal()] = 90;
        probabilityOfEat[EntityType.EAGLE.ordinal()][EntityType.DUCK.ordinal()] = 80;

        probabilityOfEat[EntityType.HORSE.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.DEER.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.RABBIT.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.MOUSE.ordinal()][EntityType.CATERPILLAR.ordinal()] = 90;
        probabilityOfEat[EntityType.MOUSE.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.GOAT.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.SHEEP.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.BOAR.ordinal()][EntityType.MOUSE.ordinal()] = 50;
        probabilityOfEat[EntityType.BOAR.ordinal()][EntityType.CATERPILLAR.ordinal()] = 90;
        probabilityOfEat[EntityType.BOAR.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.BUFFALO.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.DUCK.ordinal()][EntityType.CATERPILLAR.ordinal()] = 90;
        probabilityOfEat[EntityType.DUCK.ordinal()][EntityType.PLANT.ordinal()] = 100;

        probabilityOfEat[EntityType.CATERPILLAR.ordinal()][EntityType.PLANT.ordinal()] = 100;

    }
}
