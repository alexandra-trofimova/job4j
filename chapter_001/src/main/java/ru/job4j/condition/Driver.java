package ru.job4j.condition;

/**
 * Class Класс для операций с категориями водительских прав (не задание, скопированный пример)
 * @author Alexandra Trofimova
 * @since 17.12.2019
 * @version 1
 */
public class Driver {
    private char license = 'R';

    public void passExamOn(char category) {
        this.license = category;
    }
    public boolean hasLicense() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }
    public boolean canDrive(char category) {
        return this.license == category;
    }
 }
