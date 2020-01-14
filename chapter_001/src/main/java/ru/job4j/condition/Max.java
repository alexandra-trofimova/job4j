package ru.job4j.condition;

/**
 * Class Класс для определение большего числа из двух заданных
 * @author Alexandra Trofimova
 * @since 18.11.2019
 * @version 1
 */
public class Max {
    public static int max(int first, int second) {
        boolean condition = first > second;
        return condition ? first : second;
    }
}
