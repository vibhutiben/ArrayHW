import java.util.ArrayList;
import java.util.List;

public class ReplaceParticularElementInArrayList {
    //java main method
    public static void main(String[]args){

        List<String>books =new ArrayList<String>();//Arraylist
        books.add("Economics");
        books.add("Maths");
        books.add("Accountancy");
        books.add("Business Administration");
        books.add("Statestics");

        System.out.println("Arraylist before replace: "+ books);

        books.set(1,"Business Maths");//Replace element
        System.out.println("Arraylist after replace: "+ books);



    }
}
