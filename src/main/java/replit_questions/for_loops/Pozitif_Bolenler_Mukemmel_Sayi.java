package replit_questions.for_loops;

import java.util.Scanner;

public class Pozitif_Bolenler_Mukemmel_Sayi {

    public static void main(String[] args) {

        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
Input :
6
Output:
6 Mukemmel Sayidir.
======================
Input
7
Output:
7 Mukemmel Sayidir degildir.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int toplam = 0;

        for (int i = 1; i < num ; i++) {
            if (num % i == 0) {
                toplam += i;
            }
        }
        if (num == toplam) {
            System.out.println(num + " " + "Mukemmel bir sayidir.");
        }else {
            System.out.println(num + " " + "Mükemmel bir sayi degildir.");
        }






    }
}
