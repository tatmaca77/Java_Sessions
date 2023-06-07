package javaders.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /**
        1) TreeMap "thread-safe" ve "synchronized" degildir.
           Note : Map'ler "multi-thread" kullanilmasi gerektiginde sadece HashTable kullanabilirsiniz.
        2) TreeMap'ler value'lerde "null" kullanimina müsaade eder, key'lerde müsaade etmez.
        3) TreeMap entry'lerde key'lerine göre "natural order" siraya koyar. Bu yüzden coookkk yavastir.
     */

    public static void main(String[] args) {

        long time1 = System.nanoTime();

        TreeMap<String, Integer> countryPopulation = new TreeMap<>();

        countryPopulation.put("USA", 40000000);
        countryPopulation.put("Netherland", 1800000);
        countryPopulation.put("Turkiye", 80000000);
        countryPopulation.put("Belgium", 2000000);
        countryPopulation.put("Mexico", 12500000);
        countryPopulation.put("Brasil", 21500000);
        countryPopulation.put("France", 1500000);
        countryPopulation.put("Norway", 1000000);
        countryPopulation.put("Germany", 85000000);
        countryPopulation.put("Madagaskar", 3000000);

        System.out.println(countryPopulation);

        long time2 = System.nanoTime();


        HashMap<String, Integer> countryPop = new HashMap<>();

        countryPop.put("USA", 40000000);
        countryPop.put("Netherland", 1800000);
        countryPop.put("Turkiye", 80000000);
        countryPop.put("Belgium", 2000000);
        countryPop.put("Mexico", 12500000);
        countryPop.put("Brasil", 21500000);
        countryPop.put("France", 1500000);
        countryPop.put("Norway", 1000000);
        countryPop.put("Germany", 85000000);
        countryPop.put("Madagaskar", 3000000);

        TreeMap<String, Integer> countryPop2 = new TreeMap<>(countryPop);

        System.out.println(countryPop2);

        long time3 = System.nanoTime();

        System.out.println(time2 - time1);
        System.out.println(time3 - time2);


        /**
            Alfabetik sirada bir Entry istiyorsaniz TreeMap'i direkt kullanmayin !!!! HashMap olusturun elemanlari
            eklerken HashMap'in hizindan istifade edin , sonra HashMap'i TreeMap'e ceviren. Böylece hem
            alfabetik sirada Entry'ler elde etmis olursunuz hemde yavaslamamis olursunuz. Bunu TreeSet lerde de konustuk.
         */



    }
}
