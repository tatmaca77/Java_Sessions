package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // ********************** isEmpty () **************************\\

        /*
        isEmpty () bosmu dolumu diye bakar
         */


        // EX : Bir String'in hic karakter icermedigini gosteren kodu yaziniz


        String str ="";
        // 1.Yol lenght ()
        boolean bosMu = str.length()==0;
        //2 is yaptirildi lenght() + ==0 ile karsilastirma operatoru kullanildi
        System.out.println("bosMu = " + bosMu);//true
        // 2.Yol isEmpty ()
        boolean bosMu2 =str.isEmpty();
        // 1 is yaptirildi isEmpty() Makbul olan isEmpty() dir.
        System.out.println("bosMu2 = " + bosMu2);

        // Ex: Bir String'in bosluk haric hicbir karakter
        // icermedigini kontrol eden kodu yaziniz
        String str2 = "  ";
        // 1.Yol
        boolean result = str2.replace(" ","").length() ==0;
        System.out.println("result = " + result);

        // 2. Yol
        boolean result2 = str2.replace(" ","").isEmpty();
        System.out.println("result2 = " + result2);//true


        // Ex: Bir String'in "*" haric hicbir karakter
        // icermedigini kontrol eden kodu yaziniz
        String str3 = "*a";

        boolean rslt = str3.replace("*","").length()==0; // lengt ile isEmty ayni ise yarar.
        boolean rslt2 = str3.replace("*","").isEmpty();
        System.out.println("rslt = " + rslt);//true
        System.out.println("rslt2 = " + rslt2);//true


                           ///************** isBlank *************///

        /*
        isBlank == methodu String bir datada space + hiclik icin true dondurur.
                Bos mu dolu mu oldugunu kontrol eder. boolean bir deger döndürür.
                isEmpty den farki variable da sadece space varsa bos mu dolu mu diye soruldugunda
                isBlank == BOS der.
                isEmpty == Bos degil der.
         */
        
        //  String str2 = "  ";
        boolean rslt3 = str2.isBlank();
        System.out.println("rslt3 = " + rslt3); // true   
        // Cünkü isBlank bosluk oldugunu görür true der. 
        
        boolean rslt4 = str2.isEmpty();
        System.out.println("rslt4 = " + rslt4); // false verir. Burda Empty icin karakter olarak görür boslugu.
                                                // Bu yuzden false döndürür.


                   /// ********************** indexOf() ********************\\\
        /*
        indexOf() verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
                  int deger dondurur. Coklu data icin kullanildiginda ilk gordugu
                  datanin ilk karakterinin indexini verir. Olmayan bir karakterin
                  indexi sorulursa bize -1 dondurur. Olmayan bir datanin kacinci indexte oldugunu
                  sorgulatirsak bize -1 dondurur.
         */
        // EX : Bir String'de a,i,e karakterlerinin ilk gorunumunun indexleri toplamini ekrana yazdiriniz

        String s="Java is easy to learn";//1 +5 + 8 = 14
        int aIdx=s.indexOf('a');
        System.out.println("aIdx = " + aIdx);//aIdx = 1            // ilk göründügü indexini verir.

        int iIdx=s.indexOf('i');
        System.out.println("iIdx = " + iIdx);//iIdx = 5

        int eIdx = s.indexOf('e');
        System.out.println("eIdx = " + eIdx);//eIdx = 8
        System.out.println("indexler Toplami : " + (aIdx + iIdx + eIdx));
        //indexler Toplami : 14

        //  String s="Java is easy to learn";
        int pIdx = s.indexOf('p');//olmayan karakter sorgulanirsa -1 dondurur
        System.out.println("pIdx = " + pIdx);//pIdx = -1

        String s2="Java is easy to learn to easy to";
        int idx = s2.indexOf("to");
        System.out.println("idx = " + idx);//13

        // Ex : Bir String'de "Java " kelimesinin ilk olarak kacinci index'de oldugunu gosteren
        //kodu yaziniz
        String cumle="Ah Java vah Java sen ne guzel seysin Java";

        int indexJava=cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava);//indexJava = 3

        int indexQYX=cumle.indexOf("QYX");//-1
        System.out.println("indexQYX = " + indexQYX);//indexQYX = -1

        // ******************* lastIndexOf() *********************\\
        /*
        lastIndexOf ()  Verilen String bir datada istenilen
        degerin son gorunumunun indexini verir. Olmayan bir
        karakter sorgulanirsa -1 dondurur
         */

        // EX : Bir String'de a,i,e karakterlerinin son gorunumunun
        //      indexleri toplamini ekrana yazdiriniz    //40
        String c="Java is easy to learn";

        int aLast= c.lastIndexOf('a');//18
        System.out.println("aLast = " + aLast);

        int iLast=c.lastIndexOf('i');
        System.out.println("iLast = " + iLast);//5

        int eLast=c.lastIndexOf('e');
        System.out.println("eLast = " + eLast);//17

        int oLast = c.lastIndexOf('o');
        System.out.println("oLast = " + oLast);//14

        System.out.println("Toplam index : "+(aLast+iLast+eLast));//Toplam index : 40




    }//main
}//class







