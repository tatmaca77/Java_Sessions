package TolgaTraining.forloops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // Example 1 : Ekrana 10 kez "Java Guzeldir" yaz.

        for (int i = 0; i < 10; i++) {
            System.out.println("Java Guzeldir");
        }

        System.out.println();

        // Example 2 :  10 ile 30  arasindaki sayilari virgül olarak ayni satirda yazdiriniz.

        for (int i = 10; i < 31; i++) {
            if (i == 30) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }

        System.out.println();

        // Example 3 : 100 den baslayarak 50 ye kadar olan sayilari aralarinda virgul olarak ayni satirda yaz.

        for (int i = 100; i > 49; i--) {
            if (i == 50) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }

        System.out.println();

        // Example 4 : Kullanicidan 100 den kucuk bir tamsayi alin. 1 den baslayarak girilen sayiya kadar
        // 3'un kati olan sayilari yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir sayi giriniz.");
        int num = input.nextInt();

        for (int k = 1; k <= num; k++) {

            if (k % 3 == 0) {
                System.out.print(k + ",");
            }
        }

        System.out.println();

        // Example 5 : Kullanicidan 100 den kucuk bir tam sayi alin 1 den baslayarak girilen sayiya kadar 3 un veya
        // 5 in kati olan sayilari yaz.

        System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz...");
        int num2 = input.nextInt();

        for (int c = 0; c <= num2; c++) {

            if (num2 > 100) {
                System.out.print("Invalid Input");
                break;
            }

            for (int i = 1; i <= num2; i++) {

                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }

        }

        System.out.println();


        // Example 6 : Kullanicidan 100'den kucuk bir tamsayi isteyin. 1 'den baslayarak girilen sayiya kadar
        // tum sayilari yazdiriniz. Ancak ;
        // Sayi 3'un kati ise sayi yerine Java
        // Sayi 5'in kati ise sayi yerine Guzeldir
        // Sayi hem 3 e hemde 5 in kati ise sayi yerine Java guzeldir yaz.

        System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            if (number > 100 || number < 0) {
                System.out.print("Invalid Input");
                break;
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("Java");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.print("Guzeldir");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Java Guzeldir");
            } else {
                System.out.print(i + " ");
            }

        }

        System.out.println();


    }

    }























