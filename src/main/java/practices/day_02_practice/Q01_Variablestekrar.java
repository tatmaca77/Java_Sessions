package practices.day_02_practice;



public class Q01_Variablestekrar {

    public static void main(String[] args) {

        //Ayni satirda coklu variable deklere et. Ama cok kullanilan birsey degildir.
        double apfel = 1.19, banane = 1.88, orange = 0.99;
        System.out.println("apfel = " + apfel);
        System.out.println("banane = " + banane);
        System.out.println("orange = " + orange);
        
        
        // Variable degerlerini güncelle.
        apfel = 1.19;
        System.out.println("apfel = " + apfel);
        apfel = 0.99;
        System.out.println("apfel = " + apfel);



        //Bir variable deklere et : t
        double t;
        //Bir variable baslat : y
        double y = 2.19;
        //Başka bir variable başlat : z
        double z = 15.87;
        //t değişkenini y değişkeni ile başlat
        t = y;
        //Variable'i güncelle
        t = 5.59;

        //Değişkenleri yazdır
        System.out.println("t = " + t);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        double result = toplama(2.19,15.87,5.59 );
        System.out.println("result = " + result);





     // Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren bir kod yaziniz.

        int sayi1 = 10;
        System.out.println("sayi1 = " + sayi1);
        int sayi2 = 20;
        System.out.println("sayi2 = " + sayi2);
        
        sayi1 = 20;
        System.out.println("sayi1 = " + sayi1);
        sayi2 = 10;
        System.out.println("sayi2 = " + sayi2);


     //Verilen sayi3 ve say4 variable'larinin degerlerini 3.bir variable olmadan degistiren bor program yapiniz.

     int sayi3 = 5;
        System.out.println("sayi3 = " + sayi3);
     int sayi4 = 3;
        System.out.println("sayi4 = " + sayi4);

     sayi3 = sayi4 + sayi3;
     sayi4 = sayi3 * sayi4;
        System.out.println(sayi3);
        System.out.println(sayi4);




       


        





    }



    
    public static double toplama (double t, double y, double z){return t + y+ z; }







}
