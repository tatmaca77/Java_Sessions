package practices.day_17_practice;

import java.io.FileInputStream;
import java.io.IOException;

public class C02 {

    // Bir tane txt dosyası olusturunuz.
    // txt dosyasının icerisine cumleler yazınız
    // Olusturdugunuz txt dosyasına ulasınız.
    // icerisindeki cumleleri yazdırınız
    public static void main(String[] args) {
        /**
        Bir kod yazılırken olası exceptionları ongorup exception olustugunda
        javanın ne yapmasını istedigimize karar vermeliyiz
        1- eger exception olustugunda kodun calısmaya devam etmesini istemiyorsak;
        main method isminin yanına olusabilecek exceptio'ı deklare ederiz
        2- eger exception olussada kodun calısmaya devam etmesini istiyorsak;
        sorun olusturabilecek kodu try blogunun icine yazmalıyız
        catch bloguna ise exception durumunda javanın ne yapmasını istedigimizi yazmalıyız
         */
        String dosyaYolu = "src/main/java/day_17_practice/dosya.txt";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }
        } //catch (FileNotFoundException e) {
        // e.printStackTrace();
        // System.out.println("yoluma devam ediyorum");
        // }
        catch (IOException e) {
            // e.printStackTrace();
            System.out.println("yoluma devam ediyorum");
        }
    }
}
/**
exceptionlar icin parent child iliskisi mevcuttur
eger bir kod icin birden fazla exception olusma ihtimali varsa
oncelikle olası exceptionlar parent child iliskisi tasıyor mu bakmamız gerekir
eger parent child iliskisi yoksa, istedigimiz sırada catch cumleleri olusturabiliriz
Eger parent child iliskisi varsa sadece parent exception'ı yazabiliriz
veya ikisini de yazmak istersek child'ı once paret'ı sonra yazmalıyız
 */
