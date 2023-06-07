package replit_questions.collections;

import java.util.TreeSet;

public class C15 {

    public static void main(String[] args) {
/*
Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.

TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

```
Beklenen Çıktı:
```

```
Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
```

```
Tree eleman sayısı: 5
```
 */
        TreeSet<String> colors = new TreeSet<>();
        colors.add("yesil");
        colors.add("sari");
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("pembe");
        System.out.println("Orjinal TreeSet = " + colors); //  [kirmizi, mavi, pembe, sari, yesil]

        int elemanSayisi = colors.size();
        System.out.println("Tree eleman sayisi :" + elemanSayisi); //5



    }
}
