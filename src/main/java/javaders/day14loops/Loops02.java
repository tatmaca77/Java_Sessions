package javaders.day14loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops02 {

    public static void main(String[] args) {


        // 3 den 8 e kadar tum tamsayilari konsola yaz.

        ////// ******** 1. Way ***********/////
        for (int i = 3; i < 9; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        ////// ******** 2. Way *********                  // for ile cozulen while ile cozulemeyen soru yoktur.
        // tum Loops'larla ayni soruyu cozebilirsin.
        int i = 3;                                       // while Loop daha kolay okunur daha basittir.
        // for loop daha tekniktir.
        while (i < 9) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();


        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

        //1.Way:

        for (int k = 21; k < 181; k++) {
            if (k % 4 == 0 && k % 6 == 0) {
                System.out.print(k + " ");
            }
        }

        //2.Way:

        int k = 21;

        while (k < 181) {

            if (k % 4 == 0 && k % 6 == 0) {
                System.out.print(k + " ");
            }
            k++;
        }

        System.out.println();

        //Example : Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan characterleri büyük harfe donustur.
        //miami ==> MiAmI

        String s = "miami";

        int m = 0;
        while (m < s.length()) {

            String ch = s.substring(m, m + 1);

            if (m % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch.toLowerCase());
            }
            m++; // Bu kismi unutma yoksa "infinite Loop" olusur. Yani "sonsuz loop" olusur. Sonsuz lopp'lar
            // application'in donmasina sebep olur. Cok dikkat edilmelidir. !!!!!!!
        }

        System.out.println();


        // Size verilen tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.

        int r = -578;
        r = Math.abs(r);                // Math.abs() metodunu kullanilir. Hem negativ hemde pozitivler icin kullanilir.
        int sum = 0;

        while (r > 0) {

            sum = sum + r % 10;      //Son Rakami alir.

            r = r / 10;           // Bu sefer bölerek sayiyi azaltmis olduk. !!!!!!!!!

            //System.out.println(sum);   // Eger Loop icine yazarsan tüm adimlari yazdirir.
        }
        System.out.println(sum);


        // Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kado yaziniz. ****************INTERVIEW !!!!!!!!!!
        // 3*1 = 3  3*2 = 6  3*3 = 9 ..... 3*10 = 30

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double n = input.nextDouble();

        int u = 1;

        while (u < 11) {

            System.out.println(n + "x" + u + " = " + (n * u));

            u++;
        }

        System.out.println();


        // Kullanicidan aldiginiz String'deki sessiz harfleri yaziniz.
        //Alabama = lbm

        // Daha önce Scanner dan obje yapildigi icin yazmadik.

        /*System.out.println("Please enter a word");
        String y = input.next();//kelime girecegi icin next yeterli

        int z = 0;

        while(z<y.length()){//ilk index 0 dir son index lengt bir azdir
            char ch = y.charAt(z);//bu sifirken bana ilk karakter verilecek artirmadan sonra 1 olduugunda ikinci karakter verilecek
            boolean x = ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' || ch=='A' ||  ch=='E'||  ch=='I' || ch=='O'|| ch=='U';

            if(x){//booleana yazilan kodu if kodunun icinden aldik
                //burada ayrica if(!x)  de yazabilirdik bunun icin else yi cikartamamiz gerekir.
                //   z++;// diger harfe gecmek icin yazmaliyiz
                //   continue;//demezsek tekrarlari yazmiyor
                //continue while loop da sorunsuz calismakla beraber diger kodlarda durum ayni degil
            }else {
                System.out.print(ch);     // Eger parantez'in icin cok uzunsa if(x) yapmalisin.
            }
            z++;
        */

        System.out.println();


        //Kullanicidan aldiginiz String'deki sessiz harfleri console'a yazdiran kodu yaziniz
        //Alabama ==> lbm

        System.out.println("Please enter a word");
        String y = input.next();

        int z = 0;

        while (z < y.length()) {

            char ch = y.charAt(z);
            boolean x = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

            if (!x) {
                System.out.print(ch);
            }
            z++;
        }


    }
}










