package practices.day_06_practices;

import java.util.Scanner;

public class C02_ATM_Projesi_Switch {

    public static void main(String[] args) {

        /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1-4 arasinda bir islem numarasi giriniz...  \n" +
                "     işlem 1: Bakiye Sorgulama\n" +
                "     işlem 2: Para Cekme\n" +
                "     işlem 3: Para Yatırma\n" +
                "     işlem 4: İşlemi Sonlandırın");
        int islemNo = input.nextInt();
        int bakiye = 1000;

        switch (islemNo){
            case 1:
                System.out.println("Bakiyeniz = " + bakiye);
                break;
            case 2:
                System.out.println("Lütfen cekmek istediginiz para miktarini giriniz...");
                int cekilenPara = input.nextInt();

                if (cekilenPara <= bakiye) {
                    System.out.println("Mevcut Bakiyeniz = " + (bakiye - cekilenPara) + "TL");
                }else {
                    System.out.println("Yetersiz Bakiye");
                }
                break;
            case 3:
                System.out.println("Lütfen yatirmak istediginiz para miktarini giriniz...");
                int yatanPara = input.nextInt();

                if (yatanPara <= 2000) {
                    System.out.println("Mevcut Bakiyeniz = " + (yatanPara + bakiye) + "TL");
                }else {
                    System.out.println("ATM'de Günlük Para Yatirma Limiti 2000TL'dir " );
                }
                break;
            case 4:
                System.out.println("Techpro Bank'i Kullandiginiz icin Tesekkür Ederiz...");
                break;

            default:
                System.out.println("Gecersiz bir islem numarasi girdiniz...");

        }



















        /*switch (islemNo) {
            case 1:
                System.out.println(" Islem 1:" + "Bakiye Sorgulama");
                break;
            case 2:
                System.out.println("Islem 2: " + "Para Cekme");
                break;
            case 3:
                System.out.println("Islem 3: " + "Para Yatirma");
                break;
            case 4:
                System.out.println("Islem 4: " + "Islemi Sonlandir");
                break;

            default:
                System.out.println("Invalid number");
        } */











    }
}
