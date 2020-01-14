package ru.job4j.array;

/**
 * Class Класс для поиска минимального числа в массиве
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
