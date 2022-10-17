package com.javarush.island.torkel;

import com.javarush.island.torkel.entity.EntityType;
import com.javarush.island.torkel.entity.animal.Animal;
import com.javarush.island.torkel.entity.animal.herbivore.Boar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.printf(String.valueOf(EntityType.WOLF.getName()));
        System.out.printf(String.valueOf(EntityType.WOLF.getIcon()));

    }
}