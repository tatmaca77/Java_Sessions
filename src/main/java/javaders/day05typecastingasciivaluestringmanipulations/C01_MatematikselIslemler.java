package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {

    /*
    -Javada farkli data type'lari arasinda islem yapiliyorsa
     sonuc buyuk olan data type'inin turunde olur
     - Karsilastirma operatorlerinde sonuc hep boolean doner
     < Kucuktur
     >  Buyuktur
     == Esittir
     != Esit Degildir
     <= ucuk Esittir
     >= Buyuk Esittir
     && and (ve) operatoru
    ||  or (veya) operatoru
    */

    public static void main(String[] args) {

        System.out.println(4*(5+2)/3); //9 --- Normalde 9.333 diye gider.Int oldugu icin sadece tam sayi kismini alir.
        //int/int == int olacagi icin 9.3333334 yerine virgulden sonrasini siler ve tamsayi kismini alir.
        // Biz ekranda 9 rakamini görürüz.

        System.out.println(6*16/8); // 12

        double sonuc = 4*(2+5)/3;
        System.out.println("sonuc : " + sonuc); //normalde sonuc 9.3333 double olmasina ragmen 9.0 verdi.
                                                //tam sayi yani int olarak sayilari yukarda int olarak verir.
                                                // int oldu double icine koyduk 9.0 verir. double kapsar int'i.
        double sonuc2 = 4.0*(2+5)/3;
        System.out.println("sonuc2 : " +sonuc2); // 9.3333334
        //iki farkli data tipinde islem yapiliyorsa büyük olani veya soldan saga calistigi icin double olarak verdi.
        // Farkli data tipleri arasindaki yapilan islemlerde büyük olan data tipinde sonuc verir.

        System.out.println( 4*(1+5)/3); // 8 -- Bütün data tipleri int oldugu icin konteyner da double olmadigi icin
                                        // sonuc direkt int olarak verir.

        int sayi1 = 5;
        int sayi2 = 2;
        double sayi3 = 2; // Java bunu 2.0 olarak görür. Double icine int yazabilirsin.
        System.out.println(sayi1/sayi2); // Normalde 5/2 == 2.5 tir. Ama int/int == int olacagi icin sonuc int olarak döner.

        System.out.println(sayi1/sayi3); // int/double == double. Büyük olan data tipinde sonuc döner. 2.5

        System.out.println(sayi1+sayi3/sayi2); // Islem önceligi yapti önce bölme yapti sonra topladi.
                                               // doublle büyük oldugu icin ondalikli sonuc verir. 6.0 verir.
                                               // icinde  bir tane double olmasi yeter ve sonucu double verir.

        boolean first = 2<4;
        boolean second = 2+6 !=8;
        boolean third = 2+3*5<20;

        System.out.println("first : " + first); // true

        System.out.println("second : " + second); //false

        System.out.println("third : " + third); //true

        System.out.println(first && second);// false // && en ufak bir false görse false döndürür. Hep pozitif olmalidir.

        System.out.println(first || second || third); //true

    }//main
}//class
