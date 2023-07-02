package com.javarush.island.maysuradze.herbivores;

import com.javarush.island.maysuradze.predator.*;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Goat extends Herbivores {
    public static int maxPopulation = 140;

    public Goat(int age, String gender, int health) {
        super(new HashMap<>(Map.ofEntries(

                new AbstractMap.SimpleEntry<>(Wolf.class, 0f), new AbstractMap.SimpleEntry<>(Python.class, 0f), new AbstractMap.SimpleEntry<>(Fox.class, 0f), new AbstractMap.SimpleEntry<>(Bear.class, 0f),
                new AbstractMap.SimpleEntry<>(Eagle.class, 0f), new AbstractMap.SimpleEntry<>(Deer.class, 0f),
                new AbstractMap.SimpleEntry<>(Rabbit.class, 0f), new AbstractMap.SimpleEntry<>(Mouse.class, 0f),
                new AbstractMap.SimpleEntry<>(Sheep.class, 0f), new AbstractMap.SimpleEntry<>(Boar.class, 0f), new AbstractMap.SimpleEntry<>(Buffalo.class, 0f),
                new AbstractMap.SimpleEntry<>(Duck.class, 0f), new AbstractMap.SimpleEntry<>(Caterpillar.class, 0f),
                new AbstractMap.SimpleEntry<>(Plants.class, 1f), new AbstractMap.SimpleEntry<>(Goat.class, 0f)
        )), age, gender, health);
    }


}
