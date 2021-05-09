package model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("Ik ben nog bezig met de GUI");

        System.out.println("1) Er wordt een screenprotector verkocht");
        System.out.println("2) Er wordt een schermreparatie uitgevoerd");
        System.out.println("3) Er wordt geen screenprotector gebruikt");

        System.out.println("Typ het corresponderende nummer: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        if(input == 3){
            System.out.println("De voorraad is onveranderd gebleven.");
            Voorraad.toontotaal();
        }

        System.out.println("Om welke iphone gaat het?");
        int naam = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Om welk model gaat het?");
        int model;
        switch(naam){
            case 8:
                System.out.println("1) 8");
                System.out.printf("2) 8 Plus");
                model = scanner.nextInt();
                scanner.nextLine();
                if(model == 1){

                }
        }




    }
}
