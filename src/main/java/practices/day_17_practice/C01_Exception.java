package practices.day_17_practice;

import java.util.Scanner;

public class C01_Exception {

    // Kullanıcıdan istedigi kadar sayiyi alıp toplayan bir program yazınız
    // toplam 500'u gecerse programı bitirsin veya
    // kullanıcı bitirmek istediginde Q'ya basmalıdır
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam=0;
        do {
            System.out.println("toplamak istediginiz sayiyi giriniz \n Bitirmek icin Q'ya basınız");
            int sayi=0;
            try {
                sayi = scan.nextInt();
            } catch (Exception e) {
                String hataliGiris = scan.next();
                if(hataliGiris.equalsIgnoreCase("q")){
                    break;
                }else{
                    System.out.println("Hatali Giris");
                }
            }
            toplam+=sayi;
        }while (toplam<500);
        System.out.println("Girdiginiz Sayinin Toplami: " + toplam);
    }

}
