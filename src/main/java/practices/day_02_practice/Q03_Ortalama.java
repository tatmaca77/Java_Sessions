package practices.day_02_practice;

public class Q03_Ortalama {

/*
   double num1 = 23.4;
   double num2 = 24.0;
   double num3 = 12;
   double num4 = 450.3;
   double num5 = 100;

  Bu sayıların ortalamasını hesaplayan bir kod yazınız.
*/

    public static void main(String[] args) {
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        double toplam = num1+num2+num3+num4+num5;
        double ortalama = toplam/5;
        System.out.println("ortalama = " + ortalama);
        //System.out.println((num1+num2+num3+num4+num5)/5);


    }

}
