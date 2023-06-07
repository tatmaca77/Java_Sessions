package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {

        /*
           Kullanicidan bir sayi aliniz,o sayi pozitif ise ekrana pozitif yazdirin. Degilse pozitif degil yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        /////***** 1. YOL ******/////  USE IF-ELSE
        if (number>0){
            System.out.println("Pozitif");
        }
        else {
            System.out.println("Pozitif degildir");
        }

        /////***** 2. YOL ******/////   USE TERNARY
        String result = number>0 ? "Pozitif" : "Pozitif degildir";   //ternary operator sonuc String oldugu icin String.
        System.out.println(result); // Eger 0 verirsek 0>0 = false 'dir. Ve ikinci degeri verir. Pozitif degildir yazar.

    }//main
}//class
