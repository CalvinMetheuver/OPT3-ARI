package model;

public class Scherm extends Product {
    private final String naam = "Scherm";

    public Scherm(String model){

        super.setNaam(super.getNaam() + model + " " + naam);

        Voorraad.getInstance().addProduct(this);
    }

    @Override
    protected boolean batterij() {
        return false;
    }

    @Override
    protected boolean scherm() {
        return true;
    }
}
