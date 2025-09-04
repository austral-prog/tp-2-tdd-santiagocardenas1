package com.tp2.stringcalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    private final StringCalculator calc = new StringCalculator();

    @Test
    void emptyStringShouldReturn0() {
        assertEquals(0, calc.add(""));
    }

    @Test
    void singleNumberShouldReturnThatNumber() {
        assertEquals(5, calc.add("5"));
    }

    @Test
    void twoNumbersSeparatedByCommaShouldReturnSum() {
        assertEquals(3, calc.add("1,2"));
    }

    @Test
    void multipleNumbersSeparatedByCommaShouldReturnSum() {
        assertEquals(10, calc.add("1,2,3,4"));
    }

    @Test
    void numbersSeparatedByNewlineShouldWorkAsDelimiter() {
        assertEquals(6, calc.add("1\n2,3"));
    }

    @Test
    void negativeNumbersShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calc.add("1,-2,3"));
    }
}