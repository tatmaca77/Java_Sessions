package javaders.day18constructorsstatickeyword;

public class MethodOverloading {    // BU KONU INTERVIEW da gelir
    /**
        1) Bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
        2) "Method Overloading" Java da iyi organizasyon icin onemlidir.
        3) Method Overloading yaparken parametre 3 sekilde degisebilir.
           i)Parametrelerin sayilarini degistirilebilir.
           ii) Parametrelerin data type'larini degistirebilirsiniz.
           iii) Parametrelerin data type'leri farkli ise yer degistirebilirsiniz.
        4) "Method Overloading" bir class'in icinde olusur , bu yüzden "private" method'larla overload edilebilir.

     ******* INTERVIEW da sorulur. *******
           "Method Overloading" butun access modifier'larda kullanilabilir.
        5) "static" method'lar "overload" edilebilirler.  !! INTERVIEW da sorulur.
    **/

    public static void main(String[] args) {

        System.out.println(add(3,5));
    }

    public static int add(int a, int b) {

        return a + b;
    }

    private static int add(int a, int b, int c) {

        return a + b + c;
    }

    public static double add ( double a, int b){

        return a + b;
}
    private static double add(int a, int b, double c){

        return a + b + c;
}





}