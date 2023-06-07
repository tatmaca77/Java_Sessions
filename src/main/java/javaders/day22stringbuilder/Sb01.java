package javaders.day22stringbuilder;

public class Sb01 {

    /**
      1) "StringBuilder" String üreten bir Class'tir.
      2) String Class kullanarak String üretiriz, Java nicin "StringBuilder" Class'i da olusturdu?
         "String Class "immutable"(degistirilemez) String üretir, "StringBuilder" Class "mutable"(degistirilebilir) String üretir.
      3)"Immutable" olmak demek orginal degerin korunmasi yani degistirilemez olmasi demektir.
         "Mutable" olmak demek orginal degerin degistirilebilir olmasi demektir.
      4) "capacity" Java'nin size verdigi bir data depolama yer sayisidir.
          Length ise verilen data depolama yerinin kullanilan kismidir.
      5) Java baslangic olarak size capacity'i 16 olarak verir.
         Siz verilen capacity'i asarsaniz Java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde gösterir.
     **/

    public static void main(String[] args) {

        String s = "Java";
        s = s+ "!";

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        /** StringBuilder nasil olusturulur ? **/

        //1.YOL
        StringBuilder t = new StringBuilder("Python");
        System.out.println("t = " + t); // Python

        /** StringBuilder'lara nasil ekleme yapilir ? **/
        t.append("!").append(".."); // Ayni satirda olusturgumuz method'a "Chain Method" adi verilir.
        System.out.println("t = " + t); // Python!..

        // 2.Yol
        StringBuilder r = new StringBuilder();
        System.out.println("r = " + r);

        r.append('c');
        System.out.println("r = " + r);
        
        /** "capacity" ve "length" arasindaki fark nedir? **/
        StringBuilder sb1 = new StringBuilder("Money");
        
        int capacity = sb1.capacity();
        System.out.println("capacity = " + capacity);  // 21   ==> 16 bize verilen index hanesi + Money indexi 5 == 21
        
        int length = sb1.length();
        System.out.println("length = " + length); // "Money" ==> 5

        sb1.append("!").append(".................");

        int c = sb1.capacity();
        System.out.println("c = " + c); // 21 * 2 + 2 = 44
        
        int ln = sb1.length();
        System.out.println("ln = " + ln); // "Money!" ==> 6  // 23


        /** Default Capacity'i degistirebiliriz? **/
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity()); // 2

        sb2.append("...");
        System.out.println(sb2.capacity()); // 6







    }
}
