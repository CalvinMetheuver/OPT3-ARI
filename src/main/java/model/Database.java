package model;

import java.util.Scanner;

public class Database {
    Voorraad voorraad;
    Batterij batterij;
    Scherm scherm;
    Screenprotector screenprotector;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("---------------------");

        System.out.println("Voer uw gebruikersnaam in");
        String gebruikersnaam = scanner.nextLine();

        System.out.println("Voer uw wachtwoord in");
        String ww = scanner.nextLine();

        Login.getInstance().loginCheck(gebruikersnaam, ww);

        if (Login.getInstance().getNaam().equals("Arriyan")) {
            System.out.println("Succesvol Login");
            System.out.println("---------------------");

            menu(voorraad);
        } else {
            System.out.println("Login gefaald, probeer nogmaals");
        }

    }

    public void menu(Voorraad voorraad) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ het corresponderende nummer");
        int antwoord = 0;
        int model = 0;
        int onderdeel = 0;


        while (antwoord != 5) {

            System.out.println("\nMenu:");

            System.out.println("1)  Toevoegen product");
            System.out.println("2)  Verwijderen product");
            System.out.println("3)  Alle producten");
            System.out.println("4)  Specifiek product");
            System.out.println("5)  Log uit");


            antwoord = scanner.nextInt();
            scanner.nextLine();


            switch (antwoord) {
                case 1:
                    System.out.println("Welk model?");
                    System.out.println("1) Iphone 8");
                    System.out.println("2) Iphone SE");
                    System.out.println("3) Iphone X");
                    System.out.println("4) Iphone 11");
                    System.out.println("5) Iphone 12");

                    model = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Welk onderdeel?");
                    System.out.println("1) Batterij");
                    System.out.println("2) Scherm");
                    System.out.println("3) Screenprotector");

                    onderdeel = scanner.nextInt();
                    scanner.nextLine();

                    switch (onderdeel) {
                        case 1:
                            switch (model) {
                                case 1:
                                    batterij = new Batterij("8");
                                    batterij.ask("8");
                                    break;
                                case 2:
                                    batterij = new Batterij("SE");
                                    batterij.ask("SE");
                                    break;
                                case 3:
                                    batterij = new Batterij("X");
                                    batterij.ask("X");
                                    break;
                                case 4:
                                    batterij = new Batterij("11");
                                    batterij.ask("11");
                                    break;
                                case 5:
                                    batterij = new Batterij("12");
                                    batterij.ask("12");
                                    break;
                            }
                            break;

                        case 2:
                            switch (model) {
                                case 1:
                                    scherm = new Scherm("8");
                                    scherm.ask("8");
                                    break;
                                case 2:
                                    scherm = new Scherm("SE");
                                    scherm.ask("SE");
                                    break;
                                case 3:
                                    scherm = new Scherm("X");
                                    scherm.ask("X");
                                    break;
                                case 4:
                                    scherm = new Scherm("11");
                                    scherm.ask("11");
                                    break;
                                case 5:
                                    scherm = new Scherm("12");
                                    scherm.ask("12");
                                    break;
                            }
                            break;

                        case 3:
                            switch (model) {
                                case 1:
                                    screenprotector = new Screenprotector("8");
                                    screenprotector.ask("8");
                                    break;
                                case 2:
                                    screenprotector = new Screenprotector("SE");
                                    screenprotector.ask("SE");
                                    break;
                                case 3:
                                    screenprotector = new Screenprotector("X");
                                    screenprotector.ask("X");
                                    break;
                                case 4:
                                    screenprotector = new Screenprotector("11");
                                    screenprotector.ask("11");
                                    break;
                                case 5:
                                    screenprotector = new Screenprotector("12");
                                    screenprotector.ask("12");
                                    break;
                            }
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Welk model?");
                    System.out.println("1) Iphone 8");
                    System.out.println("2) Iphone SE");
                    System.out.println("3) Iphone X");
                    System.out.println("4) Iphone 11");
                    System.out.println("5) Iphone 12");

                    model = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Welk onderdeel?");
                    System.out.println("1) Batterij");
                    System.out.println("2) Scherm");
                    System.out.println("3) Screenprotector");

                    onderdeel = scanner.nextInt();
                    scanner.nextLine();

                    switch (onderdeel) {
                        case 1:
                            switch (model) {
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
                            switch (model) {
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
                            switch (model) {
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
                    System.out.println("Welk model?");
                    System.out.println("1) Iphone 8");
                    System.out.println("2) Iphone SE");
                    System.out.println("3) Iphone X");
                    System.out.println("4) Iphone 11");
                    System.out.println("5) Iphone 12");

                    model = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Welk onderdeel?");
                    System.out.println("1) Batterij");
                    System.out.println("2) Scherm");
                    System.out.println("3) Screenprotector");

                    onderdeel = scanner.nextInt();
                    scanner.nextLine();

                    switch (onderdeel) {
                        case 1:
                            switch (model) {
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
                            switch (model) {
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
                            switch (model) {
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

            }
        }
        return;
    }
}
