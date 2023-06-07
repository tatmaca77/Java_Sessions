package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02SesliHarfKontrolSorusu {

    public static void main(String[] args) {

        /*
           Kullanicidan aldiginiz karakterin sesli harf olup olmadigini kontrol eden kodu yaziniz.
         */

        // toLowerCase string icin calisir char icin calismaz.


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        char letter = input.next().charAt(0);


        // 1. Way :
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':    // tek tek uzun bir kod yazmak yerine tek cade de yaz.
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");
            /*case 'b' :
                System.out.println("b is not a vowel");
                break;
            case 'i' :
                System.out.println("I");
                break;
            case 'o' :
                System.out.println("O");
                break;
            case 'u' :
                System.out.println("U");
                break;
            default :
                System.out.println("Invalid input");*/

        }//switch body1

                // 2.Way :
        System.out.println("Please enter a letter: ");
        String letter2 = input.next().substring(0, 1).toLowerCase();

                switch (letter2) {
                    case "a":                                   // Verdigin data sout icinde ise dinamik mesajdir.
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                        System.out.println( letter2 + " is a vowel");   // tek tek uzun bir kod yazmak yerine tek cade de yaz
                        break;
                    default:
                        System.out.println("It is not a vowel");
                }//switch body2

        // 2.Way :
        System.out.println("Please enter a letter: ");
        String letter3 = input.next().substring(0, 1);

        switch (letter3) {                               // Eger dinamik olsun derse kod uzayabilir.
            case "a":                                   // Verdigin data sout icinde ise dinamik mesajdir.
            case "e":
            case "i":
            case "o":
            case "u":
            case "A" :
            case "E" :
            case "I" :
            case "O":
            case "U" :
                System.out.println(letter3 + " is a vowel");   // tek tek uzun bir kod yazmak yerine tek cade de yaz
                break;
            default:
                System.out.println("It is not a vowel");
        }//switch boday3

        }//main
    }//class