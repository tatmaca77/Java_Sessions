package TolgaTraining.forloops;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ebob = 1;
        int ekok = 1;
        int max;
        System.out.println("1.sayiyi giriniz...");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi giriniz...");
        int sayi2 = input.nextInt();
        max = sayi1*sayi2;

        for (int i = 1 ; i <= sayi1 && i <= sayi2; i++){

            if (sayi1 % i == 0 && sayi2 % i == 0){
                ebob = i;
            }
        }
        for(int j = max; j > 0 ; j--){

            if (j % sayi1 == 0 && j % sayi2 == 0){
                ekok = j;
            }

        }
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);












    }


}
