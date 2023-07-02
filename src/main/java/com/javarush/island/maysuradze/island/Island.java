package com.javarush.island.maysuradze.island;

import com.javarush.island.maysuradze.Animal.Animal;
import com.javarush.island.maysuradze.herbivores.*;
import com.javarush.island.maysuradze.predator.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Island {
    protected List<Animal>[][] field;

    protected static HashMap<Class, String> symbols = new HashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<Class, String>(Rabbit.class, "🐰"),
            new AbstractMap.SimpleEntry<Class, String>(Wolf.class, "🐺"),
            new AbstractMap.SimpleEntry<Class, String>(Python.class, "🐍"),
            new AbstractMap.SimpleEntry<Class, String>(Fox.class, "🦊"),
            new AbstractMap.SimpleEntry<Class, String>(Bear.class, "🐻"),
            new AbstractMap.SimpleEntry<Class, String>(Eagle.class, "🦅"),
            new AbstractMap.SimpleEntry<Class, String>(Horse.class, "🐎"),
            new AbstractMap.SimpleEntry<Class, String>(Deer.class, "🦌"),
            new AbstractMap.SimpleEntry<Class, String>(Mouse.class, "🐁"),
            new AbstractMap.SimpleEntry<Class, String>(Goat.class, "🐐"),
            new AbstractMap.SimpleEntry<Class, String>(Sheep.class, "🐑"),
            new AbstractMap.SimpleEntry<Class, String>(Boar.class, "🐗"),
            new AbstractMap.SimpleEntry<Class, String>(Buffalo.class, "🦬"),
            new AbstractMap.SimpleEntry<Class, String>(Duck.class, "🦆"),
            new AbstractMap.SimpleEntry<Class, String>(Caterpillar.class, "🐛"),
            new AbstractMap.SimpleEntry<Class, String>(Plants.class, "🌿")
    ));


    public Island(String name, int x, int y) {
        this.field = new List[x][y];
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[i].length; j++) {
                this.field[i][j] = new ArrayList<Animal>();


                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Wolf.maxPopulation); k++) {
                    Wolf wolf = new Wolf(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(wolf);
                    wolf.setX(i);
                    wolf.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Python.maxPopulation); k++) {
                    Python python = new Python(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(python);
                    python.setX(i);
                    python.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Fox.maxPopulation); k++) {
                    Fox fox = new Fox(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(fox);
                    fox.setX(i);
                    fox.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Bear.maxPopulation); k++) {
                    Bear bear = new Bear(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(bear);
                    bear.setX(i);
                    bear.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Eagle.maxPopulation); k++) {
                    Eagle eagle = new Eagle(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(eagle);
                    eagle.setX(i);
                    eagle.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Horse.maxPopulation); k++) {
                    Horse horse = new Horse(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(horse);
                    horse.setX(i);
                    horse.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Deer.maxPopulation); k++) {
                    Deer deer = new Deer(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(deer);
                    deer.setX(i);
                    deer.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Rabbit.maxPopulation); k++) {
                    Rabbit rabbit = new Rabbit(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(rabbit);
                    rabbit.setX(i);
                    rabbit.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Mouse.maxPopulation); k++) {
                    Mouse mouse = new Mouse(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(mouse);
                    mouse.setX(i);
                    mouse.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Goat.maxPopulation); k++) {
                    Goat goat = new Goat(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)

                    );
                    this.field[i][j].add(goat);
                    goat.setX(i);
                    goat.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Sheep.maxPopulation); k++) {
                    Sheep sheep = new Sheep(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(sheep);
                    sheep.setX(i);
                    sheep.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Boar.maxPopulation); k++) {
                    Boar boar = new Boar(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(boar);
                    boar.setX(i);
                    boar.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Buffalo.maxPopulation); k++) {
                    Buffalo buffalo = new Buffalo(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(buffalo);
                    buffalo.setX(i);
                    buffalo.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Duck.maxPopulation); k++) {
                    Duck duck = new Duck(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(duck);
                    duck.setX(i);
                    duck.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Caterpillar.maxPopulation); k++) {
                    Caterpillar caterpillar = new Caterpillar(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(caterpillar);
                    caterpillar.setX(i);
                    caterpillar.setY(j);
                }
                for (int k = 0; k < ThreadLocalRandom.current().nextInt(0, Plants.maxPopulation); k++) {
                    Plants plants = new Plants(
                            ThreadLocalRandom.current().nextInt(0, 20 + 1),
                            (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f",
                            ThreadLocalRandom.current().nextInt(0, 100 + 1)
                    );
                    this.field[i][j].add(plants);
                    plants.setX(i);
                    plants.setY(j);
                }
            }
        }
    }


    public boolean isValidCell(int x, int y) {
        int numRows = field.length;
        int numCols = field[0].length;
        return x >= 0 && x < numRows && y >= 0 && y < numCols;
    }

    public void iterate() throws NullPointerException {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[i].length; j++) {
                List<Animal> animals = this.field[i][j];
                Collections.shuffle(animals);
                Dictionary<String, Integer> dict = new Hashtable<>();
                for (Animal k : this.field[i][j]) {
                    String symbol = symbols.get(k.getClass());
                    try {
                        dict.put(symbol, dict.get(symbol) + 1);
                    } catch (Exception error) {
                        dict.put(symbol, 1);
                    }
                }
            }
        }
    }


    public void multiply() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[i].length; j++) {
                List<Animal> animals = this.field[i][j];
                List<Animal> multiply = animals.stream()
                        .filter(animal -> (animal.getAge() >= 15 && animal.getAge() <= 20)).collect(Collectors.toList());
                for (Animal animal : multiply) {
                    Class<?> clazz = Class.forName(animal.getClass().getName());
                    Constructor<?> ctor = clazz.getConstructor(int.class, String.class, int.class);
                    Animal animal1 = (Animal) ctor.newInstance(new Object[]{0, (ThreadLocalRandom.current().nextInt(0, 2) == 0) ? "m" : "f", 10});
                    animal1.setX(i);
                    animal1.setY(j);
                    animals.add(animal1);
                }
            }
        }
    }


    public String toString() {
        String table = "";
        for (List<Animal>[] lists : this.field) {
            String line = "";
            for (List<Animal> list : lists) {
                String cell = "";
                HashMap<String, Integer> dict = new HashMap<>();
                for (Animal k : list) {
                    String symbol = symbols.get(k.getClass());
                    try {
                        dict.put(symbol, dict.get(symbol) + 1);
                    } catch (Exception error) {
                        dict.put(symbol, 1);
                    }
                }
                cell += "{ ";
                for (String key : dict.keySet()) {
                    cell += key + ": " + dict.get(key) + ", ";
                }
                cell += " }";
                line += cell + ", ";
            }
            table += line + "\n";
        }
        return table;
    }


    public void move() {
        List<Animal> animalMove = new ArrayList<>();
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[i].length; j++) {
                List<Animal> animals = new ArrayList<>(this.field[i][j]);
                for (Animal animal : animals) {
                    Integer directionX = ThreadLocalRandom.current().nextInt(0, 3) - 1;
                    Integer directionY = ThreadLocalRandom.current().nextInt(0, 3) - 1;
                    Integer distX = animal.getX() + directionX;
                    Integer distY = animal.getY() + directionY;
                    if (isValidCell(distX, distY)) {
                        animal.setX(distX);
                        animal.setY(distY);
                        this.field[i][j].remove(animal);
                        animalMove.add(animal);
                    }
                }
            }
        }
        animalMove.forEach(animal -> {
            this.field[animal.getX()][animal.getY()].add(animal);
        });

    }

    public void eat() throws NullPointerException {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[i].length; j++) {
                List<Animal> animals = new ArrayList<>(this.field[i][j]);
                for (Animal animal : animals) {
                    if (animal instanceof Herbivores) {
                        Optional<Animal> oPlant = this.field[i][j].stream().filter(a -> a instanceof Plants).findFirst();
                        if (oPlant.isPresent()) {
                            Plants plant = (Plants) oPlant.get();
                            this.field[i][j].remove(
                                    plant
                            );
                        }
                    } else {
                        Optional<Animal> oAnimal = this.field[i][j].stream().filter(a -> a instanceof Herbivores || a instanceof Predator).findFirst();
                        if (animal instanceof Predator) {
                            if (oAnimal.isPresent()) {
                                Animal animal2 = oAnimal.get();
                                    float prob = ((Predator) animal).getProbability(animal2.getClass());
                                    float random = ThreadLocalRandom.current().nextFloat();
                                    if (random < prob) {
                                        this.field[i][j].remove(
                                                animal2
                                        );
                                    } else {

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


