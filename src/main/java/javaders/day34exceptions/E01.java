package javaders.day34exceptions;

public class E01 {


    /**
       1) "Exception" beklenmedik problem demektir.
       2) "Exception" i halledebilmek icin iki temel yol vardir:
           i) "Exception" a uygun cözümler üretebilirsiniz. "Exception Handling" denir.
           ii) "Exception" olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir.
       3) "Exception" a uygun cozumler üretmede "try-catch" kullanilir.
          "try-block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
          Java islemi problemsiz bir sekilde yaparsa "catch-block" Java tarafindan okunmaz.
          "try-block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki
          code'lar calisir.
       4) "try-block" da islem yapilirken "Exception" olusursa "try-block" icindeki Exception'dan sonraki code'lar calismaz.

       
     Aslinda Java Exception'larla beraber Developer'a duvar örüyor ve onlarin büyük hata yapma ihtimalini önlüyor.!!!
     Bir hata yapiyorsun, JAVA sana Exception atiyor ve bu Exception icinde mesajla sana hatayi söylüyor. O hatayi
     telafi etmek icin "try-catch" kullanarak bu ölümcül hatalari önlüyor. Yani bunu güvenlik ayari gibi düsünebiliriz.
     Yani aslinda hata yapmamizi önlüyor. Exception Class'lar sayesinde bu hatalar engelleniyor.
     
     */

    public static void main(String[] args) {

        System.out.println(divide1(12,3));
        System.out.println(divide1(6,0));

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));

    }

    /** 1.Way Exception'i handle etmede ilk ve igrenc yol */ //Yani aslinda Exception da if else degil try catch kullan.!
    public static int divide1 (int a, int b){
        if (b == 0){
            return 0;
        }else {
            return a/b;
        }
    }

    /** 2.Way Exception'i handle etmede harika yol */
    public static int divide2 (int a, int b){

        int result = 0;

        try{
            result = a/b;
            System.out.println("I am here");
        }catch(ArithmeticException e){ //"ArithmeticException" matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("There is an issue in the division");
        }
        return result;
    }
    
    
}
