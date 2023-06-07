package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_ScannerTekrar {

    public static void main(String[] args) {

        // Schreiben Sie ein Programm, das den Benutzer fragt,
        // ob ihm sein Land gefallen, sein Geschlecht, sein Name, seine Heimatstadt, sein Alter, seine Größe.

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte Schreiben Sie ihr Geschlecht...");
        char geschlecht = input.next().charAt(0);

        System.out.println("Bitte Schreiben Sie ihr Name...");
        String name = input.next();

        System.out.println("Bitte Schreiben Sie ihre Heimatsatadt...");
        String heimatStadt = input.next();

        System.out.println("Bitte Schreiben Sie ihr Alter...");
        byte alt = input.nextByte();

        System.out.println("Bitte Sgen Sie mir ihre Größe...");
        float größe = input.nextFloat();

        System.out.println("Bitte ob ihm sein Land gefallen...");
        boolean land = input.nextBoolean();

        System.out.println(geschlecht+ "\n"+name +"\n"+ "\n"+heimatStadt+ "\n"+alt+ "\n"+ "\n"+größe +"\n"+land);











    }//main
}//class
