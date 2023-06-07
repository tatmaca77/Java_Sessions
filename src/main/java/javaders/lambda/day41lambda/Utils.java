package javaders.lambda.day41lambda;

/**
    Utils Class, Utilities, Helper ; bu her projede vardir. Bu Class faydali methodlarin depolandigi yer demektir.
         Eger sik sik bu methodu kullanacaksam tek tek yazmam buraya olusturum isime yarayacagi zaman burdan kullanirim.
         Yani sik kullanilanlardir. Burda methodlari depolarim.

         Utils copluk degildir tek veya iki kez kullanacagin methodlari depolamana gerek yok. Sürekli kullanacaksan depo.

         Bir Proje öncesinde Utils Class icine mutlaka bak cok faydali olur. Bu hazir methodlarla isin cok hazir olur.
         Alip alip kullanirsin. Hazir Methodlardir.
 */
public class Utils {

    public static int getSquare (int a){
        return a*a;
    }

    public static boolean isOdd (int a){return a % 2 !=0;
    }
    public static boolean isEven (int a){return a % 2 == 0;
    }
    public static boolean kontrol (int a){return a < 7;
    }
    public static boolean kontrol2 (int a){return a > 8;
    }
    public static String kontrol3 (String s){
        s.startsWith("T");
        return s;
    }
    public static String kontrol4 (String s){
        s.endsWith("u");
        return s;
    }
    public static int getSumOfDigits (int a){   // Rakamlarin sayilari toplama methodu yaptik. !!!1

        int sum = 0;

        while (a > 0){
            sum = sum + a % 10;  // Sayinin son rakamini alir

            a =  a / 10;   // Sayiyi kücültür.
        }
        return sum;
    }
}
