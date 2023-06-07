package javaders.day18constructorsstatickeyword;

import java.time.LocalDate;

/**
    1) "static blocks" lar "static variable" 'lara "ilk degerlerini atamak" ( initialize ) icin kullanilir.
    2) "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
    3) "static" bir variable'a deger atamak icin yazilmasi gereken kod "main method" icinde yazilabilir
        ama "static block" icine yazilan kod "main method" icine yazilan kod'dan önce calisir.
    4) Bir class'da birden fazla static block varsa ustteki once calisir.
 **/
public class StaticNonStaticBlocks01 {

    // static variable'lar "static block" kullanilmadan da "initialize" edilebilirler.
    public static double pi = 3.14;

    //  static variable'lar "static block" kullanilarak da " initialize" edilebilirler.
    // Asagidaki gibi "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
    // Eger kod yazacaksan static block kullan
    public static double price;

    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
    }
    static{
        System.out.println("Hey I am a static block 2");
    }
    static {
        System.out.println("Hey I am a static block 1");
        LocalDate d = LocalDate.now();
        if (d.getMonthValue() == 3) {
            price = 1000;
        } else {
            price = 1200;
        }
    }



}


