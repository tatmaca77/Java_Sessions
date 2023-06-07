package replit_questions.string_methods;

import java.util.Scanner;

public class Elemanlar_Yerine_Yildiz_Koy {

    public static void main(String[] args) {

        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN  : **** **** **** 1478

* Ilk Harfler Buyuk harf ile baslamalidir.
         */


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
