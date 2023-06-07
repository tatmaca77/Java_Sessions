package practices.day_14_practice;

public class C02_Overloading {

    public static void main(String[] args) {
        // Aynı classta ayni isimde method olusturunuz
        /*
         aynı classta, aynı isimde method olusturmak icin;
         1-) parametrelerin data turleri degistirilebilir
         2-) parametrelerin sayısı degistirilebilir
         3-) parametrelerin data turleri farklı oldunda, parametrelerin yeri degistirilebilir.
         */
        toplama(55,66);
        toplama(2.3,4.5);
        carpma(1,2,3);
        carpma(1,2,3,4);
        cikartma(3.7,1.3f);
        cikartma(1.3f, 3.7);
    }
    // 1-) parametrelerin data turleri degistirilebilir
    private static void toplama(int a, int b){
        System.out.println("iki int deger toplandı: " + (a+b));
    }
    private static void toplama(double a, double b){
        System.out.println("iki double deger toplandı: " + (a+b));
    }
    // 2-) parametrelerin sayısı degistirilebilir
    private static void carpma(int a, int b, int c){
        System.out.println("uc int deger carpıldı: " + (a*b*c));
    }
    private static void carpma(int a, int b, int c, int d){
        System.out.println("dort int deger carpıldı: " + (a*b*c*d));
    }
    // 3-) parametrelerin data turleri farklı oldunda, parametrelerin yeri degistirilebilir.
    private static void cikartma(double a, float b){
        System.out.println("ilki double, ikincisi float cıkartma islemi yapıldı: " + (a-b));
    }
    private static void cikartma(float b, double a){
        System.out.println("ilki float, ikincisi double cıkartma islemi yapıldı: " + (a-b));
    }
}
