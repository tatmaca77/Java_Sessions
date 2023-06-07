package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    /**
      1) Array, Java'nin coklu data depolamak icin Java tarafindan olusturulan bir yapidir.
      2) Array'in icine farkli data type'de veriler koyamazsiniz. Int ise int, String ise string.
      3) Array, Java'nin "ayni data tipinde" ve "coklu data" depolamak icin Java tarafindan olusturlmustur.
      4) Array ler "primitive data type'i" veya "reference" larla calisir.
      5) Arrayler "super-fast" dir ve memory de az yer kaplar.
     */

    public static void main(String[] args) {

        /**Array nasil olusturulur ? **/
        String stdNames [] = new String [5];
        // Kactane data yazacagini ikinci köseli parantez icine yazmalisin. Yoksa Java hata verir.

        /**Array nasil yazdirilir ? **/
       // System.out.println(stdNames);  // Bu sekilde direkt yazdirmazz !!!!!! Steak ve Heap memory kullanicaz.

        System.out.println(Arrays.toString(stdNames)); // [null,null,null,null,null]
        //Ekrana 5 tane null yazar. Null == null'lar String'in default degerleridir.

        /**Array'e nasil eleman eklenir ?**/
        System.out.println(Arrays.toString(stdNames)); // [Ajda,null,null,null,null]
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tolga";
        stdNames[1] = "Ayse";
        stdNames[4] = "Oguz";
        System.out.println(Arrays.toString(stdNames)); // [Ajda,null,Kemal,Cuneyt,null]
        // Burda Arrays icin 3.index dememize ragmen 4.index'e koyar cünkü index'i 0 dan baslatti.!!!!


        /** Array'deki specific bir elemani nasil alabiliriz ? **/
        System.out.println(stdNames[3]); // Cuneyt



        // Example 1 : stdNames Array'indeki her ismin sonuna "*" koyarak console'a yazdiriniz.

        //1.Way :
        for(int i = 0; i < stdNames.length; i++){  // length ; String Method'larda parantezli
                                                   // Array'lerde parantezsiz kullanilir.
                                                   // Array'ler variable kullanir, String'ler method kullanir !!!!!!
            System.out.println(stdNames[i] + "*");

        }

        //2.Way : for-each loop ==> Enhanced(Zenginlestirilmis) Loop - Mumkunse hep for-each loop kullan.

        // for each loop ta paranteze data type'ini yaz !!!!
        // Array'in olmadigi yerde for-each loop kullanamazsin.
        // Array görünce for-each loop kullan !!!. For each loop sadece Array ile calisir.
        for(String w : stdNames){
            System.out.println(w + "*");

        }


        //Example 2 : Bir Integer Array olusturunuz , 5 eleman ekleyiniz, elemanlarin toplamini yazdiriniz.

        int ages[] = new int[5];
        System.out.println(Arrays.toString(ages)); // [0, 0, 0, 0, 0]  Int icin default deger 0 'dir.

        ages [0] = 12;
        ages [1] = 23;
        ages [2] = 9;
        ages [3] = 38;
        ages [4] = 27;
        System.out.println(Arrays.toString(ages)); // [12, 23, 9, 38, 27]

        int sum = 0;                        // toplamini almak icin bos kutu icine koymaliyiz.

        for(int w : ages){

            sum = sum + w;
        }
        System.out.println(sum); //109


        //Example 3 : Bir char Array olusturunuz , 3 eleman ekleyiniz, elemanlarin carpimini yaz.

        char initials [] = new char[3];
        System.out.println(initials);

        initials[0] = 'a'; //97
        initials[1] = 'b'; //98
        initials[2] = 'c'; //99
        System.out.println(initials); // ['a', 'b', 'c']

        int carpim = 1;   // Carpimlarini istedigi icin 1 koyduk bos küme icine (baslagic degeri) , 0 koysaydik
                          // gelen her deger ile carpilinca 0 verecekti. 0 Yutan elemandir.
        for (int w : initials){
            carpim = carpim * w;
        }
        System.out.println(carpim); // BUrda carpilmis halini görürüz.   ==>  941094

    }
}
