package javaders.day08stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

                          ///************** replaceFirst (); **************///

        /*
        replaceFirst () ; : replace () ile ayni isi yapmakla birlikte ilk gördügü datayi degistirir.
                             icerisine tek karakter bile degistirmek istersen veya cok karakterde olsa
                             char olmaz her zaman String yani " " icine yazmalisiniz.
         */
        
        String str ="Bizimle Java Ogrenmek Cok Kolay";
        
        //EX : str Stringin'deki ilk gördügü i harflerinin yerine e harfi yerlestiriniz.
        
        String str1 = str.replaceFirst("i","e") ; // Sadece ilk gördügü "i" harfini "e" yapar.
        System.out.println("str1 = " + str1); // Bezimle Java Ogrenmek Cok Kolay
        
        String str2 = str.replace("i","e"); // Bütün "i" leri degistirir.
        System.out.println("str2 = " + str2); // Bezemle Java Ogrenmek Cok Kolay


                        ///******************** trim (); ***********************///

        /*
        trim (); : Kelime anlami kiriklari aldirmak demektir. Yani daha düzenli hale gelmesi icindir.
                   Bir String'de bastaki ve sondaki space karakterlerini siler.
                   Ortadaki space karakterlere dokunmaz. String bir data döndürür.
                   Kullanim sebebi kullanicinin yanlislikla bosluga basma ihtimaliyle fazla data girmis
                   olursa onlardan kurtulmak icin yapilan bir islemdir.
         */
        
        String isim ="   Tolgahan Oguzhan Atmaca  ";

        //EX : isim String'deki varsa bas ve sondaki space'leri siliniz.
        System.out.print("************************"); // sadece cümledeki space'leri rahat görmek icin yaptik.
        System.out.print(isim);
        System.out.print("************************");
        String trimIsim =isim.trim( );
        System.out.print("trimIsim =" + trimIsim);
        System.out.print("************************");

        //EX : Asagida fiyatlari verilen ürünlerin toplam fiyatini bulunuz.
        // String tv = "599.99$"  String laptop = "299.99$"

        String tv = "599.99$";
        String laptop = "299.99$";

        String tv2 = tv.replace("$",""); // Bu islemde $ isaretini silmis oluyoruz.  
        System.out.println("tv2 = " + tv2); // "599.99"
        String laptop2 = laptop.replace("$",""); //Cünkü toplama islemi yapicaz. 
        System.out.println("laptop2 = " + laptop2); // "299.99"                 // Bu yüzden $ sembolünden kurtuduk.

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2); // 299.99 + 599.99
        System.out.println("totalPrice = " + totalPrice + "$"); // 899.98$


        /*
        valueOf () bize String olan bir datayi sayisal bir degere yani islem yapabilecegimiz
        dataya cevirir.
         */

        String tamIsim ="  tolgahan atmaca  ";

        //EX: Verilen tam isim String'inin icindeki ilk ismin ilk harfi ile son ismin ilk harfini 
             // Bbüyük harf olarak yanyana yazdiriniz.  ==>TA görmek istiyorum
        // 1.Adim == once bosluklari silerim. Space'lerden kurtulurum.
        // 2.Adim == sonra tüm hepsini büyük harf yaparim.
        // 3.Adim == son olarak parcalarim split() ile.

        //split metodu, böl ve istediğin indexi al.
        //split(" ")[1].charAt(0) //BOSLUKTAN BOL VE 1. INDEKSI AL

        char first = tamIsim.trim().toUpperCase().charAt(0);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        // Split ile parcaladiktan sonra elinde toplam iki index olmus oldu. Böldügün yerden solda kalan parca
        //o.index olur , sag tarafta kalan parca 1.index'in olur. Biz soyisimin ilk harfini alacagimiz icin
        //1.index'i sectik ve o parcanin charAt ile ilk index'ini almis olduk. " " bosluktan parcalamis olduk.
        System.out.println("first + second = " + first + second); // first + second == TA
        System.out.println(first+second); // Eger böyle olursa Ascii degerleri toplar.  == 147 -- char oldugu icin.
    }//main
}//class
