package practices.day_18_practice;

import java.util.*;

public class C03_Iterator {

    /** Index yapisi olmayanlarda Iterator kullaniriz. Ama mesela List'lerde index oldugu icin for-loop ile
         elemanlar arasinda gezinmis oluruz.
         Interface'ler Override edilmek zorundadir.
     */

    public static void main(String[] args) {

      /*
        Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
        5'den buyuk elemanları iterator ile yazdırınız
                */
        Deque<Integer> dq = new LinkedList<>(Arrays.asList(1,8,3,6,7));
        System.out.println(dq);

        //List list = new ArrayList();

        Iterator itr = dq.iterator(); // Deque'lerde index yapisi yoktur bu sebeple Iterator kullanilir.

        while (itr.hasNext()){ // yaninda eleman var mi diye kontrol ediyorum

            Object sayi = itr.next(); // itr'i bir adim ileriye atiyorum ve üzerinden geceni donduruyor.

            if((Integer) sayi > 5){  // sayi 5 ten buyuk mu diye kontrol ediyorum; 5 ten buyukse
                System.out.print(sayi + " "); // sayiyi yazdiriyorum
               // list.add(sayi);
            }
        }
        //System.out.println();
       // System.out.print("List : " + list); // List : [8, 6, 7]
    }

}