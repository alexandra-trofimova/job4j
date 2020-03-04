package ru.job4j.tracker;

public class Builder extends Engineer {
    private String plan;

    public Builder(String name, String surname, String education, String birthday, String company, String plan){
        super(name, surname, education, birthday, company);
        this.plan = plan;
    }

    public boolean check (Report report) {
        return false;
    }
}
