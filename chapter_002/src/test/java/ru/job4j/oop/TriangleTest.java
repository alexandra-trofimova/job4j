package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void when002002() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 2.0;
        Assert.assertEquals(expected, result, 0.01);
    }
    @Test
    public void when003004() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 6.0;
        Assert.assertEquals(expected, result, 0.01);
    }
    @Test
    public void when003303() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 3);
        Point c = new Point(0, 5);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 7.5;
        Assert.assertEquals(expected, result, 0.01);
    }
    @Test
    public void whenNotExistByX() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(0, 5);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, result, 0.01);
    }
    @Test
    public void whenNotExistByY() {
        Point a = new Point(0, 3);
        Point b = new Point(2, 3);
        Point c = new Point(2, 3);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, result, 0.01);
    }
}