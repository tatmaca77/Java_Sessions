package practices.interview_questions.advance_01_practice;

import java.util.Arrays;

public class C02_Camel_Case {

    /*   INTERVIEW QUESTION QA AUTOMATION Nisan 2023

    String str = "cats AND*Dogs-are Awesome";

    Verilen String Data'nin her bir kelimenin ilk harfini buyuk harf diger harfleri kucuk harf olacak sekilde yazin.

    input = "cats AND*Dogs-are Awesome";

    output = CatsAndDogsAreAwesome

     */

    public static void main(String[] args) {

        // tum harfler haricindeki yerlerden parcalariz.
        String str = "cats AND*Dogs-are Awesome";
        String [] words = str.split("[^a-zA-Z]"); // coklu data olunca hemen Array icine atadim isim kolaylasti.
        System.out.println(Arrays.toString(words));//  [cats, AND, Dogs, are, Awesome]

        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            if (w.length() > 0){
                sb.append(w.substring(0,1).toUpperCase()); // kelimelerin ilk harfini buyuk harf yapar append() ile sb objesine ekler.
                if (w.length() > 1){
                    sb.append(w.substring(1).toLowerCase());
                }
            }
        }
        System.out.println("sb : " + sb); // CatsAndDogsAreAwesome



    }
}
