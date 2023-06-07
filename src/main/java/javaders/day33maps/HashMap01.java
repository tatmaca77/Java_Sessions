package javaders.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {

    public static void main(String[] args) {

        String s = "Hello Henry!";
        System.out.println(getTheNumOfOccurenceOfLetters(s)); // {r=1, e=2, H=2, y=1, l=2, n=1, o=1}
                                                              // {H=2, e=2, l=2, n=1, o=1, r=1, y=1}


    }

    // Example 1 : Verilen String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
    //              " Hello Henry!"  ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

    public static TreeMap<String,Integer> getTheNumOfOccurenceOfLetters(String s){

        /** String deki harf disindaki bütün karakterleri silmis olduk, cünkü soru sadece bize harfleri soruyor. */
        s = s.replaceAll("[^A-Za-z]", "");

        /**Gorunum sayilarini depolamak icin bir Map olusturmaliyiz. */
        TreeMap<String,Integer> numOfOccurence = new TreeMap<>(); // Alfabetik siraya koymak icin TreeMap yapmaliyiz.

        /** Harfleri almaliyiz. */
        String letters [] = s.split("");

        /**For each Loop olustur elimizde Array var */
        for (String w : letters){
            Integer numOfOcc = numOfOccurence.get(w);
            if(numOfOcc == null){
                numOfOccurence.put(w,1);
            }else{
                numOfOccurence.replace(w,numOfOcc+1);
            }
        }
        return numOfOccurence;
    }
}
