package introduction.day04scannerwrapperoperators;

public class WrapperClassTekrar {

    public static void main(String[] args) {


        // primitive int'i Non-Primitiv'e ceviriniz.

        int a = 31;
        Integer b = a;  // Autoboxing

        // Wrapper Double 'i primitiv'e cevirinniz.

        Double c = 2.12;
        double d = c;  // Unboxing

        /*
        short data taype'nin en büyük degeri ile int data type'nin en kücük degerlerini toplayniz.
        */
        short shortMax = Short.MAX_VALUE;
        double doubleMax = Double.MAX_VALUE;
        System.out.println("doubleMax+shortMax = " + shortMax+ doubleMax);

        char karakter = 'T';
        Character ayniKarakter = karakter;
        System.out.println("ayniKarakter = " + ayniKarakter);
    }//main
}//class


