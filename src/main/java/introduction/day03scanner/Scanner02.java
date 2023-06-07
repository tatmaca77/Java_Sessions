package introduction.day03scanner;


import java.util.Scanner;

public class Scanner02 {

    //Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yansitiniz.

    public static void main(String[] args) {

        //1.Adim: Scanner Class'dan object olustur.
        Scanner input = new Scanner(System.in);

        //2. Adim : Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Ilk Isminizi giriniz...");
        String firstName = input.next();

        System.out.println("Soy Isminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);

        //araya " " atinca otomatik ayni satirda yan yana bosluk biakir!!!

    }

}
