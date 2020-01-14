package ru.job4j.condition;

/**
 * Class Класс для проверки, существует ли треугольник
 * @author Alexandra Trofimova
 * @since 19.12.2019
 * @version 1
 */
public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab);
    }
}
