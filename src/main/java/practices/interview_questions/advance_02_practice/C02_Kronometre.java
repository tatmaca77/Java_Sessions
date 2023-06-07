package practices.interview_questions.advance_02_practice;

import java.util.Scanner;

public class C02_Kronometre {

    /** 2023 QA INTERVIEW QUESTIONS */

    public static void main(String[] args) {


        /**
        Kullanicinin belirledigi sayida islemi gerceklestiren, sonunda toplam süreyi
        ve ortalama süreyi kullaniciya gösteren bir kronometre yaziniz. */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac defa islem yapilacagini giriniz");
        int numTask = input.nextInt(); // numTask ==> görev sayisi demektir. Bu isimler Task'de olur.

        long startTime = System.currentTimeMillis(); // Suan'daki zamani yani baslangic zamanini alir. nano da olurdu.

        System.out.println("***********************************");

        int sum = 0;

        for (int i = 0; i < numTask; i++){
            int numbers[] = {1,2,3,4,5};

            for (int w : numbers) {
                sum += w;
            }
            System.out.println("sum :" + sum);
            System.out.println("islem" + (i+1) + "tamamlandi");
            System.out.println("**********************");
        }// for body

        long endTime = System.currentTimeMillis();

        long islemSuresi = endTime-startTime;
        System.out.println("**********************");
        System.out.println("islemSuresi :" + islemSuresi);// Bu bana toplam yani islem süresini sureyi verir.
        System.out.println("OrtalamaSure : " + ((double)islemSuresi/numTask) + "milisaniye");




    }//main body
}//class body
