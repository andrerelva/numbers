package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {

    @Test
    public void accept_1() {
        PositiveFilter filter = new PositiveFilter();
        boolean accept = filter.accept(1);
        Assertions.assertEquals(true, accept);
    }

    @Test
    public void accept_2() {
        PositiveFilter filter = new PositiveFilter();
        boolean accept = filter.accept(0);
        Assertions.assertEquals(false, accept);
    }
}
