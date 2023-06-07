package javaders.lambda.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastChar(names)); // [MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]
        System.out.println();
        System.out.println(sortWithLastChar2(names)); // [ALEX, TOM, MICHAEL, MARY, ALEXANDER, JIM]
        System.out.println();
        System.out.println(sortWithLengthReversed(names)); // [alexander, michael, alex, alex, mary, jim, tom]
        System.out.println();
        System.out.println(isLengthMoreThanTwo(names)); // true
        System.out.println();
        System.out.println(nonLengthLessThanThree(names)); // true
        System.out.println();
        System.out.println(atLeastOneLengthLessThanFour(names)); // true



    }

    //Exmaple 1 : List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle List olarak yaziniz.
    //           [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]
    public static List<String> sortWithLastChar(List<String> names) {
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toList());
    }

    public static Set<String> sortWithLastChar2(List<String> names) {
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toSet());
        /** Normalde distinct elemanlari depolamak icin Set kullanilir. Ancak Lambda'daki toSet(); methodu
            elemanlari rastgele siralar, halbuki bu soruda rastgele siralama kabul edilmioyor.
            Bu yüzden mecburen collect(Collectors.toList()); */
    }

    // Example 2 : List elemanlarini karakter sayilarina göre ters sirada kucuk harfle List icinde yaziniz.
    // Ayni karakter sayisina sahip elemanlar kendi iclerinde alfabetik sirada olsun.
     // [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [Alexander, Michael, Alex, Alex, Mary, Jim, Tom]

    public static List<String> sortWithLengthReversed (List<String> names) {
        return names.
                stream().
                map(String ::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
    }

    //Example 3: List elemanlarinin tamaminin charachter sayisinin 2 den büyük olup olmadigini kontrol eden methodu yaz.

    /** allMatch(); methodunu iyi ögren Tester'lar cok kullanirlar.*/

    public static boolean isLengthMoreThanTwo (List<String> names){
        return names.
                stream().
                allMatch(t->t.length() > 2);
        /** //allMatch() methodu tum elemanlarda verilen sarta gore karsilastirma yapar.Tamami ortusuyorsa true degilse false verir */
    }

    // Example 4 : List elemanlarinin hicbirinin charachter sayisinin 3 den kucuk olup olmadigini kontrol eden method.
    public static boolean nonLengthLessThanThree (List<String> names){
        return names.
                stream().
                noneMatch(t->t.length() < 3);
    }

    // Example 5 : List elemanlarinin en az birinin charachter sayisinin 4 den kucuk olup olmadigini kontrol eden method.
    public static boolean atLeastOneLengthLessThanFour (List<String> names){
        return names.
                stream().
                anyMatch(t->t.length() < 4);
    }
}
