package introduction.day02datatypesmethodcreation;

public class Variables01 {

    /*
    Javada temelde iki tip data vardir.
    1)primitive data types :
    char, boolean, byte, short, int, long, float, double   -- 8 tane dir.
    2)non-primitive data types :
    String   -- sayisi belli degildir.
    Her olusturdugumuz bir class bir non-primitive data type oldugu icin sayisizdir.


     */

    //Bu Not bölümleri cok önemlidir Interview da cikar!!!
    /*
    Note 1 : primitive data type'lari Java olusturmustur  ve biz olusturamayiz.
    Note 2 : primitive data type'larin isimlerinde sadece kücük harf kullanilir.
    Note 3 : primitive data types data type'larina göre memory de farkli farkli yer kaplarlar.
    Note 4 : primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.
     */

    /*
    non-primitive data types :
        1)Strings , Arrays , Objects .....

        Note 1 : Uretilen her bir class ayni zamdan aslinda bir "non-primitive" data type'dir.
        Note 2 : Bu sebeple "non-primitive" data types sinirsizdir.
        Note 3 : "non-primitive" data type'larin isimleri buyuk harfle baslar.
        Note 4 : "non-primitive" data type'larin tamami icin Java Memory de ayni miktarda yer ayirir.

   */

    public static void main(String[] args) {
        //Ornek 1 : Sehir ismmi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.

        String cityName = "Ankara" ;
        System.out.println(cityName);



         /*
         Interview Sorusu: "primitive" ve "non-primitive" data type'lari arasindaki fark nedir ?
        1)"primitive" ler sadece bizim atadigimiz degeri icerir;
          "non-primitive"ler bizim atadigimiz degeri ve methodlari icerir.
        2) "primitive"ler kucuk harfle baslar , "non-primitive'ler buyuk harf ile baslar.
        3) "primitive"leri java üretmistir 8 taned´dir.
           "non-primitive"leri Java ve Developer'lar üretebilir ve sinirsiz sayidadir.
        4) "primitive"ler memory de data type'ina göre yer kaplar
           "non-primitive"ler icin java memory'de hep ayni büyüklükte yer ayirir.
          */


    }

}


