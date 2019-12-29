package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(3000, 600, 10);
        assertThat(year, is(8));
    }

    @Test
    public void whenNoCredit() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 20, 50);
        assertThat(year, is(0));
    }
}
