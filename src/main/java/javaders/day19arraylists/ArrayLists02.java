package javaders.day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    /*
        method ogrenirken 3 seye dikkat!!
        1 - o method ne is yapar,
        2 - o method nasil kullanilir,
        3 - o method size ne verir
 */

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);// [Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //ArrayList'te bir elemanin "ilk gorunumu" nasil silinir?
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);// [Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //ArrayList'te bir eleman index'i kullanilarak nasil silinir?
        System.out.println(cities.remove(2));// Barcelona
        System.out.println(cities);// [Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]

        /** remove() method'u eleman ile kullanilirsa ilk gorunumunu siler. **/
        /** remove() method'u index ile kullanilirsa size o elemani silip silmedigini ifade eden true yada false verir.**/

        //ArrayList olustururken an basa ArrayList yerine List de yazabilirsiniz. Sebebini Collections konusunda gorecegiz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example 1: 12 elemanini ages List'ten siliniz
        ages.remove((Integer)12);       /**AUTOBOXING yapariz **/    // Bu method'ta sayi index ile karismasin diye
        System.out.println(ages);//[23, 7, 4]                         // WRAPPER INTEGER yaptik
        /** Another WAY
        Integer nonPrimitive = 12;
        ages.remove(nonPrimitive);
        System.out.println(ages); **/

        ages.remove(ages.indexOf(12));    /** Bu sekilde de eleman silinir. **/
        System.out.println(ages);

        //Bir ArrayList'teki bir elemanin tum gorunumlerini nasil sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");       // Ayni isimle farkli isler yapiyorsa bunun adina Overloading denir.
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);// [Miami]

        // Iki ArrayList'in birbirine esit olup olmadigini nasil anlariz ?
        /** Kisa yoldan bir List olusturmak icin asagidaki List.of() method'u kullanilabilir. **/
        List<Character> initials = List.of('a', 'k', 'c', 'd', 'k');      // Her defasinda add methodunu kullanmamak icin kolay yol.
        System.out.println(initials); // [a, k, c, d, k]   // Kolayca icine elemanlari atadik.

        List<Character> letters = List.of('a', 'c', 'k', 'd','k');
        System.out.println(letters); // [a, c, k, d, k]
        /**List of () özellikleri ve dezavantajlari :
        //initials.add('e'); elemen eklenemez
        //initials.remove(0); silinemez
        //initials.set(0,'u'); degistirilemez
         Bu methodlar List.of()'da kullanilamaz.
         Lis.of() methodu sabit elemanlari icerir. Eger List icinde bir degisiklik yapilmayacaksa kullanilabilir. **/


        // Iki ArrayList'in birbirine esit olup olmadigini nasil anlariz ?
        // equals() method'u ayni elemanlar ayni index'te oldugu sürece true verir.
        boolean r = initials.equals(letters);    /** Hem elemanlar ayni mi diye bakar hemde ayni indexte'ler mi diye bakar.**/
        System.out.println("r = " + r); // false

        // indexOf('k) yazarsaniz 'k' nin ilk gorunumunun index'ini verir.
        int r2 = initials.indexOf('k');
        System.out.println("r2 = " + r2); // 1

        // lastIndexOf ('k') yazarsaniz 'k' nin son gorunumununun index'ini verir.
        int r3 = initials.lastIndexOf('k');
        System.out.println("r3 = " + r3); // 4


        /******** INTERVIEW 'da gelebilir. !!! ************/
        // Example 1 : Bir List'deki tekrarsiz elemanlari console'a yazdiran kod'u yaziniz.

        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);   // for each loop ilk tercih olmalidir.
        for(Double w : prices){
            if(prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.print(w+ " "); // 3.75 4.0
            }
        }

        System.out.println();

        // Example 2 : Bir List'de tekrarli eleman olup olmadigini gösteren kodu yaziniz.

        List<Double> heights = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        int counter = 0;

        for(Double w : heights) {

            if (heights.indexOf(w) != heights.lastIndexOf(w)) {
                counter++;
            }
        }
        if (counter == 0){
                System.out.println("All elements are unique in the list");
            }else{
                System.out.println("At least one element is not unique in the list");
            }


    }
}

