package TolgaTraining.forloops;

import java.util.Scanner;

// Kullanıcıdan ad, soyad ve kredi kartı numarasını alın
// Ad ve soyadı ayırmak için boşluk karakteri kullanın
// Adın ilk harfini büyük harfle başlatın
// Adın geri kalan harflerini * işaretleri ile değiştirin
// Soyadın ilk harfini büyük harfle başlatın
// Soyadın geri kalan harflerini * işaretleri ile değiştirin
// Kredi kartı numarasının son dört hanesini alın
// Kredi kartı numarasının ilk 12 hanesini * işaretleri ile değiştirin
// Sonuçları ekrana yazdırın


public class KrediKartiSorusu_ArrayForLoop_String_Methods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı ve soyadınızı girin... ");
        String tamIsim = input.nextLine();
        System.out.print("Kredi kartı numaranızı girin... ");
        String ccnNo = input.nextLine();

        String[] isimler = tamIsim.split(" ");
        String ilkIsim = isimler[0];
        String ikinciIsim = isimler[isimler.length - 1];

        String mFirstName = Character.toUpperCase(ilkIsim.charAt(0)) + "";
        //char mFirstName2 = ilkIsim.toUpperCase().charAt(0);

        for (int i = 1; i < ilkIsim.length(); i++) {
            mFirstName += "*";
        }
        String mLastName = Character.toUpperCase(ikinciIsim.charAt(0)) + "";

        for (int i = 1; i < ikinciIsim.length(); i++) {
            mLastName += "*";
        }
        String sonDort = ccnNo.substring(ccnNo.length() - 4);

        String ccn = "";
        for (int i = 0; i < ccnNo.length() - 4; i++) {
            if (ccnNo.charAt(i) >= '0' && ccnNo.charAt(i) <= '9') {
                ccn += "*";
            } else {
                ccn += ccnNo.charAt(i);
            }
        }
        ccn += sonDort;

        System.out.println("Name : " + mFirstName + " " + mLastName);
        System.out.println("CCN  : " + ccn + " ");


    }
}
