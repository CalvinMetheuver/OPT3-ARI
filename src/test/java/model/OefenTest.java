package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OefenTest {

    @Test
    void korting(){
        Oefen test = new Oefen(10);
        assertEquals(0, test.korting(0));
        assertEquals(0, test.korting(1));
        assertEquals(10, test.korting(2));
        assertEquals(10, test.korting(4));
        assertEquals(20, test.korting(5));
        assertEquals(20, test.korting(8));
    }


    @Test
    void verkocht() {
        Oefen nul = new Oefen(10);
        Oefen een = new Oefen(10);
        Oefen twee = new Oefen(10);
        Oefen drie = new Oefen(10);
        Oefen vier = new Oefen(10);
        Oefen vijf = new Oefen(10);

        assertEquals(10, nul.verkocht(false, false,false));
        assertEquals(9, een.verkocht(false, false, true));
        assertEquals(9, twee.verkocht(false, true, false));
        assertEquals(9, drie.verkocht(true, false, false));
        assertEquals(8, vier.verkocht(true, true, false));
        assertEquals(7, vijf.verkocht(true, true, true));

    }

    @Test
    void screenprotector() {
        Oefen test = new Oefen(10);
        assertEquals(15, test.screenprotector("11pro", "bij", 5) );
        test.setVoorraad(10);
        assertEquals(5, test.screenprotector("11pro", "af", 5));
        test.setVoorraad(10);
        assertEquals(10, test.screenprotector("11pro", "X", 5));
        test.setVoorraad(10);
        assertEquals(10, test.screenprotector("8", "bij", 5));
        test.setVoorraad(10);
        assertEquals(10, test.screenprotector("8", "af", 5));
        test.setVoorraad(10);
        assertEquals(10, test.screenprotector("8", "X", 5));
        test.setVoorraad(10);
        assertEquals(12, test.screenprotector("11pro", "bij", 2));
        test.setVoorraad(10);
        assertEquals(8, test.screenprotector("11pro", "af", 2));

    }
}