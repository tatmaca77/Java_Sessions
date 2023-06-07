package practices.day_01_practice;

public class C01_BasamaklaraAyirma {

    public static void main(String[] args) {


        // 12345 sayısını rakamları toplamını bulunuz.

        int x = 12345;
        int birlerBasamagi = x %10; //5
        x = x/10; //1234
        int onlar = x %10; //4
        x = x/10; //123
        int yüzler = x%10; //3
        x = x/10; //12
        int binler = x%10; //2
        x = x/10; //1
        int onBinler = x%10; //1

        System.out.println(birlerBasamagi+onlar+yüzler+binler+onBinler);

        int y = 12345;

        int birler1 = y%10; //5

        int onlar2 = (y/10) %10 ;//4

        int yüzler2 = (y/100) %10 ;//3

        int binler2 = (y/1000) %10 ;//2

        int onBinler2 = (y/10000) %10 ;//1

        System.out.println(birler1+onlar2+yüzler2+binler2+onBinler2);


    }
}
