package practices.day_06_practices;

import java.util.Scanner;

public class C05_For_Loops {

    public static void main(String[] args) {
         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz
         */

        Scanner input = new Scanner(System.in);
        int toplam = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Bir sayi giriniz...");
            int num = input.nextInt();

            if (num >=5 && num <=10){
                System.out.println("Girdiginiz sayi 5 ile 10 arasinda oldugu icin isleme alinmayacaktir.");
            }else {
                toplam = toplam + num ;
            }
        }
        System.out.println(toplam);
    }
}
