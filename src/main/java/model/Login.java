package model;

import java.util.logging.Logger;

public class Login {

    private static Login singleton;

    private Gebruiker actief;

    public Login() {
        this.actief = null;
    }

    public static Login getInstance(){
        if(singleton == null){
            singleton = new Login();
        }
        return singleton;
    }

    public Gebruiker getActief() {
        return singleton.actief;
    }

    public void setActief(Gebruiker gebruiker) {
        this.actief = gebruiker;
    }
}