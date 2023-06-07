package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03TrainingArraydeSpecificEleman {

    public static void main(String[] args) {

        /** Specific bir elemanin Array'De olup olmadigini anlamak icin gereken kodu yaziniz.**/


        /****** First Way ******/
        String names[] = {"T", "R", "M", "N", "H"};
        String el = "T";

        int counter = 0;

        for(String w : names){

            if(w.equals(el)){
                counter++;
                break;
            }
        }
        if(counter > 0){
            System.out.println("Bu harf Array'in icindedir.");
        }else{
            System.out.println("Bu harf Array'in icinde degildir!");
        }

        /****** Second Way ******/

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,"Z");
        System.out.println(result);

        if (result < 0){
            System.out.println("Bu harf Array'in icinde degildir.");
        }else{
            System.out.println("Bu Harf Array'in icindedir.");
        }






    }
}
