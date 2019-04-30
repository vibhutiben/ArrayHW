public class ContainSpecificValue {

    //User define method
    public static boolean contain(int arr[],int item){

        for (int n:arr){
            if(item==n){
                return true;
            }
        } return false;
    }
    // java main method
    public static void main(String[]args){
        int a1[] ={55,66,77,44,88,99,22};

        System.out.println(contain(a1,99));
        System.out.println(contain(a1,33));


    }
}
