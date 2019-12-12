package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int in_x1 = 1;
        int in_y1 = 2;
        int in_x2 = 4;
        int in_y2 = 3;
        double expected = 3.16;
        double out = Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
