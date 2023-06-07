package javaders.lambda.Lambda_Recap;

import java.util.*;
import java.util.stream.Collectors;

public class Lambd01 {

    /** Lambda'yi Map haricindeki bütün Collections'larla kullanabilir.
         Cünkü Map'lerde key-value iliskisi oldugu icin kullanamayiz.
         Lambda bize islem kolayligi saglar.*/

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));


        ciftVePozitif(sayi); // 12 6 8
        System.out.println(" \n ****************************");
        ciftVePozitif2(sayi);
        System.out.println(" \n ****************************");
        kareler(sayi);
        System.out.println(" \n ****************************");
        kareler2(sayi);
        System.out.println(" \n ****************************");
        tekrarsizKareler(sayi);
        System.out.println(" \n ****************************");
        buyuktenKucugeSirala(sayi);
        System.out.println(" \n ****************************");
        kupPozitifBirlerBas5(sayi);
        System.out.println(" \n ****************************");
        toplamMetRef(sayi); // Optional[36]
        System.out.println(" \n ****************************");
        lambdaToplam(sayi); // 36
        System.out.println(" \n ****************************");
        System.out.println(kucuktenBuyugeCiftKareList(sayi)); // [0, 36, 64, 64, 144, 144]


    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitif (List<Integer> sayi ){
         sayi.stream().
                 filter(t->t % 2 == 0 && t > 0).
                // filter(t-> t > 0).
                 forEach(t-> System.out.print(t + " "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitif2 ( List<Integer> sayi) {
        sayi.stream().
                filter(t-> t % 2 == 0 && t > 0).
                forEach(Utils::yazdir);   // Utils Class icindeki yazdir methodunu cagirdik ve Method Reference oldu.
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareler (List<Integer> sayi) {
        sayi.stream().
                map(t-> t*t).
                forEach(t-> System.out.println(t + " "));      // Lambda Expression kullandik.
         /*public static List<Integer> kareler (List<Integer> sayi) {
        sayi.stream().
                map(t-> t*t).
                forEach(Utils::yazdir);
        return sayi;
    }
     */
    }
    public static void kareler2 (List<Integer> sayi) {
        sayi.stream().
                map(Utils::kareBul).      // Method Reference kullandik.
                forEach(Utils::yazdir);
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void tekrarsizKareler (List<Integer> sayi) {
        sayi.stream()
                .map(Utils::kareBul).
                distinct().
                forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyuktenKucugeSirala (List<Integer> sayi) {
        sayi.stream().
                sorted(Comparator.reverseOrder()).  // sorted normalde kucukten buyuge Natural Order yapar.
                forEach(Utils::yazdir);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void kupPozitifBirlerBas5 (List<Integer> sayi) {
        sayi.stream().
                filter(t-> t > 0).
                map(t-> t*t*t).
                filter(t-> t % 10 == 5).  // Bir sayinin 10'a bolumunden kalan 5 ise birler bas 5'dir.
                forEach(Utils::yazdir);
    }  // -> = Arrow Function yani Ok anlamindadir.

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef (List<Integer> sayi) {
        /** int sonuc = sayi.stream().
                reduce(Math::addExact).get(); // reduce(Integer::sum) da olurdu.
                                             // reduce dan sonra method kullanilmaz. reduce Terminal Method'tur.
        return sonuc; // System.out.println(sonuc); olabilir.  Boyle olursa return type int olmali.

         */     // da olur int yerine Optional'a atadik.

        Optional<Integer> sonuc =  sayi.stream().reduce(Integer::sum); // Aksiyon sonrasi elemanlari tek deger verir.
        System.out.println(sonuc);

        /**
        get veya Optional kullanmamizin sebebi Java korkar, ya toplam deger 0 olursa diye korkar. Bizde o degeri
           int'e assign etmek istersek NullPointerException verir Java bu yüzden sen bunu Optional veya get
           kullan diyor.
         */
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void lambdaToplam (List<Integer> sayi){
       int sonuc2 = sayi.stream().
               reduce(0,(t,u) -> t+u);   // Burda Optional veya get gerek yok , ilk elemani zaten 0 verdik.
        System.out.println(sonuc2);             // sonucun 0 olma ihtimali yok.

        /**
        reduce() methodu ile Method Reference yapmak kolay ancak Lambda Expression yapmak farklidir.
                 burda biz toplma isleminin etkisiz elemani olarak0 oldugu icin ilk degeri 0 verdik.
                 Sonra bir toplama islemi olmasi icin iki eleman verdik t ve u sonra onlarin toplamini verecek.
                 t dedigimiz ilk eleman her zaman sonucu alir, u dedigimiz ikinci deger her zaman akistaki
                 elemanlari alir.
         */
    }

    //SORU9 : Listin cift elemanlarının,
    // karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> kucuktenBuyugeCiftKareList (List<Integer> sayi) {
        return sayi.stream().
                filter(Utils::ciftMi).//filter(t-> t % 2 == 0).
                map(Utils::kareBul).//map(t-> t*t).
                sorted().//sorted(Comparator.naturalOrder()). sorted() zaten kucukten buyuge dogru siralar. !!!
                collect(Collectors.toList());

    }











}
