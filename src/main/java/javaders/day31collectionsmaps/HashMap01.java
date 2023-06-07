package javaders.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** Map deyince aklimiza sözlük gelmeli.

    (KEY)    =    (VALUE)                        Map'ler key-value structure'ni kullanir.
   Tekrarsiz     Tekrarli olabilir
                                                 Map'lerdeki elemanlara yani girilen elemana "Entry" denir.
 Cat   =       Evcil Hayvan
 Dog   =       Evcil Hayvan                      Girilen elemanlarin tamamina "EntrySet" denir.
 Crocodile   =   Timsah                          Map'lerdeki elemanlar tekrarsiz oldugu icin
 Tiger   =       Kaplan                          Map olustururken 2 tane Data Type kullanilir.
                                                 ilki "Key" icin digeri "Value" icin.
                                                 Tekrarsiz verileri depolamak icin Map kullanilir. !!!
 **/

/*
Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
"key" kismi tekrarsiz, "value kismi birden fazla olabilir.
Mapler "key" ve "value" structur'ini kullanir.
Map'lerdeki elemanlara "Entry" denir.
Elemanlarin tamanina ise "EntrySet" denilir.
"Entry"ler tekrarsiz oldugu icin "EntrySet"denilir
"Key" ve "Value" lar ayri ayri data type'larinda olabilirler. 
Map'ler Collections degildir. Farkli bir yapidir. !!!
 */

public class HashMap01 {

    public static void main(String[] args) {

        // Map nasil olusturulur ?
        HashMap<String, Integer>  countryPopulation = new HashMap<>();

        /**
         HashMap'ler hizli olmak icin HashSet'lerdeki gibi Entry'leri rastgele siralar. Bu yüzden en hizli Map'tir.
         */

        // Map'e entry nasil eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherlands",18000000);
        System.out.println("countryPopulation = " + countryPopulation);
        // {Turkiye=83000000, USA=400000000, Netherlands=18000000, Germany=83000000, Albania=3000000}
        
        // get() method'u "Key" ile calisir ve Value kismini verir (Integer) verir.
        int usaPopulation = countryPopulation.get("USA");
        System.out.println("usaPopulation = " + usaPopulation); // 400000000

        // Bütün "Key" leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();  // Method'un icine girdik ve dondurdugu data type ile ayni olmalidir. Ona gore kutu ya koyduk
        System.out.println("keys = " + keys); // [Turkiye, USA, Netherlands, Germany, Albania]

        // Butun "Value" lari nasil alabilirim?
        Collection<Integer> values = countryPopulation.values();
        System.out.println("values = " + values); // [83000000, 400000000, 18000000, 83000000, 3000000]


        // Example 1 : CountryPopulation Map'indeki ülkelerin Nüfuslarinin ortalamasi kactir ?

        Collection<Integer> value = countryPopulation.values();

        int sum = 0;
        for (Integer w : value) {
            sum = sum + w;
        }
        System.out.println(sum / value.size()); // 117400000

        // Elemanlari Entry olan bir Set olusturuldu.
        // entrySet kullanarak loop ile icinde gezebilme imkani olur.
        // Map'i Set icine koyarak bize verir.
        //Elemanlari "enrtry"olan bir "Set" verdi
        /**Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz */
        // Entry leri kalip halinde Set icine koyarak verir. Entry Tekrarsizdir !!!!

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
            // Map teki Entry ler bu Set 'in elemanlaridir data keys lerin datasi String values un ki Integer dir.
        System.out.println("entries = " + entries);
        // [Turkiye=83000000, USA=400000000, Netherlands=18000000, Germany=83000000, Albania=3000000]



        // Example 2 : countryPopulation Map'indeki ülkelerin isimlerinin character sayisi ile nufuslarinin toplami.

        int toplam = 0;

        for(Map.Entry<String,Integer> w : entries){

            toplam = toplam + w.getKey().length() + w.getValue();
                              // Ulke charachter sayisi   = nufus
        }
        System.out.println(toplam);
    }
}
