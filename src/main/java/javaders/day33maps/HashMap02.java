package javaders.day33maps;

import java.util.HashMap;

public class HashMap02 {

    /**
             HashMap<String, String> capitals = new HashMap<>();
             1) olusturdugumuzda Java memory'de 16 kutucuk olusturur
                ve o kutulari siarasiyla 0'den 15'e kadar indexler. Kutularin ici bostur. Bu kutulara "bucket" denir.

             2) HashMap ilk olusturuldugunda kutular bostur.
             3) capitals.put("USA", "Washington"); yazdigimizda, java ilk isim icin bir "hashcode" uretir.
                Java key icin 34 hashcode urettigini farzedelim.

             4) Bu hashcode'u 16'ya boler. 34:16 kalan 2'yi verir. Java kalana odaklanir ve indexi 2 olani bulur, sonra
                bos kutu olan yani 2.inci indexteki bucket'a once hashmap kodu olan 34'u koyar, yanina USA onun yanina
                Washington'i koyar.

             5) capitals.get("USA"); methodunu kullanirken, java USA icin urettigi kodu bildiginden onu bize verir.
             6) capitals.put("Italy", "Roma"): yazdigimizda key olan Italy icin bir hashcode mesela 65'i uretecek
                ve 16'ya bolecek. kalan 1'dir. Java indexi bir olan bucket'in uc bolmeli yapisinda ilk bolmeye 65, 2.ye
                Italy, 3. bolmeye Roma'yi koyar.

             7) codun 16'ya bolunmesi halinde 16 index olarak siralan bucket'larin disina kalanlar ile cikilmamis olacak.
             8) capitals.put("Turkiye", "Ankara"); bunun codu ornegin 82. 82/16 kalan 2, Java onceden doldurulmus olsada
                2. index'e uc bolmeli bir entry daha ekleyecek ve once 82, sonra TR ve sonra Ankara'yi yazacak.

             9) Java bucketlar icinde LinkList kullanir. Entryleri birbirine bagliyor. Indexte birden fazla entry olduysa
                onlari node yapisi gibi birbirine baglar.

             10) capitals.get("Turkiye"); Java Turkiye icin olusturdugu hashcode'i biliyor 82. 82 index 2'de.
                 Java buraya gelerek 82'yi alir.

             11) Biz Turkiye'yi bir kere daha koyarsak, Turkiye icin uretilen hashcode ayni olur, yeni bir hashcode uretmez.
             12) capitals.put("Turkiye", "Istanbul"); Java onceden urettigi 82'yi bilir ve index 2'ye gider. Orada iki
                 entry olsa da 82'yi secer ancak hashcode'a dokunmayan java Ankara yerine Istanbul yazar.

             13) Java 12 bucket doldugunda yeni 16 adet bucket verir.
     */


    public static void main(String[] args) {

        /** HashMap arkasinda calisan mekanizma nasil calisir ? */
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington");

        capitals.put("Italy", "Roma");

        capitals.put("Turkiye", "Ankara");

        capitals.get("Turkiye");

        capitals.put(null, "Istanbul");

        capitals.put("Turkiye", null);

        System.out.println(capitals);





    }
}
