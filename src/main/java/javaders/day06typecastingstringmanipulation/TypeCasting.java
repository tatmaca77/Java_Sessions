package javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        ///************ ( Explicit Narrowing ) ***********/// Büyük datayi kücük icine yerlestirmek icindir.

        /*
        ( Explicit Narrowing ) yaparken dikkat edilmelidir. Cünkü cok ciddi Data kaybi hatta Data'nin degismesine
        neden olabilir. Eger sayimiz dönüstürmeye calistigimiz variable'in sinirlari disinda ise Java sayiyi 'mod'
        islemine alir ve kalani yazdirir.
        Kalan bölenin yarisindan fazla ise kalan sayiyi Java kucultmek ister ve bolumu 1 büyüterek kalani
        (-) isaretli olacak sekilde yazdirir.

         */

        // short data type'inde variable olusturup byte data type'ina ceviren kodu yaziniz.
        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte); //4
        // byte data type' icinde 127 -128 e kadar ve 1 var. Ücünü topla veriye bölüp kalani al.
        // 127 + 128 + 1 == 256   ---- 260/256 == kalan 4 oldugu icin bize 4 verdi. 
        short num1 = numByte;
        System.out.println("num1 = " + num1); // Bu islemden sonra tekrar dönüstürüp short'a koysan bile 
                                              // ilk veri gider yine 4 verir. 
        
        short num2 = 1023 ; 
        byte num2Byte = (byte) num2;
        System.out.println("num2Byte = " + num2Byte); // -1'dir.  
                                                      // 1023 / 256 == kalan 255 falan kalir cok büyüktür yani. 
                                                      // 256 tane data vardir. byte in toplam degerleridir.
                                                      // Eger yaridan fazla ise kalan 1 fazlaya tamamlar. 
        short num3 = 1000;
        byte num3Byte = (byte) num3;
        System.out.println("num3Byte = " + num3Byte); // -24  -- 3'e degil 1 fazla yaparsin 4'e bölersin kalani alirsin.
                                                      // 1000/256 == -24 kalan. 
        
        int intSayi = 8880;
        short shortSayi = (short) intSayi; // -32768 ile 32678 arasinda ve bir tanede 0 datasi vardir.
                                           // 32678+32678+1 olur.
        System.out.println("shortSayi = " + shortSayi); // Aynisini yani 8880 olarak görürüz.
                                                        // Cünkü data degerinin aynisini icinde barindirir.
                                                        // Herhangi bir aralik tasmasi olmaz !!!!

    }//main
}//class
