package practices.day_05_looparrays;

public class Interview_Sorusu_Maymun_Sorusu {

    public static void main(String[] args) {

        /* INTERWIEW SORUSU

             Adada yalnız bir maymun var
             Her gün 4 muz yemesi gerekiyor
             o adada sadece 165 muz var
             Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
         */

        int numberOfBananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;

        do{
            numberOfBananas -= 4;    // toplam Muz sayisindan her gün 4 muz eksilir.
            System.out.println("Kalan Muz sayisi" + numberOfBananas);
            survivalDays++;

            if (numberOfBananas < 4){
                monkeyAlive = false ;
                System.out.println("Bugün" + survivalDays + ".Yeterli Muz kalmadi ve Maymun rahmetli oldu." );
            }
            else {
                System.out.println("Bugün" + survivalDays + ".gün; Maymun hala hayattadir.");
            }
        }while (monkeyAlive);
    }
}
