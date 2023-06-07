package javaders.day13loops;

public class LoopsTraining {

    public static void main(String[] args) {

        //Ex : Verilen bir String'de kucuk harfleri yazmayiniz. Sadece buyuk harf ve digerlerini yazdir.
        //"Pwd12?Ab" == Password          P12?A


        String s = "Pwd12?Ab";

        for(int i = 0 ; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                continue;
            }
            else {
                System.out.print(ch);
            }
        } // for body


        //Ex : Interview sorusu !!!!!!!!
        // Bir String'i tersten yazdiran (Tokatci sorusu gibiydi) code'u yaziniz. veya (ters ceviren) code'u yaziniz.
        // Java ==> avaJ             Eger ters ceviren derse yeni bir bos String konteyneri olmalidir.

        System.out.println();

       // 1. WAY
        String s1 = "Tolga";
        String ters = "";

        for(int i = s1.length()-1 ; i>=0; i--){

            ters = ters + s1.substring(i , i+1);
        }
        System.out.print(ters);

        System.out.println();
        // 2. WAY

        String s2 = "Aysem";
        String ters2 = "";

        for (int i = s2.length()- 1; i >= 0 ; i--){

            ters2 = ters2 + s2.charAt(i);
        }
        System.out.print(ters2);



        System.out.println();



        // Ex : Bir tamsayi'nin rakamlari toplamini veren code'u yaziniz.   INTERVIEW !!!!!!
        //578 ==> 5+7+8 == 20,


        int n = -321;
        n = Math.abs(n);

        int sum = 0;

        for (int i = n ; i>0 ; i = i/10 ){

            sum = sum + i%10;
        }
        System.out.print(sum);


        System.out.println();



        // Example : 21 den 180 e kadar hem 4 hemde 6 ile bölünebilen tam sayilari console'a yazdiran code'u yazınız.
        
        
        for (int i = 21; i < 181 ; i++){
            System.out.println(i + " ");
        }
        System.out.println();

        //Example : Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan characterleri büyük harfe donustur.


        String j = "Tolgahan";
        //5
        for (int i = 0; i < j.length(); i++) {               //String ile calisirken index 0 dan baslat genelde.
            String ch = j.substring(i , i+1);                     //cahrAt kullanirsan UpperCase yapamazsin.
            // Bu yüzden tikanirsin cözemezsin. substring daha iyidir.
            // String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {

                // s = s.replace(ch, ch.toUpperCase());    //Butun gordugu karakterleri buyuk yapar. Ama ben digerini m istiyom.
                // Tolga yapsan olur ama tekrarli harflerde hata verir.
                System.out.print(ch.toUpperCase());
            }
            else {
                System.out.print(ch);
            }

        }

        System.out.println();



        // Example : Verilen bir String'de ilk 't' harfinden onceki tum karakterleri yaziniz.
        // Tolgahan Atmaca  ==> Tolgahan A yazacagiz.

        String str = "Tolgahan Atmaca";
        for (int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);
            if( ch == 't'){
                break;
            }else {
                System.out.print(ch);

            }

        }


















    }// main body
}// class body
