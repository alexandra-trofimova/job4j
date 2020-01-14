package ru.job4j.array;

/**
 * Class Класс для проверки, что слово заканчивается определенной последовательностью
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[(post.length - index - 1)] != word[word.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
