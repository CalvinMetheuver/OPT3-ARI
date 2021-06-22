package model;

public class Leeg {
    private static int bestelnummer = 1;

    public static void empty(){

        if (Voorraad.getInstance().checkProducts().size() != 0) {
            System.out.println("-------------------");
            System.out.println("Bestelnummer: " + bestelnummer);
            for (Product op : Voorraad.getInstance().checkProducts()) {
                System.out.println(op.getNaam() + " is op!");
            }
            System.out.println("-------------------");
            bestelnummer++;
        } else{
            System.out.println("Alles is op voorraad");
        }
    }
}
