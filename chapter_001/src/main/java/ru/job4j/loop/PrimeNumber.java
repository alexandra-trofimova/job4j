package ru.job4j.loop;

/**
 * Class Класс для подсчета коилчества простых чисел (от 1 до заданного)
 * @author Alexandra Trofimova
 * @since 30.12.2019
 * @version 1
 */
public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count += 1;
            }
        }
        return count;
    }
}
