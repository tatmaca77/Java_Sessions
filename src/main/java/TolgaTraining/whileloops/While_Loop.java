package TolgaTraining.whileloops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While_Loop {

    public static void main(String[] args) {


        // Example 1 : While Loop kullanarak 3 den 13 e kadar tum tek sayilari yaziniz.

        int i = 3;

        while (i < 14) {

            if(i % 2 !=0){

            System.out.print(i + " ");}

            i++;
        }

        System.out.println();

        // Example 2 : For loop ve while loop kullanarak 3 basmakli sayilardan 15,20 ve 90 na tam bolune bilen sayilari yaz.

        for(int t = 100; t <1000 ; t++){

            while(t % 15 == 0 && t % 20 == 0 && t % 90 == 0){

                System.out.println( "15,20 ve 90 na tam bolunenler :" + t );

                t++;
            }

        }


        // Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri dahil aralarindaki tum
        // cift sayilari while loop ile yapin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutden baslangic degerini giriniz...");
        int sayi1 = input.nextInt();
        System.out.println("Lutfen bitis degerini giriniz ...");
        int sayi2 = input.nextInt();

        while(sayi1 <= sayi2){
            while(sayi1 % 2 == 0){

                System.out.println("Tum cift sayilar : " + sayi1);
                sayi1++;
            }
            sayi1++;
        }


        // Example 4 : Kullanicidan baslangic ve bitis harflerini alin ve baslangic harfinden basylip bitis
        // harfinde biten tum harfleri buyuk harf olarak ekrana yaz. Kullanicinin hata yapmadigini farz edin.

        System.out.println("Lutfen baslangic harfini gir.");
        char ch = input.next().toUpperCase().charAt(0);
        System.out.println("Lutfen bitis harfini gir.");
        char ch1 = input.next().toUpperCase().charAt(0);

        while(ch <= ch1){

            System.out.print(" " + ch);

            ch++;
        }


        // Example 5 : Kullanicidan bir rakam alin ve bu rakam icin carpim tablosu yazin.

        System.out.println("Please enter a number");
        int no = input.nextInt();

        int m = 1;

        while(m <= 10){

            System.out.println(m + " * " + no + " = " + (m*no) );

            m++;
        }

        System.out.println();


        // Example 6 : Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane oldugunu yazdirin.

        System.out.println("Please enter a number");
        int nr = input.nextInt();

        int bolen =1;
        int bolensayi = 0;

        while (bolen <= nr){

            while ( nr % bolen == 0 ){
                System.out.println(bolen + " ");
                bolen++;
                bolensayi++;

            }
            bolen++;

        }
        System.out.print(bolensayi);


        // Example 7 : Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yaz.

        System.out.println("Please enter a number");
        int nummer = input.nextInt();

        int sum = 0;

        int n = nummer;

        while ( n > 0){

            sum = sum + n % 10;

            n=n/10;
        }
        System.out.println(" sum " + sum);






















    }

}




