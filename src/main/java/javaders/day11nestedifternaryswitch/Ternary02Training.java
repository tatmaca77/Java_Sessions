package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02Training {

    public static void main(String[] args) {

        /*
           Kullanicidan bir sayi aliniz,o sayi pozitif ise ekrana pozitif yazdirin. Degilse pozitif degil yazdirin.
         */



    ////****** First Way *******////                         IF-ELSE
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        if (num > 0 ){
            System.out.println("Pozitif");
        }
        else {
            System.out.println("Pozitif degildir");
        }

        ////****** Second Way *******////                  TERNARY OPERATOR
        String result = num > 0 ? "Pozitif" :"pozitif degildir";
        System.out.println("result = " + result);
    }
}
