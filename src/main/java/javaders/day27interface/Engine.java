package javaders.day27interface;

// Interface ve Abstraction farklari INTERVIEW'da kesinlikle gelir. !!!!!!!

/**
 *                                 Interface'deki Method'lar
 1) "Interface" icine "Concrete Method" konulamaz. !!! (Yani body olmamali)
 2) "Interface" icindeki method'larin "abstract method" oldugunu Java bilir, bu yüzden interface icindeki
    "abstract method"larda "abstract keyword" kullanmaya gerek yoktur. !!!
 3) "Interface" icindeki "abstract method"larin tamami "public"tir. Bu yüzden interface icinde abstract method olustururken
    "access modifier" yazmaya gerek yoktur. !!!
 4) Bir "interface" i bir "class"in parent'i yapmak istediginizde "extends" keyword yerine "implements" keyword kullanilir.!!!
 5) "Concrete Child Class"lar "parent interface"deki "abstract method"lari Override etmek zorundadirlar.!!!
 6) "Interface"ler bir Application'da "Concrete Child Class"larin yapmak zorunda olduklari
     fonksiyonlari barindirirlar. Bu yüzden "interface"lere "to-do list" de denir.
 7) Birden fazla "parent Interface" icinde ayni isimli "abstract method"lar olusturabilirsiniz.
    abstract method'larin body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi birini
    Override ederek kullanabilirler.
 8) Birden fazla "parent Interface" icinde ayni isimli "abstract method"lar olusturdugunuzda bu method'larin
    "return type"lari ayni olmak zorundadir.
 9) Normalde "interface" icine "concrete method" konulamaz. Ama bazi özel durumlarda "concrete method" koymak gerekirse
    "default" ve "static" keyword'unu asagidaki gibi kullanarak interface icine "concrete method" konulabilir.
          i) default void eco () { System.out.println("Uses gas less...");}
          ii) static void stop () {System.out.println("Stops securely...");}
 10) "default" veya "static" keyword'unu kullanarak olusturdugubuz "concrete method"larin "concrete child class"lar
     tarafindan kullanilma zorunlulugu yoktur. Yani bunlari Override etme zorunlulugun yoktur. !!!!
 11) "default" keyword'unu kullanarak olusturdugunuz "concrete method"lara "object" olusturarak ulasilabilir.
     "static" keyword'unu kullanarak olusturdugunuz "concrete method"lara ulasmak icin "object" olusturmaya
     gerek yoktur. "Interface" ismi yeterlidir.
 12) "interface"lerden "object" olusturulamaz. Cünkü icinde abstract yani body'si olmayan yarim method'lar vardir.
     Bu sebeple Object'lerde yarim olur.
 13) "interface"lerin "Constructor"i yoktur. !!!!

 **/

public interface Engine {

     void start();

     void payment();


     default void eco(){
          System.out.println("Uses gas less...");  // default keyword ile concrete method olusturdum.
     }

     static void stop(){
          System.out.println("Stops securely..."); // static keyword ile concrete method olusturdum.
     }
}
