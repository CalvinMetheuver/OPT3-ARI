package model;

public class Batterij extends Model {

    private String naam;

    public Batterij(String naam) {
        super();
        super.setNaam(super.getName() + " " + naam + " Batterij");
    }

    Boolean metBatterij(){
        return true;
    }


    @Override
    void batterij(Model naam) {
        Voorraad.getInstance().addProduct(naam);
    }

    @Override
    void screenprotector(Model naam) {

    }

    @Override
    void scherm(Model naam) {

    }

}
