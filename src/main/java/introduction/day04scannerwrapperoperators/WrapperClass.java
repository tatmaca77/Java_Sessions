package introduction.day04scannerwrapperoperators;

public class WrapperClass {

    public static void main(String[] args) {
        //primitive     : char  -     boolean- byte, short,  int,    long,  float,  double
        //Wrapper Class : Character - Boolean-  Byte- Short -Integer- Long -Float - Double

        //Wrapper Class'lar non-primitive'dir-. O yüzden Memory'de cok fazla yer kaplarlar.
        //Bu yüzden sart degilse Wrapper Class'lar kullanmayi tercih etmeyiz.
        //Böyle bir imkanin da haberdar olmaliyiz.

        //"n" yazip "nokta" koyarsaniz hic method göremezsiniz, cunku "primitive"'ler method icermez.
        int n = 12;
        //"m" yazip "nokta" koyarsaniz bircok method tipi görürsünüz, cünkü "Wrapp Class" 'lar method icerir.
        Integer m = 12;


        byte p = 13;
        Byte r = 13;

        //Ornek1 : short data type nin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Ornek 2 : int data type'nin  minimum degeri ile byte data type'nin maximum degerinin toplamini yaziniz.
        int intMin = Integer.MIN_VALUE;
        System.out.println("minInt = " + intMin);
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("maxByte = " + byteMax);

        System.out.println(intMin + byteMax); // -2147483521

        //Ornek 3 : 1)primitive int'i wrapper Integer'a ceviriniz.
        int num = 13;
        Integer wrapperNum = num;
        //primitive yani bir method bulunmayan bir kutudaki degeri alarak icinde
        //bazi methodlar bulunan Wrapper kutuya atama yaparsak bu isleme
        // ( "Autoboxing" ) denir.

        // : 2) Wrapper Byte'i primitive byte'a ceviriniz.
        Byte k = 33;
        byte primitiveK = k;
        //Wrapper bir kutu icinde bazi methodlarla birlikte bulunan degeri alarak
        //primitive yani method bulunmayan bir kutuya atama yaparsak bu isleme
        //( "Unboxing" ) denir.

        //Ornek 4 : 1) primitive char'i Wrapper Charachter 'e ceviriniz.
        char initial = 'T';
        Character initialWrapper = initial;
        // : 2)
        Boolean isOld = true;
        boolean isOldPrimitive = isOld;
    }//main}
}//class
