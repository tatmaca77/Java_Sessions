package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {

        /*
          Numeric Data Type'larinin birbirine dönüstürülmesine "Type Casting" denir.
          Numeric Data Type'lari : byte < short < int < long < float < double

          Kucuk Data Type'larinin Büyük Data Typelarina dönüstürülmesine "Auto Widening ( Otomatik Genisletme )denir.
          Kucuk kutunun Buyuk kutu icerisine yerlestirilmesidir.

          Buyuk kutunun Kucuk kutuya dönüstürülmesinde Java sorumlulugu kabul etmez Data kaybi olacagi icin
          kodu yazana sorumlulugu verir. Buna "Explicit Narrowing" ( Aciktan Daraltma ) denir.
         */

        byte age = 13;
        int ageInt = age;  // Bu isleme "AUTO WIDENING" denir.

       // long data type'ni short'a ceviriniz.
        long population = 2471L;
        short populationShort = (short) population;  // Bu islemi yaparken tüm kod kipkirmizi olur.
                                                       // Java data kaybindan dolayi topu bize atiyor bize soruyor.
                                                     // "Explicit Narrowing" denir.

        // int data typeni floata cevirniz.
        int boy = 170;
        float boyFloat = boy; // ( "Auto Widening" ) yapmis oluyoruz.

        // short u byte a cevir.
        short a = 5874;
        byte b = (byte) a;

        int d = 1255;
        byte e = (byte)d;
    }//main
}//class
