package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {
        
        // Example 1 : Size verilen bir cümlede kac kelime oldugunu gösteren code yaziniz.
        // World de yazi yazarken kullanilan kelime sayisi yazar iste o bu.
        
        String s = "Java is easy. Learn Java earn money"; // Kelimeleri saymak icin bosluklardan kesmek lazim. yani split()
        
        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);


    ///********  INTERVIEW **********////
        // Example 2 :  Size verilen bir cümlede kac harf oldugunu gösteren code yaziniz.

        // Once noktalama isaretleri ve sapace den kurtulmam lazim . Sadece harflere ihtiyacim var.

        String letters[] = s.replaceAll("[^a-zA-Z]", "").split("");
        // Aslinda tek karakteri aramamiza ragmen char'a koyamayiz. Stringi kes string yine stringtir.
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);

        int arr5[] = {12,23,12,2,3};
        Arrays.sort(arr5);
        System.out.println(Arrays.binarySearch(arr5,12)); // 2

        char ch[] = new char[4];
        ch[0] = 'A';
        ch[2] = 'E';
        ch[3] = 'M';
        System.out.println(Arrays.toString(ch));


    }
}
