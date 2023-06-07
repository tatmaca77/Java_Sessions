package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        /** Specific bir elemanin Array'De olup olmadigini anlamak icin gereken kodu yaziniz.**/

        String names [] = {"K", "C", "R", "A", "S"};    // Eger 10 bin tane array elemani olsa tek tek cok zor olur.
        String el = "A";

        // 1. WAY :
        int counter =0;

        for(String w : names){

            if(w.equals(el)){
                counter++;
                break;    // Break ile code daha hizli calisir. A dan sonra diger karakterlere bakmaya gerek yoktur cunkü.
            }
        }
        if(counter>0){
            System.out.println("Array has " + el);     // Bu sekilde dinamik mesaj yapmis oluruz. !!!!
        }else{
            System.out.println("Array does not have the element");
        }

        /** INTERVIEW de gelir bu binarySearch() sorusu !!!!! */

        // 2. WAY :  // Tek tek hepsine bakacagina genel bakis at !!  Eleman arama logic 'i.
                     // sort ile siraya koymak cok iyidir. Kontrol edecegi eleman sayisini azaltir ve hizi artar.
                     // Yani aslinda bu siralama ismi binarySearch() method'dur. Ve cok hizli arama yapar.
        Arrays.sort(names);
        int result = Arrays.binarySearch(names, "E");  // Bize A nin index'ini verir o yüzden int e koyduk.
        System.out.println(result);

        if(result < 0){
            System.out.println("Array does not have the element");
        }else{
            System.out.println("Array has " + el);
        }

        /** 1) binarySearch() method'unu, sort() kullanmadan kullanmayiniz.
        // 2) Cünkü binarySearch() method'u siralanmis elemanlarda calisir.
        // 3) binarySearch() method'u var olan elemanlar icin size o elemanin index'ini verir.
        // 4) binarySearch() method'undan aldiginiz index 0 veya 0'dan buyukse o eleman Array'de vardir demektir.
        // 5) binarySearch() method'u olmayan elemanlar icin negativ tamsayi degeri verir.
        // 6) "-" isaretinin anlami o eleman yok demektir.
        // 7) Yanindaki sayi ise o eleman olsaydi kacinci eleman olurdu demektir. Index sirasi degildir. Yer sirasi yani.
        // 8) Ama normalde index degerini verir.**/







    }
}
