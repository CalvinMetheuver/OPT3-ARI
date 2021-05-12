package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class Database {
    Login log = Login.getInstance();

    private static Database singleton;

    private ArrayList<Gebruiker> gebruikers;

    private Database(){
        gebruikers = new ArrayList<Gebruiker>();
    }

    public static Database getInstance(){
        if(singleton == null){
            singleton = new Database();
        }
        return singleton;
    }

    public void readUsers(String fileName) throws FileNotFoundException, ParseException {
        File file = new File(fileName);
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));

        while (scanner.hasNextLine()) {

            String[] split = scanner.nextLine().split(", ");
            String gebruikersnaam = split[0];
            String wachtwoord = split[1];

            gebruikers.add(new Gebruiker(gebruikersnaam, wachtwoord));
        }
    }

    public Gebruiker loginCheck(String gb, String  ww){
        for (Gebruiker g: gebruikers){
            if(gb.equals(g.getGebruikersnaam()) && ww.equals(g.getWachtwoord())){
                log.setActief(g);
                return g;
            }
        }
        return null;
    }
}


