package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04ObjectClassSorusu {

    public static void main(String[] args) {
        
        /*
           Kullanicidan aldiginiz sayi cift ise yarisni ekrana yazdırıniz, tek ise
           "Bu sayi ikiye bolunmez" yazdırınız.
         */

        /**
        1)Ternary'de true ve false durumlari icin size verilen data type'leri farkli ise olusturdugunuz
        container'in data type'ni ( "Object" ) yapiniz.

        2) "Object" Java'da bir class'tir.
           "Object" Java'daki butun class'larin "Parent"'i dir. Yani babasidir. Hz.Adem.
           "Object" Class'in Parent'i yoktur.
           Java'da Parent'i olmayan tek Class "Object Class"'tir.
           "Object" icine her türlü data type'ni kabul eder.
         **/

        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        
        Object result = number % 2 == 0 ? number/2 : "Bu sayi ikiye bolunmez";
        System.out.println("result = " + result);
        
        // Eger burdaki gibi iki farkli data type'de bir ayni satirda yazarsak hata verecektir. Bu sebeple Object yaz.

    }//main
}//class
