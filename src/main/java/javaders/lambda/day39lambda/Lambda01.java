package javaders.lambda.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
  Normal Structure yapisi vardir Java,
  "Funtional Programming" Lambda. Okumasi daha kolaydir ve sadedir. Method olusturmadan hazir methodlarlar olusur.
  ve cok hizlidir ve hatasiz kod yazma durumu vardir. Bizim yazdigimiz methodlar bazen hata olabilir. Güncellemeler vs.
 Lambda = Bir programlama tarzidir. Hazir methodlarla yapilir. Funtional Programming'tir. Bazi yerdelerde kullanilir ama
 bazi konularda kullanilamaz. Mesela; sinirliliklari vardir. Collection ve Array lerde kullanilir ama , Map 'lerde
 kullanilamaz.
 Her halükarda calisan sistem Structure Programming tir. Yani Java'dir.
 */

public class Lambda01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueWithLower(myList);
        System.out.println();
        d(myList);
        System.out.println();
        duygu(myList);


    }
    // Example 1 : Bir List'deki elemanlari console yazdiran methodu olusrunuz.
    /** 1.Yol */
    public static void printElements(List<String> myList){

        for (String w : myList){                /** Bu code yazma sistemi for Loop ile yazildi.
                                                      Bu yapiya " Structured Programming" denir. */
            System.out.print(w + " ");
        }
    }


    /** 2.Yol : LAMBDA EXPRESSION */
    // Farkli bir yapisi dikey yapilanma vardir. Yukardan asagiya dogrudur.Yan yana degildir.stream();
    public static void printEl(List<String> myList){
                                                       /** Bu sekilde code olmadan sadece hazir Lambda methodlari
                                                               Bu yapiya "Functional Programming" denir.
                                                                 */
        myList.stream(). // datalari akisa sunar.
                forEach(t -> System.out.print(t + " ")); // console yazdirir.
    }


    // Example 2 : Bir List'deki Tile baslayanlar haric tüm elemanlari console yazdiran methodu olusturunuz.
    public static void printElExceptStartWithT(List<String> myList){

        myList.stream().
                filter(t->!t.startsWith("T")).// eleme yapiyoruz. genelde bunu önce kullan az elemanla islem yapmak icin.
                forEach(t -> System.out.print(t + " "));

    }

    //Example 3 : Bir List'de karakter sayisi 4 ten az olan tüm elemanlari console yazan method olusturnuz.
    public static void printElLengthLessThanFour(List<String> myList){

        myList.stream().filter(t -> t.length()<4).forEach(t -> System.out.print(t + " "));
    }

    // Example 4 : Bir lIst'deki karakter sayisi 4 ten cok olan tüm elemanlari büyük harfle method yazin
    public static void printElLengthMoreThanFourWithUpper(List<String> myList){

        myList.stream().
                filter(t -> t.length()>4).
                map(t -> t.toUpperCase()). // elemanlarin yapisini degistirmek icin map(); kullan.
                forEach(t -> System.out.println(t + " "));
    }

    //Example 5 : Bir List'deki karakter sayisi 4 ten cok olan tum elemanlari tekrarsiz olarak kucuk harflerle yazdiran method.
    public static void printElLengthMoreThanFourUniqueWithLower(List<String> myList){

        myList.
                stream().
                filter(t -> t.length()>4). // eleme yapar
                distinct().// tekrarsiz elemanlari alir.
                map(t -> t.toLowerCase()). // yapisini degistirir
                forEach(t -> System.out.print(t + " "));
    }

    /** distinct()tekrarli elemanleri bir kere gosterir. */
    //lambda'da elemanlari azaltan methodlar once kullanilir

    // Example 6 : Bir List'deki elemanlari tekrarsiz olarak büyük harflerle alfabetik sirada yazdirin.
    public static void d (List<String> myList) {
        myList.
                stream(). // datalari akisa alir. [C, a, B, a]
                distinct(). // [C, a, B]
                map(t -> t.toUpperCase()). // [C, A, B]
                sorted(). // alfabetik siraya koyar. (Natural Order) [A, B, C]
                forEach(t -> System.out.print(t + " "));
        //sorted(); => methodu Natural Order olarak calisir. String icin A-Z , integer icin 1 den sonsuza
        //reverse order , tersten siralamadir.
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle
    // uzunluklarina kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void duygu(List<String> mylist) {

        mylist.
                stream().
                distinct().
                map(t -> t.toLowerCase()).   //Alfabetik siraya gore dizer
                sorted(Comparator.comparing(t-> t.length())).//sorted(Comparator.comparing(t-> t.length()  elemanin uzunluguna bakarak karsilastir
                forEach(t-> System.out.print(t+ " "));
    }  /** Note: Siralamayi bir sarta baglayacaksak biz belirleyeceksek sorted(Comparator.comparing()) kullanmaliyiz */
    // Comparator.comparing karsilastiricidir. Karsilastirma sartini ben yazacaksam kullanilir.
    //Comparator.comparing(t-> t.length()) gibi. Elemanlari uzunluklarina göre karsilastir dedim.


}


