package javaders.day32maps;
import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        /** "key"i tekrarli kullandigimizda hata vermez, en son verilen entry'nin degerini kabul eder.Bu yöntem value
         güncellemede kullanilabilir. Buna "overwrite" denir.
         */
        stdAges.put("Tom", 83);
        /** HashMap'ler entry'leri rastgele siralar, bu yüzden cok hizli calisirlar. */
        /** Map 'ler bütün siralama islemini "key" lere göre yaparlar. */
        System.out.println(stdAges); //  {Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38},
        // Veri güncellemeleri islemlerinde kullanilabilir. Tom'u iki kere kullandik ve yasini güncelledik.Normalde key
        // tekrarsiz olmasi gerekiyordu. Java hata vermedi. En son verilen veriyi kabul etti, güncelleme gibi gördü.

        /** replace() methodu "value"lari "key"leri kullanarak update etmeye yarar. */
        stdAges.replace("Ezel",39);
        System.out.println(stdAges); // {Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        /** replace("Angelina",58,61); bu methodu Map icinde "Angelina" '57' varsa 57'i 61'e donusturur, yoksa yapmaz. */
        stdAges.replace("Angelina",58,61);
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        /** putIfAbsent("Ali",60); methodu Map'de "Ali"key olarak yoksa Map'e "Ali=60"i ekler, varsa eklemez. **/
        stdAges.putIfAbsent("Ali",60);
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}


        /**getOrDefault("Ayse", 0) methodu Map'de varolan "key"ler icin "get()" methodu ile ayni ciktiyi verir.*/
        /** getOrDefault("Ayse", 0) methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri verir.
         "get()" methdou ise "null" verir. */
        System.out.println(stdAges.get("Tom")); // 83
        System.out.println(stdAges.getOrDefault("Tom", 0)); // 83

        System.out.println(stdAges.get("Ayse")); // null
        System.out.println(stdAges.getOrDefault("Ayse", 0)); // 0

        /** containsValue(77)); methodu value'larin icinde 77 nin olup olmadigini kontrol eder. */
        System.out.println(stdAges.containsValue(77)); // true
        System.out.println(stdAges.containsValue(99)); // false

        /**containsKey("Ali")); methodu key'lerin icinde "Ali" nin olup olmadigini kontrol eder. */
        System.out.println(stdAges.containsKey("Ali")); // true
        System.out.println(stdAges.containsKey("Tolgal")); // false

        /** remove("Ali"); methodu "key" kullanarak "entry"i silmeye yarar */
        stdAges.remove("Ali");
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        /** remove("Tom", 81); methodu Map'de key'si "Tom", value'su 81 olan bir entry varsa siler, yoksa silmez. */
        stdAges.remove("Tom", 81);
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}


        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);

        /** putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
         Ama kidsAge Map'i degismez. */
        stdAges.putAll(kidsAge);  // Rastgele icine siralar.
        System.out.println(stdAges); // {Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge); // {John=12, Jack=32, Jim=22}








    }
}
