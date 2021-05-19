package model;

public class Login {

    private static Login singleton = null;


    private Login(){

    }

    public static Login getInstance() {
        if(singleton == null){
            singleton = new Login();
        }

        return singleton;
    }
}
