package asociatie;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

public class Locatar implements Serializable {

    private static final long serialVersionUID = 6174098234516460158L;

    public static class ComparatorName implements Comparator<Locatar>{


        @Override
        public int compare(Locatar o1, Locatar o2) {
            return o1.nume.compareTo(o2.nume);
        }
    }

    public static class ComparatorAp implements Comparator<Locatar>{

        @Override
        public int compare(Locatar o1, Locatar o2) {
            return o1.ap.compareTo(o2.ap);
        }
    }


    private String nume;
    private Apartament ap;

    Locatar(String nume, Apartament ap){
        this.nume = nume;
        this.ap = ap;
    }

    @Override
    public String toString(){
        return  ap.getNrAp() + " locuieste " + nume;
    }
}
