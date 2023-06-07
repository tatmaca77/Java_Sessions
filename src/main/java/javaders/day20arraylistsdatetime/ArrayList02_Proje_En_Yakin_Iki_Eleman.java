package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02_Proje_En_Yakin_Iki_Eleman {

    public static void main(String[] args) {

        /*
           Example 1 : Bir Integer List'deki birbirine en yakin iki elemani bulunuz.
           [12, 23, 10, 19] ==> 12,10 yazilmali.
         */

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums); // [12, 23, 10, 19]

        /** List bir Collection dir. **/

        //Collections.sort(nums); meethod'u nums listindeki elemanlari "Natural Order" yapar.
        Collections.sort(nums);
        System.out.println(nums);// [10, 12, 19, 23]

        int minDifference = nums.get(1) - nums.get(0);

        for (int i = 1; i < nums.size(); i++){
            minDifference = Math.min(minDifference, nums.get(i) - nums.get(i-1));
        }
        System.out.println(minDifference);  // 2

        for (int i = 1; i < nums.size(); i++){
            if (nums.get(i) - nums.get(i-1) == minDifference){
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }







    }
}
