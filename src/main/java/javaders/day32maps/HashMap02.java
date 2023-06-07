package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        /*
        Example 1: Type code to print the number of occurrences of words in a sentence
                   Verilen cümledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        " I like to move it, move it do you like it"  I=1, like=2, to=1 , move=2, it=3, do=1, you=1 "
         " I like you, like like! " I=1, like=3, you=1
         */

        String s = "I like you you, like like!";
        System.out.println(s);

        /** 1.Adim */
        // like ile like! i ayni yapabilmek icin tum noktalama isaretlerini sileriz.
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s); // I like you like like

        /** 2.Adim */
        // Ben kelimelerle calismaliyim, bu yüzden split(" ") kullanacagim

        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words)); // [I, like, you, like, like]

        /** 3.Adim */
        // Sonuc ekranda key-value yapisiyla istedigi icin Map olusturmam gerekiyor.
        // Kelimeleri tek tek al Map icine bak varsa var olan degeri artir yoksa direkt 1 ile Map icine yerlestir derim.
        HashMap<String, Integer> occ = new HashMap<>();

        // "words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        // "words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
        // "words" arrayindeki kelimeler Map'e varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for (String w : words) {

            Integer numOfOccurance = occ.get(w); // Map'deki görünüm sayisini almis oluruz. Kelimenin var olup olmadigina bak.

            if (numOfOccurance == null){

                occ.put(w,1);   // Eger Map'de yoksa value'su 1 olacak sekilde Map'e yerlestirdik.

            }else{

                occ.replace(w,numOfOccurance+1); // Eger Map'de varsa value'su 1 artirilarak yazdirdik
            }

        }
        System.out.println(occ); // {like=3, I=1, you=1}









    }
}
