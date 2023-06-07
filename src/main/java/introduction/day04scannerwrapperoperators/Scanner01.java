package introduction.day04scannerwrapperoperators;


import java.util.Scanner;

public class Scanner01 {


    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz.



        Scanner input = new Scanner (System.in);

        System.out.println("Lutfen 5 basamakli bir sayi girniz...");

        int number = input.nextInt();
        //Bir sayinin son rakamini alabilmek icin o sayiyi 10'abölüp kalani almaliyiz.
        // % == modulus operator ; solunda bulunan sayinin saginda bulunun sayiya bölümünden kalani verir.
        //dolayisiyla %10 her zaman bize birler basamaginda bulunun sayiyi verir. !!!
        // Bir tam sayiyi bir tam sayiya bölerseniz Java sonucu kesinlikle tam sayi yapar.
        //Java bu durumda yuvarlama yapmaz. !!! Ondalikli bölümü iptal eder.
        //dolayisiyla bir tam sayiyi 10'a bölersek birler basamagini silmis oluruz.
        //Note: Birsayinin son rakamini alabilmek icin o sayiyi 10'a bolup kalani aliriz.
        //Bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tam sayi yapar.
        // Java sonucu nasil tam sayi yapar ?
        // Ondalikli kismi iptal eder. Java yuvarlama yapmaz.
        //Yani aslinda sayiyi kücültürüz.



        //Son rakami al !!    -- 38671 % 10 == 1      38671 / 10 == 3867
        int lastDigit = number%10;
        //sayi kucult
        number = number/10;

         //sondan ikinci rakami al. --3867 % 10 == 7     3867 / 10 = 386
        int lastSecondDigit = number%10;
        //sayi kucult.
        number = number/10;

        //sondan ucuncu rakami al.     -- 386 % 10 == 6      386 / 10 == 38
        int lastThirdDigit = number%10;
        //sayi kucult.
        number = number/10;

        //sondan dördüncü rakami al.   --38 % 10 == 8      38 / 10 == 3
        int lastFourthDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan besinci rakami al.     -- 3 % 10 == 3
        int lastFifthDigit = number%10;
        //sayiyi kucult.
        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);


    }//main

}//class
