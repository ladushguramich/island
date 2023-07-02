package com.javarush.island.maysuradze.predator;

import com.javarush.island.maysuradze.herbivores.*;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Bear extends Predator{
    public static int maxPopulation = 5;

    public Bear(int age, String gender, int health) {
        super(new HashMap<>(Map.ofEntries(
                        new AbstractMap.SimpleEntry<Class, Float>(Python.class, 0.80f), new AbstractMap.SimpleEntry<Class, Float>(Horse.class, 0.40f),
                        new AbstractMap.SimpleEntry<Class, Float>(Deer.class, 0.80f), new AbstractMap.SimpleEntry<Class, Float>(Rabbit.class, 0.80f),
                        new AbstractMap.SimpleEntry<Class, Float>(Mouse.class, 0.90f), new AbstractMap.SimpleEntry<Class, Float>(Goat.class, 0.70f),
                        new AbstractMap.SimpleEntry<Class, Float>(Sheep.class, 0.70f), new AbstractMap.SimpleEntry<Class, Float>(Buffalo.class, 0.20f),
                        new AbstractMap.SimpleEntry<Class, Float>(Duck.class, 0.10f), new AbstractMap.SimpleEntry<Class, Float>(Wolf.class, 0f),
                        new AbstractMap.SimpleEntry<Class, Float>(Fox.class, 0f), new AbstractMap.SimpleEntry<Class, Float>(Eagle.class, 0f),
                        new AbstractMap.SimpleEntry<Class, Float>(Caterpillar.class, 0f), new AbstractMap.SimpleEntry<Class, Float>(Plants.class, 0f),
                        new AbstractMap.SimpleEntry<Class, Float>(Bear.class, 0f)
                )), age, gender, health

        );
    }
}
