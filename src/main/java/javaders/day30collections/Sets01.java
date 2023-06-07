package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    /**
     1) Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
     2) 3 tane Set Class vardir.
        i) HashSet Class:
            a)"Hash" benzersiz ID olusturma teknigidir. Bu teknige "Hashing Technique" denir.
            b)"HashSet" elemanlari rastgele siralar.
            c)"HashSet" elemanlari rastgele siraladigindan dolayi cok hizli calisir.
            d)"HashSet" ler "null" i eleman olarak kabul eder.
            e)"HashSet"ler tekrarsiz eleman depolamak icindir.
        ii) LinkedHashSet Class:
            a)"LInkedHashSet"ler elemanlari sizin verdiginiz siraya göre dizdiklerinden(insertion order) "HashSet"lere göre daha yavastir.
            b) "LinkedHashSet"ler tekrarsiz eleman depolamak icindir.
        iii) TreeSet Class:
            a)"TreeSet"ler elemanlari Natural Order'a göre dizerler.
            b) "TreeSet"ler elemanlari Natural Order'a göre dizdiklerinden dolayi cooookkk yavastirlar. Mecbursa kullanilir.
            c) En yavas Set Class "TreeSet" dir.
     3) TreeSet cok yavas oldugundan mümkün oldugu kadar TreeSet kullanmamaya calisiriz.
     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cüneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cüneyt"); // Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler.
        hs.add(null); // sakin cift tirnak icine koyma !!!
        hs.add(null); // null yazinca her zaman onu ilk index'e koyar.
        System.out.println("hs = " + hs); //  [Zeki, Ajda, Cüneyt, Esra, Ezel]  rastgele siraladi.
        System.out.println(hs.hashCode()); // -2131540013 Bu HashSet'im icin bir ID üretmis oldu.

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);
        lhs.add(null);
        System.out.println("lhs = " + lhs); // [234, 87, -32, 124, null]
        
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println("ls = " + ls); // [451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs); // [87, 124] ==> Ilk LinkedHashSet'deki farkli elemanlar silindi. Ortak elemanlari yazdirir.
        System.out.println(ls); // [451, 87, 231, 124]

        TreeSet<Character> ts = new TreeSet<>();
        
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //ts.add(null); TreeSet'lere null eklenmez. Cünkü Java elemanlari alfabetik siraya koyar. null nereye koyacak bilemez.
        System.out.println("ts = " + ts); // [A, G, R, U, Z]

        System.out.println(ts.first()); // A
        System.out.println(ts.last()); // Z

        System.out.println(ts.lower('R')); // G ==> R den önceki yani r den asagidaki elemani verir.
        System.out.println(ts.lower('D')); // Elemanlar icinde yoksa da kullanilir D den önceki elemani yazdirir.
        System.out.println(ts.lower('A')); // null verir.

        System.out.println(ts.higher('K')); //R ==> Verilen K'den sonraki elemani verir.

        System.out.println(ts.headSet('R')); // [A, G] ==> R den öncekileri Set olarak ver. R ye kadar yaz. R haric
        System.out.println(ts.headSet('R',true)); // [A, G, R] R yi dahil et dedim.

        System.out.println(ts.tailSet('G')); // [G, R, U, Z] Parantez icindeki dahildir. Sonrakileri yazdirir.
        System.out.println(ts.tailSet('G',false)); // G yi dahil etme dedim. [R, U, Z]

        System.out.println(ts.ceiling('R')); // R ==> Eleman Set icinde varsa eleman'in kendisi return eder.
        System.out.println(ts.ceiling('K')); // R ==> Eleman Set icinde yoksa sonraki elemani return eder.

        System.out.println(ts.floor('G')); //G ==> Eleman Set icinde varsa eleman'in kendisi return eder.
        System.out.println(ts.floor('J')); //G ==> Eleman Set icinde yoksa önceki elemani return eder.

        System.out.println(ts.subSet('G', 'Z')); // Ilk eleman dahil ikinci eleman harictir. [G, R, U]
        System.out.println(ts.subSet('G', false,'Z',true)); // [R, U, Z]



        






    }
}
