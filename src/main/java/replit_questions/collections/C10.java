package replit_questions.collections;

import java.util.Collections;
import java.util.LinkedList;

public class C10 {

    public static void main(String[] args) {

        /*
        Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

**hint:  Collections.swap();**

```
Beklene Çıktı:
```

```
Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
```

```
Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
```

         */

        LinkedList<String> list = new LinkedList<>();

        list.add("mavi");
        list.add("kirmizi");
        list.add("beyaz");
        list.add("siyah");
        list.add("yesil");
        list.add("turuncu");
        System.out.println("Orjinal LinkedList :" + list);

        Collections.swap(list, 0,3);
        System.out.println("Yeni LinkedList :" + list);

        list.set(0,"**siyah**");
        list.set(3,"**mavi**");
        System.out.println("Swap sonrasi yeni LinkedList :" + list);




    }
}
