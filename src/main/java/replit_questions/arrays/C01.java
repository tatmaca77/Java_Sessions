package replit_questions.arrays;

public class C01 {

    public static void main(String[] args) {

        /*
        Array deki sayıları tolpayan Java kodunu yazınız.

array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

```
Beklenen Çıktı:
```

```
Array toplamı: 55
         */

        int[] sayilar = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for (int i = 0; i < sayilar.length ; i++) {
            sum = sum + sayilar[i];
        }
        System.out.println("Array toplami : " + sum);




    }
}
