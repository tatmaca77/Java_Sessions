package javaders.day14loops;

import java.util.Scanner;

public class Loops04AtmSorusuProje {


    public static void main(String[] args) {

        //ATM - QUESTION ***************INTERVIEW****************

        // Kullanici username ve password'u girsin.
        // 3 kereden fazla yanlis girerse "Your account was blocked" mesajini alsin.
        // 3 kereye kadar yanlis girerse "Invalid username or password" mesajini alsin.
        // Dogru girerse "Welcome to your account" mesajini alsin.

        Scanner input = new Scanner(System.in);
        int counter = 0;          // Giris sayisini ölcmesi icin bunu koyduk. !!!!!!!!!!!!
        String validUsername = "techpro123";
        String validPassword = "Education12?";
        do {
            if (counter == 3) {
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Please enter your username");    // Tekrarli old.icin loop icine koyduk
            String username = input.next();

            System.out.println("Please enter your password");
            String password = input.next();

            counter++;

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Welcome to your account");
                break;     // Burda da tekrar password username girin yazmasin diye break ile loop disina ciktim.

            }else {
                System.out.println("Invalid username or password");
                System.out.println((3-counter) + "right left");
            }
        }while(true);
    }
}
