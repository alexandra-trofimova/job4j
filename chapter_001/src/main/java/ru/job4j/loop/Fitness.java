package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        if (ivan <= nik) {
            do {
                ivan *= 3;
                nik *= 2;
                month++;
            }
            while (ivan < nik);
        }
        return month;
    }
}
