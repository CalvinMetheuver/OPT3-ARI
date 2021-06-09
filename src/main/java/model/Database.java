package model;

import java.util.Scanner;

public class Database {
    Scanner scanner = new Scanner(System.in);

    int antwoord = 0;
    int model = 0;
    int onderdeel = 0;

    Batterij batterij;
    Scherm scherm;
    Screenprotector screenprotector;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int poging = 0;

        while(poging <3) {
            System.out.println("---------------------");
            System.out.println("---------------------");

            System.out.println("Voer uw gebruikersnaam in");
            String gebruikersnaam = scanner.nextLine();

            System.out.println("Voer uw wachtwoord in");
            String ww = scanner.nextLine();

            Login.getInstance().loginCheck(gebruikersnaam, ww);

            if(gebruikersnaam.equals("0") && ww.equals("0")){
                return;
            }

            if (Login.getInstance().getNaam().equals("Arriyan")) {
                System.out.println("Succesvol Login");
                System.out.println("---------------------");

                opties(Voorraad.getInstance());
                poging = 0;
            } else {
                poging++;
                System.out.println("Login gefaald" + ", kans " + poging + "/3");

            }
        }
        return;

    }

    private int model(){
        System.out.println("Welk model?");
        System.out.println("1) Iphone 8");
        System.out.println("2) Iphone SE");
        System.out.println("3) Iphone X");
        System.out.println("4) Iphone 11");
        System.out.println("5) Iphone 12");

        model = scanner.nextInt();
        scanner.nextLine();

        return model;
    }

    private int onderdeel(){
        System.out.println("Welk onderdeel?");
        System.out.println("1) Batterij");
        System.out.println("2) Scherm");
        System.out.println("3) Screenprotector");

        onderdeel = scanner.nextInt();
        scanner.nextLine();

        return onderdeel;
    }

    private int menu (){
        System.out.println("\nMenu:");

        System.out.println("1)  Toevoegen product");
        System.out.println("2)  Verwijderen product");
        System.out.println("3)  Alle producten");
        System.out.println("4)  Specifiek product");
        System.out.println("5)  Specifiek model");
        System.out.println("6)  Log uit");

        antwoord = scanner.nextInt();
        scanner.nextLine();

        return antwoord;

    }

    public void opties(Voorraad voorraad) {

        System.out.println("Typ het corresponderende nummer");

        int ant = 0;

        while (ant != 6) {
            ant = menu();
            switch (ant) {
                case 1:
                    switch (onderdeel()) {
                        case 1:
                            switch (model()) {
                                case 1:
                                    batterij = new Batterij("8");
                                    batterij.samenstelling("8");
                                    break;
                                case 2:
                                    batterij = new Batterij("SE");
                                    batterij.samenstelling("SE");
                                    break;
                                case 3:
                                    batterij = new Batterij("X");
                                    batterij.samenstelling("X");
                                    break;
                                case 4:
                                    batterij = new Batterij("11");
                                    batterij.samenstelling("11");
                                    break;
                                case 5:
                                    batterij = new Batterij("12");
                                    batterij.samenstelling("12");
                                    break;
                            }
                            break;

                        case 2:
                            switch (model()) {
                                case 1:
                                    scherm = new Scherm("8");
                                    scherm.samenstelling("8");
                                    break;
                                case 2:
                                    scherm = new Scherm("SE");
                                    scherm.samenstelling("SE");
                                    break;
                                case 3:
                                    scherm = new Scherm("X");
                                    scherm.samenstelling("X");
                                    break;
                                case 4:
                                    scherm = new Scherm("11");
                                    scherm.samenstelling("11");
                                    break;
                                case 5:
                                    scherm = new Scherm("12");
                                    scherm.samenstelling("12");
                                    break;
                            }
                            break;

                        case 3:
                            switch (model()) {
                                case 1:
                                    screenprotector = new Screenprotector("8");
                                    screenprotector.samenstelling("8");
                                    break;
                                case 2:
                                    screenprotector = new Screenprotector("SE");
                                    screenprotector.samenstelling("SE");
                                    break;
                                case 3:
                                    screenprotector = new Screenprotector("X");
                                    screenprotector.samenstelling("X");
                                    break;
                                case 4:
                                    screenprotector = new Screenprotector("11");
                                    screenprotector.samenstelling("11");
                                    break;
                                case 5:
                                    screenprotector = new Screenprotector("12");
                                    screenprotector.samenstelling("12");
                                    break;
                            }
                            break;
                    }
                    break;

                case 2:
                    switch (onderdeel()) {
                        case 1:
                            switch (model()) {
                                case 1:
                                    Voorraad.getInstance().removeProduct("Iphone 8 Batterij");
                                    break;
                                case 2:
                                    Voorraad.getInstance().removeProduct("Iphone SE Batterij");
                                    break;
                                case 3:
                                    Voorraad.getInstance().removeProduct("Iphone X Batterij");
                                    break;
                                case 4:
                                    Voorraad.getInstance().removeProduct("Iphone 11 Batterij");
                                    break;
                                case 5:
                                    Voorraad.getInstance().removeProduct("Iphone 12 Batterij");
                                    break;
                            }
                            break;

                        case 2:
                            switch (model()) {
                                case 1:
                                    Voorraad.getInstance().removeProduct("Iphone 8 Scherm");
                                    break;
                                case 2:
                                    Voorraad.getInstance().removeProduct("Iphone SE Scherm");
                                    break;
                                case 3:
                                    Voorraad.getInstance().removeProduct("Iphone X Scherm");
                                    break;
                                case 4:
                                    Voorraad.getInstance().removeProduct("Iphone 11 Scherm");
                                    break;
                                case 5:
                                    Voorraad.getInstance().removeProduct("Iphone 12 Scherm");
                                    break;
                            }
                            break;

                        case 3:
                            switch (model()) {
                                case 1:
                                    Voorraad.getInstance().removeProduct("Iphone 8 Screenprotector");
                                    break;
                                case 2:
                                    Voorraad.getInstance().removeProduct("Iphone SE Screenprotector");
                                    break;
                                case 3:
                                    Voorraad.getInstance().removeProduct("Iphone X Screenprotector");
                                    break;
                                case 4:
                                    Voorraad.getInstance().removeProduct("Iphone 11 Screenprotector");
                                    break;
                                case 5:
                                    Voorraad.getInstance().removeProduct("Iphone 12 Screenprotector");
                                    break;
                            }
                            break;

                    }
                    break;

                case 3:
                    Voorraad.getInstance().showAll();
                    break;
                case 4:
                    switch (onderdeel()) {
                        case 1:
                            switch (model()) {
                                case 1:
                                    Voorraad.getInstance().showProduct("Iphone 8 Batterij");
                                    break;

                                case 2:
                                    Voorraad.getInstance().showProduct("Iphone SE Batterij");
                                    break;
                                case 3:
                                    Voorraad.getInstance().showProduct("Iphone X Batterij");
                                    break;
                                case 4:
                                    Voorraad.getInstance().showProduct("Iphone 11 Batterij");
                                    break;
                                case 5:
                                    Voorraad.getInstance().showProduct("Iphone 12 Batterij");
                                    break;
                            }
                            break;

                        case 2:
                            switch (model()) {
                                case 1:
                                    Voorraad.getInstance().showProduct("Iphone 8 Scherm");
                                    break;
                                case 2:
                                    Voorraad.getInstance().showProduct("Iphone SE Scherm");
                                    break;
                                case 3:
                                    Voorraad.getInstance().showProduct("Iphone X Scherm");
                                    break;
                                case 4:
                                    Voorraad.getInstance().showProduct("Iphone 11 Scherm");
                                    break;
                                case 5:
                                    Voorraad.getInstance().showProduct("Iphone 12 Scherm");
                                    break;
                            }
                            break;

                        case 3:
                            switch (model()) {
                                case 1:
                                    Voorraad.getInstance().showProduct("Iphone 8 Screenprotector");
                                    break;
                                case 2:
                                    Voorraad.getInstance().showProduct("Iphone SE Screenprotector");
                                    break;
                                case 3:
                                    Voorraad.getInstance().showProduct("Iphone X Screenprotector");
                                    break;
                                case 4:
                                    Voorraad.getInstance().showProduct("Iphone 11 Screenprotector");
                                    break;
                                case 5:
                                    Voorraad.getInstance().showProduct("Iphone 12 Screenprotector");
                                    break;
                            }
                            break;

                    }
                    break;
                case 5:

                    switch (model()) {
                        case 1:
                            Voorraad.getInstance().showProduct("Iphone 8 Batterij");
                            Voorraad.getInstance().showProduct("Iphone 8 Scherm");
                            Voorraad.getInstance().showProduct("Iphone 8 Screenprotector");
                            break;
                        case 2:
                            Voorraad.getInstance().showProduct("Iphone SE Batterij");
                            Voorraad.getInstance().showProduct("Iphone SE Scherm");
                            Voorraad.getInstance().showProduct("Iphone SE Screenprotector");
                            break;
                        case 3:
                            Voorraad.getInstance().showProduct("Iphone X Batterij");
                            Voorraad.getInstance().showProduct("Iphone X Scherm");
                            Voorraad.getInstance().showProduct("Iphone X Screenprotector");
                            break;
                        case 4:
                            Voorraad.getInstance().showProduct("Iphone 11 Batterij");
                            Voorraad.getInstance().showProduct("Iphone 11 Scherm");
                            Voorraad.getInstance().showProduct("Iphone 11 Screenprotector");
                            break;
                        case 5:
                            Voorraad.getInstance().showProduct("Iphone 12 Batterij");
                            Voorraad.getInstance().showProduct("Iphone 12 Scherm");
                            Voorraad.getInstance().showProduct("Iphone 12 Screenprotector");
                            break;
                    }
                    break;

                case 6:
                    Login.getInstance().loguit();
            }
        }
    }
}
