package asociatie;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apartament implements Comparable<Apartament>, Serializable {


    private static final long serialVersionUID = -3184825063474378470L;
    private int nrCamere;
    private int nrApartament;
    List<Locatar> locList;

    Apartament(int nrCamere, int nrApartament){
        this.nrCamere = nrCamere;
        this.nrApartament = nrApartament;
        locList = new ArrayList<>();
    }

    @Override
    public String toString(){
     return " Apartamentul " + nrApartament + " si are " + locList;

    }

    void addLocatar(Locatar loc){
        locList.add(loc);
    }

    void removeLocatar(){

    }

    public int getNrAp() {
        return nrApartament;
    }


    public List<Locatar> getLocatar() {
        return locList;
    }



    @Override
    public int compareTo(Apartament o) {
        return this.nrApartament - o.nrApartament;
    }
}

