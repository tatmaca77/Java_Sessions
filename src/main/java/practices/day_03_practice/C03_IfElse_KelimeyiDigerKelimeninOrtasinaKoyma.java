package practices.day_03_practice;

import java.util.Scanner;

public class C03_IfElse_KelimeyiDigerKelimeninOrtasinaKoyma {

    public static void main(String[] args) {

        /*
Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
Eger İlk kelimenin karakter sayısı çift ise,
 ikinci kelimeyi birinci kelimenin ortasına koyun.
İlk kelimenin karakter sayısı tek ise, konsola
"ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
*/
        // Kadinlar       Günü     == KadiGününlar

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1.kelimeyi giriniz: ");
        String kelime = input.next();
        System.out.println("Lutfen 2.kelimeyi giriniz");
        String kelime2 = input.next();

        if(kelime.length() % 2 == 0){
            String ortas = kelime.substring(0, kelime.length()/2 );
            String ortas2 = kelime.substring(kelime.length()/2);
            System.out.println(ortas+kelime2+ortas2);

        }else if(kelime2.length() % 2 != 0){
            System.out.println("Ilk kelimenin ortasına ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }

    }
}
