package javaders.day09stringmanipulationsifstatement;

import java.security.spec.RSAOtherPrimeInfo;

public class C02_IfStatementTraining {


    public static void main(String[] args) {

        // INTERWIEW QUESTIONS USA QA
        // String str ="abbccdc" tekrarsiz karakterleri ekrana yazdiriniz

        String str = "abbccdc";

        char ch = str.charAt(0);
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.print(ch);
        }
        char ch1 = str.charAt(1);
        if(str.indexOf(ch1) == str.lastIndexOf(ch1)) {
            System.out.print(ch1);
        }
        char ch2 = str.charAt(2);
        if(str.indexOf(ch2) == str.lastIndexOf(ch2)) {
            System.out.print(ch2);
        }
        char ch3 = str.charAt(3);
        if(str.indexOf(ch3) == str.lastIndexOf(ch3)) {
            System.out.print(ch3);
        }
        char ch4 = str.charAt(4);
        if (str.indexOf(ch4) == str.lastIndexOf(ch4)){
            System.out.print(ch4);
        }
        char ch5 = str.charAt(5);
        if(str.indexOf(ch5) == str.lastIndexOf (ch5)) {
            System.out.print(ch5);
        }
        char ch6= str.charAt(6);
        if (str.indexOf(ch6) == str.lastIndexOf(ch6)){
            System.out.print(ch6);
        }









    }
}
