package replit_questions.collections;

import java.util.ArrayList;

public class C03 {

    public static void main(String[] args) {

        /*
        Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

```
Beklenen Çıktı:
```

```
Arrayin 1. elemani: beyaz
```

```
Arrayin 3. elemani: sari
```
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("beyaz");
        list.add("siyah");
        list.add("sari");
        list.add("kirmizi");
        list.add("turuncu");
        System.out.println(list);

        System.out.println("Arrayin 1. elemani : " + list.get(0));

        System.out.println("Arrayin 3. elemani : " + list.get(2));


    }
}
