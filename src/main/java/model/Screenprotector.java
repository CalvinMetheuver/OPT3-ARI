package model;

public class Screenprotector extends Model {

    private String naam;

    public Screenprotector(String naam) {
        super();
        super.setNaam(super.getName() + " " + naam + " Screenprotector");
    }

    Boolean metScreenprotector(){
        return true;
    }


    @Override
    void batterij(Model naam) {
    }

    @Override
    void screenprotector(Model naam) {
        Voorraad.getInstance().addProduct(naam);
    }

    @Override
    void scherm(Model naam){

    }

}
