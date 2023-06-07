package practices.day_02_practice;

public class Q04_Hipotenus {
    //Hipotenüs hesaplayan bir kod yazınız.

    public static void main(String[] args) {

        //System.out.println(Math.sqrt(16));

        System.out.println(hipotenusHesapla(3, 4));

    }

    public static double hipotenusHesapla(double dikKenar1, double dikKenar2) {

        double hipotenus = Math.sqrt(dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);

        return hipotenus;

    }

}


//public static double hipotenusHesapla(double x, double y) {
//
//       return Math.sqrt(x*x+y*y);