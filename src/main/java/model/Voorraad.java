package model;

public class Voorraad {
    private static Voorraad singleton = null;

    private Voorraad(){

    }

    public static Voorraad getInstance(){
        if(singleton == null){
            singleton = new Voorraad();
        }

        return singleton;
    }
}
