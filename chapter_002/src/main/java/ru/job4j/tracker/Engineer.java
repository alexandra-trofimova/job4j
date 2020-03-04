package ru.job4j.tracker;

public class Engineer extends Profession {
    private String company;

    public Engineer(String name, String surname, String education, String birthday, String company){
        super(name, surname, education, birthday);
        this.company = company;
    }

    public Project project(Task task) {
        Project data = null;
        return data;
    }
}
