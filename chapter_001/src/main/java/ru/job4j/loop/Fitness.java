package ru.job4j.loop;

/**
 * Class Класс для определения срока фитнес-тренировок, чтобы обогнать соперника в тяге
 * @author Alexandra Trofimova
 * @since 30.12.2019
 * @version 1
 */
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
