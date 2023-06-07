package javaders.day24inheritancepolymorphism;

/**
  1) Inheritance da object olustururken constructor'lar yukaridan(Parent) asagiya(Child) dogru calisir.
  2) Parent ve Super es anlamlidir. Child ve Sub es anlamlidir.
  3) super(); her constructor'in ilk satirinda gorunmez olarak bulunur. Ancak isterseniz gorunur sekilde de yazilabilir.
  4) super(); sizi parent class'daki constructor'a tasir.
  5) this(); sizi ayni class icindeki constructor'lar arasinda gezmemizi saglar.
  6) "this" icinde bulundugunuz class'taki variable'lari cagirmaya yarar.
     "super" parent class'daki variable'lari cagirmaya yarar.
  7) Eger data type'lari arasinda "IS-A" ve "HAS-A" iliskisi varsa bu data type'larina "COVARIANT" denir.
 **/
  // OOP concept yani Object Oriented Programming 4 tane Prensibi vardir.
  //   --- Inheritance  --- Polymorphism (Overloading+Overriding) ---       ---
/**    POLYMORPHISM
   1) Polymorphism == > Coklu sekil.
      Yani; bir method'un farkli sekillerde karsimiza cikmasi demektir.
      Polymorphism == Overloading + Overriding
   2) Overriding , parent class'daki method'u child class'in ihtiyaclarina göre ozellestirerek kullanmak demektir.
   3) Overriding'de method'un body'si degistirilir. ( Overloading'te method'un parametresini degistiririz. !!!! )
   4) Overriding'de method "signature"(signature yani method'un ismi ve parametre.)'a dokunulmaz. Dokunursaniz Java kizar.


 **/

public class Car {

    public void move() {
        System.out.println("Cars move...");
    }
    public void getBreak() {
        System.out.println("Cars break...");
    }
    public void engine() {
        System.out.println("Cars have engine...");
    }

    public String model = "Car";
    public int price = 0;

    public Car (){ // Constructor
        super();
        System.out.println("Car constructor 1");
    }

    public Car(int i ){
        System.out.println("Car constructor 2");
    }


}