/*
Main method disinda bir listteki elemanlari console'a yazdiran kodumuzu olusturalim.

public static printElements(List<String> myList) olarak methodumuzu olusturduk. Listimizi import ettik.
for each loop kullandik. sadece listimizi for each icinde String w'ya assign ettik. Sout icinde w+ " " yazdik.
Bu methoda bir List vermeliyiz.  Main method icine myList isimli String List olusturduk. Listimize add methodu ile elemanlar ekledik. methodu parantezi icine myList ekleyerek cagirdik.
Calistirinca ekrana elemanlar yazildi. Bu birinci yoldu.

Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
degisti. Tom
         Jim
         Clara

  stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
  Sonra for each gelip ikinci elamani aliyor. javaya print deyince Jim yazdiriyor ve devaminda Clara'yi bu sekilde yazdiriyor. Her yazdirmada bir bosluk birakiyor.
 */

/*
Main method disinda bir listteki elemanlari console'a yazdiran kodumuzu olusturalim.

public static printElements(List<String> myList) olarak methodumuzu olusturduk. Listimizi import ettik.
for each loop kullandik. sadece listimizi for each icinde String w'ya assign ettik. Sout icinde w+ " " yazdik.
Bu methoda bir List vermeliyiz.  Main method icine myList isimli String List olusturduk. Listimize add methodu ile elemanlar ekledik. methodu parantezi icine myList ekleyerek cagirdik.
Calistirinca ekrana elemanlar yazildi. Bu birinci yoldu.

Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
degisti. Tom
         Jim
         Clara

  stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
  Sonra for each gelip ikinci elamani aliyor. javaya print deyince Jim yazdiriyor ve devaminda Clara'yi bu sekilde yazdiriyor. Her yazdirmada bir bosluk birakiyor.
 */

/*
Example 5: Bir Listteki charcter sayisi 4 den cok olan tum elamanlari tekrarsiz olarak kucuk harflerle
consol'a yazdiran methodu olusturun.
Bu soruda cok sey isteniyor. Lambda ile kisa surede yapabiliriz.

Yukaridaki listimize daha sonra bir tane daha Tom, bir tane daha Clara ve bir Angelina ekledik.

public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myLIst)
Listimizde tam 6 eleman vardi. Sirasiyla 4'ten kucuk olanlari daha sonra birden fazla olanlarin tekrarli olanlarini
iptal ettik. Once listi stream'e cevirdik ve filtreleme isini yaptirdik. Bu kismda elemanlardan Tom ve Jim'i iptal etti.
Neyi eleyecek? length'i 4'ten kucuk olanlar elendi devaminda distinct methodunu kullandik. Cunku tekrarli olanlari bir kez yazmasini istedik. Clara iki kez vardi.
Clara'yi bire dusurdu. map'i yazarak toLowerCase methodunu
alabildik, aldigi elemanlarin karakterlerini kucuk harfle yazdik. forEach methodu icine sout, onun da icine t'yi yazdik. Main method icine gidip methodu yazinca
ekranda clara angelina'yi gorduk. Diger elemanlardan birer tane daha vardi.

Elemanlari azaltan methodlar genellikle once kullanilir. Yazdigimiz kod buyudukce okumak zorlasir. Functional programming sayesinde kodumuzu daha okunur hale getirmis oluruz.
 */

/*
Example 6: Bir listteki elemanlarini tekrarsiz ve buyuk harflerele alfabetik sirada consol'e yazdiran methodu
olusturun.

public static void printElUniqueToUpperCaseSorted(List<String> myList)
Burada eleme yapmayacagiz. Her zamanki gibi stream ile baslayalim. Ancak kodumuzu yan yana okunacak sekilde
degil, alt alta siralayalim.
{
   myList.stream().
           distinct().
           map(t->t.toUpperCase()).
           sorted().//Alfabetik siraya gore dizer
           forEach(t -> System.out.print(t + " "));

}
methodu main method icinde cagirdik ve ekranda ANGELINA CLARA JIM TOM gorduk
 */
