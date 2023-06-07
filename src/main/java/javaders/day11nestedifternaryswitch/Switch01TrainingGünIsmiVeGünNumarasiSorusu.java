package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01TrainingGünIsmiVeGünNumarasiSorusu {

    public static void main(String[] args) {

        /*
           Kullanicidan gun isimlerini aliniz, o gunun kacinci gun oldugunu ekrana yazdirirniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name");
        String dayName = input.next();

        switch (dayName.toLowerCase()){
            case "sunday":
                System.out.println("First Day");
                break;
            case "monday" :
                System.out.println("Second Day");
                break;
            case "tuesday" :
                System.out.println("Third Day");
                break;
            case "wednesday" :
                System.out.println("Fourth Day");
                break;
            case " thursday" :
                System.out.println("Fifth Day");
                break;
            case "friday" :
                System.out.println("Sixth Day");
                break;
            case "saturday" :
                System.out.println("Last Day");
                break;
            default :
                System.out.println("Unknown Day");
        }



        if (dayName.equalsIgnoreCase("Sunday")){
            System.out.println("First Day");
        }
        else if (dayName.equalsIgnoreCase("Monday")){
            System.out.println("Second Day");
        }
        else if (dayName.equalsIgnoreCase("Tuesday")){
            System.out.println("Third Day");
        }
        else if (dayName.equalsIgnoreCase("Wednesday")){
            System.out.println("Fourth Day");
        }
        else if (dayName.equalsIgnoreCase("Thursday")){
            System.out.println("Fifth Day");
        }
        else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Sixth Day");
        }
        else if (dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Last Day");
        }
        else{
            System.out.println("Invalid Day Name");
        }



    }
}
