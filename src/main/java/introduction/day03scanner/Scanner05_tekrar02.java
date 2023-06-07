package introduction.day03scanner;



//Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz.
//1)Alanini hesaplayiniz. == ( Kisa kenar * uzun kenar )
//2)Cevresini hesaplayiniz. == ( 2*kisa kenar + 2*uzun kenar )

import java.util.Scanner;

public class Scanner05_tekrar02 {

    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.println("Lütfen Dikdörtgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();

        System.out.println("Lütfen Dikdörtgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        System.out.println("Alan : " + shortSide * longSide);
        System.out.println("Cevre :" + (2*shortSide + 2*longSide));
    }


}
