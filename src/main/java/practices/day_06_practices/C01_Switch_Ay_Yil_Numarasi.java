package practices.day_06_practices;

import java.util.Scanner;

public class C01_Switch_Ay_Yil_Numarasi {

    public static void main(String[] args) {

         /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yil numarasini giriniz.");
        int yilNo = input.nextInt();
        System.out.println("Lütfen 1-12 arasinda ay numarasini giriniz.");
        int ayNo = input.nextInt();

       /* if (ayNo == 1 || ayNo == 3 || ayNo == 5 || ayNo ==7 || ayNo ==8 || ayNo ==10 || ayNo ==12){
            System.out.println("Bu ay 31 gün ceker...");
        } else if (ayNo == 4 || ayNo ==6 || ayNo ==9 || ayNo ==11 ||) {
            System.out.println("Bu ay 30 gün ceker...");
        } else if (ayNo % 4 == 0){
            System.out.println("Bu ay 29 gün ceker...");
        } else if (ayNo % 4 != 0){
            System.out.println("Bu ay 28 gün ceker...");
        }*/
        switch(ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                int gun = 31;
                System.out.println("Girdginiz Ay " + gun + " Gun ceker...");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gun = 30;
                System.out.println("Girdginiz Ay " + gun + " Gun ceker...");
                break;
            case 2:
                if (yilNo % 4 == 0) {
                    gun = 29;
                    System.out.println("Girdiginiz Ay " + gun + " Gun Ceker...");
                } else {
                    gun = 28;
                    System.out.println("Girdiginiz Ay " + gun + " Gun Ceker...");
                }
                break;
            default:
                System.out.println("Girdiginiz Ay numarasi hatalidir...");

        }
    }
}
