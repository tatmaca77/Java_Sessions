package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini
        //ekrana yazdiran programi yaziniz.


        // % == Modulus operatoru sayinin bolumunden kalan sayiyi verir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz..."); //8649
        int number = input.nextInt();

        int lastDigit = number%10;
        number = number/10;

        int lastSecondDigit = number%10;
        number = number/10;

        int lastThirdDigit = number%10;
        number = number/10;

        int lastFourthDigit = number%10;
        number = number/10;

        System.out.println(lastDigit+lastFourthDigit);
        //System.out.println("lastFourthDigit + last FourthDigit = " + (lastFourthDigit)); 8
        // Alternatiftir. Parantezlere dikkat et.

       // System.out.println("lastDigit+lastFourthDigit : " + lastDigit+lastFourthDigit);
        //Bu sekilde asla toplama yapmaz yan yana sadece degerleri verir. Bu sekilde String bir datanin yanina int
        // bir data girersen onu Java resim gibi görür ve herhangi bir islem yapmaz ve yan yana yazar.

        /*
        3 basamakli bir sayinin
        ilk basamagini almak icin ( Basamak sayisi-1) 0 olan yani 100'e bolmeliyiz.
        4 basamakli bir sayinin
        ilk basamagini almak icin ( Basamak sayisi-1) 0 olan yani 1000'e bolmeliyiz.
        5 basamakli bir sayinin
        ilk basamagini almak icin ( Basamak sayisi-1) 0 olan yani 10000'e bölmeliyiz.
         */


        /*
        package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve sonrakaminin toplamini
        //ekrana yazdiran programi yaziniz
        // % ==> Modulus operatoru sayinin bolumunden kalan sayiyi verir

        Scanner input = new Scanner(System.in); //Beyza
        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
        int sayi= input.nextInt();//8649
        int sonRakam = sayi%10;//9
        int ilkRakam = sayi/1000;//8
        System.out.println("IlkRakam+ sonRakam = "+(ilkRakam+sonRakam));




    }//main
}//class
         */


    }//main

}//class
