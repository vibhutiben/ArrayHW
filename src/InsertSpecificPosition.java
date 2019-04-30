import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSpecificPosition {

    //java main method
    public static void main(String[]args){
     int array[] ={33,54,89,73,99,45};

     //Position and element declare
     int Indexpos = 2;
     int newValue =34;

     System.out.println("Old String" + Arrays.toString(array));//Old string

     for(int i = array.length -1;i > Indexpos; i--){
         array[i] =array[i - 1];
     }
     array[Indexpos] = newValue;
     System.out.println("New String" + Arrays.toString(array)); //New string

    }
}
