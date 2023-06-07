package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch01TrainingAyNumarasiSorusu {

    public static void main(String[] args) {

          /*
           ( Kullanicidan alinan rakama göre yap )Ay numarasi verildiginde verilen
           ay'in ismini ve December'a kadarki tum aylarin ismini konsola yazdiran
           kodu yaziniz.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Bitte Schreiben Sie die Nummer des Monats");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("Januar");
            case 2:
                System.out.println("Februar");
            case 3:
                System.out.println("März");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("Juni");
            case 7:
                System.out.println("Juli");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("Decemeber");
                break;
            default:
                System.out.println("Unbekannte Monatsnummer");
        }





        /*
           Kullanicidan aldiginiz karakterin sesli harf olup olmadigini kontrol eden kodu yaziniz.
         */

        System.out.println("Bitte Schreiben Sie ein Buchstabe");
        char letter = input.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(letter + " ist ein Buchstabe");
                break;
            default :
                System.out.println(letter + " ist kein Buchstabe");
        }


        System.out.println("Bitte Schreiben Sie ein Buchstabe");
        String letters = input.next().substring(0,1).toLowerCase();

        switch (letters){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letters + " ist ein Buchstabe");
                break;
            default :
                System.out.println(letters + " ist kein Buchstabe");
        }













    }

}