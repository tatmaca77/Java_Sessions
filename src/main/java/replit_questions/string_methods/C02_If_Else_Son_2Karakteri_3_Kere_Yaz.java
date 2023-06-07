package replit_questions.string_methods;

import java.util.Scanner;

public class C02_If_Else_Son_2Karakteri_3_Kere_Yaz {

    public static void main(String[] args) {
        /*
         Ask user for a string and print a new string made of 3 copies of the last 2 letters

The strings length will be at least 2.

 Sample:

INPUT       : Mustafa
OUTPUT      : fafafa
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String word = input.next();

        String newWord = word.substring(5, 7);
        System.out.println(newWord+newWord+newWord);

    }
}
