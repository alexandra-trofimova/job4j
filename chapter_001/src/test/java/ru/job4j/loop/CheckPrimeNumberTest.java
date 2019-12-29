package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when17() {
        boolean rsl = CheckPrimeNumber.check(17);
        assertThat(rsl, is(true));
    }

    @Test
    public void when12() {
        boolean rsl = CheckPrimeNumber.check(12);
        assertThat(rsl, is(false));
    }
}
