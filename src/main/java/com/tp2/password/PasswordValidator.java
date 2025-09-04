package com.tp2.password;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void invalidSiEsMenorA8Caracteres() {
        assertFalse(validator.isValid("Ab1!a")); // 5 chars
    }

    @Test
    void invalidSiNoTieneMayuscula() {
        assertFalse(validator.isValid("abcdef1!"));
    }

    @Test
    void invalidSiNoTieneMinuscula() {
        assertFalse(validator.isValid("ABCDEF1!"));
    }

    @Test
    void invalidSiNoTieneNumero() {
        assertFalse(validator.isValid("Abcdefg!"));
    }

    @Test
    void invalidSiNoTieneEspecial() {
        assertFalse(validator.isValid("Abcdefg1"));
    }

    @Test
    void invalidSiEsNullOVacio() {
        assertFalse(validator.isValid(null));
        assertFalse(validator.isValid(""));
    }

    @Test
    void validCuandoCumpleTodosLosCriterios() {
        assertTrue(validator.isValid("Abcdef1!"));     // 9 chars, A/mayus, b/minus, 1/dígito, !/especial
        assertTrue(validator.isValid("M1c0ntr@seña")); // otro ejemplo
    }
}