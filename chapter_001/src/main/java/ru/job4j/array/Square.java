package ru.job4j.array;

/**
 * Class Класс для заполнения массива степенями чисел (от 1 до заданного числа)
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }
}
