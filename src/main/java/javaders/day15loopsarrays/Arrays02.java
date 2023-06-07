package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    /*
       1) Application'larda "data" ile bu data'lari isleyen kod'lar (Logic) birbirinden ayrilir.
       Yani; logic data'ya bagimli olmamalidir.
       Data'ya bagimli olarak yazilan kod'lara " Hard Code" denir.
       Hard Code hatali kod demektir.
*/
       /** Asagidaki grades Array'inde son elemani almak icin "4" veya grades[grades.length-1] kullanilabilir.
       "4" Kullanirsaniz Array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama
       grades[grades.length-1] kullanirsaniz hep dogru sonucu alirsiniz.
       **/

    public static void main(String[] args) {

        // Array'leri kisa yoldan nasil olusturabiliz?
        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades)); // [67, 98, 100, 34, 76]



        // Example 1 : grades Array'indeki en kucuk ve en buyuk grade'in toplamini yaziniz.
        Arrays.sort(grades); // sort degerleri kucukten buyuge dogru siralar.

        System.out.println(Arrays.toString(grades)); // [34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades[grades.length - 1]); //134

        // grades[grades.length-1] yazdik cünkü direkt son rakamini almasi icin. Yani sona gitti. !!!!
        // grades[grades.length] yapmamizin sebebi kullanici eger bir fazla deger verse calismayacak.
        //grades[0] + grades[4] desem 5 deger verince olmayacckti.

        System.out.println();
        // Example 2 : Size verilen bir String Array'Deki isimlerden 5 karakterden az karakter icerenleri yazdiriniz.

        String stdNames[] = new String[5];
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tolga";                         // Alicam karakter sayisina bakicam yazdiricam
        stdNames[1] = "Ayse";
        stdNames[4] = "Oguzhan";
        stdNames[0] = "Ajda";

        for (String w : stdNames) {

            if (w.length() < 5) {
                System.out.println(w);
            }
        }
        System.out.println();

        // Example 3 : Size verilen bir String Array'Deki isimlerden alfabetik siraya koyduktan sonra T ile baslayan
        // isimlerden onceki isimleri yazdiriniz.

        String stdNames1[] = new String[5];
        stdNames1[3] = "Cuneyt";
        stdNames1[2] = "Tolga";                         // Alicam karakter sayisina bakicam yazdiricam
        stdNames1[1] = "Ayse";
        stdNames1[4] = "Filiz";
        stdNames1[0] = "Ajda";

        Arrays.sort(stdNames1); // Stringleri alfabetik yapar , sayi lari büyükten kucuge siralar.

        for (String w : stdNames1) {

            if (w.startsWith("T")) {
                break;
            }                                                // Kirdiktan sonra yazdir.
                System.out.println(w);
            }


        System.out.println();

        // Example 4 : Size verilen bir String Array'Deki isimlerden alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden onceki isimleri ve "F" ile baslayanlari yazdiriniz.

        String stdNames2[] = new String[5];
        stdNames2[3] = "Cuneyt";
        stdNames2[2] = "Tolga";
        stdNames2[1] = "Ayse";
        stdNames2[4] = "Filiz";
        stdNames2[0] = "Ajda";

        Arrays.sort(stdNames2);    //*********** Stringleri alfabetik yapar , sayi lari büyükten kucuge siralar.

        for (String w : stdNames2) {

            System.out.println(w);                               // Yazdirip kiriyorum !!!!!!!!

            if (w.startsWith("F")) {
                break;
            }

        }

        System.out.println();




        // Example 5 : Size verilen bir String Array'Deki isimlerden alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden haric diger isimleri yazdiriniz.

        String stdNames3[] = new String[5];
        stdNames3[3] = "Cuneyt";
        stdNames3[2] = "Tolga";
        stdNames3[1] = "Ayse";
        stdNames3[4] = "Filiz";
        stdNames3[0] = "Ajda";

        Arrays.sort(stdNames3); // sort () , Stringleri alfabetik yapar, sayi lari büyükten kucuge siralar.
                                              //alphabetically                          // kucukten buyuge dizmek (ascending) denir.
                                          // ascending + alphabetically ==> Natural Order ( dogal Siralama )
        for (String w : stdNames3) {

            if (w.startsWith("F")) {   // F görünce bisey yapma devam et demektir. "continue" keyword önemlidir.
                continue;
            }
            else{
                System.out.println(w);
            }
        }



        }
    }

