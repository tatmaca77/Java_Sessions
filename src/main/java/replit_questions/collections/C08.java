package replit_questions.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class C08 {

    public static void main(String[] args) {

        /*
        Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

```
Beklenen Çıktı:
```

```
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
```

```
Listenin ilk elemani: sari
```

```
listenin son elemani: beyaz
```
         */

        LinkedList<String> renkler = new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");
        renkler.add("siyah");
        renkler.add("yesil");
        renkler.add("beyaz");
        System.out.println("Original List of Elements = " + renkler);

        Iterator<String> iterator1 = renkler.iterator();
        System.out.println("Listenin ilk elemani : " + iterator1.next());

        Iterator<String> iterator2 = renkler.descendingIterator();
        System.out.println("Listenin son elemani : " + iterator2.next());

        /** descendingIterator(); metodu çağrılarak listenin son elemanına kadar geri gidilir
            ve son eleman alınır ve yazdırılır. */

    }
}
