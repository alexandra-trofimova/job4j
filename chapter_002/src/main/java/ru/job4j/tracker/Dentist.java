package ru.job4j.tracker;

public class Dentist extends Doctor {
    private String drill;

    public Dentist(String name, String surname, String education, String birthday, String clinic, String drill){
        super(name, surname, education, birthday, clinic);
        this.drill = drill;
    }

    public void anesthesia (Pacient pacient) {
    }
}
