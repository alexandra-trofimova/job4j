package ru.job4j.condition;

import org.junit.Test;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 2, 1);
        assertThat(result, is(6));
    }
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 7, 2, 6);
        assertThat(result, is(7));
    }
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 8, 1);
        assertThat(result, is(8));
    }
    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2, 5);
        assertThat(result, is(5));
    }
    @Test
    public void whenFourEquals() {
        SqMax check = new SqMax();
        int result = check.max(2, 2, 2, 2);
        assertThat(result, is(2));
    }
}
