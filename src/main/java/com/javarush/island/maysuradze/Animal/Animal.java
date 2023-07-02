package com.javarush.island.maysuradze.Animal;

public class Animal {

    protected static String gender;
    protected static int age;
    public static int maxPopulation;
    protected static int health = 10;
    private int x;
    private int y;


    protected Animal(int age, String gender, int health) {
        this.gender = gender;
        this.age = age;
        this.health = health;
        if (gender.equals("m") || gender.equals("f")) {
            this.gender = gender;
        } else {
            throw new RuntimeException("only natural relationships in this field");
        }

    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return age;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }


}
