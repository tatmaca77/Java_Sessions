package javaders.day23inheritance;

public class Animal {
    /**
      1) eat(){} method'u gibi bir cok Class'in kullanmasi gereken method'lari her class'a ayri ayri
         yazarsak :
         i)Tekrar yapmis oluruz,tekrar ideal code'da olmamalidir.
         ii)Ayni method'u tekrar tekrar yazmak zaman kaybidir.
         iii)Tekrar tekrar yazilan method'un tamiri cok zaman alir.
         iv)Tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir.
         v)Method'u tekrar tekrar yazmak "atomic" yapiya terstir.

      2) private class member'lar child class'lar tarafindan kullanilamaz.!!!
         public class member'lar child class'lar tarafindan kullanilabilir.!!!
         default class member'lar ayni Package 'de child class'lar tarafindan kullanilabilir.!!!'
         protected class member'lar farkli Packagade de olsalar child class'lar tarafindan kullanilabilir. !!!!

     3) Java'da bir Class'in sadece bir tane parent'i olabilir.
        Coklu Parent kullanimina "Multiple Inheritance" denir, tekli Parent'a "Single Inheritance" denir.
        Java "Multiple Inheritance"'i desteklemez, Java "Single Inheritance" kullanir.

     4) Apartman seklindeki inheritance yapisina "Multilevel Inheritance" denir.
        Java "Multilevel Inheritance"'i destekler.

     **/

     protected void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }


}
