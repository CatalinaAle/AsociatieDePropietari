package asociatie;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Asociatie implements Serializable {

    private static final long serialVersionUID = 748638099380973L;
    List<Apartament> apList;

    Asociatie(List<Apartament> apList){

        this.apList = apList;
    }

    @Override
    public String toString(){
        return "Asociatia are apartamentele: " + apList;

    }



    void getAllLocatar(List<Locatar> locList){

    }

   public List<Locatar> getAllLocatarUnsorted(){
        List<Locatar> tempList = new ArrayList<>();

        for(Apartament e: apList){
           tempList.addAll(e.getLocatar()) ;
        }
        return tempList;

    }

    public List<Locatar> getLocatarByName(){
        List<Locatar> locatar = getAllLocatarUnsorted();

        Collections.sort(locatar,new Locatar.ComparatorName());
        return locatar;

    }

    public List<Locatar> getLocatarByAp(){
        List<Locatar> loc = getAllLocatarUnsorted();
        Collections.sort(loc,new Locatar.ComparatorAp());
        return loc;
    }

    void registerLocatarToApartamnet(Locatar locatar,Apartament apartament){

    }

    public void save(){

        try{
            FileOutputStream file = new FileOutputStream("asoc.db");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);

            out.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println("IOException is caught");
        }
    }

    public static Asociatie load(){

        Asociatie obj = null;
        try{
            FileInputStream file = new FileInputStream("asoc.db");
            ObjectInputStream in = new ObjectInputStream(file);

            obj = (Asociatie) in.readObject();

            in.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }


}
