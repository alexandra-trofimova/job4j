package ru.job4j.array;

/**
 * Class Класс для формирования таблицы умножения
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
