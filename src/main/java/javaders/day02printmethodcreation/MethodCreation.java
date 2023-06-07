package javaders.day02printmethodcreation;

public class MethodCreation {


    public static void main(String[] args) {

        //static == protokol tribunu

        //Karenin alanini veren kodu yaziniz.
        kareninAlani (7); //return type void oldugunda döndürdügü herhangi bir deger olmaidigi icin,
                             // sadece ekrana bastirdigi icin toplama cikarma gibi islem yapamayiz.
                            //Method sonucunda ortaya cikan datayi kullanamayiz. Sadece ekranda görürüz.

        //Dikdortgenin alanini veren kodu yaziniz.
        System.out.println( " Dikdortgenin Alani " + (dikdortgeninAlani(11, 12)+2)); // Dikdortgenin Alani 132

        /*
        Return Type'i int oldugu icin bir deger dondurur ve bu degeri kullanabiliriz. Toplama cikarma gibi
        elde edilen datayi kullanabiliriz.
         */


    }//main

    private static int dikdortgeninAlani(int a, int b) {

        return a*b; //carpmanin sonucunu kullaniciya verdim.
    }

    private static void kareninAlani(int i) {

        System.out.println("Karenin Alani : " + (i*i)); // Karenin Alani : 49
    }//main




}//class
