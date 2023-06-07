package TolgaTraining.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Training_02_Question_Bank {

    public static void main(String[] args) {

        /*
        L!stedek! 7 ve 10 dısındak! her ögen!n deger!n! 2'ser artırınız.
        Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
         */

        List<Integer> num = new ArrayList<>();

        num.add(12);
        num.add(31);
        num.add(7);
        num.add(13);
        num.add(10);
        System.out.println("num = " + num);

        for (Integer w : num) {

            if (w == 7 || w == 10) {
                continue;
            }
            num.set(num.indexOf(w), w+2);
        }
        System.out.println(num); // [14, 33, 7, 15, 10]


        // Str!ng b!r l!stede ver!len tüm f!yatların toplamını bulunuz.
        //Örnek: L!st<Str!ng> myL!st = new L!st<Str!ng>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        System.out.println("myList = " + myList); // [$12.99, $23.60, $54.45]

        double toplam = 0;

        for (String w : myList){
            Double price = Double.valueOf(w.replace("$", ""));
            toplam = toplam + price;
        }
        System.out.println("toplam = " + "$" + toplam); // $91.04


        // B!r Str!ng l!stes!nde ver!len en düsük ve en büyük f!yatın toplamını bulunuz.
        //Örnek: L!st<Str!ng> myL!st = new L!st<Str!ng>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> list = new ArrayList<>();
        list.add("$12.99");
        list.add("$8.25");
        list.add("$54.45");
        list.add("$23.60");
        System.out.println("list = " + list); // [$12.99, $8.25, $54.45, $23.60]

        List<Double> liste = new ArrayList<>();

        for (String w : list){
            Double fiyat = Double.valueOf(w.replace("$", ""));
            liste.add(fiyat);
        }
        Collections.sort(liste);
        System.out.println("liste = " + liste); // [8.25, 12.99, 23.6, 54.45]
        
        Double sum = liste.get(0) + liste.get(liste.size()-1);
        System.out.println("En büyük + en kücük sayi toplami = " + "$" + sum); // $62.7


        // Döngüler! kullanarak tamsayılardan olusan b!r l!sten!n tüm ögeler!n!n benzers!z (tekrarsız)
        //olup olmadıgını kontrol ed!n!z.

        List<Integer> tolga = new ArrayList<>();
        tolga.add(10);
        tolga.add(31);
        tolga.add(15);
        tolga.add(7);
        tolga.add(15);
        tolga.add(23);
        System.out.println("tolga = " + tolga);

        for (Integer w : tolga) {
            if (tolga.indexOf(w) == tolga.lastIndexOf(w)) {
                System.out.print(w + " ");   // 10 31 7 23
            }
        }
        System.out.println();

        /** Second WAY **/
        Integer counter = 0;
        for(Integer k : tolga){
            for(Integer t : tolga){
                if(k==t){
                    counter++;
                }
            }
        }
        if(counter==tolga.size()){
            System.out.println("Tekrarlanan oge yoktur");
        }else{
            System.out.println("En az 1 oge tekrarlanmistir");
        }

    }
}