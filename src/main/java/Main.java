import model.Menu;
import model.Oefen;
import model.Voorraad;

public class Main {
    public static void main(String[] args) {
        //JavaFXApp.main(args);

        //model.Product screenprotector11pro = new model.Product("screenprotector", "11pro", 12.50);

        //Voorraad.addProduct("scrpro", "11pro", 12.5);
        //Voorraad.addProduct("scrpro", "12pro", 15.5);
        Voorraad.addProduct("batterij", "X", 17.5);
        Voorraad.addProduct("batterij", "X", 17.5);

        Voorraad.toonModel("batterij", "X");
        Voorraad.verwProduct("batterij", "X");

        Oefen test = new Oefen(10);
        System.out.println(test.screenprotector("11pro", "bij", 4));



        Menu menu = new Menu();
        //menu.run();
    }
}
