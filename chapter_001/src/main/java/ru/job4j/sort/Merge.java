package ru.job4j.sort;

import java.util.Arrays;

/**
 * Class Класс для объединения двух массивов
 * @author Alexandra Trofimova
 * @since 03.12.2019
 * @version 1
 */
public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0) {
            System.arraycopy(right, 0, rsl, 0, rsl.length);
        }
        else if (right.length == 0) {
            System.arraycopy(left, 0, rsl, 0, rsl.length);
        } else {
            int x = 0;
            int y = 0;
            for (int i = 0; i < rsl.length; i++) {
                if (left[x] < right[y]) {
                    rsl[i] = left[x];
                    if (left.length > (x + 1)) {
                        x++;
                    } else {
                        left[x] = (right[(right.length - 1)] * 2);
                    }
                } else {
                    rsl[i] = right[y];
                    if (right.length > (y + 1)) {
                        y++;
                    } else {
                        right[y] = (left[(left.length - 1)] * 2);
                    }
                }
            }
        }
        return rsl;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
