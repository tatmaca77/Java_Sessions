package TolgaTraining.ifelse;

import java.util.Scanner;

public class If_Else_Training {

    public static void main(String[] args) {



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


        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
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

        System.out.println();


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

        if (sayi1 > 0){
            if (sayi1 < 1000 && sayi1 > 99) {
                System.out.println("3 basamakli");
            }
                if (sayi1 % 2 == 0){
                    System.out.println("3 basamkli olmayan cift sayi");
                }else{
                    System.out.println("3 basamakli olmayan tek sayi");
                }
        }
        else {
            System.out.println("Negatif bir sayi");
        }




    }
}
