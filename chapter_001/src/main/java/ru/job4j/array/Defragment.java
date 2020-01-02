package ru.job4j.array;

import javax.swing.*;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int x = index + 1;
                while (x < array.length) {
                    String cell1 = array[x];
                    if (cell1 != null) {
                       array[index] = cell1;
                       array[x] = null;
                       break;
                    } else {
                        x++;
                    }
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
