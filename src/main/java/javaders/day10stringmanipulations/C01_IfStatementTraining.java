package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatementTraining {

    public static void main(String[] args) {

        //EX: Kullanicidan alinan Datanin Tekmi; CiftMi? oldugunu yazdiran kodu yaziniz.

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        number = Math.abs(number);

        if (number % 2 == 0) {
            System.out.println("Harika Sayi");
        } else {
            System.out.println("Degildir");

        }





    }
}