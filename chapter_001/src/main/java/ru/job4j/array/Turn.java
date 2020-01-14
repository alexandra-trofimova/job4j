package ru.job4j.array;

/**
 * Class Класс для переворачивания массива "задом наперед"
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < (array.length / 2); index++) {
            int tmp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = tmp;
        }
        return array;
    }
}
