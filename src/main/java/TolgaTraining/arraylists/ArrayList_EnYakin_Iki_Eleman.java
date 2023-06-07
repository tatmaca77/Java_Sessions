package TolgaTraining.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_EnYakin_Iki_Eleman {

    public static void main(String[] args) {
        
        /** INTERVIEW **/
         /*
           Example 1 : Bir Integer List'deki birbirine en yakin iki elemani bulunuz.
           [11, 33, 20, 28] ==> 20,28 yazilmali.
         */
        
        List<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(33);
        nums.add(20);
        nums.add(28);
        System.out.println("nums = " + nums);

        Collections.sort(nums);
        System.out.println("nums = " + nums);

        int minDiff = nums.get(1) - nums.get(0);

        for (int i = 1; i < nums.size() ; i++) {
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));
        }
        System.out.println(minDiff);  // 5

        for (int i = 1; i < nums.size() ; i++) {
            if (nums.get(i) - nums.get(i-1) == minDiff){
                System.out.println(nums.get(i-1) + " and " + nums.get(i));  // 28 and 33
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
