package TolgaTraining.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array5BasSayininToplami {

    public static void main(String[] args) {

        // 5 basamakli bir sayinin ilk 2 ve son iki degerini toplayin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  5 basamakli bir sayi girin");
        String sayi1 = input.next();
        String array[] = sayi1.split("");
        int toplam = 0;

        for(String w : array){

            if(w !=array[2]){
                int sayiDegeri = Integer.valueOf(w);
                toplam +=sayiDegeri;
            }

        }
        System.out.println(toplam);

        System.out.println();


        // // Example 1 : grades Array'indeki en kucuk ve en buyuk grade'in toplamini yaziniz.

        int sayi [] = {5,12,45,90,10};
        Arrays.sort(sayi);
        System.out.println(sayi[0] + sayi[sayi.length -1]);








    }
}
