package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        /*
        Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Two Integers...");
        int first = input.nextInt();
        int second = input.nextInt();

        ///****************** 1.YOL ********************///   Use If - Else Genlde cok yogun oldugu icin parantezler karsiir.
        if (first<second){
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }

        ///****************** 2.YOL ********************///  Use Ternary
        int result = first<second ? first : second;  // Sart kismi true ise first degeri alir. false ise second alir.
        System.out.println("result = " + result);    // Ayni sayi girilirse sart kismina bakar
                                                    // true ise ilki false ise ikincisini verir.Yani ayni sayiyi verir.


        int num1 = 4;
        int num2 = 5;
        String str1 = "Ali";

        System.out.println(num1 + num2 + str1);

        String s1 = "";
        System.out.println("s1 = " + s1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Ad ve soyadınızı g!r!n!z");
        String isim = scan.next();
        System.out.println(isim);


    }//main
}//class
