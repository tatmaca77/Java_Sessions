package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

            /*

            Kullanicidan data almak icin Scanner Classi kullanilir.Ve bir input/ scan/ scanner Objesi olusturulur
            .Bu objeyi new objeyi new key worduyle olustururuz

         */
        // 1 )Adim Object Olusturma
        Scanner input = new Scanner(System.in);//Tolgahan

        //2 ) Kullaniciya ne yapacagini soyluyoruz
        System.out.println("Lutfen maasinizi giriniz");

        // 3 ) Adim kullanicidan alinan datalar yapisina ve
        // buyuklugune gore bir Variable'a yerlestirilir
        long maas = input.nextLong();

        // 4) Kullanicini verdigi bilgileri teyit edebilmesi vs. icin yazdiriyoruz
        System.out.println("maas = " + maas);


        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini soran bir program yaziniz

        System.out.println("Lutfen cinsiyetinizi Kadin ise K Erkek ise E olarak giriniz");
        char cinsiyet = input.next().charAt(0);//erkek
        //Burda kullanici istedigimizi veriyi yanlis yazabilir. Bundan dolayi biz 0.veriyi almasi icin
        //.charAt() yazip parantez icine kacinci index i almak istiyorsak onu belirtiriz.
        //Bu sebeple burda tek kelime E veya K yazmasina ragmen erkek yazarsa ilk index olan e yi alir.
        // E 0, R 1 K 2.index tir.


        System.out.println("Lutfen adinizi giriniz");
        // String isim = input.next();
        input.nextLine(); // Dummy atildi. Satir atlamamasi icin kullanilir. Dummy atmak bu demektir.
        String name = input.nextLine();//Tolgahan Metehan  // Adi üstünde "Line" ayni satir.

        System.out.println("Lutfen memleketinizi giriniz");
        String memleket= input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi True/ False seklinde giriniz");
        boolean seviyorMu= input.nextBoolean();

        //Bu yazdirmanin ilk yolu.Print Println konusuna bakabilirsin.
        System.out.println("*************** Tolgahan *****************");
        System.out.println("cinsiyet = "+cinsiyet+"\nname==> "+name+"\nmemleket : "
                +memleket+"\nyas : "+yas+"\nboy : "+boy+"\nseviyorMu : "+seviyorMu);

        //Bu da tek tek yazdirma yöntemi ama Best Practice degildir. Cünkü Motto az kod cok is.
        System.out.println("cinsiyet =" + cinsiyet);
        System.out.println("name : " + name);
        System.out.println("yas : " + yas);
        System.out.println("memleket : " + memleket);
        System.out.println("maas : " + maas);
    }//main
}//class