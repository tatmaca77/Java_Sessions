package practices.day_13_practice;
/** Kod okurken mutlaka cizim yapmalisin !!!! */
public class C01_StaticKeyword {

    // Bir tane static variable, bir tane istance variable olusturalim bunlarin kullanimini main method icinde göaterelim.

    static int sayi1; // static variable

    int sayi2;  // instance variable

    public static void main(String[] args) {

        C01_StaticKeyword obj1 = new C01_StaticKeyword();

        C01_StaticKeyword obj2 = new C01_StaticKeyword();

        System.out.println(sayi1); // 0
        System.out.println(obj1.sayi2); // 0

        sayi1++;
        obj1.sayi2++;

        System.out.println(sayi1); // 1

        System.out.println(obj1.sayi2); // 1

        System.out.println(obj2.sayi2); // 0

        System.out.println(obj1.sayi1);//Aslinda sayi1 static vraible old. icin direkt yazdirabilirsin objeye gerek yok.

        System.out.println(obj2.sayi1); //1

        obj2.sayi1++;

        obj2.sayi2++;

        System.out.println(obj2.sayi2); //1

        System.out.println(obj2.sayi1); // 2

        System.out.println(obj1.sayi2); // 1

        System.out.println(obj1.sayi1); // 2

        obj1.sayi1++;

        obj1.sayi2++;

        System.out.println(obj1.sayi1); // 3

        System.out.println(obj1.sayi2); // 2

        System.out.println(obj2.sayi2); // 1

        System.out.println(obj2.sayi1); // 3



    }
}
