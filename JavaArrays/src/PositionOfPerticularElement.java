import java.util.ArrayList;

public class PositionOfPerticularElement {
    //java main method
    public static void main(String[]args){


        ArrayList<String >namelist = new ArrayList<String>();//Array list

        namelist.add("Kajal");
        namelist.add("Mohit");
        namelist.add("Binal");
        namelist.add("Bhakti");
        namelist.add("Kanan");
        System.out.println(namelist);

        namelist.add(3,"Kajal");//insert index and element

        System.out.println(namelist);
    }
}
