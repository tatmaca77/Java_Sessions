package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulationsEmailSorusu {

    public static void main(String[] args) {

         /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
               i)mail adresi "@gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi  \n" +
                " i)mail adresi \"@gmail\" icermeli\n" +
                " ii)Space characteri mail'de olmamali\n" +
                "iii)mail adresinde buyuk harf olmamali\n" +
                " iv)En az bir tane noktalama isareti bulunmali \n seklinde veriniz");
        String email = input.nextLine();

       // 1) mail adresi "@gmail" icermeli
        boolean first = email.contains("@gmail");
        System.out.println("first = " + first);

        // 2) Space characteri mail'de olmamali
        boolean second = !email.contains(" "); // '!' ile olumsuzluk eki eklemeliyiz. Space icermesin.
        System.out.println("space = " + second);

        // 3) mail adresinde buyuk harf olmamali
        boolean third = email.replaceAll("[^A-Z]", "").length()==0;
        System.out.println("Buyuk harf olmamali = " + third); // Buyuk harfler haricini yok et ve buyuk harf var mi
                                          // diye kontrol et. Cünkü digerleri gidince kalan sadece buyuk harflerdir.


        // 4) En az bir tane noktalama isareti bulunmali
        //boolean fourth = email.replaceAll("[^\\p{Punct}]","" ).length()>0;
        boolean fourth = email.replaceAll("[a-zA-Z0-9]", "").replace(" ", "").length()>1;
        System.out.println("punctuation = " + fourth);

        System.out.println(first && second && third && fourth);

    }//main
}//class
