package ru.job4j.loop;

/**
 * Class Класс для рисования креста в псевдографике
 * @author Alexandra Trofimova
 * @since 30.12.2019
 * @version 1
 */
public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row == cell);
                boolean right = ((size - cell) == (1 + row));
                if ((left) || (right)) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
