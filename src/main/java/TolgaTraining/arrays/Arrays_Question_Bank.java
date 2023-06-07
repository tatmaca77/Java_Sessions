package TolgaTraining.arrays;

import java.util.Arrays;

public class Arrays_Question_Bank {

    public static void main(String[] args) {


        /*  EXAMPLE : 1
        Tamsayılardan olusan b!r arrayde ortadak! elemanı bulunuz.
Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */

        int [] arr = {12, 5, 8};
        Arrays.sort(arr);
        System.out.println(arr[1]);

        int [] arr1 = {12, 5, 8, 13};
        Arrays.sort(arr1);
        System.out.println((arr1[1] + arr1[2]) /2);

        /** SECOND WAY **/
        int [] arr2 = {12, 5, 8, 13};
        Arrays.sort(arr2);
        System.out.println("arr2 = " + arr2);  // [5, 8, 12, 13]

        if (arr2.length % 2 != 0){
            Integer ortadakiElemaninIndexi = arr2.length / 2 ;
            System.out.println(ortadakiElemaninIndexi);
        }
        else {
            Integer ortadakiElemaninIndexi = arr2.length / 2 ;
            Integer ortadakiEleman = (arr2[ortadakiElemaninIndexi] + arr2[ortadakiElemaninIndexi -1]) / 2 ;
            System.out.println(ortadakiEleman);
        }

        /*   EXAMPLE : 2
              Str!ng’ lerden olusan b!r arrayde uzunlugu en küçük olan elemanları bulunuz.
             Örnek: ( Kemal, Jonathan, Mark, Ang!e, Vel! ) ==> Output !s Mark, Vel!
         */

        String [] names = {"Kemal", "Jonathan", "Mark", "Angie","Veli"};
        int minLength = names[0].length();

        for (String w : names){
            minLength = Math.min(minLength,w.length());
        }
        for (String w : names) {
            if (minLength == w.length()){

                System.out.print(w + " ");
            }
        }

        int maxLength = 0;

        for (String w : names) {
            if(w.length() > maxLength){
                maxLength = w.length();
            }
        }
        for (String w : names) {
            if (maxLength == w.length()){
                System.out.print(w + " ");
            }
        }
        System.out.println();

        /* EXAMPLE :  3
        Tamsayılardan olusan b!r arrayde en küçük poz!t!f elemanı ve en büyük negat!f elemanı bulunuz.

        Örnek:(-12, 18, -5, 23, -2) ==> En küçük poz!t!f 18, en büyük negat!f -2
         */

        int [] num = {-12, 18, -5, 23, -2};

        Arrays.sort(num);
        Integer minPositive = num[num.length-1];
        Integer maxPositive = num[0];

        for (Integer w : num) {
            if (w >= 0) {
                minPositive = Math.min(minPositive, w);
            }
            if (w < 0) {
                maxPositive = Math.max(maxPositive, w);
            }
        }
        System.out.println("En kücük pozitif sayi : " + minPositive);
        System.out.println("En büyük negatif sayi : " + maxPositive);


        /*
         EXAMPLE : 4
         Str!ng’ lerden olusan b!r arrayde ögeler 'n' veya 'k' !le b!t!yorsa, o ögeler!n bas harfler!n! alınız.

         Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Al!” } ==> Çıktı JJM
         */

        String [] isimler = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        Arrays.sort(isimler);
        String initials = "";

        for (String w : isimler){
            if (w.endsWith("n") || w.endsWith("k")){
                //System.out.print(w.charAt(0));
                initials = initials + w.substring(0,1);
            }
        }
        System.out.println(initials);

        /* EXAMPLE : 5
        Str!ng’ lerden olusan b!r arrayde kullanılan ögeler!n toplam karakter sayısını bulunuz.
         Örnek: { "Kemal", "Jonathan", "Mark", "Ang!e", "Vel!" } ==> Çıktı 26
         */

        String [] ad = new String[5];
        ad[0] = "Kemal";
        ad[1] = "Jonathan";
        ad[2] = "Mark";
        ad[3] = "Angie";
        ad[4] = "Vel!";

        int toplam = 0 ;

        for (String w : ad) {
            toplam = toplam + w.length();
        }
        System.out.println("Toplam karakter sayisi : " + toplam);

        /*
        EXAMPLE : 6
        Ver!len b!r Str!ng'de 'a' veya 'A' !le baslayan kel!mey! sayısını bulunuz.
         */

        String s = "Apex is an object oriented programming language";
        String [] s2 = s.split(" ");
        int counter = 0;

        for (String w : s2) {
            if(w.startsWith("a") || w.startsWith("A")) {
                counter++;
            }
        }
        System.out.println("'A' veya 'a' ile baslayan kelimelerin sayisi : " + counter);


        /*
        EXAMPLE : 7
        Ver!len b!r Str!ng'dek! sesl! harf sayısını bulunuz.
         */

        String clubs = "Fenerbahce Besiktas Galatasaray";
        String [] clubsArr = clubs.toLowerCase().split("");
        int counter1 = 0;

        for (String w : clubsArr){
            switch(w){
                case "a" :
                case "e" :
                case "i":
                case "o":
                case "u":

               counter1++;

            }
        }
        System.out.println("Sesli harflerin sayisi = " + counter1);

















    }
}
