package javaders.day33maps;

import java.util.Hashtable;

public class HashTable01 {

    /**
       HashMap ile HashTable arasindaki fark nedir?  ****** INTERVIEW SORUSU ******

      *i)"HashMap" "thread-safe" (Multi-thread yani coklu is) degildir, "HashTable" "thread-safe"dir.
          "HashMap" "synchronized" degildir, "HashTable" "synchronized" dir.
      ii)"HashMap" bir tane "null" key'e ve istediginiz kadar "null" value'a müsaade eder.
          "HashTable" key'lerde de value'larda da "null" kullanilmasina müsaade etmez.
      iii)"HashMap" hizlidir, "HashTable" HashMap'e göre daha yavastir.
      Note: "HashMap" ve "HashTable" ikiside entry'leri rastgele siralar.
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();

        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
        // stdAges.put(null, 85); // HashTble'larin key'lerine null konualmaz.
        //stdAges.put("Chris",null); // HashTable'larin value'larina da null konulamaz.

        System.out.println(stdAges); // {Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}


    }
}
