package ru.job4j.loop;

import javax.swing.*;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double cost = (amount + amount * (percent/100));
        if ((cost - salary) >= amount) {
            return 0;
        }
        else {
            while (cost > salary) {
                double rest = cost - salary;
                cost = rest + rest * (percent / 100);
                year += 1;
            }
            return year;
        }

    }

}
