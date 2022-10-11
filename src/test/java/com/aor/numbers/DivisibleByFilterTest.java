package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {

    @Test
    public void accept_1() {
        try {
            DivisibleByFilter filter = new DivisibleByFilter(2);
            boolean accept = filter.accept(3);
            Assertions.assertEquals(false, accept);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void accept_2() {
        try {
            DivisibleByFilter filter = new DivisibleByFilter(0);
            boolean accept = filter.accept(0);
            Assertions.assertEquals(null, accept);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
