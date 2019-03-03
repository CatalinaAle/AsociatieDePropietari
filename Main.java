package asociatie;

import sun.security.krb5.internal.APOptions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
     /*   List<Apartament> x =new ArrayList<Apartament>();
        List<Locatar> y = new ArrayList<Locatar>();

        Apartament ap = new Apartament(2,1);
        Apartament ap1 = new Apartament(2,2);
        Apartament ap2 = new Apartament(3,3);

        x.add(ap);
        x.add(ap1);
        x.add(ap2);

        Locatar loc = new Locatar("Andreea",ap);
        Locatar loc1 = new Locatar("Gabriel",ap1);
        Locatar loc2 = new Locatar("Catalina",ap2);

        ap.addLocatar(loc);
        ap1.addLocatar(loc1);
        ap2.addLocatar(loc2);


        Asociatie obj = new Asociatie(x);

        //System.out.println(obj.getAllLocatarUnsorted());
        // System.out.println(obj.getLocatarByName());
       // System.out.println(obj.getLocatarByAp());

      */

        Asociatie aaa = Asociatie.load();
        System.out.println(aaa);
        System.out.println(aaa.getLocatarByAp());










    }
}
