package ru.job4j.array;

/**
 * Class Класс для поиска минимального числа в диапазоне массива
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
