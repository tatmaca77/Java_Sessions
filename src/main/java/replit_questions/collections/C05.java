package replit_questions.collections;

import java.util.ArrayList;

public class C05 {

    public static void main(String[] args) {

        /*
        Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.

ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

```
Beklenen Çıktı:
```

```
Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
```

```
siyah
```

```
mavi
```

```
kirmizi
```

```
yesil
```

```
mor
```

```
turuncu
         */

        ArrayList<String> list = new ArrayList<String>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("mor");
        list.add("turuncu");
        System.out.println("list = " + list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));






    }
}
