package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenSecondMaxTwo() {
        Max check = new Max();
        int result = check.max(1, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMaxTwo() {
        Max check = new Max();
        int result = check.max(6, 4);
        assertThat(result, is(6));
    }
    @Test
    public void whenFirstMaxThree() {
        Max check = new Max();
        int result = check.max(7, 4, 1);
        assertThat(result, is(7));
    }
    @Test
    public void whenSecondMaxThree() {
        Max check = new Max();
        int result = check.max(7, 8, 1);
        assertThat(result, is(8));
    }
    @Test
    public void whenThirdMaxThree() {
        Max check = new Max();
        int result = check.max(5, 4, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenFirstMaxFour() {
        Max check = new Max();
        int result = check.max(9, 4, 1, 3);
        assertThat(result, is(9));
    }
    @Test
    public void whenSecondMaxFour() {
        Max check = new Max();
        int result = check.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMaxFour() {
        Max check = new Max();
        int result = check.max(1, 4, 9, 3);
        assertThat(result, is(9));
    }
    @Test
    public void whenFourthMaxFour() {
        Max check = new Max();
        int result = check.max(1, 4, 2, 7);
        assertThat(result, is(7));
    }
    @Test
    public void whenTwoEquals() {
        Max check = new Max();
        int result = check.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenThreeEquals() {
        Max check = new Max();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }
    @Test
    public void whenFourEquals() {
        Max check = new Max();
        int result = check.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }
}
