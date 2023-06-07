package practices.day_05_looparrays;

import java.util.Scanner;

public class EvBütcesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Aile üyelerinin sayısını ve birikim miktarını kullanıcıdan alın
        System.out.print("Aile üyelerinin sayısı: ");
        int aileUyeSayisi = input.nextInt();
        System.out.print("Toplam birikim miktarı: ");
        double birikimMiktari = input.nextDouble();

        // Aylık harcanacak miktarları kullanıcıdan alın
        System.out.print("Ev kirası: ");
        double evKira = input.nextDouble();
        System.out.print("Elektrik faturası: ");
        double elektrikFaturasi = input.nextDouble();
        System.out.print("Su faturası: ");
        double suFaturasi = input.nextDouble();
        System.out.print("Gıda harcamaları: ");
        double gidaHarcamalari = input.nextDouble();
        System.out.print("Diğer harcamalar: ");
        double digerHarcamalar = input.nextDouble();

        // Toplam harcamaları hesapla
        double toplamHarcamalar = evKira + elektrikFaturasi + suFaturasi + gidaHarcamalari + digerHarcamalar;

        // Aile üyeleri arasında eşit paylaşımı hesapla
        double kisiBasinaHarcama = toplamHarcamalar / aileUyeSayisi;

        // Geriye kalan bütçeyi hesapla
        double kalanButce = birikimMiktari - toplamHarcamalar;

        // Sonuçları ekrana yazdır
        System.out.println("Kişi başı harcama miktarı: " + kisiBasinaHarcama);
        System.out.println("Geriye kalan bütçe: " + kalanButce);
    }
}

