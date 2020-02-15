package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void when002002() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, is(1.9999999999999993));
    }
    @Test
    public void when003004() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, is(6.0));
    }
    @Test
    public void when003303() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 3);
        Point c = new Point(0, 5);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, is(7.499999999999997));
    }
}