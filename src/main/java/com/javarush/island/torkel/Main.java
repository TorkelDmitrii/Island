package com.javarush.island.torkel;

import com.javarush.island.torkel.map.GameMap;

public class Main {
    public static void main(String[] args) {

        GameMap map = new GameMap();
        for (int i = 0; i < Config.NUMBER_OF_ITERATION; i++) {
            try {
                map.start();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.printGameMap();
        }
    }
}