package practices.day_01_practice;

public class C03_Ascii {

    public static void main(String[] args) {

        // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız

        /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77
          N ==> 78           O ==> 79

        */

        char ilkKarakter = 'B'+1; // C yi elde etmis oluruz.
        char ikinciKarakter = 'D'+1; // E
        char ucuncuKrakter = 'N'-1; // M

        System.out.println("CEM : " + ilkKarakter + ikinciKarakter + ucuncuKrakter);




    }
}
