package com.javarush.island.maysuradze.island;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Island island = new Island("Island", 10, 10);
        System.out.println("Welcome to Island\n Enter number of moves");
        try {
            Scanner scanner = new Scanner(System.in);
            Integer iterations = scanner.nextInt();
            for (int i = 0; i < iterations; i++) {
                island.iterate();
                island.multiply();
                island.move();
                island.eat();
                System.out.println(island);
            }
        } catch (Exception e) {
            System.out.println("Enter the numbers, not symbols");
        }

    }
}