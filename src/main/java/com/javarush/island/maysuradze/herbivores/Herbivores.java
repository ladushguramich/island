package com.javarush.island.maysuradze.herbivores;

import com.javarush.island.maysuradze.Animal.Animal;

import java.util.HashMap;

public abstract class Herbivores extends Animal {
    public Herbivores(HashMap<Class, Float> eatProbability, int age, String gender, int health) {
        super(age, gender, health);
        this.eatProbability = eatProbability;
    }

    protected final HashMap<Class, Float> eatProbability;


}
