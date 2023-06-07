package javaders.day26abstraction;

/**
    1) Bazen Parent Class'daki method'un body'si hicbir Child Class tarafindan kullanilmaz.
      Bu durumda parent daki method'a body yazmak hic kullanilmadigi icin mantikli degildir.

    2)  Bizde o method'a body yazmayiz. Body'si yazilmayan method'a "abstract" method denir.
       Abstract ingilizce'de vücutsuz veya soyut denir.

    3) Method'un body'si yazilmayinca Java hata verir. Bizde "abstract" key word'unu kullanarak
       Java'ya bu method'un body'si olmayacak deriz.

    4) "abstract" key word'unu kullaninca elde ettigimiz abstract method normal class'lara konulamaz.
       Bu yüzden Class'da abstract olur.

    5) Parent'daki method abstract ise butun child class'lar o method'u Override etmek zorundadir.
       Bu yüzden tüm Child'lar icin mecburi olan foksiyonlari abstract yapmak mantikli bir secimdir.

    6) Body'si olan method'lar (Concrete Method) abstract class'larin icine yazilabilir. Ancak
       abstract method'lar Concrete Class'larin icine yazilamazlar.

    7) "abstract" keyword ile "method body" bir method'da ayni anda kullanilamaz.

    8) Abstract Class'lardan Object üretilemez. Cünkü eksik olur. !!!!
       Abstract Class'larin icinde abstract method'lar olur. Abstract Method'larin body'si olmadigindan
       eksik method'lar gibi düsünülebilir.
       Yani ; abstract class icinde eksik bir yapi barindirir. Siz abstract class'dan object üretirseniz, abstract
       class icindeki eksiklik
       object'e yansir ve object eksigi olan bir object olmus olur.Java bunu istemez, cünkü eksik object eksik is yapar.
       Bu durumda application'in yanlis calismasina sebep olur. Java application'i korumak icin abstract class'lardan
       Object üretilmesini engellemistir.

    9) "abstract class" larin Constructor'i vardir ancak Object olusturamazlar.

    10) "final method"lar "abstract" olamazlar.

    11) "private method"lar abstract olamazlar. "static" te abstract olamaz.

    12) "Abstract Class"in "abstract child"i veya "concrete child"i olabilir.


 **/


            /*  INTERVIEW SORUSU

     final keyword"u aciklar misiniz ?

     Degismeyecek bir deger varsa onun degismemesi icin final eklersin. Final silince yeni deger atayabilirsin.

     "final keyword"  i) variable'larda  ii) method'larda iii) class'larda kullanilir.


     i) variable'larda kullanildiginda  a) O variable'a kesinlikle deger atamasi yapilmalidir.
                                        b) Ilk atanan deger asla degistirilemez

     ii) method'larda kullanildiginda   a) method'un body'si degistirilemez
                                        b) Bu sebeple o method override edilemez.

     iii) class'larda kullanildiginda    a) O class'in child class'i olamaz ama final class'in kendisi child olabilir.



           */

public abstract class Courses {

    public abstract void math ();     // Yarim kalmis bir method'tur. Body'si yoktur ama child override edince body'si tamamlanir.


    public void art(){
        System.out.println("Learn art...");   // Tam bir method'tur.
    }

    public final void multiply (){
        System.out.println("Do multiplication...");
    }




}


