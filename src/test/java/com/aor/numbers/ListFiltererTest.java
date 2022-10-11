package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {

    @Test
    public void filter_1() {
        List<Integer> list = Arrays.asList(2, 67, 8, 3, 9, 13);
        List<Integer> expected = Arrays.asList(2, 67, 8, 3, 9, 13);
        PositiveFilter filter = new PositiveFilter();
        ListFilterer filterer = new ListFilterer(filter);
        List<Integer> filtered = filterer.filter(list);
        Assertions.assertEquals(expected, filtered);
    }

    @Test
    public void filter_2() {
        List<Integer> list = Arrays.asList(-4, 0, 8, -12, 9, 1000);
        List<Integer> expected = Arrays.asList(8, 9, 1000);
        PositiveFilter filter = new PositiveFilter();
        ListFilterer filterer = new ListFilterer(filter);
        List<Integer> filtered = filterer.filter(list);
        Assertions.assertEquals(expected, filtered);
    }

    @Test
    public void filter_3() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);
        try {
            DivisibleByFilter filter = new DivisibleByFilter(2);
            ListFilterer filterer = new ListFilterer(filter);
            List<Integer> filtered = filterer.filter(list);
            Assertions.assertEquals(expected, filtered);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void filter_4() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);
        try {
            DivisibleByFilter filter = new DivisibleByFilter(0);
            ListFilterer filterer = new ListFilterer(filter);
            List<Integer> filtered = filterer.filter(list);
            Assertions.assertEquals(expected, filtered);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
