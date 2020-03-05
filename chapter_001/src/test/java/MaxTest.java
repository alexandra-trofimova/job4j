package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax4To1Then4() {
        int result = Max.max(4, 1);
        assertThat(result, is(4));
    }
    @Test
    public void wheneqals() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }
}