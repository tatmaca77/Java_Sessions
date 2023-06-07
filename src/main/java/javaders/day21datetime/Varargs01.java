package javaders.day21datetime;

public class Varargs01 {

    public static void main(String[] args) {

        System.out.println(add1(5, 2, 4, 3)); // 14
        System.out.println(add1(5, 2)); // 7
        System.out.println(add1(5)); // 5
        System.out.println(add1()); // 0


        getInitials("Ali Can", "Tolga Han", "Oguz Han", "Umut Kaan");
        /*
        initials = AC
        initials = TH
        initials = OH
        initials = UK
         */

    }

    //  EXAMPLE : 1  ==> Toplama islemi yapan bir method olusturun.

    // Asagidaki gibi farkli method'lar olusturarak is yapmayiz. Cünkü Kullanici farkli sayidaki sayilari
    //toplamak isteyebilir, her ihtimal icin bir method olusturmak mumkun degildir.
    public static int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;

    }

    // Java farkli sayidaki parameterelerin hepsini kabul eden bir yapi olusturdu.
    /** Bu yapiya "Varargs" denir. **/  // Aslinda List gibi calisir.
    // "Varargs" arka planda "Array" yapisini kullanir.

    /**
     * Bu Varargs ile byüyük ve fazla yapcagin islerde cok önemlidir.1000 tane sayiyla da toplama yapabilirsin !!!
     **/

    /*
      1) Bir method parantezinde birden fazla "Varargs" kullanilamaz.
      2) Bir method parantez'inde bir'den fazla parametre kullanuilacaksa "Varargs" en son kullanilir.
      3) Her Data Type'inde "Varargs" kullanilabilir.

     */
    public static int add1(int... a) {  // yanina bir tanede daha ( int b...) yazmaya gerek yok. Zaten her elemani aliyor.
        // Bu kullanilmayan yani Unused Code'dur.
        int sum = 0;                              /** Ama (int a, int b...) bu sekilde kullanilabilir. !!! **/
        for (int w : a) {                            /** Önce varrargs sonra parametre kullanilamaz. **/
            sum = sum + w;
        }
        return sum;

    }

    // EXAMPLE 2 : Verilen isimlerin ilk harflerini console'a yazdiran kodu yazin.
    // Ali Can == > AC    Tolga Han ==> TH

    public static void getInitials(String... s){

        String initials = "";

        for (String w : s) {
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println("initials = " + initials);
            initials = "";
        }

    }


}
