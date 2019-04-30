import java.util.Arrays;

public class SortNumeric_Stringarray {
  //java main method
    public static void main(String[] args) {
        int a[] = {45, 6, 18, 9};   //local variable where store value

        Arrays.sort(a);             //Sort in ascending order

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        ;

        String arr[]={"Car,Bicycle,Train,Bike,Plane"};  //local variable where store value

        {
            System.out.println(Arrays.toString(arr));
        };
        Arrays.sort(arr);


    }
}