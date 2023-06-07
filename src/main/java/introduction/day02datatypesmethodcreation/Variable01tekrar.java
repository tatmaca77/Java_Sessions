package introduction.day02datatypesmethodcreation;

public class Variable01tekrar {

    public static void main(String[] args) {

        char ch = '?';
        System.out.println(" Kitap okuyor mu" +ch); // birlestirir Concat yapar.
        System.out.println(5+ch); // Ascii degeri alir. Cünkü int deger ile yazmak istersen toplama yapar.
        System.out.println(5+" " +ch);
        boolean ogrenciMI = true;
        System.out.println("ogrenciMI = " + ogrenciMI);
        byte by =35;
        System.out.println(by);
        int number = 128;
        byte number2 = (byte) number;  // byte bir degere int deger veremeyiz . Istersek Explicit Narrowing yapmaliyiz.
        System.out.println(number);
        short sh = 27;
        System.out.println(sh);
        long lo = 251323211L;
        float fl = 15.6F;
        double dd = 13;
        System.out.println("dd = " + dd); // int deger girsek bile bize double döndürür. 13.0
        // int number2 = number+dd
        System.out.println(by+number2+sh+lo+fl+dd); // double bir sonuc döndürür.



    }//main
}//class
