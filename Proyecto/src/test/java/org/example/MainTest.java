package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void cambiarValorANumero() {
        assertAll(
                () -> assertEquals(1879,Main.cambiarValorANumero("1879")),
                () -> assertEquals(1351,Main.cambiarValorANumero("1351")),
                () -> assertEquals(1899,Main.cambiarValorANumero("1899")),
                () -> assertEquals(-1,Main.cambiarValorANumero("a")),
                () -> assertEquals(1900,Main.cambiarValorANumero("1900")),
                () -> assertEquals(-1,Main.cambiarValorANumero("ocho"))
        );
    }

    @Test
    void comprobarCondicion() {
        assertAll(
                () -> assertTrue(Main.comprobarCondicion(1859)),
                () -> assertTrue(Main.comprobarCondicion(45)),
                () -> assertTrue(Main.comprobarCondicion(1899)),
                () -> assertFalse(Main.comprobarCondicion(0)),
                () -> assertFalse(Main.comprobarCondicion(2040)),
                () -> assertFalse(Main.comprobarCondicion(-7))
        );
    }
}