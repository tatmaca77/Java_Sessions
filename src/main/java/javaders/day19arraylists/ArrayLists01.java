package javaders.day19arraylists;

import java.util.ArrayList;

public class ArrayLists01 {

    /**
       1) Ayni data type'indeki coklu data'lari depolamak icin Array kullaniriz.
       2) Array'lerin bir negativ yönü vardir ; icine koyacaginiz eleman saiyisini en basta belirlemek zorundasiniz.
       3) Array'ler eleman sayisinda esnek degildir; bu yüzden Java "ArrayList" adli yeni bir yapi olusturdu,
          bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
          1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.
       4) "ArrayList" yerine sadece "List" de diyebiliriz.
       5) Java ArrayList'leri olusturduktan sonra "Array"leri iptal etmedi cunku ;
          i) Array'ler super fast dir.
          ii) Array'ler memory'de coook az yer kaplar.
       6) Array'ler "primitive data" type'lari ve "reference"'lari depolayabilir ama "ArrayList" ler "non-primitive"
          data type'larini depolar. Bu yüzden "ArrayList"'ler "Array"'lerden daha cok yer kaplar.
     **/

    public static void main(String[] args) {

        // ArrayList nasil olusturulur ?
        ArrayList <Integer> ages = new ArrayList<>();

        // ArrayList nasil yazdirilir ?
        System.out.println(ages); // [  ]

        // ArrayList'e eleman nasil eklenir ?    // Obje'yi kullanarak method olusturursam non-static olur.
        /** 1. Yol **/
        ages.add(12);
        ages.add(24);
        ages.add(9); /** add() method'u elemanlari "giris sirasina"(insertion order) göre List'e yerlestirir. **/
        System.out.println(ages); // [12, 24, 9]



        /** 2. WAY **/
        ages.add(1, 99); /** Index 1'e 99'u yerlestir.**/
        System.out.println(ages); // [12, 99, 24, 9]

        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        /** 3. WAY **/
        ages.addAll(price);  /** Bu method bütün price icindeki elemanlari ages'a koyar. Bir List'i diger list'e yerlestirir.**/
        System.out.println(ages); // [12, 99, 24, 9, 23, 33]

        /** 4.WAY **/
        ages.addAll(3,price);
        System.out.println(ages);  // [12, 99, 24, 23, 33, 9, 23, 33]

        // ArrayList'e eleman sayisi nasil bulunur ?
        int numOfElement = ages.size(); /** size() method'u bir List'deki eleman sayisini verir. **/
        System.out.println("numOfElement = " + numOfElement); // 8

        // ArrayList'te specific bir eleman nasil alinir ?
        int el1 = ages.get(3); /** get() methodu index kullanarak istedigimiz elemani almaya yarar.**/
        System.out.println(el1); // 23

        //ArrayList'de specific bir eleman nasil degistirilir ?
        ages.set(6, 111);  /** 6. index'teki elemani 111 yap dedik. **/
        System.out.println(ages); /** set() method'u istedigin index'teki elemani degistirmek icin kullanir. **/

        //ArrayList'te specific bir elemanin var olup olmadigini nasil ögreniriz ?
        boolean r1 = ages.contains(99); /** ages List'inde 99 var mi yok mu ? **/
        System.out.println(r1); // true

        // Bir ArrayList'in bos olup olmadigini nasil kontrol ederiz ?
        boolean r2 = ages.isEmpty();
        System.out.println(r2); // false

        // Bir ArrayList'teki tum elemanlari nasil sileriz ?
        ages.clear(); /** clear() methodu cok sik kullanilir. **/
        System.out.println(ages); // []


        boolean r3 = ages.isEmpty();
        System.out.println(r3); // true


        // Example 1 : Bir List'in bos olup olmadigini kontrol eden cod'u yaziniz.

        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1. Yol
        if(names.size() == 0){
            System.out.println("List is empty");           // Bu yöntemde daha cok is var karsilastirma vs tavsiye olmaz.
        }
        else {
            System.out.println("Liste has at least 1 element");
        }
        //2. Yol ----- Recommended
        if(names.isEmpty()){
            System.out.println("Liste bostur");
        }                                          // Bu method tavsiye edilir.
        else {
            System.out.println("Liste'te en az bir eleman vardir");
        }










    }
}
