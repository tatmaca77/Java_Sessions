package javaders.day22stringbuilder;

public class Sb02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println("sb1 = " + sb1); // Java is easy

        sb1.reverse();  // loop ile de kelimeyi ters cevirmistik !!!!!!
        /** String'in ters cevrilmesi loop'lar ile de yapilir, bu kisa bir yoldur. **/
        System.out.println("sb1 = " + sb1); //  ysae si avaJ

        // Her kullandigin method son hali ile islem yapar. Son hali hep degiskendir bu yüzden zordur.
        sb1.deleteCharAt(6); /** Verilen index'deki character'i siler. **/
        System.out.println("sb1 = " + sb1); // ysae s avaJ

        sb1.delete(4,7); /** Baslangic index'inden(dahil) bitis index'ine kadar(haric) olan character'leri siler. **/
        System.out.println("sb1 = " + sb1); // ysaeavaJ

        /** replace(2, 5, "X") ==> 2 dahil, 5 haric ==> index 2, 3, ve 4 deki characterler yerine "X" koyar. **/
        sb1.replace(2,5,"X");
        System.out.println("sb1 = " + sb1); // ysXvaJ  // 3 karakter yerine daha fazla veya daha az karakter koyabulirsin.
        
        sb1.insert(3,"2023"); /** Ilk 3 karakteri es gec arasina 2023 yaz demektir. **/ 
        System.out.println("sb1 = " + sb1); // ysX2023vaJ
        
        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        
        sb2.compareTo(sb3);
        int r = sb2.compareTo(sb3); /**  Alfabetik olarak karsilastirir. **/
        System.out.println("r = " + r); // 0  ==> Alfabetik olarak ayni siradalar demektir.
        
        StringBuilder sb4 = new StringBuilder("Java");
        StringBuilder sb5 = new StringBuilder("Kava");
        
        int r1 = sb4.compareTo(sb5); /** J harfi K dan öncedir , bu yüzden -1 olarak sonuc aldik. **/
        System.out.println("r1 = " + r1); // -1 verir.

        StringBuilder sb6 = new StringBuilder("Kava");
        StringBuilder sb7 = new StringBuilder("Java");

        int r2 = sb6.compareTo(sb7); /** K harfi J den öncedir ; bu yüzden 1 sonucunu verir. */
        System.out.println("r2 = " + r2); // 1 verir.
        /** Yani Sonuc mesela -3 ise, sb1, sb2 den alfabetik olarak 3 harf önce demektir. !!!! **/
        /** Yani Sonuc mesela  3 ise, sb1, sb2 den alfabetik olarak 3 harf sonra demektir. !!!! **/


        /** Java burda character'lerle calisirken Ascii degerleriyle karsilastirma yapar, yani kücük j harfi ile büyük J harfi arasinda
         * fark vardir.
         Bütün kücük harfler , büyük harflerinden 32 sayi fazladir. !!!!!!**/
        StringBuilder sb8 = new StringBuilder("java");
        StringBuilder sb9 = new StringBuilder("Java");
        
        int r3 =sb8.compareTo(sb9);
        System.out.println("r3 = " + r3); // 32

        StringBuilder sb10 = new StringBuilder("Jcva");
        StringBuilder sb11 = new StringBuilder("Java");

        int r4 = sb10.compareTo(sb11);
        System.out.println("r4 = " + r4); // 2 verir. Cünkü ilk harfler aynidir 2. harflere bakar ve c-a dan 2 sonradir.

        String str = sb11.toString().toUpperCase(); /** Bu Method ile StringBuilder dan String'e gecis yapmis oluruz.
                                                ve bütün String methodlari kullanabiliriz **/
        /** StringBuilder'larda sadece method kullanmak orjinal degeri degistirirken
         * String'lerde atama yapmam gerekiyor. Bu örnekte bunu görürüz. **/
        System.out.println(str); // JAVA --- String
        
        StringBuilder newSb11 = new StringBuilder(str);
        System.out.println("newSb11 = " + newSb11);  // JAVA --- StringBuilder
        /** Bu örnekte StringBuilder nasil String'e cevrilir veya String nasil StringBuilder olur ? **/


        StringBuilder tolga = new StringBuilder("Tolga");
        char[] ch = new char[] {'J','A','V','A'};
        tolga.append(ch);
        System.out.println(tolga);










    }
}
