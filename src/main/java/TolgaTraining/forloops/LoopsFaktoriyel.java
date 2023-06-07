package TolgaTraining.forloops;

import java.util.Scanner;

public class LoopsFaktoriyel {

    public static void main(String[] args) {

        /** INTERVIEW **/

        // Example 10 : Kullanicidan 10'dan kucuk bir tamsayi aliniz ve sayinin faktoriyelini bulunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 10 dan kucuk bir tamsayi giriniz...");
        int number = scanner.nextInt();
        int faktoriyel = 1;

        for(int i = 1; i <= number;i++){

            faktoriyel = faktoriyel * i;
        }
        System.out.println(number + "!" + faktoriyel);
        System.out.println("Faktoriyel : " + faktoriyel);

    }
}
