package javaders.day12switchincrementdecrementloops;

public class Loops01 {


    public static void main(String[] args) {

        /*
           Note :  Code yazarken
                  i) Tekrarli Code yazmamaya dikkat ediniz.
                  ii) Yazdiginiz code'un gerektiginde güncellenmesi ve gelistirilmaesineve test edilmesinin kolay olmasina
                  iv) Yazdiginiz code'un farkli senaryolar icinde calisabilmesine dikkat ediniz. !!!!!!!!!!!
         */

        // Ekrana 5 kere "Hi" yazdiriniz.

        //Loops == Döngü

        System.out.println("Hi");     //Bu hic iyi bir method degil. 5000 kere dese napicaksin.
        System.out.println("Hi");     //Hic Tavsiye edilmez. Hatanin düzeltirken ve kod gelistirmek icin olmaz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        //Yukaridaki gibi tekrar gerektiren isleri yapmak icin "Loop" yapilarini kullanilirz.
        // 4 tane Loop yapisi vardir.
            //  i) for-Loop  ii) while-Loop iii) do-While-Loop iv) for-each-Loop

        // 1) for-Loop
        // Baslangic degerine ve loop ne zamana kadar devam edecek ve increment mi decrement mi yapacagiz ona bakmaliyiz.

        //Starting Value  Loop Condition  Increment/Decrement
        for (int i= 1   ;  i<6           ;  i++              ) {
            System.out.println("H***"); // Bu sekilde ister kolayca gelistir ister kolayca test et. Cok kullanilir ve
                                       // Cok sorulan bir sorudur.!!!!!!! INTERVIEW
        }

        // Example : 4'den 24'e kadar tum tam sayilari ayni satirda aralarinda bosluk birakarak konsola yaziniz.
        // Tekrarli bir is görünce aklina hemen Loop gelmeli!!!!!!!
                              // i++ , i+=1 , i =i+1
        for (int i = 4; i<25; i++)  {   // >= <= esitlikte kullanilir ama Java tek is yapmali o yüzden sayi büyüt.
           // System.out.println(i + " "); // alt alta yazar println den dolayi.
            System.out.print(i + " "); // ayni satirda ve aralinda birer boslukla yazdirdi.
        }

        System.out.println();

        //Example : 33'den 11'e kadar tüm cift tam sayilari ayni satirda,aralarinda bosluk birakarak konsola yaziniz.

        for (int i = 33; i>10; i--)  {

            if (i % 2 == 0){
                System.out.print(i + " " );
            } // if body
        } // for body
                                                      // Matematik Bilgisi iyi olmalidir. !!!!!!!!!!
        System.out.println();
        // Yazdiginiz code baska bir sahada uzmanlik icermemelidir.!!!
        for (int i = 32; i>10; i=i-2)  {
            System.out.print(i + " " );
        } // for body

        System.out.println();
        // Ex : 20 den 74 tüm tek tamsayilari ayni satirda,aralarinda bosluk birakarak yaziniz.

        for (int i = 20 ; i<75; i++)  {
            if (i % 2 !=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Ex : Massachusetts kelimesindeki tüm sesli harfleri

        String s = "Massachusetts";

        for (int i = 0 ; i<s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c== 'U') {
                    System.out.print(c + " ");
                }

        }
        System.out.println();
        // sessiz harfler icin

        for (int i = 0 ; i<s.length(); i++) {

            char c = s.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I'&&c != 'O' && c!= 'U') {
                System.out.print(c + " ");
            }

        }


    }//main
}//class

