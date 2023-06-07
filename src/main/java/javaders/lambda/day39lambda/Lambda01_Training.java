package javaders.lambda.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01_Training {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tolga");
        myList.add("Duygu");
        myList.add("Ayse");
        myList.add("DuyguTolga");
        myList.add("Selahattin");
        myList.add("Tom");
        myList.add("Duygu");
        myList.add("Tolga");

        System.out.println("myList = " + myList); // [Tolga, Duygu, Ayse, Oguzhan, Selahattin]
        
        names(myList); // Tolga Duygu Ayse Oguzhan Selahattin
        System.out.println();
        tolgaHaric(myList); // Duygu Ayse Oguzhan Selahattin
        System.out.println();
        dortdenAz(myList); // Tom
        System.out.println();
        dortdenCok(myList); // TOLGA DUYGU OGUZHAN SELAHATTIN
        System.out.println();
        tekrarsizDortdenCok(myList); // tolga duygu duygutolga selahattin
        System.out.println();
        tekrarsizBuyuk(myList); // AYSE DUYGU DUYGUTOLGA SELAHATTIN TOLGA TOM
        System.out.println();
        tekrarsizKucuk(myList); // tom ayse tolga duygu duygutolga selahattin
        
    }

    // Example 1 : Bir List'deki elemanlari console yazdiran methodu olusrunuz.
    public static void names(List<String> myList) {
        myList.
                stream().
                forEach(t -> System.out.print(t + " "));
    }

    // Example 2 : Bir List'deki T ile baslayanlar haric tüm elemanlari console yazdiran methodu olusturunuz.
    public static void tolgaHaric(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.startsWith("T")).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 3 : Bir List'de karakter sayisi 4 ten az olan tüm elemanlari console yazan method olusturnuz.
    public static void dortdenAz (List<String> myList) {
        myList.
                stream().
                filter(t -> t.length()<4).
                forEach(t -> System.out.print(t + " "));
    }

    // Example 4 : Bir lIst'deki karakter sayisi 4 ten cok olan tüm elemanlari büyük harfle method yazin
    public static void dortdenCok (List<String> myList) {
        myList.
                stream().
                filter(t->t.length()>4).
                map(t->t.toUpperCase()).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 5 : Bir List'deki karakter sayisi 4 ten cok olan tum elemanlari tekrarsiz olarak kucuk harflerle yazdiran method.
    public static void tekrarsizDortdenCok (List<String> myList){
        myList.
                stream().
                filter(t-> t.length() > 4).
                distinct().
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));
    }

    // Example 6 : Bir List'deki elemanlari tekrarsiz olarak büyük harflerle alfabetik sirada yazdirin.
    public static void tekrarsizBuyuk (List<String> myList) {
        myList.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t + " "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle
    // uzunluklarina kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void tekrarsizKucuk (List<String> myList) {
        myList.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())).
                forEach(t -> System.out.print(t + " "));
    }



}
