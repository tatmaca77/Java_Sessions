package practices.day_04_practice;

import java.util.Scanner;

public class C01_Switch {

    public static void main(String[] args) {

        /* Example 1 : Kullanicidan 0-4 arasi sinav puanini sisteme girmesini isteyiniz.
        Eger puani 0,0-1,0 arasinda ise KALDI seviyesi veriniz
             puani 1,0-2,0 arasinda ise GECTI seviyesi veriniz
             puani 2,0-2,5 arasinda ise IYI seviyesi veriniz
             puani 2,5-3,5 arasinda ise UST seviyesi veriniz
             puani 3,5-4,0 arasinda ise HARIKA seviyesi veriniz

             switch case kullanarak KALDI seviyesine F harf notu veriniz
                                    GECTI seviyesine D harf notu veriniz
                                    IYI seviyesine C harf notu veriniz
                                    UST seviyesine B harf notu veriniz
                                    HARIKA seviyesine A harf notu veriniz

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your exam point between the 0-4 ");
        double num = input.nextDouble();

        String seviye = "";

        if (num >= 0 && num <1 ){
            seviye = "KALDI";
        } else if (num >= 1 && num <2.0 ) {
           seviye = "GECTI";
        } else if (num >= 2 && num < 2.5 ) {
            seviye = "IYI";
        } else if (num >= 2.5 && num < 3.5) {
           seviye= "UST";
        } else if (num >= 3.5 && num < 4.0) {
            seviye = "HARIKA";
        }

        switch(seviye){
            case "KALDI":
                System.out.println('F');
                break;
            case "GECTI":
                System.out.println('D');
                break;
            case "IYI":
                System.out.println('C');
                break;
            case "UST":
                System.out.println('B');
                break;
            case "HARIKA":
                System.out.println('A');
                break;
            default:
                System.out.println("Gecerli bir sinav puani giriniz...");
        }


    }
}
