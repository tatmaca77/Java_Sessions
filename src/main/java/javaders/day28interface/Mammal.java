package javaders.day28interface;


   /**   Child   Parent
           |        |
     1) Class --> Class : extends
        interface --> interface : extends
        Class --> interface : implements
        interface --> Class : Olamaz ...
        Ayni ise "extends" , farkli ise "implements" kullan.
        "interface" i Class'in child'i yapma.!!!
    **/

public interface Mammal extends Animal{

   String feedBaby = "Milk";              // Bu bir final variable'dir. Deger atamasi initialization yapmaliyim.
   int age = 6;
}

        // INTERVIEW da kitabi konusma. Kendi cümlelerinle ezebere konus. !!!!
/**
     Abstract Class ile Interface arasindaki farklar nelerdir? ******** INTERVIEW da kesinkesin cikar. *******

 *1) Abstract Class'lar hem "abstract" hem de "concrete" method'lar icerebilir.
    Fakat interface'ler sadece "abstract method" icerir.
    Ama interface'lerin icinde istersek "default" ve "static" keyword'lerini kullanarak "concrete method" üretebiliriz.
 *2) Abstract Class'lar multiple inheritance'i desteklemez , ancak interface'ler destekler. Zaten bunun icin kurulmus.
 *3) Abstract Class'lar icinde her türlü variable olusturulabilir. Interface icindeki variable'lar
    public,static ve final olmak zorundadir.
 *4) "interface" Class'in Child'i olamaz, ama "abstract class" class'in child'i olabilir.
 *5) Abstract Class'larda Constructor vardir ancak object üretemezler, interface de constructor yoktur bu yüzden
     object üretemezler.
 **/
