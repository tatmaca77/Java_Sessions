package practices.day_02_practice;

public class Q01_Variables {

    public static void main(String[] args) {

        //Bir variable baslat.
        int age = 15;
        int number = 43;
        String isim = "Ali";

        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("isim = " + isim);


        //Variable degerini kopyala.
        int myAge = age;
        System.out.println("myAge = " + myAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Ayni satirda coklu variable deklere et. Ama cok kullanilan birsey degildir.
        int year = 2022, month = 3, day = 15;
        System.out.println("month = " + month);
        System.out.println("year = " + year);
        System.out.println("day = " + day);

        //Bir variable degerini güncelle.
        year = 2023;
        System.out.println("year = " + year);

        year = 2030;
        System.out.println("year = " + year);

        //Note : Eger bir integer yani int veya bir deger olusturulduysa aynisini olusturamazsin.
        //Yani bir "int"olusturduysan bir daha int olusturamazsin. Yalnizca bir kez deklere edebilirsin.!!!
        //Süslü parantez arasi kodlari yazdigimiz yerin ismi Body "Scope" tur.

        isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        //Pause öncesi yapilmasi gereken örnekler.

        //Bir variable deklere et : x
        double x;

        //Bir variable deklere et : x
        double y = 55.6;

        
        //Başka bir variable başlat : z
        double z = 10;

        //x değişkenini y değişkeni ile başlat
        x = y;

        //Variable'i güncelle
        x = 15.3;

        
        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);



    }

}
