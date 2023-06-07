package TolgaTraining.forloops;

import java.util.Scanner;

public class Loops2StringTerstenYaz {

    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
        // Example 7 : Kullanicidan bir String alin ve Stringi tersten yazdirin.

        System.out.println("Please enter a word");
        String str = input.next().toLowerCase();

        for(int i = str.length()-1; i >= 0 ; i--){
            char ch = str.charAt(i);

            System.out.print(ch);
        }

        System.out.println();

        // Example 8 : Kullanicidan bir String alin ve String'i tersine ceviren bir method yazin.

        System.out.println("Please enter a word");
        String str1 = input.next().toLowerCase();
        String ters = " ";

        for(int i = str1.length()-1; i >=0; i--){
            ters = ters + str1.substring(i, i+1);    // charAt(i) de olurdu.
        }
        System.out.println(ters);

        System.out.println();

        // Example 9 : Kullanicidan bir String alin ve String'in palindrome olup olmadigini kontrol eden kodu yaz.






        // Example 10 :Kullanicidan iki sayi iste .Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu  yazdirin.

        System.out.println("Please enter a number");
        int sayi1 = input.nextInt();
        System.out.println("Please enter a number");
        int sayi2 = input.nextInt();

        int sonuc = 0;

        for ( int i = sayi1; i <= sayi1; i--){
            sonuc = sonuc + i;
            System.out.println("Toplam = " + i);

        }

        int sonuc2 = 0;

        for(int i = sayi2; i <= sayi2; i--){
            sonuc2 = sonuc2 + i;
            System.out.println("i = " + i);

        }
        System.out.println(sayi1+sayi2+sonuc2+sonuc);

        System.out.println();


        int toplam=0;
        System.out.println("Lütfen 1. sayiyi giriniz: ");
        int i=1;
        while (i<6) {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi=input.nextInt();
            toplam+=sayi;
            i++;
        }
        System.out.println("Girdiginiz sayilarin toplami = "+toplam);


        System.out.println();


        /** Yukaridaki sorunun for loop ile cozumu**/
        Scanner s=new Scanner(System.in);
        int toplam1=0;
        System.out.println("Lütfen 5 sayi giriniz: ");

        for (int z = 1; z < 6; z++) {
            System.out.println(z+". sayiyi giriniz: ");
            int sayi4=s.nextInt();
            toplam1+=sayi4;
        }
        System.out.println("Girdiginiz sayilarin toplami = "+toplam1);


















    }





}
