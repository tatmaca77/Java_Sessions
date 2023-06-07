package practices.day_07_practice;

import java.util.Scanner;

public class C02_do_while {

    public static void main(String[] args) {

        /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yüksekligi giriniz...");
        double yukseklik = input.nextDouble();

        double toplamYol = 0;
        int yereVurmaSayisi = 0;

        do {
            toplamYol += yukseklik;
            yereVurmaSayisi++;
            toplamYol += yukseklik * 0.5;

            yukseklik = yukseklik * 0.5;

        }while (yukseklik >= 1);

        toplamYol += yukseklik;
        yereVurmaSayisi++;
        System.out.println("yereVurmaSayisi = " + yereVurmaSayisi);
        System.out.println("toplamYol = " + toplamYol);






    }
}
