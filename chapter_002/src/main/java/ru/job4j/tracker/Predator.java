package ru.job4j.tracker;

public class Predator extends Animal{

    public Predator() {
        super();
        System.out.println("Predator");
    }

    public Predator(String name) {
        super();
        System.out.println("Predator " + name);
    }

    public static void main(String[] args) {
        Predator predator = new Predator("Petya");
    }
}
