package replit_questions.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class C13_Set_Iterator {

    public static void main(String[] args) {

        /*
        Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

```
Beklenen Çıktı:
```

```
Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
```

```
Tersten Siralanisi:
```

```
yesil
```

```
turuncu
```

```
sari
```

```
mavi
         */

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("yesil");
        treeSet.add("sari");
        treeSet.add("mavi");
        treeSet.add("turuncu");
        treeSet.add("kirmizi");
        System.out.println("Orjinal TreeSet sonucu = " + treeSet); // [kirmizi, mavi, sari, turuncu, yesil]

        System.out.println("Tersten siralanisi");
        Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }




    }
}
