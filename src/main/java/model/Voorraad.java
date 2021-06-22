package model;

import java.util.ArrayList;


public class Voorraad {
    private static Voorraad singleton = null;

    private ArrayList<Product> producten;

    private Voorraad() {
        producten = new ArrayList<>();
    }

    public static Voorraad getInstance() {
        if(singleton == null){
            singleton = new Voorraad();
        }
        return singleton;
    }

    public void addProduct(Product product) {
        for (Product p: producten){
            if(p.getNaam().equals(product.getNaam())){
                p.setAantal(1);
                System.out.println("Het product " + product.getNaam() + " is toegevoegd aan de voorraad" );
                return;
            }
        }
        producten.add(product);
    }

    public void removeProduct(Product product){
        for(Product p: producten){
            if(p.getNaam().equals(product.getNaam())){
                if(p.getAantal()>0) {
                    p.setAantal(-1);
                    System.out.println("Het product " + product.getNaam() + " is verwijderd uit de voorraad");
                } else{
                    System.out.println("MISLUKT, PRODUCT NIET OP VOORRAAD");
                }
            }
        }
    }

    public Product getProduct(String naam){
        for (Product p: producten){
            if (p.getNaam().equals(naam)){
                return p;
            }
        }
        return null;
    }

    public void showAll(){
        if(producten.size() != 0) {
            for (Product m : producten) {
                System.out.println(m.getAantal() + "x " + m.getNaam());
            }
        }else{
            System.out.println("Er staan geen producten opgeslagen in de database");
        }
    }

    public ArrayList<Product> checkProducts(){
        int leeg = 1;
        ArrayList<Product> op = new ArrayList<>();
        for (Product p: producten){
            if(p.getAantal()<= leeg){
                op.add(p);
            }
        }
        return op;
    }

    public ArrayList<Product> getProducten(){
        return producten;
    }

}
