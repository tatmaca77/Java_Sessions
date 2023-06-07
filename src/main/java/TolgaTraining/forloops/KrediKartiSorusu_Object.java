package TolgaTraining.forloops;

// Kullanıcıdan ad, soyad ve kredi kartı numarasını alın
// Ad ve soyadın ilk harflerini büyük harf yapın
// Ad ve soyadın geri kalan harflerini * karakteri ile değiştirin
// Kredi kartı numarasının son 4 hanesini alın ve geri kalanını * karakteri ile değiştirin
// Sonuçları ekrana yazdırın

import java.util.Scanner;

public class KrediKartiSorusu_Object {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Adınızı giriniz: ");
        String ad = scanner.next();
        System.out.print("Soyadınızı giriniz: ");
        String soyad = scanner.next();
        System.out.print("Kredi kartı numaranızı giriniz: ");
        String ccn = scanner.next();

        String adBuyukHarf = ad.substring(0, 1).toUpperCase() + ad.substring(1);
        String soyadBuyukHarf = soyad.substring(0, 1).toUpperCase() + soyad.substring(1);

        StringBuilder adYildizli = new StringBuilder(adBuyukHarf);
        for (int i = 1; i < adYildizli.length(); i++) {
            if (adYildizli.charAt(i) != ' ') {
                adYildizli.setCharAt(i, '*');
            }
        }
        StringBuilder soyadYildizli = new StringBuilder(soyadBuyukHarf);
        for (int i = 1; i < soyadYildizli.length(); i++) {
            soyadYildizli.setCharAt(i, '*');
        }

        String ccnYildizli = "**** **** **** " + ccn.substring(ccn.length() - 4);

        System.out.println("Name : " + adYildizli + " " + soyadYildizli);
        System.out.println("CCN  : " + ccnYildizli);
    }
}


