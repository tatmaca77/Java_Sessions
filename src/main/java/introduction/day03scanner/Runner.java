package introduction.day03scanner;

public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturulur ?
        //Class ismi   +  Object Ismi  +  Assignment Oprator  + "new"  +  Constructor
              Car           myCar               =              new        Car();

              //"new" keyword'u sifirdan yeni bir object olusturmak icin kullanilir.
        //Constructor Java da nesneleri olusturmak icin kullanilan özel bir method'dur.

        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model );


        myCar.hareket();
        myCar.dur();

        Student tolgahanAtmaca = new Student();

        System.out.println("tolgahanAtmaca.name =" + tolgahanAtmaca.name);
        System.out.println("tolgahanAtmaca.address = " + tolgahanAtmaca.address);
        System.out.println("tolgahanAtmaca.grade = "+ tolgahanAtmaca.grade);

        tolgahanAtmaca.feed();
        tolgahanAtmaca.study();


        byte grade = tolgahanAtmaca.grade ;
        System.out.println("grade = " + grade);
        








    }

}
