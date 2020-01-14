package ru.job4j.calculator;

/**
 * Class Класс для расчета идеального веса при заданном росте (для мужчин и женщин)
 * @author Alexandra Trofimova
 * @since 27.11.2019
 * @version 1
 */
public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
    public static void main(String[] args) {
        double man = manWeight(180);
        System.out.println("Man 180 is " + man);
        double woman = womanWeight(150);
        System.out.println("Woman 150 is " + woman);
    }
}
