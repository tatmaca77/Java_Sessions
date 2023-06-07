package javaders.day28interface;

public interface Animal {


    void eat();   // Bu method abstract ve public cünkü interface icinde. Bu yüzden onlari yazmaya gerek yok.
    void drink();

    /** 1) Interface'lerdeki tüm Variable'lar otomatik olarak "final" dir. Bu yüzden interface icindeki variable'i
           olusturdugunuz zaman mutlaka bir deger atamasi yapmalisiniz.
           Bilindigi gibi "final variable"larin degerleri degistirilemez.
        2) interface'lerdeki tüm variable'lar otomatik(default) olarak "public" tir.
        3) interface'lerdeki tüm variable'lar otomatik olarak "static" dir.

     **/
    int age = 4;



}
