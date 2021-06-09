package model;

public class Scherm extends Model {
    Voorraad voorraad;

    private String naam;

    public Scherm(String naam) {
        super();
        super.setNaam(super.getName() + " " + naam + " Scherm");

    }

    Boolean metScherm(){
        return true;
    }


    @Override
    void batterij(Model naam) {
    }

    @Override
    void screenprotector(Model naam) {
    }

    @Override
    void scherm(Model naam) {
        Voorraad.getInstance().addProduct(naam);
    }

}
