package replit_questions.if_else;

import java.util.Scanner;

public class Harflerin_Kopyasindan_Yeni_Kelime {

    public static void main(String[] args) {
        
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT   : Mustafa

OUTPUT  : fafafa
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = input.next();
        
        String yeniIsim = isim.substring(5,7);
        System.out.println("yeniIsim+yeniIsim+yeniIsim = " + yeniIsim+yeniIsim+yeniIsim);
        
        
        
        
    }
}
