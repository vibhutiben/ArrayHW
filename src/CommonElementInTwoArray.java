import com.sun.deploy.util.SyncAccess;

public class CommonElementInTwoArray {
    // java main method
    public static void main(String[]args){

        int a1[] = {1,2,3,4,5,6,7,};   //Declare Array  Sting variable
        int a2[] = {9,8,7,10,11,4,12};

        for(int i =0; i< a1.length; i++){

            for (int j =0; j< a2.length; j++){

                if (a1[i]==(a2[j])){

                    System.out.println("Common element is:" +(a1[i]));
                }
            }
        }





    }
}
