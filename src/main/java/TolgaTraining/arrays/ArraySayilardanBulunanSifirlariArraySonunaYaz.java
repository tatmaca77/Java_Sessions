package TolgaTraining.arrays;

import java.util.Arrays;

public class ArraySayilardanBulunanSifirlariArraySonunaYaz {

    //Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
            //Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
    public static void main(String[] args) {

        int [] sayi  = {5, 0, 2, 0, 3};

        int [] sum  = new int[sayi.length];

        int firstIndex=0;
        int lastIndex = sayi.length-1;

        for(int i = 0; i < sayi.length;  i++){

            if (sayi[i] > 0){
                sum[firstIndex] = sayi[i];
                firstIndex++;
            }
            else {
                sum[lastIndex]=0;
                lastIndex--;
            }

        }
        System.out.println(Arrays.toString(sum));


    }

}

