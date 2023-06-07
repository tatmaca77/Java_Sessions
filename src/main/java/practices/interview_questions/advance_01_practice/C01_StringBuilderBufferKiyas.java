package practices.interview_questions.advance_01_practice;

/**   String - StringBuffer - StringBuilder
 * JAVA Immutable ve Pass By Value oldugu icin String Class'in bazi yerlerde sinirliliklari vardir.
            *********** String nedir ? ************    ---------INTERVIEW 'da sorulmus.--------
    1) String bir Class'tir.
    2) String Non-Primitive data type'dir.
    3) Immutable'dir. Yani degistirilemezdir.
    4) Ancak atama yaparak degistirebiliriz.
    5) Degistirilebilir olmasi icin "StringBuffer" diye bir Class olusturulmustur.
       a)"Mutable" dir.
       b) "Multi-thread" (ayni anda coklu is yapar) ve "synchoronized" (senkronize) dir.
        Mesela; Telefon ile konusurken bir yandan da WhatsApp'tan mesaj geliyor, baska bir app calisiyor hava durumu gibi.

       StringBuffer icinde cok ozellik ve cok method oldugu icin cok yavastir.
       Bu sebeple "StringBuilder" kurulmusutur. "StringBuilder" :
       a) "Mutable" dir.
       b) Ama "synchronized" ve "multi-thread" degildir.
       c) "More Efficient" dir. Yani daha etkili ve daha hizlidir.


 Örnegin bir sehit yakinina veya ogrenciye indirim yapan bir Online-Shopping sitesin var. Bu durumda urun sadece
 indirim hakki olan ozel kisilere aittir, diger kisiler bu indirimden yararlanamazlar.
 Böylesi bir durumda urun fiyati her zaman ayni kalmalidir. Degisiklik ancak ozel kisiler uzerinde yapilir.
 */

public class C01_StringBuilderBufferKiyas {

    /*          2023 Nisan QA Tester

        *For Loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani kontrol edip C01_StringBuilder,
        * StringBuffer ve String Class'larinin performanslarini karsilastiralim.
        * Ipucu : long TimeSb = System.nanoTime(); kullanalim.

     */

    public static void main(String[] args) {

        String str = "Merhaba";
        System.out.println("************* String **************");

        long time1 = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            str += " "; // str == str+" ";
        }
        long time2 = System.nanoTime();
        long stringSure = time2 - time1;
        System.out.println("performace = " + stringSure / 1000 + " nano saniye"); // performace = 30594 nano saniye


        System.out.println("************* StringBuffer **************");
        StringBuffer buffer = new StringBuffer("Merhaba");

        long time3 = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            buffer = buffer.append(" ");
        }
        long time4 = System.nanoTime();
        long bufferSure = time4 - time3;
        System.out.println("bufferPerformance = " + bufferSure / 1000 + " nano saniye");// bufferPerformance = 157 nano saniye

        System.out.println("********* StringBuilder ***********");
        StringBuilder builder = new StringBuilder("Merhaba");

        long time5 = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            builder.append(" ");
        }
        long time6 = System.nanoTime();
        long builderSure = time6 - time5;
        System.out.println("builderPerformance= " + builderSure / 1000 + " nano saniye");//builderPerformance= 140 nano saniye

        System.out.println("*********** Kiyaslama ************");

        if (stringSure > bufferSure && stringSure > builderSure) {
            System.out.println("En yavas String");
        if (bufferSure > builderSure) {
            System.out.println("Ikinci sirada StringBuffer");
            System.out.println("En hizli StringBuilder");
        } else {
            System.out.println("Ikinci sirada StringBuilder");
            System.out.println("En hizli StringBuffer");
        }

    } else if (bufferSure > stringSure && bufferSure > builderSure) {
            System.out.println("En yavas Buffer Class'tir.");
            if (stringSure > builderSure) {
                System.out.println("Ikinci yavas String Class'tir.");
                System.out.println("En hizlisi Builder Class'tir");
            }else {
                System.out.println("Ikinci yavas Builder Class'tir.");
                System.out.println("En hizlisi String Class'tir");
            }
        }else {
            System.out.println("En yavas Builder Class'tir");
            if ( bufferSure > stringSure){
                System.out.println("Ikinci yavas Buffer");
                System.out.println("En hizlisi String'dir.");
            }else {
                System.out.println("Ikinci yavas String");
                System.out.println("En hizlisi Buffer Class'tir");
            }
        }

    }

}
