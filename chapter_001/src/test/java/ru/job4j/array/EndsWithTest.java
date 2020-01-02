package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

    public class EndsWithTest {

        @Test
        public void whenEndWithPostThenTrue() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] post = {'l', 'o'};
            boolean result = EndsWith.endsWith(word, post);
            assertThat(result, is(true));
        }

        @Test
        public void whenEndWithLongPostThenTrue() {
            char[] word = {'A', 'r', 'r', 'a', 'y', 'C', 'h', 'a', 'r'};
            char[] post = {'C', 'h', 'a', 'r'};
            boolean result = EndsWith.endsWith(word, post);
            assertThat(result, is(true));
        }

        @Test
        public void whenNotEndWithPostThenFalse() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] post = {'l', 'a'};
            boolean result = EndsWith.endsWith(word, post);
            assertThat(result, is(false));
        }

        @Test
        public void whenNotEndWithLongPostThenFalse() {
            char[] word = {'A', 'r', 'r', 'a', 'y', 'C', 'h', 'a', 'r'};
            char[] post = {'y', 'c', 'h', 'a', 'r'};
            boolean result = EndsWith.endsWith(word, post);
            assertThat(result, is(false));
        }
    }

