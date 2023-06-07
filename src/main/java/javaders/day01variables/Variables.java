package javaders.day01variables;

public class Variables {

    //byte, short, int, long, double, float
    // veri tiplerinin max ve min degerlerini yazdiralim.

    public static void main(String[] args) {

        byte byteMax = Byte.MAX_VALUE; //
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMax :" + byteMax);
        System.out.println("byteMin : " + byteMin);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMax : " + shortMax);
        System.out.println("shortMin : " + shortMin);

        int intMax = Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);
        int intMin = Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        long longMax = Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);
        long longMin = Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println("doubleMax : " + doubleMax);
        System.out.println("doubleMin : " + doubleMin);

        float floatMax = Float.MAX_VALUE;
        System.out.println("floatMax = " + floatMax);
        float floatMin = Float.MIN_VALUE;
        System.out.println("floatMin = " + floatMin);

        //ctrl+z==>geri al

    } //main body

} // class body

