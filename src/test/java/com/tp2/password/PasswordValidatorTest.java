package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testTooShort() {
        assertFalse(validator.isValid("abc"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("abcdefgh1!"));
    }

    @Test
    void testNoLowercase() {
        assertFalse(validator.isValid("ABCDEFGH1!"));
    }

    @Test
    void testNoNumber() {
        assertFalse(validator.isValid("Abcdefgh!"));
    }

    @Test
    void testNoSpecialCharacter() {
        assertFalse(validator.isValid("Abcdefg1"));
    }

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Abcdefg1!"));
    }
}
