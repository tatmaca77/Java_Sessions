package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {

    // Kullanicidan aldiginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki sayilarin toplamini yazdiriniz.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");//38671
        int number = input.nextInt();//38671

        int lastDigit = number %10; // 1 == Bu islem ile son rakami alirsin.
        number = number/10; //3867 == Bu islem ile sayiyi kücültürsün.

        int lastSecondDigit = number%10; //7
        number = number/10; //386

        int lastThirdDigit = number %10; // 6
        number = number/10; // 38

        int lastFourthDigit = number %10;//8
        number = number/10;

        int lastFifthDigit = number %10; //3

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);


        // Scanner input = new Scanner (System.in);
        //System.out.println("Lutfen 5 basamakli bir sayi giriniz...");
        //int number = input.nextInt();

        //int lastDigit = number/10

    }//main

}//class
