package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String a = "Benim Tek Rakibim Dunku Ben.";
        // Burada bütün harflerin büyük olmasini istersen String icinde hazir methodu secerim. (a.) yaparim.


        ///////********** toUpperCase() **********///
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper); // aUpper = TEK RAKIBIM DUNKU BEN .


        ///////********** toLowerCase() **********///
        String bLower = a.toLowerCase();
        System.out.println("bLower = " + bLower); // bLower = ben seni seviyorum
                                                  // Bütün harfleri kucuk harf ile yazar.


        ///////********** charAt() **********///
        System.out.println("a.charAt(0) = " + a.charAt(0)); // T görürüm.
                                                            //ilk karakteri almak istersem ( index ) degeri yazmaliyim.
                                                            // index'ler 0 dan baslar.

        System.out.println("a.charAt(5) = " + a.charAt(6));  // T görürüm. 6.indexteki karakteri yazdirir.

        System.out.println("ilk karakter : " + (a.charAt(0)));

      //a String'indeki bastan ikinci ve sondan ikinci karakterleri aliniz ve yan yana yazdiriniz.
       char firstChar = a.charAt(1);//e
       char lastSecondChar = a.charAt(20);//n
       System.out.println("firstChar + lastSecondChar  = " + a.charAt(20)+ a.charAt(1)); // (ne) olur.
        System.out.println( firstChar+" "+lastSecondChar); // bosluk birakir. e n olur.

        // Bu sekilde yaparsam Ascii Table daki degerlerini toplama islemi yapar.
        System.out.println("firstChar + lastSecondChar  = " + (a.charAt(20)+ a.charAt(1))); // 211 verir.



       //********** lenght()*********//

        // a String'inde bulunan karakter sayisini bulunuz.
        System.out.println("a.length() = " + a.length());


        //******** substring() ***********//

        //a Stringinde'deki ilk 4 karakteri aliniz.

        String sub1 = a.substring(0,4);
        System.out.println("sub1 = " + sub1); // // 0 dahil 4 haric -- [0,4) 0.index 1.index 2.index 3.index
        //4.indexden itibaren alinmaz.                              ilk indexi dahil eder diger verilen index harictir.


        System.out.println("a.substring(4) = " + a.substring(0,4)); //araligi kendin belirlersin

        System.out.println("a.substring(8,12) = " + a.substring(8, 12)); // nerden baslayip nerde bitmesini istersen.
        
        System.out.println("a.substring(6) = " + a.substring(6)); // nerden baslamasi gerektigini belirtirsin.
                                                                            // gerisini sonuna kadar yazar.

        // a String'indeki 4.index dahil 7.index haric yazdiriniz.
        System.out.println("a.substring(4,7) = " + a.substring(4, 7)); // cok kullanilan bir method'tur.

        //a String'indeki Rakib kelimesini aliniz.
        System.out.println("a.substring(10,15) = " + a.substring(10, 15)); // Rakib kelimesini direkt alir.

        System.out.println("a.substring(10) = " + a.substring(10)); // 10.indexten dahil baslar sonuna kadar gider.


        //////******** contains() **********//

        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz.

        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi); // true olarak dönüs aliriz. --- Raki'bim' bu kelimede vardir.

        boolean varMiKi = a.contains("@");
        System.out.println("varMiKi = " + varMiKi); // false


        ////********** startsWith() ********//

        //a String'inin a harfi ile baslayip baslamadigini kontrol ediniz.

        System.out.println(a.startsWith("T")); // false gelir. Cünkü cümle T ile baslamiyor.
        System.out.println(a.startsWith("B")); // true döndürür. Cünkü cümle B ile basliyor.

        System.out.println(a.startsWith("Tek", 3)); // false
        // Ilk 3 karakteri at , geriye kalan karakterler Tek ile basliyor mu ? diyor.

        System.out.println(a.startsWith("Tek", 6)); //true
        // Ilk 6 karakteri at ;sonrasi "Tek" kelimesi ile basliyor mu?
        // prefix : baslangic --- offset : at gitsin demektir.

        System.out.println(a.startsWith("tek", 6)); // false
        // Cünkü büyük ve kücük karaktere duyarlidir.


        // Universite numaralari == yil + BolumKdou + GirisSirasi olarak düzenlenen bir okulda
        // Ogrenci Tolga'nin Hukuk Fakultesinde okuyup okumadigini gösteren kodu yaziniz.

        /*
        sinif ögretmenligi 22
        Hukuk 33
        Bilgisayar Müh 44
        Eczacilik 55
        Maliye 66
        Kimya Müh 77
         */

        String str = "20105501";

        System.out.println(str.startsWith("33", 4)); // false
        // Ilk 4 karakteri at ve 33 ile baslayip baslamadigina baktik.

        System.out.println(str.startsWith("55", 4)); // true


    }//main
}//class
