package ru.job4j.tracker;

public class Animal {
    private String name;

    public Animal() {
        super();
        System.out.println("Animal");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal " + name);
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Vasya");
    }
}
