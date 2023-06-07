package practices.day_02_practice;

public class Q03_Ortalamatekrar {
    /*
   double num1 = 31.4;
   double num2 = 54.0;
   double num3 = 19;
   double num4 = 457.3;
   double num5 = 106;

  Bu sayıların ortalamasını hesaplayan bir kod yazınız.
*/
    public static void main(String[] args) {
        double num1 = 31.4;
        double num2 = 54.0;
        float  num3 = 1.78F;
        double num4 = 457.3;
        double num5 = 106;

        double toplam = num1+num2+num3+num4+num5 ;
        double ortalama = toplam/5;
        System.out.println("ortalama = " + ortalama);
        System.out.println(num1+num2+num3+num4+num5/5);



    }






}
