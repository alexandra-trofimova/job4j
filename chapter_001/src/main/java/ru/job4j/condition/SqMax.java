package ru.job4j.condition;

/**
 * Class Класс для вычисления наибольшего из четырех чисел
 * @author Alexandra Trofimova
 * @since 23.12.2019
 * @version 1
 */
public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if ((first > second) && (first > third) && (first > forth)) {
            result = first;
        } else if ((second > third) && (second > forth)) {
            result = second;
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}
