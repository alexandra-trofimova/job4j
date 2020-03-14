package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student vasya = new Student();
        vasya.setName("Vasya Pupkin");
        vasya.setGroup("Intern");
        vasya.setEntered(new Date());

        System.out.println(vasya.getName() + " study at " + vasya.getGroup() + " since " + vasya.getEntered());
    }
}
