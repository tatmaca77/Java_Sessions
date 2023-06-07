package javaders.lambda.day_07_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        System.out.println("nums = " + nums); // [12, 9, 131, 14, 9, 10, 4, 12, 15]


        elemanlariYazdir(nums); // 12 9 131 14 9 10 4 12 15
        System.out.println();
        elemanlar(nums); // 12 9 131 14 9 10 4 12 15
        System.out.println();
        ciftElemanlar(nums);
        System.out.println();
        ciftler(nums);
        System.out.println();
        tekKare(nums);
        System.out.println();
        kupler(nums);
        System.out.println();
        System.out.print(ciftKare(nums)); // 456
        System.out.println();
        System.out.print(ciftKareCarpim(nums)); // 45158400
        System.out.println();
        System.out.println(getMax(nums)); // 131
        System.out.println();
        listedenMaxYazdir(nums);
        System.out.println();
        listedenMaxYazdir2(nums);
        System.out.println();
        listedenMaxYazdir3(nums);
        System.out.println();
        System.out.println(getMin(nums)); // 4
        System.out.println();
        getMin2(nums);
        System.out.println();
        getMin3(nums);


    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanlariYazdir(List<Integer> nums) {

        for (Integer w : nums) {
            System.out.print(w + " ");           // Structured Programming
        }
    }

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elemanlar(List<Integer> nums) {
        nums.
                stream().
                forEach(t -> System.out.print(t + " "));          // Funtional Programming
    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElemanlar(List<Integer> nums) {

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftler(List<Integer> nums) {

        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }


    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekKare(List<Integer> nums) {
        /*
        for(Integer w : nums){
            if (w % 2 != 0){
                System.out.print(w*w + " ");            // Structured Programming
            }
        }*/
        nums.
                stream().
                filter(t -> t % 2 != 0).
                forEach(t -> System.out.print(t * t + " "));  // Funtional Programming
        /** map(t-> t*t).forEach(t -> System.out.print(t + " ") Bu sekilde de olur. !!!!!!! */
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void kupler(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                //forEach(t -> System.out.print(t*t*t + " "));
                        map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz.
    public static int ciftKare(List<Integer> nums) {

        return nums.
                stream().
                distinct().filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(Math::addExact).
                get();
    }


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz.
    public static int ciftKareCarpim(List<Integer> nums) {

        return nums.
                stream().
                distinct().filter(t -> t % 2 == 0).
                map(t -> t * t). // Eger Küp olursa Map den gelen sonuc cok buyuk old.icin Integer icine sigmaz Exception gelir.
                        reduce(Math::multiplyExact).
                get(); // Optional Integer'i Integer'a cevirmeye yarar.  Terminal Method tur. bundan sonra method kullaniulmaz.
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz.
    public static int getMax(List<Integer> nums) {
        int max = nums.
                stream().
                reduce(Math::max). // Yani aslinda coklu datayi tek bir dataya cevirmis gibi oluyor.
                        get();
        return max;  // 131
    }

    // 1. Yol
    public static void listedenMaxYazdir(List<Integer> nums) {
        Integer max1 = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        // Burda Integer.MIN_VALUE icinde -2Milyar gibi kucuck bir sayi var. Kist'deki hangi datayla
        // karsilastirirsan karsilastir hep obur sayiyi dondurur. Hizli calisir.
        System.out.println(max1);
        // reduce(); baslangic degeri ister, ve verdigimiz iki sayi verip sartini yanina yazarak "Ternary" kullandik.
        //           t degeri baslangic degerinden yani Min_Value'dan alir.
        //           u degeri ise akistaki degerleri alir ve karsilastirir.
    }

    // 2. Yol
    public static void listedenMaxYazdir2(List<Integer> nums) {
        Integer max2 = nums.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> u).get();
        System.out.println(max2);
    }

    // 3. Yol
    public static void listedenMaxYazdir3(List<Integer> nums) {
        Integer max3 = nums.
                stream().
                distinct().
                reduce(nums.get(0),(t,u)-> t > u ? t : u);
        System.out.println(max3);
    }



    //10)Liste ogelerinden minumum degeri veren method olusturunuz.
    public static int getMin(List<Integer> nums) {
        int min = nums.
                stream().
                distinct().
                reduce(Math::min). //reduce(Integer.MAX_VALUE,(t,u)-> t > u ? t : u);
                get();
        return min;
    }

    public static void getMin2(List<Integer> nums) {
        int min1 = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println(min1);
// Hizli calisan her zaman hazirda bulunan sayilarla islem yaparkendir.
        // Yani bu method alttakinden daha hizli calisir.
    }

    public static void getMin3(List<Integer> nums) {
        int min2 = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t,u)-> t < u ? t : u); /** Ternary */
        System.out.println(min2);

    }


}