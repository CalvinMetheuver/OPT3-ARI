package model;

public class Product {

    private String naam;
    private String model;
    private double kost;
    //oefen

    public Product(String naam, String model, double kost) {
        this.naam = naam;
        this.model = model;
        this.kost = kost;
    }

    public String getNaam() {
        return naam;
    }

    public String getModel() {
        return model;
    }
}
