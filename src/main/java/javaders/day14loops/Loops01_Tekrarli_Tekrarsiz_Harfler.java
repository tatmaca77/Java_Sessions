package javaders.day14loops;

import java.util.Scanner;

public class Loops01_Tekrarli_Tekrarsiz_Harfler {


    public static void main(String[] args) {


        // Kullanicidan alinan bir tam sayinin tekrarsiz rakamlarinin toplamini bulunuz.  ****** INTERVIEW QUESTION !!!!!!
        // 1838 ==> 1  + 3 = 4

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");   // tekrarli tekrarsiz olayini cozmek icin indexof lastindex of lazim.
        String s = input.next();                         // indexof ve last indexof sadece Stringlerde kullanilir. indexof kullanmak icin
                                                        // verilen degeri String olarak alirim onun icine koyarim. !!!!
                                                         // Daha sonra bakabilirim index lerin degerine.
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {             // 0. indexten baslayip sonuna kadar artarak gidecek.
            String d = s.substring(i, i+1);
            if (s.indexOf(d)== s.lastIndexOf(d)) {
                sum = sum + Integer.valueOf(d);        // Ilk görünümün index'i son gorunumun index'ine estise tekrarlidir.
                                                          // Her karakterin ilk ve ikinci görünümünü karsilastirir.
            }                                                    // d String sum int oldugu icin d'yi int'e cevirdik. !!!!!!!
        }
        System.out.println(sum); //4                              //String olan her karakteri int'e cevirmis oluruz.




         //Bir String'deki tekrarli karakterleri yaz.
        // Alabala ==> la                             // Once iskeleti olustur sonra ince isleri yapmalisin !!!!!!!!

        String t = "Alabala";
        String result = "";                       //Buyuk kucuk harflere duyarlidir. !!!!!!!

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);
            if ((t.indexOf(ch) != t.lastIndexOf(ch)) && !result.contains("" + ch)){    // Bu Stringdeki karakterin ilk gorunumunun index'i
                result = result + ch ;                  //son gorunume esit degilse tekrarlidir.
            }

        }
        System.out.println(result);


        /*
        Konuyu ögrenme sekli:
        What?
        Why?
        Simple Implementation
        Mid level Implementation
        Advanced level Implementation
        Mini Project
       */










    }
}
