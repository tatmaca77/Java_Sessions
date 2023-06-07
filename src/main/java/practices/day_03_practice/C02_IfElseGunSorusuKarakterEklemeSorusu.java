package practices.day_03_practice;

import java.util.Scanner;

public class C02_IfElseGunSorusuKarakterEklemeSorusu {

    public static void main(String[] args) {
        /*
Kullanicidan bir gun alin
Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
 yazdiran kodu olusturunuz.
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz : ");
        String gun = input.nextLine().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar Icin Kutsal Gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin Kutsal Gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristyanlar icin Kutsal Gun");
        } else {
            System.out.println("Kutsal gun degildir");
        }

        /*
Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız.
 */
        System.out.println("Lutfen 3 karakterden daha uzun bir kelime giriniz");
        String kelime = input.nextLine(); //Yusuf karakter var.  sufYusufsuf

        if (kelime.length() <= 3) {
            System.out.println("3 karakterden daha uzun bir kelime girmelisiniz");

        } else {
            String sonucHarf = kelime.substring(kelime.length() - 3);
            System.out.println(sonucHarf + kelime + sonucHarf);
        }

    }
}

