package ru.job4j.array;
/**
 * Class Класс для поиска в массиве индекса ячейки с заданным значением
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static int indexOfRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
