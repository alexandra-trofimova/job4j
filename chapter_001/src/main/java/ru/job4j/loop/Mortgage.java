package ru.job4j.loop;

/**
 * Class Класс для определения, сколько лет нужно, чтобы погасить ипотеку
 * @author Alexandra Trofimova
 * @since 30.12.2019
 * @version 1
 */
public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double cost = (amount + amount * (percent / 100));
        if ((cost - salary) >= amount) {
            return 0;
        } else {
            while (cost > salary) {
                double rest = cost - salary;
                cost = rest + rest * (percent / 100);
                year += 1;
            }
            return year;
        }

    }

}
