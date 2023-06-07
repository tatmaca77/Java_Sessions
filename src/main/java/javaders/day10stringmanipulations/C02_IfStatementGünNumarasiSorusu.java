package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C02_IfStatementGünNumarasiSorusu {

    public static void main(String[] args) {

        //EX: Kullanici gün numarasini girsin kod gunu yazsin
        // 1 == Pazar 2== Pazartesi 3== Sali 4== Carsamba ........ 7== Cumartesi

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz\n1 : Pazar\n2 : Pazartesi\n3 : Sali\n4 : Carsamba" +
                "\n5 : Persembe\n6 : Cuma\n7 : Cumartesi");
        byte gunNo = input.nextByte();

        if (gunNo == 1) {
            System.out.println("Pazar");
        }//if body
        else if (gunNo == 2) {
            System.out.println("Pazartesi");
        }//else if body
        else if (gunNo == 3) {
            System.out.println("Sali");
        }//else if body
        else if (gunNo == 4) {
            System.out.println("Carsamba");
        }//else if body
        else if (gunNo == 5) {
            System.out.println("Persembe");
        }//else if body
        else if (gunNo == 6) {
            System.out.println("Cuma");
        }//else if body
        else if (gunNo == 7) {
            System.out.println("Cumartesi");
        }//else if body
        else {
            System.out.println("Lutfen gecerli bir gun numarasini giriniz \n1 : Pazar\n2 : Pazartesi\n3 : Sali \n4 : Carsamba"+
            "\n5 : Persembe\n6 : Cuma\n7 : Cumartesi");
        }//else body
    }//main
}//class
