package com.tp2.leapyear;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LeapYearTest {

    @Test
    void testDivisiblePor4() {
        assertTrue(LeapYear.isLeap(2024));
    }

    @Test
    void testDivisiblePor100NoEsBisiesto() {
        assertFalse(LeapYear.isLeap(1900));
    }

    @Test
    void testDivisiblePor400EsBisiesto() {
        assertTrue(LeapYear.isLeap(2000));
    }

    @Test
    void testNoDivisiblePor4() {
        assertFalse(LeapYear.isLeap(2023));
    }
}