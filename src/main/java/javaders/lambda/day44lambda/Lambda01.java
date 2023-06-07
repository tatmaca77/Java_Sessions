package javaders.lambda.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
   Lambda File Dosyalariyla nasil kullanilir ?
 */
public class Lambda01 {

    public static void main(String[] args) throws IOException {

        // Example 1 : Verilen text file icindeki text'i console yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).forEach(System.out::println);

        //lines methodu Paths.get ile calisir.
        //Satirlar oldugu icin "ln" i silmedik
        // throws IOException method Signature'a atama yaptik.

        /** files isimli text'imize ulasmamizi saglayan Paths.get icindeki sifreli kismi aldiktan sonra
         java text icindeki metni bir stream halinde satir satir alt alta siraliyor. files.lines kismi kizardiginda main metod yanina exemption'i throws keywordu ile ekladik ve kizariklik sona erdi.
         forEach ile yazdirma islemi yapiliyor.

         forEach methodu icinde lambda expression yerine System.out::println yazdik. Makbul olan budur.
         */

        System.out.println();

        // Example 2 : Verilen text file icindeki text'i buyuk harflerle console'a yazin.
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);


        // Example 3:  Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden kodu yaz.
        boolean r1 = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                anyMatch(t -> t.contains("Java")); // Burda Method Referance calismaz. !!! contains icine yazamayiz.
        // anyMatch(String::contains) yanlis olur.
        System.out.println(r1);

        //Example 4 :  (Kuran da)Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir List icinde yaz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t -> t.replaceAll("\\p{Punct}", "").
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);
        //flatMap() methodu arrayleri istenen sekle cevirir. Biz burada stream'e cevirdik


        //Example 5 : Verilen text file icindeki text'te toplam kac harf kullanildigini gosteren kodu yaziniz.
         long numOfLetters = Files.
                 lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                 map(t-> t.replaceAll("[^A-Za-z]","")).
                 map(t->t.split("")).
                 flatMap(Arrays::stream). // bu method dümdüz eder. Stream'den kurtarir.
                 count();
        System.out.println(numOfLetters); // 198



        /*
Lambda da iki tür method var.
1-Terminal Method: Kendisinden sonra method kabul etmez.sum(), count() gibi.
2-Kendisinden sonra method kabul eden methodlar.
 */


        /** count(); kendisinden sonra baska bir method kullandirmaya izin vermez.
            Kendisinden sonra method kullanilmaya izin vermeyen Methodlara "Terminal Method" denir.
            count(); Match()'ler gibi. Yani aslinda son method'tur.
            Bazilari ise izin verir.
         */

        // Example 6 : Verilen text file icindeki text'te kullanilan tüm harfleri alfabetik olarak ters sirada List icinde verin.
List<String> letters =Files.
                      lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                      map(t-> t.replaceAll("[^A-Za-z]","")).
                      map(t->t.split("")). // Split bize Array verdigi icin o harfler Array'de kalir.
                      flatMap(Arrays::stream).  // Array icinde kalan o harfleri yikariz ve dümdüz ederiz.Array'den kurtarir.
                      sorted(Comparator.reverseOrder()).
                       collect(Collectors.toList());

        System.out.println(letters);

        /**
         Example: Text file icinde kullanilan tum harfleri alfabetik olarak ters sirada bir list icinde return
         edecegiz.

         1. adim:List olustur

         2.adim:text file'i dosyaya ulasacak sekilde al, Files.lines(Paths...

         3.adim:map metodu ile harf disindaki karakterleri sil

         4.adim:2.map ile split metodu ile hiclikten keserek harfleri al. Array olarak verir.

         5.adim:flatMap ile duvari kir ve harflere ulas

         6.adim:sorted(Comparator.reverseOrder() ile ters sirada harfler sirala

         7.adim:collect(Collectors.toList() ile harfleri list icine yerlestir.

         sout icine listin ismini yaz ve calistir*/
    }


}

/*
Example 4: Text icinde kullanilan farkli kelimeleri bir list icinde return edecegiz.

Oncelikle String bir List olusturduk. text'imiz files.lines ve devamini assign ettik. files.lines kismi ile biz
file'a ulasiriz. Bu satir yanina sirasiyla map methodunu yazdik. Map icinde once noktalama isaretlerini silmemiz ve sonrasinda split metodu ile kelimeleri almamiz lazim. Once replaceAll metodu icine {"\\p{Punct}" yazarak noktalama isaretlerini sildik ve yine map icinde split metodunu kullandik. split metodu
icine " " yazarak bosluklar cikarilinca bize kelimeler kaldi. Istersek map'i bir kerede istersek iki kez kullanabiliriz. split metodu bize array verir. Kelimelerimiz bir array icinde oldu. map metodu yaninda flatMap metodu kullandik. flatMap array icine girmemizi saglar, metni cevreleyen duvarlar flatMap ile kirildi. stream icindeki kelimeler ile calisacaksak icine girebilmek icin flatMap kullaniriz. Bu metod icine Arrays::stream yazarak ardindan distinct metodunu ekleyerek farkli kelimeleri aldik.

ve collect(Collector.toList) ile kalan tum farkli kelimeleri bir liste koyduk. En son sout icinde listimizin words olan ismini yazarak kodumuzu calistirdik.
 */


/*
Example 6: Text icindeki text'de toplam kac harf oldugunu bulacagiz.

Once Files.lines...ile textimizi aldik. Harfler disinda ne varsa silebilmemiz icin map metodu icinde replaceAll metodunu kullandik. Bu defa bir map icinde birden fazla metod kullanmak yerine ikinci bir map metodu yazdik ve icinde split metodunu kullanarak hicliklerden kelimeleri degil, harfleri aldik. Elimizdeki
harfler bir stream'in ve array'in icinde. Bu elemanlara ulasmak icin array parantezini kirmak icin flatMap metodunu yazdik. flatMap icine Arrays::stream yazarak elemanlara ulastik. Devaminda count () metodu kullanmaya karar verdik. Cunku bu metod ile toplam harf sayisini alabiliriz. count metodu bize long verir.
Biz de tum kodumuzu yeni olusturdugumuz long numOfLetters conteynerina assign ettik.
Son olarak sout icine numOfLetters koyarak kodumuzu calistirdik.
lambda da bazi metodlar kendisinden sonra metod gosterir, bazi metodlar son kullanim amacli olup, ondan sonra baska metod kullanamiyoruz. Ornek anyMatch() ya da count(), forEach() yanlarina nokta koyunca baska metodlari
ekranda sirali halde goremedik. count() gibi kendisinden sonra metod kullanilmasina musaade etmeyen metodlara terminal method denir.
 */