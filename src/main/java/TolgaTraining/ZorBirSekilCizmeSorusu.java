package TolgaTraining;

import java.util.Scanner;

public class ZorBirSekilCizmeSorusu {

    public static void main(String[] args) {

        /*
             Example: Kulanicidan satir sayisini alarak asagidaki sekli yazdiriniz

                                           *
                                          * *
                                         *    *
                                        *      *
                                       * * * * *

 */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz: ");
        int satirSayisi = input.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= satirSayisi - i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == satirSayisi) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }










    }
}
