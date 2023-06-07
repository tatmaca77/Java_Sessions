package TolgaTraining.ifelse;

import java.util.Scanner;

public class KrediKartiSorusu_StringMethods_IfElse {

    public static void main(String[] args) {

        /*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
                Input :
        John White
        1234234534561478
        Output :
         Name :
        J*** W****
        CCN  : **** **** **** 1478
                * Ilk Harfler Buyuk harf ile baslamalidir.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name");
        String name = input.next();
        System.out.println("Please enter the surname");
        String surname = input.next();
        System.out.println("Enter Card number");
        String no = input.next();

        String firstChar = name.substring(0, 1).toUpperCase();
        String name1 = name.substring(1).replaceAll("[A-Za-z]", "*");
        String name2 = firstChar.concat(name1);

        String sFirstChar = surname.substring(0, 1).toUpperCase();
        String surname1 = surname.substring(1).replaceAll("[A-Za-z]", "*");
        String surname2 = sFirstChar.concat(surname1);

        if (no.length() == 16) {
            if (!no.contains("123456789")) {
                System.out.println("Geçersiz kredi kartı numarası");
            } else {
                String no1 = no.substring(0, 12).replaceAll("[0-9]", "*");
                String ilk = no1.substring(0, 4);
                String iki = no1.substring(4, 8);
                String uc = no1.substring(8, 12);
                String dort = no.substring(12, 16);

                System.out.println(name2 + " " + surname2);
                System.out.println(ilk + " " + iki + " " + uc + " " + dort);
            }
        } else {
            System.out.println("Geçersiz kredi kartı numarası");
        }

        System.out.println();


        // Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.


        System.out.println("Please enter a number");
        int sayi = input.nextInt();

        System.out.println((sayi*sayi*sayi)/2);









    }
}


