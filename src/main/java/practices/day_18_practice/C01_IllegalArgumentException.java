package practices.day_18_practice;

import java.util.Scanner;
//Istedigimiz zaman kendimiz Exception firlatabiliriz ve onu handle yapabiliriz.
public class C01_IllegalArgumentException {

    /* Kullanıcıdan yasını sisteme girmesini isteyiniz.
        Kullanıcı yas olarak 0'dan kucuk esit veya
        120'den buyuk esit bir sayı girerse
        IllegalArgumentException olusacak sekilde
        bir program yazınız
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi Giriniz");
        int yas = scan.nextInt();

        if(yas<=0 || yas>=120){
                throw new IllegalArgumentException();
            // Java bizim istedigimiz durumlarda exception fırlatabilir.
            } else{
            System.out.println("Uygun Bir Yas Girdiniz");
        }
    }
    // throw new ile kendimiz bir Exception olusturmus olduk.
    // Eger app'in calismasini istemiyorsan hata ile dursun diyorsan bu sekilde yap.
    // Ama eger Exception'i try-catch ile handle edersen bu Exception'dan kurtulmus olursun. Her sekilde calisir.


    /**
    if(yas<=0 || yas>=120){
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Exception firlatma yoluna devam et.");
            }
        }else{
            System.out.println("Uygun Bir Yas Girdiniz");
        }
    }
     */
}
