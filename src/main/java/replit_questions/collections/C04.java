package replit_questions.collections;

import java.util.ArrayList;

public class C04 {

    public static void main(String[] args) {
        
        /*
        Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

Array Elemanları: sari,yesil,mavi,pembe

**mavi rengini turuncu ile değiştirelim.**

```
Beklene Çıktı:
```

```
[sari,yesil,mavi,pembe]
```

```
[sari,yesil,turuncu,pembe]
```
         */
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("sari");
        list.add("yesil");
        list.add("mavi");
        list.add("pembe");
        System.out.println("list = " + list);
        
        list.remove(2);
        System.out.println("list = " + list);
        
        list.add(2,"turuncu");
        System.out.println("list = " + list);
        
        
        
        
    }
}
