package model;

public abstract class Product {
    private String naam;
    private int aantal;

    public Product(){
        this.naam = "Iphone ";
        this.aantal = 1;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam(){
        return this.naam;
    };

    public void setAantal(int aantal){
        this.aantal += aantal;
    }

    public int getAantal(){
        return this.aantal;
    }

    public final void nieuwProduct(String model){
        if(batterij()){
            new Batterij(model);
        }
        if(scherm()){
            new Scherm(model);
        }
    }

    protected abstract boolean batterij();
    protected abstract boolean scherm();
}
