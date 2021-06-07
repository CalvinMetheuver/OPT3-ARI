package model;

import java.util.ArrayList;


public class Voorraad {
    private static Voorraad singleton = null;

    private ArrayList<Model> products;


    private Voorraad() {
        products = new ArrayList<>();
    }

    public static Voorraad getInstance() {
        if(singleton == null){
            singleton = new Voorraad();
        }
        return singleton;
    }

    public void addProduct(Model x) {
        products.add(x);
        System.out.println(x.getName() + " is toegevoegd aan de voorraad");
    }

    public void removeProduct(String name){
        if (products.size() != 0) {
            for (Model m : products) {
                if (m.getName().equals(name)) {
                    System.out.println(name + " is verwijderd");
                    products.remove(m);
                    break;
                } else {
                    System.out.println(name + " niet gevonden in de voorraad");
                }
            }
        } else{
            System.out.println("De voorraad is leeg");
        }
    }

    public void showAll(){
        if(products.size() != 0) {
            for (Model m : products) {
                System.out.println(m.getName());
            }
        }else{
            System.out.println("De voorraad is leeg");
        }
    }

    public void showProduct(String name){
        int aantal = 0;
        if(products.size() != 0){
            for (Model m:products){
                if(m.getName().equals(name)){
                    aantal++;
                }
            }
        }
        if(aantal == 1){
            System.out.println("Er is " + aantal + " " + name );
        }else {
            System.out.println("Er zijn " + aantal + " " + name+ "en");
        }
    }
}
