import java.util.ArrayList;

public class GivenElementIsPresentInArray {

    //java main method
    public static void main(String[]args){

        ArrayList<String> list = new ArrayList<>(2);//Arraylist
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list.contains("A"));
        System.out.println(list.contains("K"));

    }
}
