package ru.job4j.array;

/**
 * Class Класс для сортировки значений массива (от минимального к максимальному)
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, (data.length - 1));
            int index = FindLoop.indexOfRange(data, min, i, data.length);
            int tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        return data;
    }
}
