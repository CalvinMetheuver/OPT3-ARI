package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    @Test
    void loginCheck() {
        assertFalse(Login.getInstance().loginCheck("FOUT", "ww"));
        assertFalse(Login.getInstance().loginCheck("Arriii_2001", "FOUT"));
        assertTrue(Login.getInstance().loginCheck("Arriii_2001", "ww"));
    }
}