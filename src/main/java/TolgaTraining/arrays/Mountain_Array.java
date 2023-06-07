package TolgaTraining.arrays;

import java.util.ArrayList;
import java.util.List;

public class Mountain_Array {

    public static void main(String[] args) {

        /*Ver!len herhang! b!r array!n Mounta!n Array olup olmadıgını kontrol etmek !ç!n b!r kod
        yazınız.*/
             /**   Not:
        Mounta!n Array ==> [0, 2, 5, 3, 1]
        B!r array elemanları en büyük deger!ne kadar sürekl! artan, en büyük deger!nden sonra sürekl
        ! azalan deger alıyorsa Maunta!n Array' d!r.
        Mounta!n Array Deg!l ==> [5, 2, 7, 1, 4]
        B!r array elemanları en büyük deger!ne kadar sürekl! azalan, en büyük deger!nden sonra sürekl
        ! artan deger alıyorsa Maunta!n Array deg!ld!r.
         **/

     int [] numbers = {0, 2, 4, 6, 8, 5, 3, 1};
        List<Integer> myList = new ArrayList<>();



    }

    public static boolean isMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }

        int i = 0;
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}
