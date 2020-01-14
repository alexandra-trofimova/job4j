package ru.job4j.loop;

/**
 * Class Класс для построения шахматной доски в псевдографике
 * @author Alexandra Trofimova
 * @since 30.12.2019
 * @version 1
 */
public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
