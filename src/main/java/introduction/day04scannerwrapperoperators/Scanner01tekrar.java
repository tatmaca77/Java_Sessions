package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01tekrar {

    public static void main(String[] args) {

        /*
         Kullanicidan alacaginiz 4 basamakli bir sayinin ilk ve son rakamini toplayiniz.
         Sonra 3.sayidan cikaran bir kod yaziniz.

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz..."); // 3162
        int number = input.nextInt();

        int lastDigit = number%10; // 3162 %10 = 2
        number = number/10; // 3162/10 = 316

        int lastSecondDigit = number%10; // 316 %10 = 6
        number = number/10; // 316/10 = 31

        int lastThirdDigit = number%10; // 31 %10 = 1
        number = number/10; // 31 /10 = 3

        int firstDigit = number%10; // 3

        System.out.println("firstDigit + lastDigit : " + (firstDigit+lastDigit));//3+2 ==5


        /*
        Kullanicidan aldigin 3 basamakli ve 6 basamakli sayilari kendi aralarinda sayilari toplayip
        2. sayidan 1. sayiyi cikartan bir kodu ekrana yazdirniz.
         */


        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz..."); // 121
        int num1 = input.nextByte();

        int lastDigit1 = (num1 %10); // 121 %10 = 1
        num1 = num1/10;  // 121/10 = 12

        int secondDigit = (num1 %10); // 12 %10 = 2
        num1 = num1/10; // 12/10 = 1

        int firstDigit1 = (num1 %10); //1

        System.out.println((lastDigit1+secondDigit+firstDigit1)); // 4
        System.out.println(firstDigit+lastDigit-(lastDigit1+secondDigit+firstDigit1)); //5-4 ==1


        Scanner input3 = new Scanner(System.in);
        System.out.println("Lutfen 6 basamakli bir sayi giriniz..."); // 255934
        int num2 = input.nextInt();

        int lastDigit2 = num2 %10; // 255934 %10 = 4
        num2 = num2/10; // 255934/10 = 25593

        int lastSecondDigit2 = num2 %10; // 25593 %10 = 3
        num2 = num2/10; // 25593/10 = 2559

        int lastThirdDigit2 = num2 %10; // 2559 %10 = 9
        num2 = num2/10; // 2559/10 = 255

        int lastForthDigit2 = num2 %10; // 255 %10 = 5
        num2 = num2/10; // 255/10 = 25

        int lastFifthDigit2 = num2 %10; // 25 %10 = 5
        num2 = num2/10; // 25/10 = 2

        int firstDigit2 = num2 %10; // 2

        System.out.println((firstDigit2+lastFifthDigit2+lastForthDigit2+lastThirdDigit2+lastSecondDigit2+lastDigit2)); // 28

        System.out.println("Sonuc : " + (firstDigit2+lastFifthDigit2+lastForthDigit2+lastThirdDigit2+lastSecondDigit2+lastDigit2
        - lastDigit1-secondDigit-firstDigit1 ));  // SONUC = 24
    }//main
}//class




























