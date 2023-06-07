package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04Training {

    public static void main(String[] args) {

        /*
           Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdırıniz, tek ise
           "Bu sayi ikiye bolunmez" yazdırınız.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        Object result = number %2 ==0 ? number/2 : "Bu sayi ikiye bolunmez";
        System.out.println("result = " + result);






        /**Kullanicidan aldiginiz sayi cift ise yarisni ekrana yazdırıniz, tek ise
        "Bu sayi ikiye bolunmez" yazdırınız.**/

        System.out.println("Please enter a number: ");
        int num = input.nextInt();

        Object sonuc = num % 2 == 0 ? num/2 : "Bu sayi ikiye bolunemez";
        System.out.println("result = " + sonuc);
























    }
}
