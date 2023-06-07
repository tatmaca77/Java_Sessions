package replit_questions.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class C07 {

    public static void main(String[] args) {

        /*
        bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

1. elemandan itibaren yazdıralım.

```
 Beklenen Çıktı:
```

```
beyaz
```

```
mavi
```

```
yesil
```

```
turuncu
```
         */

        LinkedList<String> getLinkedList = new LinkedList<>();
        getLinkedList.add("sari");
        getLinkedList.add("beyaz");
        getLinkedList.add("mavi");
        getLinkedList.add("yesil");
        getLinkedList.add("turuncu");
        System.out.println("getLinkedList = " + getLinkedList);

        ListIterator<String> iterator = getLinkedList.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
