package javaders.day25polymorphismencapsulation;

public class Animal {

    /**
     1) Parent'daki method ile Child'da Override edilen method'un Access Modifier'lari ayni olabilir.
     2) Child'da Override edilen method'un Access Modifier'i Parent'daki method'un Access Modifier'dan
        dar olamaz. !!!
     3) Parent'daki method'un Access Modifier'i Child'da Override edilen method'un Access Modifier'dan dar olabilir.

     4) Method'un Return Type'i "primitive" ise Overriding yapildiginda "return type" degistirelemez.!!!
     5) Method'un Return Type'i "void" ise Overriding yapildiginda "return type" degistirelemez. !!!

     6)Child'da Override edilen method'un "return type" i ile Parent'taki "return type"i arasinda
       "IS-A" iliskisi varsa "return type" degistirilebilir. Aksi takdirde degistirilemez. !!!
        Mesela; Integer Wrapper Class ile Long Wrapper Class arasinda "IS-A" iliskisi yoktur, o yüzden
        return type Integer oldugunda Long'a degistirilemez. !!!

     7) Return Type Wrapper Class oldugunda, Overriding yaparken "return type" degistirilemez. !!!

        ****** INTERVIEW ****** 'de final method'lar gelir.
     8) "final method"lar Override edilemezler. !!!
         "final method"larin body'si degistirilemez, ama Override ederken method body'i degistiririz.
         Bu bir celiskidir, bu yüzden Java "final method"'larin Override edilmesine müsaade etmez.

     9) "static method"lar Override edilemezler. Cünkü "static method"lar tüm Child'lar icin ortak method'lar dir.
         Bir Child ortak method'u degistirdiginde diger Child'lar bundan etkilenir. Bu etkilenme ummadik sonuclar
         ortaya cikarabilir. Bu yüzden Java "static method"larin Override edilmesine müsaade etmez. !!!!
         "Main Method"ta bir static method'tur o da Override edilemez.

     10) "private method"lar Override edilemez. !!! Cünkü diger Class'ta o method'u göremeyiz bu yüzden kullanamayiz.
         Yani Override edemeyiz. !!!
     **/

    public void move(){
        System.out.println("Animals move...");
    }

    public int add (int a, int b){
        return a+b;
    }

    public Animal create (){     // Bu method'u kullanana bu Object'i ver diyoruz. !!!!
       return new Animal();       // Bu sekilde new keyword'u ile Object olusturuldu. Return etti.
    }                               // return ederken sayi da hayvan isim de object de return edebilirsin.

    public Integer multiply (Integer a, Integer b) {
        return a*b;
    }

    public final double circleArea(double r){
        return 3.14*r*r;
    }


}

