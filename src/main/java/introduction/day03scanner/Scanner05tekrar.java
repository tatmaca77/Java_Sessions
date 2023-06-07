package introduction.day03scanner;


import java.util.Scanner;

public class Scanner05tekrar {

    public static void main(String[] args) {


        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz.
        //1)Alanini hesaplayiniz. == ( Kisa kenar * uzun kenar )
        //2)Cevresini hesaplayiniz. == ( 2*kisa kenar + 2*uzun kenar )


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Dikdörtgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();

        System.out.println("Lutfen Dikdörtgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        //Alternativ icin bu da olurdu ama uzun olurdu.
        double alan = shortSide*longSide; //Best Practice dir.

        System.out.println("Alan = " + (shortSide*longSide)); //Tavsiye edilen.
        System.out.println(2*shortSide+2*longSide);




    }
}
