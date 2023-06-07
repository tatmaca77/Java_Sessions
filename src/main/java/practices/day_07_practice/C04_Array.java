package practices.day_07_practice;

import java.util.Arrays;

public class C04_Array {

    public static void main(String[] args) {

        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6

        int arr [] = {1,2,-3,4,-5,-6};


        int arr1 [] = new int [arr.length];

        int idx = 0;

        for (int w : arr) { // arr'deki her bir elemani for each ile aldik.
            arr1 [idx] = w * -1; // her elemanin negatif degerini sirasiyla arr1'e assign ettik.
            idx++; // index'i her seferinde 1 artiralim.
        }
        System.out.println(Arrays.toString(arr1));







    }
}
