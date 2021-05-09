package model;

import java.util.ArrayList;

public class Voorraad {

    private static ArrayList<Product> voorraad = new ArrayList<Product>();


    public static void addProduct(String naam, String model, double kost){
        voorraad.add(new Product(naam, model, kost));
    }

    public static void toonModel(String naam, String model){
        int count = 0;
        for(Product product : voorraad){
            if(model == product.getModel() && naam == product.getNaam()){
                count++;

            }
        }
        System.out.println(count + " Iphone" + model + " " + naam);
    }

    public static void verwProduct(String naam, String model){
        toonModel(naam, model);
        for(Product product : voorraad){
            if(model == product.getModel() && naam == product.getNaam()){
                System.out.println("IN");
                voorraad.remove(product);
                break;
            }
        }
        toonModel(naam, model);

    }

    public static void toontotaal() {

    }
}
