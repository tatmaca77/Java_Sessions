package javaders.day17multidimensionalarraypassvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

        /*
            1) Bir Array'in elemanlari da array olursa bu tarz array'lere "MultiDimensional" Array denir.
         */


        /** "MultiDimensional" Array nasil olusturulur ? **/
        String names[][] = new String[3][2];  // Ilk dis array , ikincisi ic array'dir.
                                              // 3 array olustur iclerine 2 array olustur demektir.
          /** Multidimensional Array'e eleman eklemek nasil olur ? **/
        names [1][0] = "P";
        names [2][1] = "Z";
        names [0][0] = "A";
        names [0][1] = "K";
        names [1][1] = "M";
        names [2][0] = "C";

        /** Multidimensional array'leri ekrana yazdirmak icin "toString" degil "deepToString();" methodu'nu kullaniniz.**/
        System.out.println(Arrays.deepToString(names)); // [[A, K], [P, M], [C, Z]]
        System.out.println(Arrays.toString(names)); // Bu sekilde olursa sadece referanslarini ekranda görürüm.
                                                    // Array'in hepsini yazdirmak istersen deepToString kullan.
                                                    // Specific bir elemani yazdirmak istersen sout icine koymalisin.

        /** Multidimensional Array icinden specific bir eleman nasil yazdirilir ? **/
        System.out.println(names[1][1]); // Specific bir elemani yazarken direkt sout icine koy. deep'e gerek yok.


        /** Multidimensional Array icindeki bir Array'i yazdirmak ? **/

        System.out.println(Arrays.toString(names[0])); // [A, K] Array in icinden yazdirdigim icin Array old. icin Array ile yazdik.
        System.out.println(Arrays.toString(names[1])); // [P, M]
        
        /** Kisa yoldan MultiDimensional Array nasil olusturulur? **/
        
        String students [][] = { {"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"} };
        // IClerine istedigin sayida eleman koyabilirsin.
        // Bunlarin data tipi String Array'dir. Yani Sting[]


        // Example :1 Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.  *** Tekarali Bir Islem ****
        int sum = 0;

        for(String[] w : students){

            sum = sum + w.length;
        }
        System.out.println(sum);


        // Example 2 : Yukaridaki students array'inde icinde "m" olan isimleri console yazdiriniz.
        /** Ic ice bir islem oldugu icin Nested Loop kullanmaliyiz !!!!!!!! **/
        for(String [] w : students){

                 for(String k : w){

                     if(k.contains("m")){
                         System.out.println(k); // Kemal, Cemal
                     }
                 }
        }


        // Example 3 : Bir INteger Multidimensional array olusturup tüm elemanlarin carpimini hesaplayiniz.
        int nums [][] = {{5,4}, {2,3,2},{7}};

        int result = 1;

        for(int [] w : nums){

            for(int k : w){

                result = result * k;
            }
        }
        System.out.println(result); // 1680



        /** Example 4 : Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.   **INTERVIEW**/
        int numbers [][] = {{5,4},{2,3,2},{7}}; // ==> { 5, 4, 2, 3, 2, 7 }

        // 1.Step :  Iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz.
        int toplamElemanSayisi = 0;

        for(int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        // 2.Step : Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz.
        int newArray [] = new int[toplamElemanSayisi];

        // 3.Step : Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim.
        int idx = 0;
        for(int[] w : numbers){

            for(int k : w){
                newArray[idx] = k;
            idx++;
            }
        }
        System.out.println(Arrays.toString(newArray));  // [5, 4, 2, 3, 2, 7]


        // Example 5 : Bir integer Multidimensional Array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages [][] = {{15,4}, {12,43,21}, {7}};  // ==> 4 +43 == 47

        int small = ages[0][0];
        int big = ages[0][0];

        for(int[] w : ages){

            for(int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println("small :" + small);
        System.out.println("big : " + big);
        System.out.println( small+ big);


        int arr4[][] = { {3,2,1},{1,2,3} };
        for (int i = 1; i < arr4.length; i++) {
            for (int k = 1; k < arr4[0].length; k++) {
                if (arr4[i][k] % 2 == 1){
                    arr4[i][k] = arr4[i][k] + 1;
                }
                if (arr4[i][k] % 2 == 0){
                    arr4[i][k] = arr4[i][k] * 2;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr4));

    }
}
