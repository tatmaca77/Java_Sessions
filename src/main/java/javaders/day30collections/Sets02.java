package javaders.day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        /*********** INTERVIEW **********/
        
        // Example 1: ogrenci E-Mail adreslerini Natural Order'da siralanmis olarak depolayaniniz.

        //1.Yol
        long t1 = System.nanoTime();
        TreeSet<String> mails = new TreeSet<>();
        mails.add("abc@gmail.com");
        mails.add("abd@gmail.com");
        mails.add("abe@gmail.com");
        mails.add("abf@gmail.com");
        mails.add("abl@gmail.com");
        mails.add("abk@gmail.com");
        mails.add("abj@gmail.com");                          // Bu cözüm cok yavas calisir. !!!
        mails.add("abi@gmail.com");
        mails.add("abh@gmail.com");
        mails.add("abg@gmail.com");
        System.out.println("mails = " + mails);

        long t2 = System.nanoTime();
        
        //2.Yol This is the best Way
        HashSet<String> mailsHs = new HashSet<>();
        mailsHs.add("abc@gmail.com");
        mailsHs.add("abd@gmail.com");
        mailsHs.add("abe@gmail.com");
        mailsHs.add("abf@gmail.com");
        mailsHs.add("abl@gmail.com");
        mailsHs.add("abk@gmail.com");
        mailsHs.add("abj@gmail.com");                          // Bu cözüm cok daha hizli calisir. !!!
        mailsHs.add("abi@gmail.com");
        mailsHs.add("abh@gmail.com");
        mailsHs.add("abg@gmail.com");
        
        TreeSet<String> mailsHsTs = new TreeSet<>(mailsHs);
        System.out.println("mailsHsTs = " + mailsHsTs);
        long t3 = System.nanoTime();

        //HashSet benzersiz olduğu için öncelikle hashSet içine koyarız,sonra bunu treeSet e dönüştürürüz.
        //Böylece HashSet'in hızından faydalandıktan sonra TreeSet ile sıraya dizeriz.
        
     
        
        
        
        
        
        
        
        
        
        
    }
}
