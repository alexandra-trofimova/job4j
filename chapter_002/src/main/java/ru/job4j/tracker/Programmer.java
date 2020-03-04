package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String pc;

    public Programmer(String name, String surname, String education, String birthday, String company, String pc){
        super(name, surname, education, birthday, company);
        this.pc = pc;
    }

    public boolean fix (Report report) {
        return false;
    }
}
