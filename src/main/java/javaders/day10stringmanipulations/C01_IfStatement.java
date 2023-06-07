package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        // If it rains , I will cancel the picnic.
        // Eger yagmur yagarsa piknigi iptal edecegim.


        // EX: Verilen karakter büyük ise ekrana "Büyük Harf" yazan kodu yaziniz.

        char ch = 'A'; // kucuk harf 'a' veya sembol veya rakam yazsan kod calismaz.
        // Cünkü If parantezi icindeki sart önemlidir. Sartimiz büyük harf sartidir.
        //Burda if icindeki datayi Ascii degerlerini kiyaslar. Eger kiyaslama yapiliyorsa rakamsal degerleri kiyaslar.
        // Yani 'A' ==65 ile , 'Z' ==90 karsilastirdi. 65 >= 'A' && 90<= 'Z' karsilastirildi.
        if (ch >= 'A' && ch <= 'Z') { // Burda büyük har ise dedigimiz icin tüm Büyük Harfleri araliga yazmaliyim.
            // 65 >= 65 && 65<=90  ------- true 'dur. Bu sebeple If icindeki "Buyuk Harf'yazisini yazdirir.
            System.out.println("Büyük Harf");
        }//if body
        // Eger bir sart varsa if'in parantez kismina yazarsin. Süslü icine yazdirirsin.
         else {
            System.out.println("Büyük Harf degildir");
        }//else body

        char ch1 = 'a';
         if (ch1>='a' && ch1<='z') {
             System.out.println("Buyuk Harf"); // 'a' == 97 dir.
         }// If body
         else {
             System.out.println("Kucuk Harf");
         }//else body

        //Scanner input = new Scanner (System.in);
        //System.out.println("Lutfen bir sayi giriniz");
         //int sayi = input.nextInt();



        //EX: Verilen sayi cift sayi ise ekrana cift sayi yazdiran kodu yaziniz.

        byte num = 23;
        // Kod'un dinamik yazilmasi icin Variable'in ismi yazilir. Direkt deger yazilirsa
        // "Hurd Coding" yani tek datalik kod olur. Variable ismi daha dogrudur.
        if (num %2 ==0) {
             System.out.println("Cift Sayi");
         }//if body
         else {
             System.out.println("Tek Sayi");
         }//else body


        //EX: Verilen bir sayi 300'den kucuk veya 1200'den buyuk
        //ise "Harika Sayi" yazdiran kodu yaziniz.

        int number = 300;
         if(number<300 || number>1200) {
             System.out.println("Harika Sayi");
         }//if body
        else {
             System.out.println("Harika Sayi Degildir");
         }//else body


        //EX: Kullanicidan alinan Datanin Tekmi; CiftMi? oldugunu yazdiran kodu yaziniz.

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num1 = input.nextInt();

        //*********************** 1. Yol Bagimsiz If Statement ****************//
        if(num1%2==0) {
            System.out.println("Cift Mi?");
        }//if body
        if (num1%2 !=0) {
            System.out.println("Tek Mi?");
        } //if body


       //*********************** 2. Yol If Else ****************//
        if(num1%2==0) {
            System.out.println("Cift Sayi"); // Eger num1 icerisindeki data 2 ye bölümünden kalan 0 ise cifttir.
            // ve If calisir.
        }//if body
        else {
            System.out.println("Tek Sayi?"); // Else degilse demektir. Geriye kalan tüm ihtimaller icin calisir.
        }//else body


        //EX: Verilen bir sayinin pozitif mi negatif mi yoksa nötr mü oldugunu yazdiran kodu yaziniz.

        Scanner input1 = new Scanner (System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num2 = input1.nextInt();

        if(num2>0) {
            System.out.println("Pozitif Sayi");
        }//if body
        else if (num2<0) {
            System.out.println("Negatif Sayi");
        } //else if body
        else if (num2 == 0) {
            System.out.println("Nötr Sayi");
        }//else if body
    }//main
}//class
