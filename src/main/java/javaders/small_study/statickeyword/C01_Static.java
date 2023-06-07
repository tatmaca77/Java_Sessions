package javaders.small_study.statickeyword;

public class C01_Static {
    /*
    bir static birde non-static(instance) variable olusturun ve arasindaki farklari bulun.
     */

    static int sayi = 15;
    int rakam = 6;

    public static void main(String[] args) {

        System.out.println(sayi); // 15
       // System.out.println(rakam);

        C01_Static obj1 = new C01_Static();
        System.out.println(obj1.rakam); // 6
        obj1.rakam = 8;
        obj1.sayi = 57;
        System.out.println(obj1.sayi); //57
        System.out.println(obj1.rakam); //8
        C01_Static obj2 = new C01_Static();
        System.out.println(obj2.sayi);//57
        System.out.println(obj2.rakam); // 6

    }
}

