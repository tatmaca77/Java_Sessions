package javaders.day04memorykullanimiwrapperclass;

import java.sql.SQLOutput;

public class C02_WrapperClass {

    /*

    Javada sonucta bir üründür.
    Oracle firmasinin bir ürünüdür. Developerlar sadece data barindiran primitive
    data type'larinin Non-Primitive'ler gibi methodlar icermesini istemislerdir.
    Bunun üzerine Java primitive data typelarina method ekleyerek; özel bir class olusturmuslardir.
    Bunada "Wrapper(sarmalamak,dürüm) Class denir.


            Primitive                Non-Primitive
              byte       ==            Byte
              short      ==            Short
              int        ==            Integer
              long       ==            Long
              float      ==            Float
              double     ==            Double
              boolean    ==            Boolean
              char       ==            Character

       */

    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        //byte data type'inin en büyük ve en kücük degerlerini yazdiriniz.

        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        //Example : int data type'nin en büyük degeri ile byte data type'inin en kücük degerinin toplamini yazdiriniz.

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin + intMax : " + (intMax+byteMin));


        //*** Primitive Data Type'larini Wrapper Class'lara nasil ceviririz. ***

        float primitiveFloat = 12.33F;
        Float wrapperFloat = primitiveFloat;
        //Bu yapilan isleme " AUTOBOXING" denir.
        //Boxing islemini Java otomatik olarak yapar. Yani kücük kutuyu büyük kutunun icerisine koyar.

        //*** Wrapper Class'lari Primitive Data Type'larina nasil ceviririz. ***

        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar;
        //Bu yapilan isleme "UNBOXING" denir.
        //Unboxing islemini Java otomatik olarak yapar. Yanikücük kutuyu büyük kutudan cikarmaktir.


        //Example : Verilen iki String data'nin toplamini veren kodu yaziniz.

        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1+str2);//Burda Java bu islemi aslinda yan yana yazar.
                                      // Cünkü String oldugu icin resim olarak görür.
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        //Bu sekilde yaparak verilen iki String datayi toplamis oluruz.
        // Yani String datayi "valueof"memthodu ile Integer'a cevirerek yapariz.

        /*
        Burda String datalarin toplamasini yapabilmek icin kodlar yazilir.
        Eger ben String Datayi toplamak istersem Integer'a cevirmeliyim.
        Cünkü String datalari Java resim olarak görür ve yan yana ekrana yazar.
        Hatta yan yana yazarken her karakteri görür. Bosluklari bile ekrana yazar.
        "valueof" methodu String Datayi Integer'a cevirmemize yardimci olur.
        Integer.valueof(str1+str2) bu sekilde yazilan method calismaz.Ayri ayri yazmaliyiz.

        Javada "+" int icin matematik gibi toplama yapar.
        iki String icin ise yan yana yazar. Bunun ismine "CONCATINATION" denir.

        Java islem önceligine göre calisir.
            i)Üslü sayilar
            ii)Parantez ici
            iii)Carpma-bölme
            iiii) Toplama-cikarma

            */

        String harf = "A";
        int sayi = 7 ;
        System.out.println(harf+sayi);

        // Sonuc olarak ekranda biz A7 olarak görürüz.
        // Cünkü String int görünce icindeki datayi bile resim olarak görür ve yan yana yazar.
        //Yani "Concation" yapar.

        /*
        8+3+"K"  === 11K

        "K"+3*5/2  === K7  Eger bu int olarak olursa K7 olarak ekrana yazar.
                          Ama double yaparsak ondalikli kismida alir.
         Yani === K7.5 olur.

        */

        String a = "K";
        double b = 3 , c = 5 , d = 2 ;  //Ayni data tipindeki verileri tek satir icerisinde yazabilirsin.
        System.out.println(a+b*c/d);
        //K7.5
    }//main
}//class
