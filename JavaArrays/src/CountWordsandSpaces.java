public class CountWordsandSpaces {


    //java main method
    public static void main(String[]args){

        int word =1;
        String str ="I love my india";//String for count words and space

        for(int i=0;i<str.length();++i) {

            if (str.charAt(i) == ' ') word++;
        }
            System.out.println("number of words =" + word);
            System.out.println("number of spaces ="+(word-1));

    }
}
