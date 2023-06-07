package TolgaTraining.ifelse;

import java.util.Scanner;

public class Sesli_Sessiz_Harf {
    public static void main(String[] args) {

        /*       Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
                * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
                * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
                * harfi büyük yada küçüklüğüne duyarlıdır.)
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter...");
        String letter = input.next();

        boolean r = letter.replaceAll("[^a-zA-Z]", "").length() == 1;
        boolean e = letter.replaceAll("[^aeuioAEUIO]", "").length() == 1;

        if (r) {
            if (e) {
                System.out.println(letter + " Sesli harftir");

            } else {
                System.out.println(letter + " Sessiz harftir");
            }

        } else {
            System.out.println("Gecersiz karakter veya birden fazla karekter girdiniz");
        }

    }
}
