package replit_questions.ternary;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("3 harfli bir isim girin");
        String isim = input.next();

        String result = isim.charAt(0) == isim.charAt(1) || isim.charAt(1) == isim.charAt(2)
                || isim.charAt(0) == isim.charAt(2)?
                "Isim ayni karakterlere sahiptir" : "ismin benzersiz karakterleri vardir" ;

        System.out.println(result);







    }
}
