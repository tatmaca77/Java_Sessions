package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04TrainingCümledekiKelimeSayisi {

    public static void main(String[] args) {

        // Example 1 : Size verilen bir cümlede kac kelime oldugunu gösteren code yaziniz.
        // World de yazi yazarken kullanilan kelime sayisi yazar iste o bu.

        String s = "Java is easy. Learn Java earn money";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);


        /********  INTERVIEW **********/
        // Example 2 :  Size verilen bir cümlede kac harf oldugunu gösteren code yaziniz.

        // Once noktalama isaretleri ve sapace den kurtulmam lazim . Sadece harflere ihtiyacim var.

        String letters[] = s.replaceAll("[^a-zA-Z]" ,"").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);


         int arr[] = {5,4,6,7,1,1,2,4,1,1,1,1};
         Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,1));
/** // Bu sekilde iki farkli index'te ayni deger varsa Java ilk gordugu degerin index'ini verir. !!!!!! **/



       String str = "Cok calis, mutevazi ol";
       String strArra[] = str.split("");
        System.out.println(Arrays.toString(strArra));













    }
}
