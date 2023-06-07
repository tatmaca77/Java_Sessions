package replit_questions.arrays;

import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {

        /*
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.

```
Test Data:
```

```
[1232, 1134,2345,1022]
```

```
[Java, Python, PHP, C#, C Programming, C++]
```

```
Beklenen Çıktı:
```

```
[1022,1134,1232,2345]
```

```
[C Programming, C#, C++, Java, PHP, Python]
```
         */

        int [] sayilar = {1232,1134,2345,1022};
        String [] diller = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        Arrays.sort(sayilar);
        Arrays.sort(diller);

        System.out.println(Arrays.toString(sayilar)); // [1022, 1134, 1232, 2345]
        System.out.println(Arrays.toString(diller)); // [C Programming, C#, C++, Java, PHP, Python]



    }
}
