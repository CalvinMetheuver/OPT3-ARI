package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatterijTest {

    @Test
    void batterij() {
        Batterij batterij = new Batterij("9");
        assertTrue(batterij.batterij());
    }

    @Test
    void scherm() {
        Batterij batterij = new Batterij("10");
        assertFalse(batterij.scherm());
    }
}