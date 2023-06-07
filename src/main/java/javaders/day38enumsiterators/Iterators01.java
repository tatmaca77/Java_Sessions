package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {

    /**
       1) Iterator'lar Loop'larin yaptigi ayni isi yapar. Cünkü Loop'larda "Sonsuz Loop" tehlikesi vardir,
          bu yüzden Iterator'lar sonsuzluk olusmadan ayni isi yaparlar. !!!!! Iterator'larda Sonsuz Loop
          ihtimali yoktur. !!!!
       2) "Iterator" lar ile "Loop"lar arasinda performance farki yoktur.
       3) "Iterator"lar bir Collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda
          daha basarilidir.
       4) Iki tip iterator vardir :  a) "Iterator": Bu sadece eleman silmede kullanilir, eleman eklemek veya
                                                   elemani degistirmek mümkün degildir.
                                     b) "ListIterator": Bu eleman silebilir, ekleyebilir ve degistirebilir.
       Note : "Iterator" sadece soldan saga calisir.(For each Loop gibi) ilk elemandan son elemana.
              "ListIterator" ise iki yönlü calisabilir. Ister ilk elemandan son eleman, veya tam ters olabilir.
     **/

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>(); // new keyword ile objeyi yoktan var eder.

        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); // [ Tom, Jim, Clara, Angie, Mark ]

        // Iterator kullanalim. ( List'i Iterator'a döndür.)
        Iterator<String> myItr = myList.iterator();  // Bu sekilde obje olustururz. Var olandan olustururum.
         /** [ Tom, Jim, Clara, Angile, Mark ] = List ve Iterator ayni görünür ama yapisi farklidir.
              Altin görünümlü yüzük ile saf altindan yüzük gibi*/
        while (myItr.hasNext()){                  // Iterator'a git sonraki eleman var mi diye while kurduk
                                                  // hasNext();
                  myItr.next();
                  myItr.remove();
                  /** hasNext(); Iterator'da bir sonraki eleman var mi yok mu onu sorar.True veya false dondurur.
                   next();Iterator'da bir sonraki elemani almak icin kullanilir.Pointer'i bir sonraki
                   elemanin onune tasir ve ustunden atladigi elemani return eder.
                   remove(); next'in return ettigi elemani siler.
                   next(); methodu increment decrement gibidir, loop'u devam ettiren next'dir.*/
        }
        System.out.println(myList); // []


        /*
        Main method icinde bir List olusturduk ve import ettik. Burada loop yerine Iterator kullandik.
Once List'i Iterator'a donusturmeliyiz ki Iterator icindeki methodlari kullanabilelim.
Listimizin ismini yazip nokta koyunca orada sirali methdolar icinde Iterator methodunu goruruz ve onu seceriz.
Bu method bize String Iterator verir. Oyle olunce String Iterator conteynarina ihtiyacimiz olur.
Biz de Iterator<String> myItr=myList.iterator() olarak conteynerimizi olusturduk. While loop kullandik.
While icine myItr.hasNext() yazarak iteratordaki sonraki eleman var mi diye soracagiz, varsa onu silmesini
isteyecegiz. Su sekilde devam ettik:
myItr.next();
myItr.remove();
Sonda sout icine myList yazarak elemanlari bir list icinde ekranda gorebildik. Iterator sayesinde sonsuz loop
tehlikesi ile karsilasmadik.
Biz bu kodu yazinca Java ayni elemanlari iterator yapisi icine koydu. Biz liste bakinca bir de iteratora bakinca
ayni seyi gorsek de yapi olarak farklidirlar. Fark: Ilk elemanin oncesine iterator bir pointer koyuyor.
Biz has.Next methodu kullaninca bu methodla ilk pointer'a gelip kendisinden sonra bir eleman var mi diye
sormus olduk. Pointer kendisinden sonra Tom olduguna isaret ediyor yani true oluyor. Daha sonra bir sonraki
elemanin onune java tarafindan konulan pointer'a gelip senden sonra eleman var mi diye methodumuz sormaya devam eder.
While loop condition'i true oldugu surece bir sonraki elemanin olup olmadigina bakilir.
Remove methodu ise gelip oldugu anlasilan ilk eleman silinir ve sonraki kisma gelir. Once has.Next sonra
remove methodu her eleman icin calisacak.
         */


        // ListIterator kullanalim.
        List<String> yourList = new ArrayList<>(); // new keyword ile objeyi yoktan var eder.

        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList); // [ Tom, Jim, Clara, Angie, Mark ]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el + "!");   // elemani al sonuna ! koy. Yani eleman ekleme yaptik
                                       // set(); methodu, List'i update etmeye yarar.
        }
        System.out.println(yourList); // [Tom!, Jim!, Clara!, Angile!, Mark!]

        /*
        ListIterator kullanmak icin yeni bir List yaptik. Elemanlarini add methodu ile ekledik.
yourList. yapinca methodlari gorduk ve ListIterator'i sectik. Bu bize String verecek. Listimizi ListIterator'a
cevirecek.
ListIterator<String> konteynerina yourListItr'yi assign ettik.
While loop kullandik ve parantez icinde listIterator'imizin ismini yazip nokta koyunca methodlari gorduk.
Methodlardan has.Next() methodunu secip condition olarak yazdik. Daha sonra ListItaretor'imizi kullanarak
baska methodlara baktik, Iterator'a oranla daha fazla method oldugunu gorduk.
Oradaki next methodunu aldik, next methodumuzu el isimli String'e assign ettik.ve devaminda yine
ListIterator'imiz ismini yazip nokta koyduk ve set methodunu aldik.
set methodu icine el + "!" yazarak her elamanin onundeki pointeri alip o elemanin uzerinden atlayip bir sonrakinin
onune poiter'i koymasini sagladik. Ancak her atlayista uzerinden atlanan elemanin yanina ! isareti eklenecek, cunku
biz set methodu ile bunu istedik. Set methodu icinde concatination yaptik.
Sout icine listimizin ismini yazinca ekrana [Tom!, Jim!, Clara!] yazildi. has.Next nethodu calisirken son elemandan
sonra bir eleman olmadigi anlasilinca false olur ve loop kirilir. Pointer en saga gelmeden hasPrevious methodunu
kullanamayiz. Kullanirsak bastaki elemanin oncesinde eleman olmadigindan loop kirilir.
         */


        // hasPrevious() ve previous() nasil kullanilir?
        while(yourListItr.hasPrevious()){

            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);
        }
        System.out.println(yourList); // [?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]

        /**
        //hasPrevious(); pointer'a "Senden once eleman var mi?" diye sorar.
    //Eleman varsa "true" yoksa "false" return eder. Bu method sagdan sola dogru calisir
         //previous() pointer'i bir onceki elemanin onune tasir ve ustunden atladigi elemani return eder.
         */


        //En sondan en basa nasil Iterate edebiliriz ?
        LinkedList<String> ourList = new LinkedList<>(); // new keyword ile objeyi yoktan var eder.
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();           // ascending artan 1, 2 ,3 gibi
                                                                       // descending azalan 3, 2, 1
        while (ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);                        //descending sondan basa (azalan) siralama, tersten baslar.
        }                                                  // kullanabilmem icin LinkedList kullanmaliyim.
                          //descendingIterator() kullanabilmek icin LinkedList olmasi gerekir ArrayList'te kullanamayiz.

    }
}
