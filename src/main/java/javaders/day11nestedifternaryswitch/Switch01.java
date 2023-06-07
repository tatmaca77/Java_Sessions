package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
           Kullanicidan gun isimlerini aliniz, o gunun kacinci gun oldugunu ekrana yazdirirniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name...");
        String dayName = input.next();

        /////***** First Way *****///                  // Genelde 3 durum varsa if else kullanilir.
                                                       // Ayrica if else de buyuk kuzuk harf'e duyarli olur.equalsIgnoreCase.
        if(dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Sunday is the first day of the week.");           // equals.IgnoreCase
        }else if (dayName.equalsIgnoreCase("Monday")) {  //monday = Monday = MONDAY bu sekilde hata vermez.
            System.out.println("Monday is the second day");
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("Tuesday is the third day");
        }else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("Wednesday is the fourth day");
        }else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("Thursday is the fifth day");
        }else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Friday is the sixth day");
        }else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("Saturday is the seventh day");
        }else {
            System.out.println("Invalid day name");}

        /////***** Second Way *****///                   //Genelde 3 durumdan fazla bir durum varsa switch kullanilir.
        switch(dayName.toLowerCase()) {

            case "sunday" :
                System.out.println("Sunday is the first day of the week.");
                break;
            case "monday" :
                System.out.println("Monday is the second day");
                break;
            case "tuesday" :
                System.out.println("Tuesday is the third day");
                break;
            case "wednesday" :
                System.out.println("Wednesday is the fourth day");
                break;
            case "thursday" :
                System.out.println("Thursday is the fifth day");
                break;
            case "friday" :
                System.out.println("Friday is the sixth day");
                break;                                              // break burda ara ver devam edecek demek.
            case " saturday" :
                System.out.println("Saturday is the seventh day");
                break;
            default:                                                 //switch de else kisminin ismi default'dur.
                System.out.println("Invalid day name");

        }//switch body
    }//main
}//class
