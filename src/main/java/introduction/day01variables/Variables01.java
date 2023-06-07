package introduction.day01variables;

import java.sql.SQLOutput;

public class Variables01 {

    public static void main(String[] args) {
        // Java bu satiri okumaz. Kendimize veya takim arkadaslarimiza aciklamadir.
        /*
        Java bu satirlari da okumaz.
         */

        //Variable olusturmanin adimlari.
        //data type + variable name + Assignment Operator + data + noktali virgul.
              int       age               =              13       ;

        // Java cümlesi = Statement
        //Data Type + Variable Name == Variable Declaration demektir.
        //Assignment Operator ( atama operatörü) + Variable degeri == Assignment dir.
        //Eger variable Declaration yapar, assignment yapmazsaniz Java kendi degerlerini (default = varsayilan) koyar.
        //Default degerler sayilar icin sifirdir.
        //Dil bilgisindeki nokta ise Java daki noktali virgül ayni anlamdadir ve Statement in bittigini gösterir.
        //Java da esittir demek "==" bu ifade dir. Yani Matematikte "=" , java da "==" dir.


        /*
        Java da temelde iki tip data vardir.
        1)primitive (ilkel) data type :
          char, boolean, byte, short, int, long, float, double   ( ondalikli sayilar )
        2)non-primitive data type :
          String  (kelime vs...)
         */

        //Ornek 1 : Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String lere verilen degerler daima cift tirnak icinde olmalidir.
        String studentName = "Ali Can" ;

        //String bir variable olusturup ona her hangi bir atama yapmazsak java o variable a
        //default olarak "null" koyar.
        //"null" demek sifir demek degildir. Cünkü 0 da coding te bir degerdir.
        //null demek ici bos bir obje demektir.
        //yani icinde variable veya method bulunmayan default obje demektir.
        //{} bosluk yani null.

        //char data type :
        //Tek character ler icin kullanilir. Ornegin == A, x, ?, 5 ...
        //Ornek 2 : char data type inda bir ismin harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        //Note : char data type inda degerler tek tirnak icin konulmalidir.
        char isminIlkHarfi = 'A';

        //boolean data type :
        //boolean´lar sadece iki farkli deger alabilir ; true (dogru) or false (yanlis)
        //Ornek 3 : boolean data type´inda emeklimisin icin bir variable olusturun ve false degerini atayiniz.
        boolean emeklimisin = false ;

        //byte data type :
        //int gibi bu da tam sayilar icindir. Hafizada 1 byte yer kaplar. 1 byte 8 bit tir unutma !!!
        //byte : -128 den +127 ye kadar tamsayi degerleri icin kullanilir. Yani verecegin deger en kücük dahili -128
        // en büyük +127 vermelisin.
        //Ornek 4 : byte data type`inda ögrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23 ;

        //short data type :
        // short da byte ve int gibi tamsayilar icindir. Hafizada 2 byte yer farklar. Yani 16 bit dir !!!!!
        //short : -32768 ile +32767 dahil arasindadir.
        //Ornek 5 : Site nufusu icin bir variable olusturun ve deger atayiniz.
        short siteNüfusu = 2500 ;

        //int data type :
        //tam sayilar icin kullanilir. Hafizada 4 byte yani 32 bit dir !!!!
        //int deger araligi -2,147,483,648 ile 2,147,483,647 dir.
        //Ornek 6 :
        int countryPopulation = 1147257571 ;

        //long data type :
        //tam sayilar icindir. Hafizada 8 byte yer kaplar . Yani 64 bit dir !!!!!!
        // long degeri -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,808 arasindadir.
        //Ornek 6 : insan vücudundaki hücre sayisi icin variable olusturup deger atamasi yapiniz.
        //Not : Bir deger long ise sonuna "L" (tercih edilir) or "l" konulur.
        long cellNumberInHumanBody = 91475455652L ;

        //Eger long`a atadiginiz deger int`lerin araliginda ise sonuna "l" koymaya gerek yok.
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder.

        long weightOfSun = 1354654 ;
        //Burda ben long olarak yazdim ama buna ragmen ben L yazmadigim icin int kabul edecek Memoryden dolayi.

        //float data type :
        //float data type Virgullu sayilar (Ondalikli sayilar = Decimal Numbers) icin kullanilabilir.
        //float hafizada 4 byte yani 16 bit yer kaplar !!!!
        //Not: Java ondalikli sayilari yani "Decimal Numbers"i otomatik olarak "double" kabul eder.
        //Eger float data type´i olmasinda israr ederseniz sonuna "F" or "f" koymalisiniz.

        //Ornegin fiyatlandirmalar icin tercih edilebilir (12,99)
        //Ornek 8 : Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;

        System.out.println(shirtPrice + shoesPrice) ;
        //System.out.println() ; yazdirmanin kisayolu == sout yaz ve enter a bas.

        int a = 12 ;
        int b = 13 ;
        System.out.print(a);
        System.out.println(b);
        System.out.println(a+b);

        //System.out.println() ; ekrana yazdirir ve pointer i bir sonraki satira koyar.
        //System.out.print() ; ekrana yazdirir ve pointer i ayni satira koyar.

        //double data type :
        //double data type Virgullu sayilar (Ondalikli sayilar = Decimal Numbers) icin kullanilabilir.
        //double memory de daha fazla yer kaplar 8 byte yani 64 bit dir !!!, virgul den sonraki rakam daha fazla alir.
        // Ornek 11 : Hücre agirligi ve amip agirligi icin iki tane variable olusturup agirliklarinin farkini yaziniz.
        double weightCell = 0.0000000000000112 ;
        double weightAmip = 0.0000000000000023 ;

        System.out.println(weightCell - weightAmip) ;



        //6 Subatta depremde hayatini kaybedenlerin sayisini yazip ekrana yansittin.

        short eartquakeResult = 5500;
        System.out.println("eartquakeResult = " + eartquakeResult);

        //Dünyadaki en cok gol atan iki futbolcunun gol sayisini yaz yansit sonra toplamini da yansit.

        short messiGoals = 985;
        System.out.println("messiGoals = " + messiGoals);
        short ronaldoGoals = 997;
        System.out.println("ronaldoGoals = " + ronaldoGoals);

        System.out.println(messiGoals+ronaldoGoals);













    }

}

