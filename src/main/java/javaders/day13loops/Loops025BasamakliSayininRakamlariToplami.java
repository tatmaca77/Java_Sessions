package javaders.day13loops;

public class Loops025BasamakliSayininRakamlariToplami {

    public static void main(String[] args) {

        //Ex : Verilen bir String'de kucuk harfleri yazmayiniz. Sadece buyuk harf ve digerlerini yazdir.
        //"Pwd12?Ab" == Password          P12?A

        String s = "Pwd12?Ab";               // Al bak yazdir tekrarli bir islemdir.

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >='a' && ch <='z') {
                continue;               // continue  devam et islemi bölmeden diger asamaya git diyor.
                                        // yani aslinda index'in isleme koymamasini saglar. Devam ettirir.
                                       // Loop yaparken bazi elemanlari isleme sokamamak icin "continue" kullanilir.
            }
            else {
                System.out.print(ch);

            }
        }

        // break ile continue arasindaki fark nedir ?
        // break : switch'in disina cikmak icin veya Loop'u kirmak icin kullanilir.
        //continue : Loop yaparken bazi elamanlari isleme sokamamak icin "continue" kullanilir.


        System.out.println();

        //Ex : Interview sorusu !!!!!!!!
        // Bir String'i tersten yazdiran (Tokatci sorusu gibiydi) code'u yaziniz. veya (ters ceviren) code'u yaziniz.
        // Java ==> avaJ             Eger ters ceviren derse yeni bir bos String konteyneri olmalidir.


        //1.Way
        String t = "Apex";
        String ters = " ";                // Burda ters bos biraktik verileni icine koymasi icn.

        for (int i =t.length()-1;   i >=0 ;   i--) {

            ters = ters + t.substring(i, i+1);                         //Concat yapar.

            //System.out.print(ters);       // Her adimi gösterir.              x xe xep xepA
        }
       System.out.print(ters); //avaJ     // en son degeri verir.                xepA

        // ters'in en son hali bize lazim oldugu icin Loop'un disin sout yazariz.
                                        //Loop'un icinde olursa bütün herseyi gösterir. Diger türlü en son halini görürüz.

        System.out.println();


        //2.Way
        String u = "Java";
        String ters2 = "";

        for(int i=u.length()-1; i>=0; i--){

            ters2 = ters2 + u.charAt(i);          // Concetination yapar.
        }
        System.out.print(ters2);

        System.out.println();

        // Ex : Bir tamsayi'nin rakamlari toplamini veren code'u yaziniz.   INTERVIEW !!!!!!
        //578 ==> 5+7+8 == 20

        /*int number = 578;

        number = number %10 ; // 8
        System.out.println(number);   //%10 her zaman sayinin son rakamini verir.
        number = number /10;  57

        number = number %10; // 7
        System.out.println(number);
        number = number /10; //5

        number = number %10; // 5
        System.out.print(number);
        */



        System.out.println();

        // 3 Basamakli bir sayinin rakamlari toplamini alin. % Modulus

          int n = -578;
          n = Math.abs(n);      // Math.abs ile negatifler icinde calisir.
          int sum = 0;
          // Yeni data oldugunda onlari icine koymak icin bir kutu lazim.


        for (int i = n;     i>0;     i=i/10 ){   // Decrement'i bölme ile yaptik.      i/=10

            sum = sum + i %10;     // sum += i%10;
        }
        System.out.println(sum);    // 20   ----- ilk ögrendigimiz sekilden cok daha kolay.









    }
}
