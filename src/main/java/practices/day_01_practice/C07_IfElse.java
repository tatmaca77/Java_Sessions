package practices.day_01_practice;

import java.util.Scanner;

public class C07_IfElse {

    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("Please enter a number: ");
        int number2 = input.nextInt();

        if(number > number2){
            System.out.println(number + " is greater than " + number2);
        }
        else{
            System.out.println(number + " is less than " + number2);
        }
    }//main
}//class
