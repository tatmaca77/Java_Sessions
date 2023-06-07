package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01Training {

    public static void main(String[] args) {
        
         /*
        Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz.
         */
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers");
        int a = input.nextInt();
        int b = input.nextInt();
        
        if (a<b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        
        int result = a<b ? a : b;
        System.out.println("result = " + result);



        /*
          Kullanicidan 2 sayi aliniz büyük olani ekrana yazdiriniz.
         */


        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter three integers");
        int first = input1.nextInt();
        int second = input1.nextInt();
        int third = input1.nextInt();

        if (first<second && first<third && second<third){
            System.out.println(third);
        }
        else {
            System.out.println(first);
        }

        int result1 =first<second && first<third && second<third ? third : first;
        System.out.println("result1 = " + result1);

        
        
    }
}
