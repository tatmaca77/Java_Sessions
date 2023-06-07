package practices.day_01_practice;

import java.util.Scanner;

public class C04_Dikdortgen {

    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.print("Dikdortgenin a: ");
        int a = input.nextInt();
        System.out.println("Dikdortgenin b: ");
        int b = input.nextInt();

        System.out.println("Dikdortgenin Cevresi : " + ((2*a)+(2*b)));

    }//main
}//class
