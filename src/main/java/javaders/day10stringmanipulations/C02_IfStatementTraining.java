package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C02_IfStatementTraining {


    public static void main(String[] args) {

        //EX: Kullanici gün numarasini girsin kod gunu yazsin
        // 1 == Pazar 2== Pazartesi 3== Sali 4== Carsamba ........ 7== Cumartesi


        Scanner input = new Scanner( System.in);
        System.out.println("Please enter a day number");
        byte gunNo = input.nextByte();

        switch (gunNo) {

            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Thuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
            default :
                System.out.println("Invalid day number");
        }










    }
}
