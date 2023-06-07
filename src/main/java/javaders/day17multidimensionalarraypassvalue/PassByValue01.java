package javaders.day17multidimensionalarraypassvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
            1) Access Modifier
            2) Return Type
            3) Method Ismi
            4) Method Parantez
            5){} Method'un body'si
         */

        /** Note : "Main Method" 'un icindeki tum method'lar static olmalidir.
         Bir Method'u Static yapmak icin method'a static yapmalisin.

         Pass by Value :
         1) Java "Pass by Value" kullanir.
         2) Yani; Java Method'larin orginal degeri degistirmesine izin vermez.
         3) Java method'lara deger yollarken orginal degerin kopyasini olusturur ve o kopyayi method'a yollar
            Method kopya deger üzerinde degisiklik yapar, boylece orjinal deger korunmus olur.
         4) Java esnek bir dil'dir.
         **/

        /** Pass by Reference :
         1) Pass by Reference da method'a reference yollanir.
         2) Rference adres demektir. Adres yollaninca method adresi kullanarak orjinal degerer ulasir ve
         orjinal degeri degistirir. Bu yüzden "C#" gibi Pass by Rference kullanan dillerde method variable'in orjinal
         degerini degistirir.
         **/

        int shirtPrice = 200;        // OLusturulan method'u Main Method'ta kullanmak istersen "static" yapmalisin.

        System.out.println(discount("student", shirtPrice)); // 180

        System.out.println(shirtPrice); // 200  - // Bu method'lari kullansan bile deger degissede orginal deger aynidir.
                                                 /** Bunun adina da PASSBYVALUE denir. **/
                                                 //C Sharp dilinde passbyvalue yoktur ve orginal deger hep degisir.

        shirtPrice = discount("veteran", shirtPrice); // Bu sekilde orjinal degeri istersek degistirebiliriz.
        System.out.println(shirtPrice); // 160
    }

    // Discount Method'u olusturunuz.
    public static int discount(String type , int price){

        switch (type){
            case "student" :
                price = price -20;
                break;
            case "veteran" :
                price = price -40;
                break;
            case "senior" :
                price = price -30;
                break;
            default :
                price = price;
        }
        return price ;

    }

}
