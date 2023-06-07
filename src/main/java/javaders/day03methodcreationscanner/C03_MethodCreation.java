package javaders.day03methodcreationscanner;

public class C03_MethodCreation {


    /*
    Java da method nasil olusturulur.

    1) Java da method main'in disinda olusturulur.
    2)tekrar tekrar kullanmamiz gerekirse method olustururuz.
    Acces Modifier    +     Return Type    +    methodIsmi     +   ( )   +   { }
    islem yapilacak olan sayilari veya verileri methodIsmi () parantezin icine eklenir.

    Scope == (Kapsam Alani) bir variable'in bir degerin hangi alanda kapsama alani icinde oldugunu gösterir.
     */

    public static void main(String[] args) {

        // 1) Verilen iki sayiyi toplayan methodu olusturunuz.
        add(30 ,87); // +9 yapamazsin void return type oldugu icin toplama yapmaz. Int yap diye tavsiye verir.

        // 2) Verilen iki sayiyi carpan methodu yaziniz.
        multiply(46,12); // /10 yapamayiz. Sadece ekrana verir yani kullanamiyoruz sadece görüyoruz.

        //3) Verilen 3 dayidan ilk ikisini carpan ve sonucu
        //ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
        System.out.println("firstTwoMultiplyThirdadd : " + firstTwoMultiplyThirdadd (2,3,5) );

        // 4) Verilen bir ondalikli sayinin kupunu hesaplayip kullandiran bir method olusturunuz 5.6
        double resultCube = getcube(5.6);
        System.out.println("resultCube = " + resultCube);

        // 5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
        System.out.println("daireninCevresiMethodu : " +daireninCevresiMethodu(2));



    }//main


    static void add(int a, int b) { // Acces Modifiers (default) oldugu icin bir sey yazilmadi.

        System.out.println(a + b);

    }

    private static void multiply(int x, int y) {

        System.out.println(x * y);

    }

    private static int firstTwoMultiplyThirdadd(int a, int b, int c) {

        return a*b+c;
    }

    private static double getcube(double v) {

        return v*v*v;
    }

    private static int daireninCevresiMethodu(int r) { 

        return 2*314*r/100; // Normalde  pi dedigimiz rakam 3,14 tür. Burda int aldigimiz icin ondalikli yazamayiz.
                            // Bu sebeple 100 e böldük. Ama double veya float olsaydi 3,14 yazabilirdik.
                         // Ve bu sebepten dolayi sonuc 12.56 olarak yazilir. Ondalikli tarafi da alir.
                        // Ama normalde Int verirsen ondalikli bölümü almaz direkt tam sayi olarak yazar.

        /*  Yani :

        public static double daireninCevresiMethodu ( double r) {   return 2*3,14*r; }
         */
    }



}//class
