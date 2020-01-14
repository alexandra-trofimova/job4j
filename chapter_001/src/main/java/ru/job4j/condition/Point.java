package ru.job4j.condition;

/**
 * Class Класс для вычисления расстояния между двумя точками (в 2-мерой системе координат)
 * @author Alexandra Trofimova
 * @since 27.11.2019
 * @version 1
 */
public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double x = x2 - x1;
            double y = y2 - y1;
            return  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = distance(2, 5, 7, 8);
        System.out.println("result (2, 5) to (7, 8) " + result1);
    }
}
