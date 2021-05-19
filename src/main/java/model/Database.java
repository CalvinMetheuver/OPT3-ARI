package model;

import java.util.ArrayList;

public class Database {
    private ArrayList<Product> products;

    public Database(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(Product product){
        return products.get(0);
    }
}
