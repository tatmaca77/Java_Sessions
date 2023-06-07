package replit_questions.for_loops;

import java.util.Scanner;

public class Girilen_Sayiyi_Tersine_Cevirme {

    public static void main(String[] args) {

        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)


Input  :1238

Output :Girilen Numananin Tersi: 8321
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        String number = input.next();
        String ters = "";

        for (int i = number.length()-1  ; i >= 0 ; i--){
            ters = ters + number.substring(i,i+1);
        }
        System.out.println("Girilen Numaranin Tersi : " + ters);







    }
}
