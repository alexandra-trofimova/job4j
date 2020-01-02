package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 5, 9};
        int[] result = turner.back(input);
        int[] expect = new int[] {9, 5, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {2, 7, 6, 4, 8, 1, 15};
        int[] result = turner.back(input);
        int[] expect = new int[] {15, 1, 8, 4, 6, 7, 2};
        assertThat(result, is(expect));
    }
}