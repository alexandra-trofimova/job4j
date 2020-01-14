package ru.job4j.array;

/**
 * Class Класс для проверки, что все элементы массива заполнены одинаково - или true, или false
 * @author Alexandra Trofimova
 * @since 03.01.2019
 * @version 1
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
           for (int index = 0; index < data.length; index++) {
                if (data[index] != data[0]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
