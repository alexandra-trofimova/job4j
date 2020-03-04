package ru.job4j.tracker;

public class Doctor extends Profession {
    private String clinic;

    public Doctor(String name, String surname, String education, String birthday, String clinic){
        super(name, surname, education, birthday);
        this.clinic = clinic;
    }

    public Diagnose heal(Pacient pacient) {
        Diagnose diagnose = null;
        return diagnose;
    }
}
