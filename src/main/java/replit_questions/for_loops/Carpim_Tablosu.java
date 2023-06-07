package replit_questions.for_loops;

import java.util.Scanner;

public class Carpim_Tablosu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number...");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        System.out.println();

    }
}
