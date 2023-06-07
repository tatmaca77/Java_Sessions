package introduction.day01variables;

public class VariablesTekrar {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int              sayi                        =                            31                        ;
       //data turu       variable ismi           Assignment Operator        variable degeri            statement sonu
        System.out.println(sayi); // 31
         sayi = 23;
        System.out.println("sayi = " + sayi); // 23
        
        int sayi1 = 65 ; 
        // sayi ve sayi1 degerlerini toplayip iki ile carpin ve yeni bir deger atayip yazdirin. 
        int toplam = (sayi+sayi1)*2;
        System.out.println("toplam = " + toplam);


        // Önce Vriable olusturup sonra deger atamsi yapabiliriz.!!!!!

        String isim;
        boolean ogrenciMi;

        isim = "Tolgahan";
        ogrenciMi = true ;
        System.out.println(isim);
        System.out.println(ogrenciMi);

        int yas = 30;
        yas = 31;
        yas = 32;

        // Ayni data type de birden fazla variable tek komutla deklare edilebilir.

        int gun,ay,yil;
        gun=21;
        ay=02;
        yil=2023;
        System.out.println(gun+ay+yil); // 2046 toplam deger aldi.
        System.out.println(gun+"\n"+ay +"\n"+yil) ; // alt alta yazdirir.
        System.out.println(gun+" "+ay +" "+yil); // yan yana yazdirir.
        //System.out.println(gun+ay+yil); // böyle bir method yoktur ve hata verir.

        int gun1=1,ay1=1,yil1=2023;
        System.out.println(gun1+" "+ ay1  +" "+ yil1 );


    }//main
}//class
