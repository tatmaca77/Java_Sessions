package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yapmak istediginiz islemi yaziniz (topla,cikar,carp,bol):");
        String islem = input.nextLine();

        if (islem.contains("topla"))  {
            System.out.println("ilk sayi giriniz:");
            int sayi = input.nextInt();
            System.out.println("ikinci sayiyi giriniz:");
            int sayi2 = input.nextInt();
            System.out.println("toplama:" + (sayi + sayi2));
        }
        if (islem.contains("cikar")) {
            System.out.println("ilk sayi giriniz:");
            int sayi = input.nextInt();
            System.out.println("ikinci sayiyi giriniz:");
            int sayi2 = input.nextInt();
            System.out.println("toplama:" + (sayi - sayi2));
        }
        if (islem.contains("carp")) {
            System.out.println("ilk sayi giriniz:");
            int sayi = input.nextInt();
            System.out.println("ikinci sayiyi giriniz:");
            int sayi2 = input.nextInt();
            System.out.println("toplama:" + (sayi * sayi2));

        }if (islem.contains("bol")) {
            System.out.println("ilk sayi giriniz:");
            int sayi = input.nextInt();
            System.out.println("ikinci sayiyi giriniz:");
            int sayi2 = input.nextInt();
            System.out.println("toplama:" + (sayi / sayi2));
        }

        }//main
    }//class


