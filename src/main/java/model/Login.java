package model;

public class Login {

    private static Login singleton = null;
    private String naam;
    private Login(String naam){
        this.naam = naam;
    }

    public static Login getInstance() {
        if(singleton == null){
            singleton = new Login("noob");
        }

        return singleton;
    }

    public String getNaam() {
        return naam;
    }

    public Boolean loginCheck(String  gebruikersnaam, String wachtwoord){
        if (gebruikersnaam.equals("Arriii_2001") && wachtwoord.equals("ww")){
            singleton = new Login("Arriyan");
            return true;
        } else {
            return false;
        }
    }

    public void loguit(){
        singleton = null;
    }
}
