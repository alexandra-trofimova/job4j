package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private String knife;

    public Surgeon(String name, String surname, String education, String birthday, String clinic, String knife){
        super(name, surname, education, birthday, clinic);
        this.knife = knife;
    }

    public void operation (Pacient pacient) {
    }
}
