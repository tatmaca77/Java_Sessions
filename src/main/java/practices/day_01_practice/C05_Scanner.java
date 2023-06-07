package practices.day_01_practice;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*
        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.next();

        System.out.println("Please enter your surname: ");
        String surname = input.next();

        System.out.println("Please enter your age: ");
        byte age = input.nextByte();

        System.out.println("Please enter your weight: ");
        double weight = input.nextDouble();

        System.out.println("Please enter your height: ");
        double height = input.nextDouble();

        System.out.println("Adi :" + name + "\n" + "Soyadi :" + surname + "\n" + "Yas :" + age + "\n" + "Boy :" + height
        + "\n" + "Kilo :" + weight);
    }//main
}//class
