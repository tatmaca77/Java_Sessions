package javaders.lambda.day40lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01_Training {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Tolga");
        names.add("Duygu");
        names.add("Oguzhan");
        names.add("Ilknur");
        names.add("Selahattin");
        names.add("Tolga");
        names.add("Tolgahan");
        names.add("Duygu");
        names.add("Ayse");
        System.out.println("names = " + names);


        printElUpperUnique(names); //AYSE TOLGA DUYGU ILKNUR OGUZHAN TOLGAHAN SELAHATTIN
        System.out.println();

        sonHarfeGoreSirala(names); //TOLGA AYSE OGUZHAN SELAHATTIN TOLGAHAN ILKNUR DUYGU
        System.out.println();

        uzunluklariAyniAlfabetik(names);
        System.out.println();

        System.out.print(silmeIslemi(names)); // [Tolga, Duygu, Tolga, Duygu, Ayse]
        System.out.println();

        System.out.print(silmeHVer(names)); // [Duygu, Duygu]
        System.out.println();



    }// main body

     //Example 1 : Tum List elemanlarini buyuk harfle, uzunluklarina göre artan sirada, tekrarsiz olarak yaziniz.
    public static void printElUpperUnique(List<String> names){
        System.out.print("1) ");
        names.
                stream().
                distinct().
                sorted(Comparator.comparing(t->t.length())).
                map(t->t.toUpperCase()).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 2 : Tum List elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yaziniz.
    public static void sonHarfeGoreSirala(List<String> names){
        System.out.print("2) ");
        names.
                stream().
                distinct().
                sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
                map(String::toUpperCase).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 3 : Tum List elemanlarini buyuk harfle, uzunluklarina gore artan sirada, tekrarsiz olarak yainiz.
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar.
    public static void uzunluklariAyniAlfabetik(List<String> names){
        System.out.print("3) ");
        names.
                stream().
                distinct().
                map(String::toUpperCase). // Method Reference ile yaptik
                sorted(Comparator.comparing(String::length). // Method Reference ile yaptik
                thenComparing(Comparator.naturalOrder())). // Devam eden karsilastrima method'u
                forEach(System.out::println); // Method Reference ile ekrana yazdirma.
    }

    // Example 4 : Karakter sayisi 5 ten fazla olan elemanlari siliniz.
    public static List<String> silmeIslemi (List<String> names) {
        System.out.print("4) ");
        names.removeIf(t -> t.length() > 5);
        return names;
    }

    // Example 5 : "H" ile baslayan veya "r" ile biten elemanlari siliniz.
    public static List<String> silmeHVer (List<String> names) {
        System.out.print("5) ");
        names.removeIf(t->t.startsWith("T") || t.endsWith("e"));
        return names;
    }













}
