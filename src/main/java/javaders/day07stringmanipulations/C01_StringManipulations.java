package javaders.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        /// ************ endswith *********** ///

        /*
        endsWith (); : Metnin belirli bir datayla bitip bitmedigini verir. Bize boolean bir sonuc döndürür.
                       Tek karakterde , coklu karakterde kullanilabilir.
                       */

        // Ex: s String'inin "money" ile bitip bitmedigini kontrol eden bir kod yaziniz.

        boolean isEnd = s.endsWith("money"); // true yada false döndürür. Bu kelime ile bitiyor mu demektir.
        System.out.println("isEnd = " + isEnd); // true döndürür.

        boolean isEnd2 = s.endsWith("Java");
        System.out.println("isEnd = " + isEnd); // false
        

        /// ************* replace (); ************* //

        /*
        replace (); : Metnin icerisindeki belirli bir data'nin yerine verilen diger datayi yerlestirir.
        Bu yüzden String bir data döndürür. String konteyner'a koyarim. Cok kullanilan bir method'tur.
        tekli 'char' karakterleri ile de coklu "String" karakterler ile de calisir. Ancak her iki taraftada
        ( cift tirnak ) (" ") yada her iki taraftada ( tek tirnak ) (' ') kullanilmalidir. 
         */

        //Ex: s String'indeki "money" kelimesini "dollar" kelimesi ile yer degistiren bir kod yaziniz. 
        
        String s1 = s.replace("money","dollar");
        System.out.println("s1 = " + s1); // Learn Java earn dollar 
        
        //Ex: s String'indeki "earn" kelimesinin yerine "win" yazan kod yaziniz.

        String s2 = s.replace("earn","win");
        System.out.println("s2 = " + s2); // Lwin Java win money -- olarak döndürür. "earn" gördügü heryerde degisim yapar.
        
        //Ex: s String'indeki "a" harflerinin yerine "*" sembolünü yerlestirin.
        
        String s3 = s.replace("a", "*"); // char da olur String de. 
        String s4 = s.replace('a', '*'); // Konteyner String olarak kalir. Eger tek karakter degisikligi
                                                         // yapacaksan char olarak tek tirnak ile kullan. 
                                                        // Parantezi tek tirnak ile char yapabilirsin.
        System.out.println("s3 = " + s3); // Le*rn J*v* e*rn money
        System.out.println("s4 = " + s4);
        
        //Ex: s String'indeli "n" harflerini "***" ile degistiriniz. Yani tek bir karakteri birden fazla karakter ile
        //degistirebiliriz. 
        
        String s5 = s.replace("n","***"); // ikiside cift tirnak olmalidir.
                                                     // String oldugu icin tek karakter yerine istersen kitap yaz.
        System.out.println("s5 = " + s5);// Lear*** Java ear*** mo***ey

        //Ex: s String'indeki tüm "e" harflerini siliniz.

        String s6 = s.replace('e',' '); // Verilen datanin yerine space yerlestirmek demektir aslinda.
        System.out.println("s6 = " + s6); // L arn Java  arn mon y
        // String s6 = s.replace("e",""); Bu sekilde yaparsan e yi siler ama kelimeler birbirine yapismis olur.
        //String s6 = s.replace("e",' '); Bu sekilde de olmaz iki tarafta tek tirnak olmalidir.
        //String s6 = s.replace('e',' '); L arn Java  arn mon y

        /*
        char data type'inin icine mutlaka tek karakter yerlestirilmelidir.
        Space bir karakterdir ancak hiclik Java da char icin kullanilamaz.
        Bu nedenle silme islemi yaparken mutlaka String kullanmaliyiz.
         */

        ///************ replaceAll (); ***************//

        /*
        Bir grup datayi degistirmek icin kullanilir. Bir grup datayi ifade edebilmek icin tirnak icine köseli parantez yazarsin.
        ( "Regular Expression" ) yani Regex kullanilir.
         */


        String t = "Tolga 31 ya$indadir sandik ama 30'mis!."; // ayri yerlerde rakam olursa replace kullanmayiz!!
        
        String t1 = t.replaceAll("[0-9]","*"); // Köseli parantez ve icine rakamlar araligini yaz.
        System.out.println("t1 = " + t1); // Tolga ** ya$indadir sandik ama **'mis!.


        /*
         En cok Kullanilan Regex'ler :

        1) Tum Rakamlar = ==> [0-9]
        2) Tum Kucuk Harfler ==> [a-z]
        3) Tum Büyük Harfler ==> [A-Z]
        4) Tum Harfler ==> [a-zA-Z]  // 'a' ile 'Z' arasina hic birsey yazilammz !!!
        5) Tum Harfler ve Tum Rakamlar ==> [a-zA-Z0-9]
        6) Tum Noktalama Isaretleri ==> \\p{Punct}
        7) Tum Sesli Harfler ==> [aeiouAEIOU]


        ^ ==> den farkli, haricinde demek istiyorsak

        1) Tum Rakamlar Haric = ==> [^0-9]
        2) Tum Kucuk Harfler Haric ==> [^a-z]
        3) Tum Büyük Harfler Haric ==> [^A-Z]
        4) Tum Harfler Haric ==> [^a-zA-Z]  // 'a' ile 'Z' arasina hic birsey yazilammz !!!
        5) Tum Harfler ve Tum Rakamlar Haric ==> [^a-zA-Z0-9]
        6) Tum Noktalama Isaretleri Haric ==> \\p{Punct}
        7) Tum Sesli Harfler Haric ==> [^aeiouAEIOU]
         */

        //Ex: t String'indeki tum harfleri ve tum rakamlari '!'e ceviriniz.
        
        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("t2 = " + t2); //!!!!! !! !!$!!!!!!! !!!!!! !!! !!'!!!!.

        //Ex: t String'indeki tum harfleri ve tum rakamlari '!'e ceviriniz.
        
        String t3 = t.replaceAll("[^ ]", "+");
        System.out.println("t3 = " + t3); // +++++ ++ ++++++++++ ++++++ +++ ++++++++

        // EX: t String'indeki tum kucuk harfler disindaki tum karakterleri ?'ne ceviriniz.

        String t4 = t.replaceAll("[^a-z]", "?"); 
        System.out.println("t4 = " + t4); // ?olga????ya?indadir?sandik?ama????mis??
        
        String t5 = t.replaceAll("[^aeiouAEIOU]","&" );
        System.out.println("t5 = " + t5); // &o&&a&&&&&a&i&&a&i&&&a&&i&&a&a&&&&&i&&&
    }//main
}//class
