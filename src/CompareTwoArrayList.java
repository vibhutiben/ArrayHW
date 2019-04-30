import java.util.ArrayList;

public class CompareTwoArrayList {
    // java main method
    public static void main(String[]args){

        ArrayList<String>f1 = new ArrayList<String>();//ArrayList 1
        f1.add("Apple");
        f1.add("Banana");
        f1.add("Kiwi");
        f1.add("Strawberry");
        f1.add("Papaya");

        ArrayList<String>f2 = new ArrayList<String>(); //ArrayList 2
        f2.add("Apple");
        f2.add("Banana");
        f2.add("Kiwi");
        f2.add("Papaya");

        ArrayList<String>f3 =new ArrayList<String>();//Store result

        for(String e :f1)
            f3.add(f2.contains(e)?"Yes":"No");
            System.out.println(f3);


    }
}
