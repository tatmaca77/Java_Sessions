package replit_questions.collections;

import java.util.TreeSet;

public class C14 {

    public static void main(String[] args) {

        /*
        Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

```
Beklenen Çıktı:
```

```
Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
```

```
ilk elemen: kirmizi
```

```
son eleman: yesil
```
         */
        TreeSet<String> colors = new TreeSet<>();

        colors.add("sari");
        colors.add("mavi");
        colors.add("yesil");
        colors.add("kirmizi");
        colors.add("turuncu");
        colors.add("pembe");
        System.out.println("OrjinalTreeSet = " + colors); // [kirmizi, mavi, pembe, sari, turuncu, yesil]

        System.out.println("Ilk eleman : " + colors.first()); // kirmizi
        System.out.println("Son eleman : " + colors.last()); // yesil


    }
}
