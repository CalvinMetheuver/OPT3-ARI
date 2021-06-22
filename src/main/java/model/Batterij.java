package model;

public class Batterij extends Product {
    private final String naam = "Batterij";

    public Batterij(String model){
        super.setNaam(super.getNaam() + model + " " + naam);
        
        Voorraad.getInstance().addProduct(this);
    }


    @Override
    protected boolean batterij() {
        return true;
    }

    @Override
    protected boolean scherm() {
        return false;
    }
}
