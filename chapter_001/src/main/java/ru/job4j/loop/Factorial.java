package ru.job4j.loop;

/**
 * Class Класс для вычисления факториала
 * @author Alexandra Trofimova
 * @since 30.12.2019
 * @version 1
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        if (n > 0) {
            for (int index = 1; index <= n; index++) {
                result = result * index;
            }
        }
        return result;
    }
}
