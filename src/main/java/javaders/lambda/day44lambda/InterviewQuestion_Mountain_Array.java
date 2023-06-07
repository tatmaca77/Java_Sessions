package javaders.lambda.day44lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion_Mountain_Array {
    /**
     !!!!!!!!!!!!!! GOOGLE INTERVIEW de cikmis soru  !!!!!!!!!!!

     Bu tarz uzun sorulari 30-40 dk verirler. Tamamini bitiremesende sorunun mantigini iyi kurmalisin. !!!!!!!
     */
    public static void main(String[] args) {

        // Size verilen bir Array'in "Mountain Array" olup olmadigini gosteren kodu yaziniz.

        // [0, 2, 5, 3, 1, -1]

        // Bu soruda Arayy'i List'e ceviricem ve daha cok method sahibi olan List ile calisicam.

        int [] arr ={0, 2, 5, 3, 1, -1};

        // Array'i List'e cevirelim; cünkü List'i kullanmak daha kolaydir.
        List<Integer> myList = new ArrayList<>();
        Arrays.stream(arr).     /** Bu Kod ile stream() e cevirdim. */
        forEach(t->myList.add(t)); /** Elemani alip List'e ekler. */
        System.out.println(myList); // [0, 2, 5, 3, 1, -1]
        
        // List'deki max elemani bulalim.
        int max = myList.stream().reduce(Math::max).get();
        System.out.println("max = " + max); // 5
        
        
        // List'deki max elemanin index'ini bulalim.
        int indexOfMax = myList.indexOf(max);
        System.out.println("indexOfMax = " + indexOfMax); // 2
        
        // Max elemana kadar ki tum elemanlari bir List'in icine koy.
        List<Integer> firstList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t) <= indexOfMax).forEach(t->firstList.add(t));
        System.out.println("firstList = " + firstList); //  [0, 2, 5]
        
        // firstList'in copy'sini olustur.
        List<Integer> firstListCopy = new ArrayList<>();
        firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println("firstListCopy = " + firstListCopy); // [0, 2, 5]

        // Copy olan List'i sort et.
        Collections.sort(firstListCopy); // Alfabetik siralar.

        // firstList ile firstListCopy'nin ayni olup olmadigini kontrol et.
       boolean rule1 = firstList.equals(firstListCopy);
        System.out.println("rule1 = " + rule1); // true
        
        // Max elemandan sonraki tum elemanlari bir List'de ver.
        List<Integer> secondList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t) >= indexOfMax).
                forEach(t -> secondList.add(t));
        System.out.println("secondList = " + secondList);
        
        // seconList copy'sini olustur.
        List<Integer> secondListCopy = new ArrayList<>();
        secondList.stream().forEach(t -> secondListCopy.add(t));
        System.out.println("secondListCopy = " + secondListCopy);

        // SecondListCopy'i tersten sirala.
        Collections.sort(secondListCopy);
        Collections.reverse(secondListCopy);
        System.out.println(secondListCopy);

        // secondList ile secondListCopy ayni mi diye kontrol et.
        boolean rule2 = secondList.equals(secondListCopy);
        System.out.println("rule2 = " + rule2);


        System.out.println("Is the Array Mountain Array ? = " + (rule1&&rule2));
    }
}


















