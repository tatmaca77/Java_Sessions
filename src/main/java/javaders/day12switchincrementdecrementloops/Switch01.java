package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
           ( Kullanicidan alinan rakama göre yap )Ay numarasi verildiginde verilen
           ay'in ismini ve December'a kadarki tum aylarin ismini konsola yazdiran
           kodu yaziniz.
         */

        // Note : switch parantez'i icinde "String" , "int" kullanabilir , "byte", "short" ve "char" da kullanilanilabilir.
        // "boolena" , "float" , "double" , "long" kullanilmaz.

        // Minimum 3 durum ve fazlasi icin "switch" kullan!!!!

        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter a month Number: ");
        //int monthNumber = input.nextInt();

        int monthNumber = 3;

        switch (monthNumber) {
            case 1 :                                // break önemlidir. eger break yoksa bir sonraki
                System.out.println("January");      // case 'de ekrana yazdirilir.
                //break;                             // Eger baska bir is yapmiyorsa break ile kapat.
            case 2 :                                // mart daki break'i kapatirsak mart nisan yazdirir.
                System.out.println("February");
                //break;                            // Mesela marttan basla aralika kadar ekrana yazdir derse
            case 3 :                              // Araliktaki bütün break'leri kapat ama Araliktaki
                System.out.println("March");      // break kalmali. Yoksa Invalid'de yazilir.
                //break;
            case 4 :
                System.out.println("April");
                //break;
            case 5 :
                System.out.println("May");
                //break;
            case 6 :
                System.out.println("June");
                //break;
            case 7 :
                System.out.println("July");
                //break;
            case 8 :
                System.out.println("August");
                //break;
            case 9 :
                System.out.println("September");
                //break;
            case 10 :
                System.out.println("October");
               // break;
            case 11 :
                System.out.println("November");
                //break;
            case 12 :
                System.out.println("December");
                break;
            default :
                System.out.println("Invalid month");
        }//switch body
    }//main
}//class
