package ru.job4j.condition;

/**
 * Class Класс для определение наибольшего числа из трех заданных
 * @author Alexandra Trofimova
 * @since 19.11.2019
 * @version 1
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return (result > third) ? result : third;
    }
}
