package practices.day_01_practice;

import java.util.Scanner;

public class C08_IfElse {

    public static void main(String[] args) {
        /*
    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın
   */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a your year of service");
        int serviceYear = input.nextInt();
        System.out.println("Please enter your salary");
        int salary = input.nextInt();

        if (serviceYear>=5){
            System.out.println("Increased Salary :" + (salary + (salary*10/100))); // %10 zamli maas yazdirilicak.
        }
        else{
            System.out.println("Working year for increased salary :" + (5-serviceYear) + " You should work ");
        }


        String str = "sarıkanarya";
        System.out.println(str.charAt(str.length()-1));

        String str1 = "Java Kolaydır";
        System.out.println(str1.endsWith(""));

        String str2 = "Java";
        System.out.println(str2.replace("", "/"));




    }//main
}//class
