package javaders.lambda.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
   Her method stream(); ile akisi alindiktan sonra kullanilmaz. Bazen akisa almadan yapmak gerekebilir.
   Ornegin ; remove(); methodu stream(); ile kullanilamaz!!!!
 */

public class Lambda01 {
    /*
      add(); methodu yerine Arrays.asList(); methodu ile daha kolay eleman ekleme yapabiliriz.
     */

    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Gumushane", "MUS", "Kutahya", "Ankara",
                "Ordu", "Gaziantep", "Hatay", "Edirne", "Ankara", "MUS", "Van"));

        System.out.println();
        duygu(iller); // VAN MUS ORDU HATAY ANKARA EDIRNE KUTAHYA GUMUSHANE GAZIANTEP

        System.out.println();
        tolga(iller); // KUTAHYA ANKARA GUMUSHANE EDIRNE VAN GAZIANTEP MUS ORDU HATAY

        System.out.println();
        aysem(iller); // MUS VAN ORDU HATAY ANKARA EDIRNE KUTAHYA GAZIANTEP GUMUSHANE

        System.out.println();
        System.out.println(selo(iller)); // [Van, MUS, Ordu, Hatay, MUS, Van]

        System.out.println();
        System.out.println(reis(iller)); // [Van, MUS, Ordu, MUS, Van]

        System.out.println();
        System.out.println(kareleriHesapla(iller)); // [9, 9, 16, 9, 9]

        System.out.println();
        System.out.println(filtreleVeYazdir(iller));




    }// main body

    // Example 1 : Tum List elemanlarini buyuk harfle, uzunluklarina gore artan, tekrarsiz olarak yaziniz.
    public static void duygu(List<String> iller) {
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                sorted(Comparator.comparing(t -> t.length())).
                map(t -> t.toUpperCase()).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 2 : Tum List elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yaziniz.
    public static void tolga(List<String> iller) {
        System.out.print("2) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()). // Lambda Expression
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))). // Lambda Expression
                forEach(t -> System.out.print(t + " "));
        /** Harflerin esitlik durumunda yazdigin sirayla getirir. Yani Kutahya ve Ankara son elemanlari ayni nasil siralar.
            Son elemana göre siralarken hangi isimi önce yazdiysan onu önce getirir. */
    }

    //Example 3 : Tum List elemanlarini buyuk harfle, uzunluklarina gore artan sirada, tekrarsiz olarak yainiz.
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar.
    public static void aysem(List<String> iller) {
        System.out.print("3) ");
        iller.
                stream().
                distinct().
                map(String::toUpperCase). // Method Reference ile yaptik
                sorted(Comparator.comparing(String::length). // Method Reference ile yaptik
                thenComparing(Comparator.naturalOrder())). // Devam eden karsilastrima method'u
                forEach(System.out::println); // Method Reference ile ekrana yazdirma.

        /**  "Lambda Expression" ==> forEach(t-> System.out.print(t + " "));
         "Method Referance" ==>  forEach(System.out::println); ama bu sekilde yan yana yazmaz.!! bunun icin özel kod yazmaliyiz.
         */

        /**Eger karsilastirma islemi birden cok kez yapilacaksa  sorted(Comparator.comparing 'dan sonra
         thenComparing(Comparator. methodu nu kullan. thenComparing. dan sonra bir cok method cikar ordan
         secimi yapabilirsin. Biz Natural Order sectik. */
    }

    /**
     * 1) map(String :: toUpperCase)  ==> "METHOD REFERENCE"
     * 2) map(t->t.toUpperCase())  ==> "lAMBDA EXPRESSION" daha uzun ve okunurlulugu daha az.
     * bu methodlar ayni isi yaparlar.
     * Ilk ogrendigimiz method'ta yine kod yazar gibi yine sembol kullandik isaret kullandik vs.
     * Ama map(String :: toUpperCase) bu method ta direkt dedik ki : String Class'a git ve
     * toUpperCase kullan. Tercih edilen ikincisidir.
     */

    // Example 4 : Karakter sayisi 5 ten fazla olan elemanlari siliniz.
    public static List<String> selo(List<String> iller) {
        System.out.print("4) "); // stream(); ile remove(); methodu kullanilmaz.
        iller.removeIf(t -> t.length() > 5); // Eger karakter sayisi 5 ten fazla ise sil dedik. !!
        return iller;

        /** a) Bu method icinde biz islemi normalde stream(); ile akisa aliyorduk ancak stream'den sonra remove
         methodu'nun kullanilamayacagini gördük.
         b) Bu yüzden stream'e almadan direkt removeIf(); methodu ile karakter sayisi eger 5 ten fazla ise
         sil methodu'nu kullandik.
         c) Sonrasinda bize calistigimiz List'i vermesi icin return iller; yaptik.
         d) Main icinden method ismi icinde List direkt yazdirirsak görürüz.
         e) Diger bir husus ise method'umuzun return type'ni void yapmadik List yaptik. Cünkü verilen sonucu biz
         bir Liste icinde istedik
         -> Sonuc olarak; biz bir List icindeki datalarin karakter sayisi 5 ten cok olan datalari sildik ve
         yine List icinde bize vermesini istedik.
         */
    }

    // Example 5 : "H" ile baslayan veya "r" ile biten elemanlari siliniz.
    public static List<String> reis(List<String> iller) {
        System.out.print("5) ");
        iller.removeIf(t->t.startsWith("H") || t.endsWith("r"));
        return iller;
    }

    // Example 6 : List elemanlari karakter sayilarinin karelerini aliniz ve bir List olarak ekrana yaziniz.
    public static List<Integer> kareleriHesapla(List<String> iller) {
        System.out.print("6) ");
        return iller.
                stream().
                map(Utils::karesiniAlMethodu). // Method Referance
                collect(Collectors.toList()); // Bu method tekrar List olarak bize yazdirir.

    }

    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> filtreleVeYazdir(List<String> iller) {
        System.out.print("7) ");
        return iller.
                stream().
                filter(Utils ::ciftMi)  // filter(t->t.length() % 2 == 0).
                .collect(Collectors.toList());


    }

}

















