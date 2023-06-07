package TolgaTraining.arrays;

import java.util.Arrays;

public class Arrays_Training {

    public static void main(String[] args) {

        //Verilen bir integer Array'deki en kücük pozitif elemani ve en büyük negatif elemani bulunuz.
        // örn : ( -12, 18 , -5, 23, -2 ) ==> En kücük pozitif 18, en büyük negatif -2

        /** 1.Yol **/

        int[] arr = {-12, 18, -5, 23, -2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [-12, -5, -2, 18, 23]

        int minPositive = arr[arr.length-1];
        int maxNegative = arr[0];

        for(int w : arr){
            /*if( w >= 0)
                minPositive = Math.min(minPositive, w);
            else
                maxNegative = Math.max(maxNegative, w);*/

            if (w >= 0 && w < minPositive)
                minPositive =w;
            else if (w < 0 && w > maxNegative)
                maxNegative = w;
        }
        System.out.println("En kücük pozitiv sayi : " + minPositive);
        System.out.println("En büyük negativ sayi : " + maxNegative);

        System.out.println();

        /**2. Yol **/

        int[] arr1 = {-12, 18 , -5, 23, -2, 0};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1)); // [-12, -5, -2, 0, 18, 23]

        int minPositif = 0;
        int maxNegatif = 0;

        for (int i = 0; i < arr1.length; i++){

            if(arr1[i] < 0 && arr1[i+2] > 0){
                maxNegatif = arr1[i];
                minPositif = arr1[i+2];
            }
        }
        System.out.println("En kücük pozitiv sayi : " + minPositif);
        System.out.println("En büyük negativ sayi : " + maxNegatif);

    }


}


