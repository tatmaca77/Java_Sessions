package TolgaTraining.forloops;

import java.util.Scanner;

public class NestedLoops_Carpim_Tablosu {


    public static void main(String[] args) {


        // Example : Kullanicidan bir rakam girmesini ve bir sekil cizmesini isteyiniz.

        Scanner input = new Scanner(System.in);
        /*System.out.println("Please enter a number");
        int number = input.nextInt();*/

        for(int i = 1; i <= 5; i++){

            for( int j = 1; j <= i  ; j++){

                System.out.print("*");
            }
            System.out.println();
        }

        // Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tabloisunu olusturun.

        System.out.println("Please enter a number");
        int sayi = input.nextInt();

        for(int i = 1; i <= sayi ; i++){

            for (int k = 1; k <= sayi ; k++){

                System.out.print(i*k + " ");
            }
            System.out.println();
        }





    }
}
