package model;

public class Database {
    private static Database singleton;
    Voorraad voorraad = Voorraad.getInstance();

    private Database(){
        Voorraad.getInstance();
    }
    public static Database getInstance(){
        if(singleton == null){
            singleton = new Database();
        }

        return singleton;
    }

    public Voorraad getVoorraad(){
        return voorraad;
    }
}
