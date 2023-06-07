package replit_questions.collections;

import java.util.LinkedList;

public class C06 {

    public static void main(String[] args) {

        /*
        Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

LinkedList elemanları: sari,mavi,mor,yesil,beyaz

```
Beklenen Çıktı:
```

```
sari
```

```
mavi
```

```
mor
```

```
yesil
```

```
beyaz
         */

        LinkedList<String> list = new LinkedList<>();

        list.add("sari");
        list.add("mavi");
        list.add("mor");
        list.add("yesil");
        list.add("beyaz");
        System.out.println("list = " + list);

        System.out.println(list.getFirst());
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.getLast());
    }
}
