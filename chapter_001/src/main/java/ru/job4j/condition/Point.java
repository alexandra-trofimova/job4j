package ru.job4j.condition;

public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double x = x2 - x1;
            double y = y2 - y1;
            double first = Math.pow(x, 2);
            double second = Math.pow(y, 2);
            double sum = first + second;
            return  Math.sqrt(sum);
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = distance(2, 5, 7, 8);
        System.out.println("result (2, 5) to (7, 8) " + result1);
    }
}
