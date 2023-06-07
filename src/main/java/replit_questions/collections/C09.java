package replit_questions.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class C09 {

    public static void main(String[] args) {

        /*
        Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

```
Beklenen Çıktı:
```

```
Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
```

```
LinkedList Tersi:
```

```
mor
```

```
beyaz
```

```
kirmizi
```

```
yesil
```

```
mavi
         */

        LinkedList<String> colors = new LinkedList<String>();
        colors.add("sari");
        colors.add("mavi");
        colors.add("yesil");
        colors.add("kirmizi");
        colors.add("beyaz");
        colors.add("mor");
        System.out.println("colors = " + colors); // [sari, mavi, yesil, kirmizi, beyaz, mor]


        Iterator<String> it = colors.descendingIterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());


    }
}
