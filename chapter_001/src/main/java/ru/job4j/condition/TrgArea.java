package ru.job4j.condition;

/**
 * Class Класс для вычисления площади треугольника
 * @author Alexandra Trofimova
 * @since 28.11.2019
 * @version 1
 */
public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
