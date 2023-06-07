package replit_questions.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class C17_Priority_Queue {

    public static void main(String[] args) {

        /*
        Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.

priority queue elemanları: sari,yesil,mavi,kirmizi

```
Beklenen Çıktı:
```

```
Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
```
         */
        Queue<String> colors = new PriorityQueue<>();
        colors.add("sari");
        colors.add("yesil");
        colors.add("mavi");
        colors.add("kirmizi");

        System.out.println(colors); // [kirmizi, mavi, sari, yesil]



    }
}
