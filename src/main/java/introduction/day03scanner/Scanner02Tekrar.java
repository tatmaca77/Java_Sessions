package introduction.day03scanner;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner02Tekrar {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String name = input.nextLine();
        System.out.println("soy ad giriniz...");
        String surname = input.nextLine();

        if (name.contains(" ")) {


            String firstName = name.substring(0, 1).toUpperCase();
            String secondName = name.split(" ")[0].substring(1).toLowerCase();
            String thirdName = name.split(" ")[1].substring(0, 1).toUpperCase();
            String fourthName = name.split(" ")[1].substring(1).toLowerCase();

            String firstName1 = surname.substring(0).toUpperCase();
            System.out.println(firstName + secondName + " " + thirdName + fourthName +" "+ firstName1);
        }//if
        else {
            String firstName = name.substring(0, 1).toUpperCase();
            String secondName = name.substring(1).toLowerCase();
            String firstName1 = surname.substring(0).toUpperCase();
            System.out.println(firstName+secondName+ " "+ firstName1);

        }//else

    }//main
}//class
