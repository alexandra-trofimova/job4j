package ru.job4j.array;

/**
 * Class Класс для дефрагментации массива (заполненные ячейки в начало, пустые в конец)
 * @author Alexandra Trofimova
 * @since 04.01.2019
 * @version 1
 */
public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int next = index + 1;
                while (next < array.length) {
                    String temp = array[next];
                    if (temp != null) {
                       array[index] = temp;
                       array[next] = null;
                       break;
                    }
                    next++;
                }
            }

            System.out.print(array[index] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
