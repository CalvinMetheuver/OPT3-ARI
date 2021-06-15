package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoorraadTest {

    @Test
    void addProduct() {
        Voorraad v = Voorraad.getInstance();
        Voorraad.getInstance().addProduct(new Batterij("8"));
        

    }

    @Test
    void removeProduct() {
    }
}