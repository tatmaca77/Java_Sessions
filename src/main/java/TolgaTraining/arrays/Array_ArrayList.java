package TolgaTraining.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_ArrayList {

    public static void main(String[] args) {

        /*
        Bos bir Array olustur ve 2 ile bölümünden kalan 0 ise

         */

        int[] arr = new int[51];
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                arr[0] = i;
            } else if (i % 2 == 1) {
                arr[49] = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }


        System.out.println();


            /*
              ArrayList le (4,5,2,3,4,5) hepsini sadece bir kere yaz
            */
        List<Integer> myList = List.of(4,5,2,3,4,5);
        List<Integer> yourList = new ArrayList<>();

        for (Integer w : myList){
            if (!yourList.contains(myList.get(w))){
                yourList.add(w);
                Collections.sort(yourList);
            }
        }
        System.out.println(yourList);










    }
}
