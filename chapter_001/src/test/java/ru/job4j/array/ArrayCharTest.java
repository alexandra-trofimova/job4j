package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenStartWithLongPrefixThenTrue() {
        char[] word = {'A', 'r', 'r', 'a', 'y', 'C', 'h', 'a', 'r'};
        char[] pref = {'A', 'r', 'r', 'a', 'y', 'C'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
    @Test
    public void whenStartWithLongPrefixThenFalse() {
        char[] word = {'A', 'r', 'r', 'a', 'y', 'C', 'h', 'a', 'r'};
        char[] pref = {'A', 'r', 'r', 'a', 'y', 'c'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}