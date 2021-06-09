package model;

public abstract class Model {
    private String naam;

    public Model() {
        this.naam = "Iphone";
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getName(){
        return this.naam;
    }

    public final void samenstelling(String naam){
        if(metBatterij()){
            batterij(new Batterij(naam));
        }
        if (metScreenprotector()){
            screenprotector(new Screenprotector(naam));
        }
        if(metScherm()){
            scherm(new Scherm(naam));
        }
    }


    abstract void batterij(Model naam);
    abstract void screenprotector(Model naam);
    abstract void scherm(Model naam);

    Boolean metBatterij(){
        return false;
    }

    Boolean metScreenprotector(){
        return false;
    }
    Boolean metScherm(){
        return false;
    }

}
