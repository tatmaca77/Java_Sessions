package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01EmekliGenderSorusu {

    public static void main(String[] args) {

        //Example 1: /*
        //Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
        //Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
        //Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        //
        // */

        /** Kod yazarken bir if'in icine baska bir if daha
        // koyarsan ( " NESTED IF" ) denir.
        // Ama NestedIf yapisini kullanmak tavsiye edilmez.
        // Ama zorundaysan kullanirsin. Ancak JAVA burda
         yavaslar ve app cok agirlasir.**/

        /**
        1) "if" icinde "if" kullanirsaniz, "NESTED IF" olusturmussunnuz demektir.
        2) Nested if = Javayi cok yavaslatir ve mecbur olmadikca kullanilmaz.
        3) Nested if gibi Java'yi yavaslatan kod'lar ( " TIME CONSUMING") denir.
         **/

        // Once sorunun ana iskeletini olusutur sonra üzerinde calis. Ince iscilik yap.
        // Sonra verilen görevi tekrar oku unutulan bisey var mi diye.

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your age... ");  // 58 girsin.
        byte age = input.nextByte();

        System.out.println("Please Enter your gender( male or female... "); //male, female
        String gender = input.next();

        if (age<0 || age>120){
            System.out.println("Negative ages or ages greater than 120 are invalid");
                                                              // Once yas negatif mi diye kontrol edilecek.
                                                              // Negatif degilse sonra gender a bakacak
                                                              // sonrada yasin uygunluguna bakacak
        }

        else if (gender.equalsIgnoreCase("male")) {  // equals iki Stringi karsilastirmak icin kullanilir.
                                      // Büyük kucuk harf dikkat edilmeli yoksa hata verir.
                                      // equalsIgnoreCase = esitlige bak ama buyuk veya kucuk harfi umursama demketir.
                                      // equalsIgnoreCase icin male = Male = MALE .

            if (age > 65){             // BURDA ERKEK BÖLÜMÜ TAMAMLANDI.
                System.out.println("Can be retired");
            }
            else {
                System.out.println("Can't be retired");
            }
        }

        else if (gender.equals("female")) {     //BURDA KADIN B��L��M�� TAMAMLANDI

            if (age > 60) {
                System.out.println("Can be retired");
            }
            else {
                System.out.println("Can't be retired");
            }
        }

        else {
            System.out.println("Undefined gender");
        }
    }//main
}//class
