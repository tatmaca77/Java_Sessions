package javaders.day22stringbuilder;

/** Tester icin bu konulari mantik olarak bilmek yeterlidir. CODE yazmaya gerek yoktur. !!!!! **/

public class Sbf01 {

    /*
       1) StringBuffer Java'da String üreten bir Class'tir.
       2) StringBuffer, StringBuilder'a cok benzer, yani ikiside "mutable String" üretir.
       3) StringBuffer "multi-thread" (coklu is yapilabilir) dir ama StringBuilder "multi-thread"(coklu is olmaz) degildir.
       4) Java StringBuffer'i StringBuilder'dan önce olusturulmustur.
       5) StringBuilder "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir.
       6) "multi-thread" yapilirken yapilan islerin siralamasi onemlidir, yapilan isleri mantikli siraya koymak
          "synchronization" olarak adlandirilir.
          StringBuffer "multi-thread" oldugu icin ayni zamanda "synchronized"dir.
     */

       /** 3 tane String olusturan Class ögrendik.

      1) immutable String lazimsa ; String CLass
      2) mutable String lazimsa; StringBuilder veya StringBuffer
                                 i) StringBuilder'i multi thread gerekmezse kullaniriz.
                                 ii) StringBuffer'i multi thread gerekirse kullaniriz.

     **/
    public static void main(String[] args) {

        StringBuffer sbf1 = new StringBuffer("Java");

        sbf1.append('t');
        System.out.println("sbf1 = " + sbf1); // Javat

    }
}
