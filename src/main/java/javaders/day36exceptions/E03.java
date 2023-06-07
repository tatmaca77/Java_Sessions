package javaders.day36exceptions;

public class E03 {

    /**
       "throws" ile "throw" keyword'leri arasindaki farklar nelerdir ?  **** INTERVIEW****

     1) "throws" method signature satirinda kullanilir, "throw" ise method body icinde kullanilir.
     2) "throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
        "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
     3) "throws" dan sonra sadece Exception Class isimleri yazilir, "throw" dan sonra ise Exception Class'tan
         Object olusturulur.
     */

    public static void main(String[] args) {

        printAges(23);

        try{
            printAges(-12);
        }catch(IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }

        printAges(-9);



    }
    //Example 1 : Kullanicidan alinan yas'i console yazdiran methodu olusturunuz.
    public static void printAges(int age){
        if(age < 0){
            throw new IllegalArgumentException("Used negative integer for ages");
            // Biz kenidmiz Exception atarsak kendimiz icine mesaj da atayabiliriz. !!!!
        }
        System.out.println(age);
    }





}
