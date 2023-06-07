package TolgaTraining.dowhileloops;

import java.util.Scanner;

public class Atm_Sorusu_do_while_loops {

    public static void main(String[] args) {

        //ATM - QUESTION ***************INTERVIEW****************

        // Kullanici username ve password'u girsin.
        // 3 kereden fazla yanlis girerse "Your account was blocked" mesajini alsin.
        // 3 kereye kadar yanlis girerse "Invalid username or password" mesajini alsin.
        // Dogru girerse "Welcome to your account" mesajini alsin.

        Scanner input = new Scanner(System.in);

        int counter = 0;
        String username = "tatmaca77";
        String password = "Mahmuttuncer77";

        do {
            if (counter == 3 ) {
                System.out.println("Your account has been blocked");
                break;
            }
            System.out.println("Please enter your username");
            String username2 = input.next();
            System.out.println("Please enter your password");
            String password2 = input.next();

            counter++;

            if (username2.equals(username) && password2.equals(password)) {
                System.out.println("Welcome to your account");
                break;
            }
            else{
                System.out.println("Invalid username or password");
                System.out.println(3-counter + " right left");
            }

        }
        while(true);







    }
}
