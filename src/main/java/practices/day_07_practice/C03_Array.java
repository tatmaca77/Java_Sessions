package practices.day_07_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {

    public static void main(String[] args) {

        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scanner = new Scanner(System.in);

        int arr [] = new int [4];

        for (int i = 0; i < 4 ; i++) {  // Kullanicidan 4 tane rakam alacagimiz icin 0 dan 4 e kadar for dongüsüne aldik.
            System.out.println("Lütfen bir rakam girniz...");
            int rakam = scanner.nextInt();

            arr[i] = rakam;
        }
        System.out.println(Arrays.toString(arr));

        double sum = 0;

        for (int w : arr) {
            sum = sum + w;
        }
        System.out.println(sum);

        double ortalama = sum / arr.length;
        System.out.println(ortalama);

        for (int w : arr) {
            if (ortalama < w){
                System.out.println(w + " ");
            }
        }








    }
}
