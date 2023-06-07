package replit_questions.ternary;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {

      /*
      Ask user to type a name,

the length of name should be 3.

Then check if the name has same characters.

If the String has same characters

Print “String has duplicate characters”
Else

Print “String has unique characters”

Please use ternary.


Input :

ala

OutPut:

String has duplicate characters

       */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter with 3 character a name");
        String name = input.next();

        String result = name.charAt(0) == name.charAt(1) && name.charAt(1) == name.charAt(2)
                 ? "String has duplicate characters" : "String has unique characters";

        System.out.println(result);

    }
}
