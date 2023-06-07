package replit_questions.for_loops;

import java.util.Scanner;

public class Faktöriyel {

    public static void main(String[] args) {

        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=6*5*4*3*2*1=720

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int sayi = input.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++){
            faktoriyel *= i;
        }
        System.out.print(sayi + "!=");
        for(int i = sayi; i > 1 ; i--){
            System.out.print(i+ "*");
        }
        System.out.print("1=" + faktoriyel);





    }
}
