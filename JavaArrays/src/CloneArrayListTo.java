import java.util.ArrayList;

public class CloneArrayListTo {
    // java main method
    public static void main(String[]args){


        ArrayList<String> al = new ArrayList<String>();//Create object to store data

        al.add("Aakash");
        al.add("Aamir");
        al.add("Amrish");
        al.add("Amit");
        System.out.println("ArrayList: "+ al);

        ArrayList<String> al2 =(ArrayList<String>)al.clone();//Clone Arraylist
        System.out.println("ArrayList copy: "+ al2);

        al.add("Ankit");               //by Adding and removing data checking that clone list not affecting
        al.remove("Amit");

        System.out.println("Original ArrayList: "+al);
        System.out.println("Clone ArrayList: "+al2);


    }
}
