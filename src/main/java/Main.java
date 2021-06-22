import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        setup();
        Boolean actief = inloggen();
        while (actief){

            if(menu()){
                return;
            }

        }
        System.out.println("Vanwege veiligheidsredenen wordt het programma afgesloten door een foute inlogpoging");

        //JavaFXApp.main(args);
    }

    private static void setup() {
        Batterij batterij = new Batterij("X");
        Scherm scherm = new Scherm("X");

        batterij.nieuwProduct("11");
        scherm.nieuwProduct("11");

        batterij.nieuwProduct("12");
        scherm.nieuwProduct("12");
    }

    private static Boolean inloggen(){
        Scanner scanner = new Scanner(System.in);
        String gebruikersnaam;
        String wachtwoord;
        System.out.println("--------------------------");
        System.out.println("Voer uw gebruikersnaam in:");
        gebruikersnaam = scanner.nextLine();
        System.out.println("Voer uw wachtwoord in:");
        wachtwoord = scanner.nextLine();
        System.out.println("--------------------------");
        return Login.getInstance().loginCheck(gebruikersnaam, wachtwoord);
    }

    private static Boolean menu() {
        switch (keuze()) {
            case (1):
                addProduct();
                break;
            case (2):
                removeProduct();
                break;
            case (3):
                Voorraad.getInstance().showAll();
                break;
            case (4):
                Leeg.empty();
                break;
            case (5):
                Login.getInstance().loguit();
                return true;
        }
        return false;
    }

    private static int keuze() {
        Scanner scanner = new Scanner(System.in);
        int keuze;
        System.out.println("");
        System.out.println("Typ het corresponderende nummer.");
        System.out.println("------------------------");
        System.out.println("1) Product toevoegen");
        System.out.println("2) Product verwijderen");
        System.out.println("3) Alle producten bekijken");
        System.out.println("4) Melding van lege producten");
        System.out.println("5) Uitloggen");

        keuze = scanner.nextInt();
        scanner.nextLine();
        return keuze;
    }

    private static int product() {
        Scanner scanner = new Scanner(System.in);
        int productkeuze;
        System.out.println("Om welk product gaat het");
        System.out.println("------------------------");
        System.out.println("1) Batterij");
        System.out.println("2) Scherm");

        productkeuze = scanner.nextInt();
        scanner.nextLine();
        return productkeuze;
    }

    private static int model() {
        Scanner scanner = new Scanner(System.in);
        int modelkeuze;
        System.out.println("Om welk model gaat het");
        System.out.println("------------------------");
        System.out.println("1) Iphone X");
        System.out.println("2) Iphone 11");
        System.out.println("3) Iphone 12");

        modelkeuze = scanner.nextInt();
        scanner.nextLine();

        return modelkeuze;

    }

    private static void addProduct() {
        int productkeuze = product();
        int modelkeuze = model();
        switch (modelkeuze) {
            case (1):
                switch (productkeuze) {
                    case (1):
                        Voorraad.getInstance().addProduct(Voorraad.getInstance().getProduct("Iphone X Batterij"));
                        break;
                    case (2):
                        Voorraad.getInstance().addProduct(Voorraad.getInstance().getProduct("Iphone X Scherm"));
                        break;
                }
                break;

            case (2):
                switch (productkeuze) {
                    case (1):
                        Voorraad.getInstance().addProduct(Voorraad.getInstance().getProduct("Iphone 11 Batterij"));
                        break;
                    case (2):
                        Voorraad.getInstance().addProduct(Voorraad.getInstance().getProduct("Iphone 11 Scherm"));
                        break;
                }
                break;

            case (3):
                switch (productkeuze) {
                    case (1):
                        Voorraad.getInstance().addProduct(Voorraad.getInstance().getProduct("Iphone 12 Batterij"));
                        break;
                    case (2):
                        Voorraad.getInstance().addProduct(Voorraad.getInstance().getProduct("Iphone 12 Scherm"));
                        break;
                }
                break;
        }
    }



    private static void removeProduct() {
        int productkeuze = product();
        int modelkeuze = model();
        switch (modelkeuze) {
            case (1):
                switch (productkeuze) {
                    case (1):
                        Voorraad.getInstance().removeProduct(Voorraad.getInstance().getProduct("Iphone X Batterij"));
                        break;
                    case (2):
                        Voorraad.getInstance().removeProduct(Voorraad.getInstance().getProduct("Iphone X Scherm"));
                        break;
                }
                break;

            case (2):
                switch (productkeuze) {
                    case (1):
                        Voorraad.getInstance().removeProduct(Voorraad.getInstance().getProduct("Iphone 11 Batterij"));
                        break;
                    case (2):
                        Voorraad.getInstance().removeProduct(Voorraad.getInstance().getProduct("Iphone 11 Scherm"));
                        break;
                }
                break;

            case (3):
                switch (productkeuze) {
                    case (1):
                        Voorraad.getInstance().removeProduct(Voorraad.getInstance().getProduct("Iphone 12 Batterij"));
                        break;
                    case (2):
                        Voorraad.getInstance().removeProduct(Voorraad.getInstance().getProduct("Iphone 12 Scherm"));
                        break;
                }
                break;
        }
    }
}





