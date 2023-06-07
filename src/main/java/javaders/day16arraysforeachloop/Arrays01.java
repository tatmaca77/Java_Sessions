package javaders.day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {
         // Mümkün oldugunca for-each loop kullanilir. Arraylerle kullanilir. En gelismisidir Loop lar arasinda.
        // Ogretmen ogrencilerin ismini sisteme girecek. Yani coklu data söz konusudur.

        /*
           1) Kullanicidan data almak icin Scanner object olusturmaliyiz.
           2) Coklu datayi yerlestirmek icin bir Array olusturmaliyim.
           3) Array olusturabilmek icin kullanicidan Array'e kac tane eleman koyacagini almaliyim.
           4) Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.
         */

        // Kullanicinin coklu data'yi bir Array'e yerlestirebilmesi icin gerekn code'u yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add");
        int numOfElements = input.nextInt();         // Bir kere bu soruyu soracagim icin loop icine koymaya gerek yok.

        String stdNames [] = new String[numOfElements];  // Kullanicinin verdigi sayi ile Array olusturulur.

        System.out.println("To stop adding press 'q'");

        for(int i = 0; i < stdNames.length; i++){

            System.out.println("Enter the" + (i+1) + ". student name");   // Mesaji dinamik yaptik.
            String name = input.next();                                       // 1. ogrenci 2. ogrenci ismini gir .....

            if(name.equalsIgnoreCase("q")){  // quit cikis. O yüzden q.
                break;                                  // Isim q ise loop'u kir diger udurmda ekleme yap.
            }                                          // stringler de esitlik kontrolu equals ile olur
            else {
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames)); //[Ali, Can , Han]








    }
}
