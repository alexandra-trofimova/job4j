package ru.job4j.loop;

/**
 * Class Класс для вычисления суммы четных числе в заданном диапазоне
 * @author Alexandra Trofimova
 * @since 30.12.2019
 * @version 1
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }
}
