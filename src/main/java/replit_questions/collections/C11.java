package replit_questions.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class C11 {

    public static void main(String[] args) {

        /*
        HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.

HashSet List: sari,mavi,kirmizi,yesil,mor

```
Beklenen Çıktı:
```

```
TreeSet elements:
```

```
kirmizi
```

```
mavi
```

```
mor
```

```
sari
```

```
yesil
         */

        HashSet<String> colors = new HashSet<>();

        colors.add("sari");
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("yesil");
        colors.add("mor");
        System.out.println("colors = " + colors);

        TreeSet<String> newColors = new TreeSet<>(colors);
        System.out.println("TreeSet elements:");
        for (String elements : newColors){
            System.out.println(elements);
        }



    }
}
