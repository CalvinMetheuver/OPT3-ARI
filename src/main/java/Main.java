import model.Database;
import model.Gebruiker;
import model.Login;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Database db = Database.getInstance();
        db.readUsers("Account");

        Login log = Login.getInstance();

        Gebruiker c = new Gebruiker("gb", "ww");
        log.setActief(c);
        System.out.println(log.getActief());


        JavaFXApp.main(args);
    }
}
