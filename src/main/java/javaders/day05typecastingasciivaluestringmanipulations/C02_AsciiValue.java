package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {

         /*
          jAVADA char data type'ni matematiksel islemlerde kullanirsaniz
          Ascii Table daki sayisal degerleri alir.

          Numeric Data Type'lari : byte - short - int - long - float - double
          *** char *** karakterin hem sayisal deger barindirir + hemde resim karakteri barindirir.
          boolean == Numeric olmayan bir DATA Type dir.

          Javada char data type'ne int degerde atanabilir. Sembol Harf vs de atanabilir.
          Cunku char data type'nin Ascii'den gelen bir sayisal == Numeric bir degeri
          birde resim karakteri vardir.

         */


        // 'A' karakterinin Ascii degerini hesaplatan kodu yaziniz.

        
        int asciiA = 'A';
        System.out.println("asciiA = " + asciiA); // 65
        
        int asciia = 'a';
        System.out.println("asciia = " + asciia);//97
        // char iki tip icerir hem sayi degeri hemde resim olarak göre character
        
        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);// 33
        // char olarak Ascii degerleri hem tek karakterdir hemde sayisal degeri vardir. Degerini bulmak icin int de yazariz.
        
        int asciiSpace = ' '; // 32
        System.out.println("asciiSpace = " + asciiSpace);
        // iki tane space birakamazsin. Char tek karakter ister. 
        
        int asciiSembol = '*'; //42
        // Yani char data type'ni , int olarak yazariz degerlerini buluruz.
        System.out.println("asciiSembol = " + asciiSembol);

        //Yukarida yapilan islem aslinda char olan datayi int e yerlestirmis oluyoruz.
        //Sadece "int" data type'inde yazmaliyiz. long byte short olmaz.

        String isim = "Zeki";
        char ch = 'Z';
        //int intCh = Z; --- böyle bisey olamaz.
        int sembol = '*';
        char isaret = '?';
        int space = ' ';
        System.out.println(ch+sembol+isaret+space);

        char rakam = '9';
        char sayi = '5'; // ama char sayi = '50'; bu olmaz. tek karakter olmali.
        System.out.println("rakam+sayi : = " + (rakam+sayi)); //110 Ascii degerleri yaziniz.
        System.out.println("rakam+sayi : = " + rakam+sayi); //95 oldu. Concation yapti.

        // 149.999TL  *2   ---- Normalde TL resimdir, rakamlar Numeric degerdir.

        int deger = 20;
        char smbl = '$';
        System.out.println(deger+smbl);// 56 olur. -- $ sembolunun Ascii Tabledaki degeri 36 + 20 = 56 verir.
                                       // Bir harf ile bir sembolü toplayabiliriz.
                                       // Semboller matematik isleme girince otomatik olarak Ascii degeri ile islem olur.

        int deger2 = 0;
        char sembol2 = '+';
        System.out.println("sembol2+deger2 = " + deger2+sembol2); // == 0+
                                                                 // String bir aciklama oldugu icin yan yana yazar.
                                                                 // Bu yüzden Strin hale yani resim haline getirdi.
                                                                 // Concat yapmis olduk. Yani birlestirme yapar.

        System.out.println("+deger2+sembol2 = " + (deger2 + sembol2)); //  == 43
        //Islem yapmasini istiyorsak String deger olunca parantez icinde yazmaliyiz !!!

        String name = "Sezen";
        int number = 998;
        System.out.println (name+number); // Concat yapar. Yan yana yazdirir. Sezen998 olur.

        String name1 = "123";
        int number1 = 45;
        System.out.println(name1+number1); // Concatination yapar. Yan yana yazdirma islemidir.
        System.out.println("name1+number1 : " + name1+number1);// String aciklama oldugu icin yan yana yazar.
        System.out.println("name1+number1 : " + (name1+number1)); // Cünkü String int den büyüktür.

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        System.out.println(str1+str2+sayi1); //JavaGuzel5

        String str3="Java";
        char ch3 ='G';
        int sayi2=5;
        System.out.println(str3+ch3+sayi2); // JavaG5 verir. Resim karakteri olur. Concat yapar.
                                            // String int'e göre daha güclü oldugu icin int resime dönüstürmüs olur.

        System.out.println(str3+(ch3+sayi2)); // Java76 -- Prantezden dolayi Ascii degeri ile toplama yapar digerini resim yapar.

        System.out.println(ch3+sayi2+str3); // 76Java verir. Soldan saga islem yapar Java unutma.
                                            // Java üstteki gibi önce str3 degerini görseydi resim olarak yan yana yazardi.
        
        int asciiG = 'G';
        System.out.println("asciiG = " + asciiG); // Bu sekilde G yi int icine alarak Ascii degerini aliriz.


        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1); // 1

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);// 2

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);// 3

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);// 4

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1+rakam2+rakam3+rakam4); // 1234
                           // String bir aciklama oldugu icin toplama yapmaz resim olarak görür
                           // ve Concatination yapar.

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + (rakam1+rakam2+rakam3+rakam4)); // 202 Ascii Degerler toplami
                         // Bu sekilde olunca toplama islemi yapar.
                         // int olmadigi icin char icinde oldugu icin 1 2 3 4 ün Ascii Degerlerinin toplamini verdi.
                         // 1 == 49   2 == 50  3 == 51  4 == 52
                         //Bu sekilde resim olarakta görmez 1+2+3+4 olarakta görmez. Ascii degerlerini bulur toplar.

        /// ******** Ascii Degerlerinden Faydalanilarak Neler Yapilabilir ? *************** ///

        byte b = 5;
        char ch2 = 'h';

        int asciih = 'h';
        System.out.println("asciih = " + asciih); //104    // Ascii Table da degeri görmek icin int'e cevirmelisin.
        
        int ascii5rakami = '5';
        System.out.println("ascii5rakami = " + ascii5rakami); //53

        System.out.println("b > ch2 = "+ (b>ch2)); // false    5 > 104 == false

        long l = 542168784578L ;
        System.out.println("ch2>l : " + (ch2>l)); //false

        float f = 2.45648F;
        double d = 2.19658;
        System.out.println("f>d = " + (f>d));

        System.out.println("b<f : " + (b<f));

        int integer = 5;
        char charr = '5';
        System.out.println("charr > integer = " + (charr>integer)); //true

        byte sayi3 =5;
        byte sayi4 =6;
        System.out.println("sayi3 < sayi4 = " + (sayi3 < sayi4)); //true

        int sayiInt = 100;
        long sayiLong = 100L;
        System.out.println("sayiLong + sayiInt = " + (sayiInt < sayiLong)); // false
        System.out.println("sayiLong + sayiInt = " + (sayiInt == sayiLong)); // true
        System.out.println("sayiLong + sayiInt = " + (sayiInt >= sayiLong)); // true

        int sayiInt3 = 9 ;
        char sayiChar = '9';
        System.out.println("sayiChar >= sayiInt3 = " + (sayiInt3 >= sayiChar) ); // false

        //String str = "9";
        //System.out.println("sayiChar > str = " + (sayiChar >= str));
        // Bu sekilde ikisinin degeride ayni olursa kiyaslama yapmaz.

        //String str = "Alpay";
        //String str5 = "Melih";
        //System.out.println("str > str5 = " + (str > str5));
        //Bunuda kiyaslama yapmaz. Cünkü kiyaslanamayacak bir Data'dir. Sadece Concatination yapar yani yanyana yazar.





    }//main
    
    
    
    
}//class
