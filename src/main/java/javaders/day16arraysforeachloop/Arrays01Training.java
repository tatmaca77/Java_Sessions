package javaders.day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Training {

    public static void main(String[] args) {

         /*
           1) Kullanicidan data almak icin Scanner object olusturmaliyiz.
           2) Coklu datayi yerlestirmek icin bir Array olusturmaliyim.
           3) Array olusturabilmek icin kullanicidan Array'e kac tane eleman koyacagini almaliyim.
           4) Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.
         */

        // Kullanicinin coklu data'yi bir Array'e yerlestirebilmesi icn gereken code'u yaziniz.

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen ne kadar eleman girmek istediginizin sayisini giriniz: ");
        int number = input.nextInt();

        String names[] = new String[number];

        System.out.println("To stop adding press 'q'");

        for(int i = 0; i < names.length; i++){
            System.out.println("Enter the" + (i+1) + ". student name");
            String name = input.next();

            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                names[i] = name;
            }
        }
        System.out.println(Arrays.toString(names));




    }
}
