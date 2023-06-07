package practices.day_08_practice;

public class C03_Array {

    public static void main(String[] args) {

         /*

      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.

      int arr1[][] = {{1,2},{3,4,5}};
      int arr2[][] = {{7,8,9},{10,11},{12}};

     */

        int arr1[][] = {{1,2},{3,4,5}};
        int arr2[][] = {{7,8,9},{10,11},{12}};

        int maxLength = Math.min(arr1.length, arr2.length); // en kısa dizi uzunluğunu alır

        for (int i = 0; i < maxLength; i++) {
            int innerMaxLength = Math.min(arr1[i].length, arr2[i].length); // iç dizilerin en kısa uzunluğunu alır
            int sum = 0;
            for (int j = 0; j < innerMaxLength; j++) {
                sum += arr1[i][j] + arr2[i][j]; // aynı indexe sahip elemanların toplamı hesaplanır
            }
            System.out.println("Index " + i + " toplam: " + sum); // toplam yazdırılır
        }
        System.out.println();

        /** Hocanin cözümü gercek cözüm **/
        int sinir = 0;
        int toplam = 0;

        for (int i = 0; i <arr1.length; i++) {// dıstaki arrayların kısa olanının sayısınca donguye alıcam

            if(arr1[i].length<arr2[i].length){// arr1'in i. indexindeki dıs arrayin eleman uzunlugu ile
                // arr2'nin i. indexindeki dıs arrayin eleman uzunlugunu karsılastırdık
                sinir=arr1[i].length;
            }else{
                sinir=arr2[i].length;
            }

            for (int j = 0; j <sinir ; j++) {
                toplam=arr1[i][j]+arr2[i][j];
                System.out.println(i+","+j+"indexindeki elemanlarin toplami " + toplam);
            }
        }











    }
}

   /* int maxLength = Math.max(arr1.length, arr2.length); // en uzun dizi uzunluğunu alır

        for (int i = 0; i < maxLength; i++) {
        int sum = 0;
        if (i < arr1.length && i < arr2.length) { // her iki dizide de eleman var mı diye kontrol edilir
        int innerMaxLength = Math.max(arr1[i].length, arr2[i].length); // iç dizilerin en uzunluğunu alır
        for (int j = 0; j < innerMaxLength; j++) {
        if (j < arr1[i].length && j < arr2[i].length) { // her iki iç dizide de eleman var mı diye kontrol edilir
        sum += arr1[i][j] + arr2[i][j]; // aynı indexe sahip elemanların toplamı hesaplanır
        } else if (j < arr1[i].length) {
        sum += arr1[i][j]; // sadece ilk dizide eleman varsa sadece onun değeri toplama eklenir
        } else {
        sum += arr2[i][j]; // sadece ikinci dizide eleman varsa sadece onun değeri toplama eklenir
        }
        }
        } else if (i < arr1.length) {
        for (int j = 0; j < arr1[i].length; j++) {
        sum += arr1[i][j]; // sadece ilk dizide eleman varsa sadece onun değeri toplama eklenir
        }
        } else {
        for (int j = 0; j < arr2[i].length; j++) {
        sum += arr2[i][j]; // sadece ikinci dizide eleman varsa sadece onun değeri toplama eklenir
        }
        }
        System.out.println("Index " + i + " toplam: " + sum); // toplam yazdırılır
        }
*/
