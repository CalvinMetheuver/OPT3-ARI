import model.Batterij;
import model.Database;
import model.Model;
import model.Voorraad;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        Database x = new Database();


        x.menu(Voorraad.getInstance());

        //JavaFXApp.main(args);
    }
}
