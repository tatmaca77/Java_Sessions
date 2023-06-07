package practices.day_01_practice;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your name and surname: ");
        String nameSurname = input.nextLine().toUpperCase(); // verilen ismi ve soysimin hepsi büyük oldu.

        char nameFirstCharacter = nameSurname.charAt(0); // Ilk karakteri aldik.
        char nameSecondCharacter = nameSurname.charAt(nameSurname.indexOf(" " ) + 1);
        // Önce charAt ile ilk karakter alacagimizi söyledik sonra icine indexof ile boslugu al sonrakini ver dedik.
        //indexOf () parantezinin icine yazdigimiz degeri verir.
        System.out.println("nameFirstCharacter+nameSecondCharacter = " + nameFirstCharacter+nameSecondCharacter); // TA
        System.out.println(  nameFirstCharacter+nameSecondCharacter); // Bu sekilde Ascii degerlerini toplar.

        String str= "Canan Can";
        System.out.println(str.startsWith("a",3));



    }//main

}//class
