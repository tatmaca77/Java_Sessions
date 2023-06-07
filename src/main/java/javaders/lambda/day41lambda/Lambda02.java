package javaders.lambda.day41lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    /**    TESTER COK FAZLA KULLANIR: bU METHODLARI. IYI OGREN !!!!!!!!
     * Match :
     * allMatch() => Tüm elemanlar sarti saglarsa true dondurur.
     * anyMatch() => En az bir eleman sarti saglarsa true dondurur.
     * noneMatch() => Hicbir sarti saglamazsa true , en az bir eleman sarti saglarsa false dondurur.
     */

    public static void main(String[] args) {


        Universite u1 = new Universite("yalova", "political science", 1000, 75);
        Universite u2 = new Universite("hacettepe", "fizik", 2000, 80);
        Universite u3 = new Universite("bogazici", "bilgisayar", 3000, 85);
        Universite u4 = new Universite("odtu", "matematik", 4000, 90);
        Universite u5 = new Universite("heidelberg", "medizin", 5000, 90);
        Universite u6 = new Universite("mannheim", "bwl", 6000, 75);
        Universite u7 = new Universite("stuttgart", "bau", 7000, 80);
        Universite u8 = new Universite("marmara", "law", 8000, 100);

        List<Universite> list = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8));
        System.out.println();

        System.out.print(yetmisBestenBuyuk(list)); // false
        System.out.println();

        System.out.print(unilerinHerhangisindeMatematikVarMi(list));
        System.out.println();

        System.out.println(buyuktenKucuge(list));


    }// main

    // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu gosteren bir program olusturunuz.
    public static boolean yetmisBestenBuyuk(List<Universite> list) {
        System.out.print("1) ");
        return list.
                stream().
                allMatch(t -> t.getGpa() > 75);
    }


    // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.
    public static boolean unilerinHerhangisindeMatematikVarMi(List<Universite> list) {
        System.out.print("2) ");
        return list.
                stream().
                anyMatch(t -> t.getBolum().
                        equalsIgnoreCase("matematik"));
    }


    // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayip liste halinde veren bir program olusturunuz.
    public static List<Universite> buyuktenKucuge(List<Universite> list) {
        System.out.print("2) ");

       return list.
                stream().
                sorted(Comparator.
                        comparing(Universite::getOgrenciSayisi).
                        reversed()).
                collect(Collectors.toList());

       // Bu sekilde buradan cikan sonucu döndürmüs olduk. Eger return sonda yaparsak bazi methodlar calismayabilir !!
    }
}

