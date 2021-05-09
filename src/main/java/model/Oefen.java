package model;

public class Oefen {
    private int voorraad;
    public Oefen(int voorraad) {
        this.voorraad = voorraad;
    }

    public int getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(int voorraad) {
        this.voorraad = voorraad;
    }

    public int verkocht(boolean a, boolean b, boolean c){
        if(a || b || c){
            voorraad--;
            if (a && b || a&&c || b&&c){
                if(a&&b&&c){
                    voorraad--;
                }
                voorraad--;
            }
        }
        return voorraad;
    }

    public int screenprotector(String model, String resultaat, int aantal){
        if(model == "11pro"){
            if(resultaat == "bij"){
                voorraad+= aantal;
            }
            if(resultaat == "af"){
                voorraad-= aantal;
            }
        }

        return voorraad;

    }

    public int korting(int aantalProducten){
        if(aantalProducten <= 1){
            return 0;
        } else if(aantalProducten <= 4){
            return 10;
        } else if(aantalProducten >= 5){
            return 20;
        }
        return 0;
    }

}
