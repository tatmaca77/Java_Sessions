package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulationsPasswordSorusu {

    public static void main(String[] args) {

        /*
        Asagidaki kurallara göre kullanicinin girdigi "password"u kontrol ediniz.

              Kurallar
          1) En az 8 karakterden olusturulmalidir.
          2) Password space icermesin
          3) En az 1 tane büyük harf olsun.
          4) En az 1 tane kucuk harf olsun.
          5) En az 1 tane sembol olsun.
          6) En az 1 tane rakam olsun.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Password  " +
                "          1) En az 8 karakterden olusturulmalidir. \n" +
                "          2) Password space icermesin\n" +
                "          3) En az 1 tane büyük harf olsun.\n" +
                "          4) En az 1 tane kucuk harf olsun. \n" +
                "          5) En az 1 tane sembol olsun.\n" +
                "          6) En az 1 tane rakam olsun. " +
                "giriniz...");
        String password = input.nextLine();

        //******* En az 8 karakterden olusturulmalidir. ***** Alttaki iki kod ta calisir ama hizli olmasi önemlidir. *****
        boolean a = password.length()>7; // daha hizli calisir. ( Best Practice )'dir.
        //boolean a = password.length()>=8; // Burda Java hem esitligi hem büyüklügü kontrol eder is uzar.

        //***** Password space icermesin.
        boolean b = !password.contains(" ");
        // " " == space karakteri icerir contains     ! == icermesin yani olumsuzluk getirir.

        // *******En az 1 tane büyük harf olsun.
        boolean c = password.replaceAll("[^A-Z]"," ").length()>0; // length olayi karakterleri sildikten sonra
                                                                                  // 0 dan büyük mü diye kontrol eder.
        // Method'lari ayni satirda yan yana yazabiliriz. Buna  ("METHOD CHAIN") ( Method Zinciri )denir.

       //******* En az 1 tane kucuk harf olsun.
        boolean d = password.replaceAll("[^a-z]"," ").length()>0;

        // *******En az 1 tane sembol olsun. ( tum harfler ve tum rakamlar disindaki hersey semboldur )
        boolean e = password.replaceAll("[a-zA-Z0-9]"," ").length()>0;


        //********En az 1 tane rakam olsun.
        boolean f = password.replaceAll("[^0-9]", " ").length()>0;

        System.out.println("Password Acceptable : "+( a && b && c && d && e && f));
        /*
         Burda kontrol ettigimiz sey dogrulugunu görmek istedigimiz oldugu icin hep boolean da yazdik
         ve yazdirirkende && isaretini kullandik. Hizli calismasi icin ve hepsi true olmasini istedigimiz
         icin ( "&&" ) isaretini kullandik. ( "&" ) bunu da kullanabilirdik aslinda ancak daha yavas oldugu icin kullanilmadi.

         */
        // Pozitif Senaryo == Ac123?*W  ==> true
        // Negatif Senaryo == Ac123? W  ==> false   //*** hepsi true sadece bir tane false oldugu icin false verir. ******//
        // Replacement yerine tirnak icinde space yaparsan sembol olarak görüyor. Hiclik yapmalisin!!!!!
        // Yani Replacement icinde " " bu demek Space var sembol görürüm.
        // Ama hiclik yaparsan o zaman bosluk görür. ""

    }//main
}//class
