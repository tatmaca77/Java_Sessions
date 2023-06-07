package practices.day_18_practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {

    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};

    /** Tekrarsiz yani ( unique ) elemanlar Set'ler de depolanir. */

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(benzersizYap(arr)));

    }
    private static int[] benzersizYap(int[] arr) {
        Set<Integer> tekrarsizSet = new TreeSet<>();
        for (int each : arr) {  // set zaten unique olacagi icin tüm elemanlari direkt ekledik.
            tekrarsizSet.add(each);   // Burda Array'i direkt Set'e cevirdik. Ve otomatik olarak Set tekrarsizlari aldi.
        }
        System.out.println(tekrarsizSet); // [1, 2, 3, 4, 5]

        int arr2[] = new int[tekrarsizSet.size()]; // tekrarsiz set'deki elemanlari yeni array'e aktaracagim icin size a kadar.
        int idx = 0;
        for (Integer each : tekrarsizSet) { // Set'lerde index yapisi olmadigi icin for-each kullandik
            arr2[idx] = each;
            idx++;
        }
        System.out.println(Arrays.toString(arr2)); // [1, 2, 3, 4, 5]
        arr = arr2; // soruda yeni bir array istemedigi icin arr yi tekrarsiz yap dedigi icin arr'ye esitledik retrun ettik.
        return arr;
    }

}

