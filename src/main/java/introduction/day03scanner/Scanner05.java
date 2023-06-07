package introduction.day03scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz.
        //1)Alanini hesaplayiniz. == ( Kisa kenar * uzun kenar )
        //2)Cevresini hesaplayiniz. == ( 2*kisa kenar + uzun kenar )

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen iki kenar uzunlugu degeri giriniz...");

        System.out.println("Kisa Kenar : ");
        double kisaKenar = input.nextDouble();
        System.out.println("Uzun Kenar : ");
        double uzunKenar = input.nextDouble();

        alan(kisaKenar,uzunKenar);
        cevre(kisaKenar,uzunKenar);

    }

    public static void alan (double kisaKenar, double uzunKenar){
        double alan = kisaKenar*uzunKenar;
        System.out.println("Dikdörtgenin Alani : " + alan); }



    public static void cevre (double kisaKenar, double uzunKenar){
        double cevre = 2* (kisaKenar+uzunKenar) ;
        System.out.println("Dikdörtgenin Cevresi : " + cevre);
}


}




