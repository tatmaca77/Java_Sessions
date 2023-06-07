package javaders.lambda.day39lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01_Sule {

    public static void main(String[] args) {
/*

    1) Lambda method create etme degil mevcut methodlari library'den cagarip kullanmaktir
    2) Java 8 ile eklenmistir
    3)Functional Programming dir.mimari yapiya onem vermez
    )Hiz, Clean Code ve okunabilirlik acisindan onemlidir

 */
        List<String> iller = new ArrayList<>(Arrays.asList("Eskisehir","MUS","VAN","Edirne","Ordu","VAN","Izmir","Safranbolu","Izmir"));
        printsElements(iller);//VAN Edirne Ordu VAN Izmir Eskisehir Safranbolu Izmir MUS
        System.out.println();
        printsEl(iller);//VAN Edirne Ordu VAN Izmir Eskisehir Safranbolu Izmir MUS
        System.out.println();

        karakSaysDorttenCokBykHrfYazdir(iller);
        System.out.println();

        karakSaysDorttenCokTkrszKucukHrfYazdir(iller);
        System.out.println();

        tkrszBuyukHrfAlfabetikSiraYazdir(iller);
        System.out.println();

        tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(iller);
        System.out.println();

        ilkHarfBykDigerKucukYazdir(iller);
        System.out.println();


        System.out.println(ilkHarfEveyaSOlanlariYazdir(iller));
        System.out.println();


    }//main

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol: Structured Programming
    public static void printsElements(List<String >iller){
        for (String w :iller ) {
            System.out.print(w+" ");
        }
    }

    //2.Yol:LAMBDA Expression
    public static void printsEl(List<String >iller){
        System.out.print("1) ");
        iller.
                stream().
                forEach(t ->System.out.print(t+" "));//datalari akisa aliyor
    }


    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void EHaricElYazdir(List<String >iller) {
        System.out.print("2) ");
        iller.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void karakSaysDorttenAzYazdir(List<String >iller) {
        System.out.print("3) ");
        iller.
                stream().
                filter(t ->t.length()<4).
                forEach(t -> System.out.print(t + " "));
    }



    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void karakSaysDorttenCokBykHrfYazdir(List<String >iller) {
        System.out.print("4) ");
        iller.
                stream().//akisa alindi
                filter(t ->t.length()>4).//karakter sayisi 4 ten fazzla olanlar filtrelendi
                map(t->t.toUpperCase()).//datalarin yapisini degistirir
                forEach(t-> System.out.print(t+" "));

    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

    public static void karakSaysDorttenCokTkrszKucukHrfYazdir(List<String >iller) {
        System.out.print("5) ");
        iller.
                stream().
                distinct().//Benzersiz tekrarsiz yapar
                filter(t->t.length()>4).//karakter sayisi 4 ten fazla olanlari aldi
                map(t->t.toLowerCase()).//datanin yapisini degistirdi hepsini kucuk harfe donusturdu
                forEach(t-> System.out.print(t+" "));

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void tkrszBuyukHrfAlfabetikSiraYazdir(List<String >iller) {
        System.out.print("6) ");
        iller.
                stream().
                distinct().//tekrarsiz
                map(t->t.toUpperCase()).//yapisi gegisir buyuk harfe cevirdi
                sorted().//siralama yapar
                forEach(t-> System.out.print(t+" "));

/*
     sorted()==> 2 turlu kullanimi vardir.
     i) Icerisine arguman verilmezse,burada oldugu gibi
        sorted()natural order'a gore kucukten buyuge dogal siralama yapar
     ii) sorted(Comparator) icerisine arguman verilirse bizim belirledigimiz parametreye gore siralama yapar
 */
    }
    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(List<String >iller) {
        System.out.print("7) ");
        iller.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).// Comparator Karsilastirici comparing karsilastir uzunluklarina gore
                forEach(t -> System.out.print(t + " "));
        // sorted(Comparator.comparing(t->t.length())) karsilastirma sartlarini biz belirliyorsak
        // sorted() icerisine Comparator ile sartimizi belirtiriz
        //Eger listede kiyas sirasinda ayni sartlar varsa listeye once eklenen once yazdirilir

    }
    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz

    public static List<String> ilkHarfBykDigerKucukYazdir(List<String >iller) {
        System.out.print("8) ");
        iller.
                stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach(t-> System.out.print(t+" "));
        return iller;
    }
    // Example 9: Ilk Harfi "E" veya "S" olanlari bir liste icerisinde yazdiran methodu olusturunuz

    public static List<String> ilkHarfEveyaSOlanlariYazdir(List<String >iller) {
        System.out.print("9) ");
        return     iller.
                stream().
                filter(t->t.startsWith("E") || t.startsWith("S")).
                collect(Collectors.toList());// bir akisin sonuclarini bir listin icinde toparlamak icin kullanilir
    }
}

