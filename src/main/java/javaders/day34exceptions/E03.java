package javaders.day34exceptions;

public class E03 {

    public static void main(String[] args) {

        System.out.println(getNumOfChars("Java")); // 4
        System.out.println(getNumOfChars("Money")); // 5
        System.out.println(getNumOfChars("")); // 0
        System.out.println(getNumOfChars(null)); // Exception verir. NullPointerException


    }

    //Bir String'Deki eleman sayisini veren method olusturunuz.
    public static int getNumOfChars(String s){
       // return s.length();
        int result = 0;
        try{
            result = s.length();
        }catch(NullPointerException e){//NullPointerException String Class "null" ile uyumlu olmayan method'larda atilir.
            //return 0;
            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());// Java'nin Exception icin ürettigi teknik mesaji varsa vaerir.
        }
        return result;
    }

}
