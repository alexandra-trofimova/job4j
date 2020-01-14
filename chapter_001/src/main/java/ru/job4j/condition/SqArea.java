package ru.job4j.condition;

/**
 * Class Класс для вычисления площади прямоугольника
 * @author Alexandra Trofimova
 * @since 28.11.2019
 * @version 1
 */
public class SqArea {
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        return w * h;
    }
}
