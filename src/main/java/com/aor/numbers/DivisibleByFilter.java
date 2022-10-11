package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    int divisor;

    public DivisibleByFilter(int divisor) throws IllegalArgumentException {
        if (divisor != 0) this.divisor = divisor;
        else throw new IllegalArgumentException("Divisor cannot be zero.");
    }

    public boolean accept(Integer number) {
        return number % divisor == 0;
    }
}
