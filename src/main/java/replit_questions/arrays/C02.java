package replit_questions.arrays;

public class C02 {

    public static void main(String[] args) {


        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array =  [20, 30, 25, 35, -16, 60, -100 ]

```
Beklenen Çıktı:
```

```
Array Sayılarının ortalaması: 7.0
```
         */
        int [] sayilar = {20,30,25,35,-16,60,-100};
        int sum = 0;
        for (int i = 0; i < sayilar.length; i++) {
            sum = sum + sayilar[i];
        }
        System.out.println(sum);
        System.out.println(sum / sayilar.length);
    }
}
