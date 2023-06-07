package practices.day_02_practice;

public class Q04_Hipotenustekrar {
    //Hipotenüs hesaplayan bir kod yazınız.

    public static void main(String[] args) {

        System.out.println(hipotenusHesapla(5,12));

    }

    public static double hipotenusHesapla(double dikKenar1, double dikKenar2) {


        double hipotenus = Math.sqrt(dikKenar1*dikKenar1 + dikKenar2*dikKenar2 );

        return hipotenus;
        //       return Math.sqrt(x*x+y*y);

    }




}
