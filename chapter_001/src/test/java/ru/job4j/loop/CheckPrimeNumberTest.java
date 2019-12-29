package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when2() {
        boolean rsl = CheckPrimeNumber.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when19() {
        boolean rsl = CheckPrimeNumber.check(19);
        assertThat(rsl, is(true));
    }

    @Test
    public void when21() {
        boolean rsl = CheckPrimeNumber.check(21);
        assertThat(rsl, is(false));
    }
}
