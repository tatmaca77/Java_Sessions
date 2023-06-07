package practices.day_03_practice;

import java.util.Scanner;

public class C01_ScannerSekilOlusturmaSayininIlkVeSonSayisiniToplama {                 /**Sekilli sorular cikiyor INTERVIEW da   Yildiz vs...**/

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız bir şekil ile aşağıdaki şekli oluşturan kodu yazınız
/*
             A                // 2 space + ch + 2 space
            A A               // 1 space + ch + 1 space             // Ucgen sorularinda kareye tamamla öncelikle !!!!
           A A A              // 1 ch + 1 space + 1 ch + 1 space + 1 ch
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character...");
        char ch = input.next().charAt(0);

        System.out.println("  " + ch + "  ");
        System.out.println(" "+ ch + " " + ch + " ");
        System.out.println(ch + " " + ch + " " + ch ) ;


        // Ex 2: Kullanicidan iki sayi alip 4 islem yapan ve islemlerinin sonucunu ekrana yazan hesap makinesi olusturun.
        System.out.println("Lutfen iki sayi giriniz...");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);

        // Ex 3: Lullanicidan alacaginiz 5 bas. bir sayinin ilk 2 ve son iki karakterinin toplamini aliniz.
        int num1 = 12345;

        /** First Way **/
        int lastDigit = num1 % 10;
        num1 = num1 /10;
        int lastSecondDigit = num1 % 10;
        num1 = num1 /10;
        int lasdtThirdDigit = num1 % 10;
        num1 = num1 / 10 ;
        int lastFourthDigit = num1 % 10;
        num1 = num1 / 10;
        int lastFifthDigit = num1 % 10;
        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);

        /** Second Way **/
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num = input.nextInt();//12345

        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkiRkm = " + ilkIkiRkm);  //12
                         //  2                 1
        int ilkIkiToplam = (ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam); // 3

        int sonIkiRkm= num%100;//45     5            4
        int sonIkiRkmToplam = (sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiRkmToplam = " + sonIkiRkmToplam);//9
        int toplam=ilkIkiToplam+sonIkiRkmToplam; // 9+ 3 == 12
        System.out.println("toplam = " + toplam);

































    }// main
}// class
