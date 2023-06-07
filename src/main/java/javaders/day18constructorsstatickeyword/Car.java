package javaders.day18constructorsstatickeyword;

/**
   1) Constructor nasil olusturulur ?
       Access Modifier + ClassName + ()  + {}

   2) Method ile Constructor arasindaki farklar nelerdir ?  // ***** INTERVIEW Sorusu *****
        i) "Method"larda Return Type olur, " Constructors" da olmaz.
        ii) "Method"lar yaptiklari ise göre isimlendirilirler,"Constructor"lar ise her zaman Class ismi ile isimlendirilirler.
        iii) "Method"lar bir aksiyon yapmak icin olusturulur, "Constructor"lar ise Object olusturmak icindir.
        iv) "Method" isimleri kucuk harfle baslar , "Constructor"isimleri Class ismi ile ayni old.icin buyuk harfle baslar.

   3) Parametreli Constructor'lar olusturarak ayni Class'tan farkli özelliklere sahip object'ler olusturabiliriz.

 **/

public class Car {

        String make = "Honda";
        String model = "Accord";
        int year = 2021;
        int price = 18000;

        /** Default Constructor **/
        /** Default Constructor'lar parametre kullanmazlar. Yani parantez ici bos kalir. **/
        /** Default Constructor'larin body kismi bostur. **/
        /** Java kiskanc'dir. Siz Default Constructor'i elle yazdiginizda Java Object Class icindeki
         /** default Constructor'i kullandirtmaz. **/
        public Car (){

        }

        /** Custom Constructor **/
        public Car(String make, String model, int year, int price) {   // Sil sag tikla generate git cons sec hazir gelir.Intelij verir.
                this.make = make;
                this.model = model;
                this.year = year;
                this.price = price;
        }

        /** Kendim Ürettigim icin  bu da /** Custom Constructor 'dir. **/
        public Car(String make) {
                this.make = make;
        }

        public Car(String make, int price) {  // Sag tikla generate git constructor sec istedigin kombinasyonu sec.
                this.make = make;
                this.price = price;
        }





}
