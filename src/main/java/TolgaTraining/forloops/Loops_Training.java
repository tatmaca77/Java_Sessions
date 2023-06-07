package TolgaTraining.forloops;

import java.util.Scanner;

public class Loops_Training {

    public static void main(String[] args) {

        /*
            Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
            'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
      */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen icinde 'a' ve 'c' karakterlerini iceren bir string giriniz: ");
        String str = scanner.nextLine();

        int count = 0;
        int indexC = str.indexOf('c');

        for (int i = 0; i < indexC; i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("'c' karakterinden önceki 'a' karakterlerinin sayısı: " + count);


        System.out.println();

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya geldiginde bunlari yazmasin.

        System.out.println("Lutfen bir kelime girniz...");
        String kelime = scanner.next();

        for (int i =0; i < kelime.length(); i++){
            char c = kelime.charAt(i);

            if (Character.isLetter(c)){   // Sadece harfleri yazdirmak icin kontrol eder.
                System.out.println(c);
            }
        }


        System.out.println();

        //Asagidaki sekli yazdiran kodu yaziniz

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6


        int n = 6; // degisebilir herhangi bir baska sayi girilebilir.

        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }












    }
}
