package TolgaTraining.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Training_QuestionBank {

    public static void main(String[] args) {

       // Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.


        List<Integer> sayilar = List.of(12,31,7,13,10);

        int m = 1;

        for (Integer w  : sayilar){
            if (w % 2 != 0){
                continue;
            }
            m = m*w;
        }
        System.out.println("tüm çift sayıların çarpımı : " + m);

        // 2: WAY
        int n = 1;

        for (Integer w : sayilar){
            if (w % 2 == 0){
                n = n*w;
            }
        }
        System.out.println(n);

        // Bir listedek ögelerin azalan sırada olup olmadıgını kontrol ed!n!z.
        //Örnek: (Sarı, Mav!, Kırmızı, Yes!l) ==> Çıktı: Azalan sırada deg!l
        //(Sarı, Kırmızı, Yes!l, Mav!) ==> Çıktı: Azalan sıradadır
        
        List<String> e = new ArrayList<>();
        e.add("Sari");
        e.add("Mavi");
        e.add("Kirmizi");
        e.add("Yesil");
        System.out.println("e = " + e);

        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int size = e.size();
        int flag = 0;

        for (int i = 0 ; i < size; i++){
            if (f.get(i).equals(e.get(size-1-i))){
                flag++;
            }
        }
        if (flag == size){
            System.out.println("Azalan siradadir");
        }
        else{
            System.out.println("Azalan sirada degildir");
        }


        // Listede eleman olarak 15 varsa, tüm 15'ler! 51 olarak deg!st!r!n!z.
        //Örnek: (12, 11, 15, 34, 15, 43) ==> Çıktı (12, 11, 51, 34, 43)

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(11);
        numbers.add(15);
        numbers.add(34);
        numbers.add(15);
        numbers.add(43);
        System.out.println("numbers = " + numbers); // [12, 11, 15, 34, 15, 43]

        if (numbers.contains(15)){
            for (Integer w : numbers){
                if (w == 15){
                    int idx = numbers.indexOf(15);
                    numbers.set(idx,51);
                }
            }
            System.out.println(numbers); // [12, 11, 51, 34, 51, 43]
        }else {
            System.out.println("Listede 15 elemani yoktur");
        }


        // L!stede 15 veya 13 varsa, bu elemanları kaldırınız.
        //Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        List<Integer> say = new ArrayList<>();
        say.add(10);
        say.add(31);
        say.add(15);
        say.add(13);
        say.add(54);
        System.out.println("say = " + say); // [10, 31, 15, 13, 54]

        if (say.contains(15) || say.contains(13)){

            for (int i = 0; i < say.size(); i++){
                if (say.get(i) == 15){
                    int index15 = say.indexOf(15);
                    say.remove(index15);
                    i--;
                }
                else if (say.get(i) == 13){
                    int index13 = say.indexOf(13);
                    say.remove(index13);
                    i--;
                }
            }
            System.out.println(say); // [10, 31, 54]
        }else {
            System.out.println("List icinde bu elemanlar yoktur");

        }

        // B!r tamsayı l!stes!nde en yakın 2 tamsayıyı bulunuz.
        //Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        ArrayList<Integer> at = new ArrayList<>();
        at.add(12);
        at.add(31);
        at.add(15);
        at.add(13);
        at.add(54);
        System.out.println("at = " + at);

        Collections.sort(at);
        System.out.println("at = " + at);

        int minDiff = at.get(1) - at.get(0);

        for (int i = 1; i < at.size(); i++){
            minDiff = Math.min(minDiff, at.get(i) - at.get(i-1));
        }
        System.out.println(minDiff); // 1

        for (int i = 1; i < at.size(); i++){
            if (at.get(i) - at.get(i-1) == minDiff){
                System.out.println(at.get(i-1) + " and " + at.get(i));
            }
        }

    }
}
