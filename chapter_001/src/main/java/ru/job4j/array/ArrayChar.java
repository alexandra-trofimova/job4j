package ru.job4j.array;

/**
 * Class Класс для проверки, что слово начинается с определенной последовательности
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
