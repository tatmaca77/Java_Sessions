package replit_questions.collections;

import java.util.TreeSet;

public class C12 {

    public static void main(String[] args) {

        /*
        Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

```
Beklenen Çıktı:
```

```
beyaz
```

```
kirmizi
```

```
mavi
```

```
sari
```

```
siyah
```

```
yesil
```
         */

        TreeSet<String> renkler = new TreeSet<>();

        renkler.add("yesil");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("sari");
        renkler.add("beyaz");
        renkler.add("siyah");

        System.out.println("TreeSet renk elemanlari");

        for (String w : renkler){
            System.out.println(w);
        }




    }
}
