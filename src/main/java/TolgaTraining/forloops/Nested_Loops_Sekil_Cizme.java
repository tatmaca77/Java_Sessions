package TolgaTraining.forloops;

import java.util.Scanner;

public class Nested_Loops_Sekil_Cizme {

    public static void main(String[] args) {

        //Asagidaki sekli yazdiran kodu yaziniz

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        int n = 6; // değişebilir, herhangi bir sayı girilebilir

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }


        //Asagidaki sekli yazdiran kodu yaziniz

        /*    6
             5 6
            4 5 6
           3 4 5 6
          2 3 4 5 6
         1 2 3 4 5 6

         */

        int m = 6; // değişebilir, herhangi bir sayı girilebilir

        for (int a = 1; a <= m; a++) {
            for (int t = 1; t <= m - a; t++) {
                System.out.print(" ");
            }
            for (int f = 1; f <= a; f++) {
                System.out.print(m - a + f + " ");
            }
            System.out.println();
        }

        /* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
    int num1
    int num2
    int num3
*/
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı girin: ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı girin: ");
        int num2 = input.nextInt();

        System.out.print("3. sayıyı girin: ");
        int num3 = input.nextInt();

        int max = num1;
        int min = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        System.out.println();

        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.

// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.


        System.out.println("Lutfen 4 basamakli bir sayi girniz");
        int sayi = input.nextInt();

        if (sayi % 5 == 0){
            int lastDigit = sayi % 10;   // Son rakami alir.
            if (lastDigit == 0){
                System.out.println("5'e bölünen cift sayi");
            }
            else {
                System.out.println("5'e bölünen tek sayi");
            }
        }
        else {
            System.out.println("Tekrar deneyin");
        }


        /*
    TASK :
     Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
     Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
     3 basamaklı degilse çift olup olmadigini kontrol edin.
     Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
     Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
     */

        System.out.println("0 dan büyük bir sayi giriniz...");
        int sayi1 = input.nextInt();

        if (sayi1 < 1000 && sayi1 > 99){
            System.out.println("3 basamakli");
        }
        else if (sayi1 % 2 == 0){
            System.out.println("3 basamkli olmayan cift sayi");
        }else{
            System.out.println("3 basamakli olmayan tek sayi");
        }










    }
}
