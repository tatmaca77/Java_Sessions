package introduction.day02datatypesmethodcreation;

import java.util.Scanner;

public class Variable02tekrar {

    public static void main(String[] args) {

        String str = "789";
        System.out.println(str.length());
        System.out.println(str.charAt(2));

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int sayi = input.nextInt();
        System.out.println(sayi);

        Variable02tekrar deneme1 = new Variable02tekrar(); // Variable02tekrar data tipine sahip bir variable olusturduk.
    }//main
}//class
