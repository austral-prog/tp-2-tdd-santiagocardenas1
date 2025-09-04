package com.tp2.roman;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

    private final RomanNumerals roman = new RomanNumerals();

    @Test
    void casosBasicos() {
        assertEquals("I", roman.convert(1));
        assertEquals("V", roman.convert(5));
        assertEquals("X", roman.convert(10));
        assertEquals("L", roman.convert(50));
        assertEquals("C", roman.convert(100));
        assertEquals("D", roman.convert(500));
        assertEquals("M", roman.convert(1000));
    }

    @Test
    void casosDeSustraccion() {
        assertEquals("IV", roman.convert(4));
        assertEquals("IX", roman.convert(9));
        assertEquals("XL", roman.convert(40));
        assertEquals("XC", roman.convert(90));
        assertEquals("CD", roman.convert(400));
        assertEquals("CM", roman.convert(900));
    }

    @Test
    void casoComplejo() {
        assertEquals("MCMXCIV", roman.convert(1994));
    }
}