package replit_questions.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class C02 {

    public static void main(String[] args) {

        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

Array List:  siyah,mavi,kirmizi,beyaz

en başa: **pembe**

mavi-kirmizi arasına **yesil**  renk eklenecek.

```
Beklenen Çıktı:
```

```
[pembe,siyah,mavi,yesil,kirmizi,beyaz]
```
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("beyaz");
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>(list);
        list2.addFirst("pembe");
        list2.add(3,"yesil");
        System.out.println(list2);





    }
}
