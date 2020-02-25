package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(1, 2);
        Point b = new Point(7, 4);
        double dist = a.distance(b);
        double expected = 6.32;
        Assert.assertEquals(expected, dist, 0.01);
    }
    @Test
    public void distance3d() {
        Point a = new Point(1, 2,3);
        Point b = new Point(7, 4,5);
        double dist = a.distance3d(b);
        double expected = 6.63;
        Assert.assertEquals(expected, dist, 0.01);
    }
}
