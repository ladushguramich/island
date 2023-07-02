package com.javarush.island.maysuradze.predator;

import com.javarush.island.maysuradze.Animal.Animal;

import java.util.HashMap;

public abstract class Predator extends Animal {
    public  HashMap<Class, Float> eatProbability;

    public Float getProbability(Class animalClass) {
        Float probability = eatProbability.get(animalClass);
        return (probability != null) ? probability : 0.0f;
    }

    public Predator(HashMap<Class, Float> eatProbability, int age, String gender, int health) {
        super(age, gender, health);
        this.eatProbability = eatProbability;
    }

}
