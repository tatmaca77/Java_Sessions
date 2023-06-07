package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulationsTekrar {

    public static void main(String[] args) {

         /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
               i)mail adresi "@gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi  \n" +
                " i)mail adresi \"@gmail\" icermeli\n" +
                " ii)Space characteri mail'de olmamali\n" +
                "iii)mail adresinde buyuk harf olmamali\n" +
                " iv)En az bir tane noktalama isareti bulunmali \n seklinde veriniz");

        String mail= input.nextLine();
        //    i)mail adresi "@gmail" icermeli
        boolean first =mail.contains("@gmail");
        System.out.println("@gmail = " + first);
        // ii)Space characteri mail'de olmamali
        boolean second = !mail.contains(" ");
        System.out.println("space = " + second);
        //iii)mail adresinde buyuk harf olmamali
       /* boolean third = !mail.contains("[A-Z]");
        System.out.println("third = " + third);

        contains methodu Regex karakterlerle
         dogru bir sekilde calismaz.Bu nedenle
         replaceAll() ya da replace() ile silme
          yapip geriye kalanlarin lenght()'ne bakilir
*/

      /*  boolean upperCaseNot=mail.replaceAll("[^A-Z]","").length()==0;
        System.out.println("upperCaseNot = " + upperCaseNot);*/

        boolean third = mail.replaceAll("[a-z0-9]","").
                replaceAll("[\\p{Punct}]","").
                replace(" ","").length()==0;
        System.out.println("Buyuk Harf Olmamali = " + third);


        //iv)En az bir tane noktalama isareti bulunmali
        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").
                replace(" ","").
                length()>0;

        boolean fourth2 =mail.replaceAll("[^\\p{Punct}]","").
                length()>0;

        boolean dort = mail.replaceAll("[a-zA-Z0-9]", "").replace(" ", "").length()>1;
        System.out.println("dort = " + dort);
        // boolean fourth = mail.replaceAll("[^\\P{P}]", "").length()>0;
        System.out.println("punctuation = " + fourth);
        System.out.println("noktalama Isareti olmali = " + fourth2);
        System.out.println(first && second && third && fourth);


        String str = "burada bir gariplik var.?-!";
        System.out.println(str.replaceAll("[^\\p{Punct}]",""));


    }//main
}//class

