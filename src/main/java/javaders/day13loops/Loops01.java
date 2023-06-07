package javaders.day13loops;

public class Loops01 {

    public static void main(String[] args) {

        // Example : 21 den 180 e kadar hem 4 hemde 6 ile bölünebilen tam sayilari console'a yazdiran code'u yazınız.

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " " );
            }
        }

        System.out.println();

        //Example : Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan characterleri büyük harfe donustur.

        // miami ==> MiAmI

        String s = "Miami";
                              //5
        for (int i = 0; i < s.length(); i++) {               //String ile calisirken index 0 dan baslat genelde.
            String ch = s.substring(i , i+1);                     //cahrAt kullanirsan UpperCase yapamazsin.
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

        //             ankara ==> AKR
        //Note : Bir string'de son index her zaman length()-1
        //Note : Yazdiginiz kod belli senaryolar icin calisiyor ancak tüm senaryolar icin calismiyorsa;
        //bu tarz koda ==> hard-code denir ==> ve mutlaka düzeltilmelidir

        // Example : Verilen bir String'de ilk 'a' harfinden onceki tum karakterleri yaziniz.
        // Hello Java  ==> Hello J yazacagiz.

        String t = "Hello Java";

        for (int i = 0; i < t.length(); i++) {     // Baslangic 0 i lengt den kucuk ve increment yap.

            char ch = t.charAt(i);                // Bu code bana karakteri verir.

            if (ch == 'a') {
                break;                          //Loop'u herhangi bir sarta gore kirmak icin break kullanilir.
                                                      // Eger karakter 'a' ise yazdirmayi birak
                                                   // break interview da sorulabilir.
                                             // Normalde lengt oldugu icin kelimenin sonuna kadar gidecekti
                                              // Ama break burda diger isleri yapma diyor.

            }
            else {                               // Degilse ekrana yaz.
                System.out.print(ch);
            }
        }

        System.out.println();


        // Example : Verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        // Tokatci ==> ict   tersten yaz.

        String u = "Tokatci";                  // Ters ten dedigi icin son index'e git son index'e gitmek icin
                                               // length-1 olmalidir.
        for (int i = u.length()-1; i >=0 ; i--) {   // Decrement yapicaz azala azala gidecek

            char ch = u.charAt(i);

            if (ch == 'a') {
                break;
            }
            else {
                System.out.print(ch);
            }
        }

        System.out.println();

        // Example : Verilen bir string de son 'a' dan önceki tum characterleri yazdiriniz
        // Tokatci ==> ict

        String k = "Tokatci";

        for (int i = 0; i < k.length(); i++) {

            char ch = k.charAt(i);
            if (ch == 'a') {
                break;
            }
            else {
                System.out.print(ch);
            }
        }

        System.out.println();


        int sum =0;
        for(int i=1; i<6; i++) {
            sum = sum + i;
        }
        System.out.println("Toplam: " + sum); //15

        System.out.println();


        int sum1 =0;
        for(int i=10; i>0; i=i-5) {
            sum1=sum1+i;
        }
        System.out.println(sum1);










    }//main
}//class
