package replit_questions.if_else;

public class Kelimeyi_Ortaya_Ekleme {

    public static void main(String[] args) {

        /*
        2 kelime oluşturun: isim1 ve isim2

        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor
         */

        String isim1 = "mehmet";
        String isim2 = "ahmet";

            if (isim1.length() % 2 == 0){
                int middleIndex = isim1.length() / 2;
                String yeniIsim = isim1.substring(0, middleIndex) + isim2 + isim1.substring(middleIndex);
                System.out.println(yeniIsim);
            }
            else{
                System.out.println("isim1, isim2 ye eklenemiyor");
            }






    }
}
