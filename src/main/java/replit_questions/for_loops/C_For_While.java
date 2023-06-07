package replit_questions.for_loops;

import java.util.Scanner;

public class C_For_While {

    public static void main(String[] args) {


        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;

		String name =“John came late"

		Expected Output:


    Number of a = 2
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name...");
        String name = input.nextLine();
        System.out.println("Please enter a character...");
        char ch1 = input.next().charAt(0);

        int count = 0;

        for (int i = 0; i < name.length(); i++){

            if (name.charAt(i) == ch1){
                count++;
            }
        }
        System.out.println("Number of " + ch1 + " = " + count);
    }
}
