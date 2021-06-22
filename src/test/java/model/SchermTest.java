package model;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ScheduledExecutorService;

import static org.junit.jupiter.api.Assertions.*;

class SchermTest {

    @Test
    void batterij() {
        Scherm scherm = new Scherm("9");
        assertFalse(scherm.batterij());
    }

    @Test
    void scherm() {
        Scherm scherm = new Scherm("10");
        assertTrue(scherm.scherm());
    }


}