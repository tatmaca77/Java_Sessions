package javaders.lambda.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    /**
     * Mumkun olan her her Lambda da "Lambda Expression" yerine "Method Reference" kullanmaliyiz. !!!!!!!
     */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds(nums)); // 436
        System.out.println(getTheSumOfSquareOfOdds2(nums));// 436
        System.out.println(getTheSumOfSquareOfOdds3(nums));// 436
        System.out.println(getMultiplicationOfSquareOfEvens(nums)); // 147456
        System.out.println(getMultiplicationOfSquareOfEvens2(nums)); // 147456
        System.out.println(getTheSumOfEvenMaxAndOddMin(nums)); // 15
        System.out.println(getTheSumOfEvenMaxAndOddMin2(nums)); // 15
        System.out.println(getTheSumOfEvenGreaterThanSevenMaxOddMinGreatherThanEight(nums)); // 6+9 = 15
        System.out.println(getTheSumOfEvenGreaterThanSevenMaxOddMinGreatherThanEight2(nums)); // 15

    }

    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds(List<Integer> nums) {

        return nums.stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);//17548
        /**reduce() => deger sayisini azaltmak. Coklu datayi tekli dataya cevirmek istedigimizde bu method kullanilir.
         *Note = reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki
         tum degerleri toplamdan alir, "u" ise stream'den alir */

    }

    public static int getTheSumOfSquareOfOdds2(List<Integer> nums) {

        return nums.stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(0, Math::addExact); /** Class Ismi :: Method Ismi ==> "Method Reference" */
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums) {

        return nums.stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(Math::addExact).  /** Class Ismi :: Method Ismi ==> "Method Reference" */
                        get(); /** bu method "optional integer"i integer'a cevirir. Yani data type degistirir. */
    }

    public static int getTheSumOfSquareOfOdds4(List<Integer> nums) {  /** En ideal kod bu dur. */

        return nums.stream().
                filter(Utils::isOdd).
                map(Utils::getSquare). /** Benim Utils Class'daki kare alma methodunu kullandim. !!!!!!! */
                        reduce(Math::addExact).  /** Class Ismi :: Method Ismi ==> Method Reference */
                        get();
        /** Ihtiyaciniz olan method o Class'ta yoksa "Utils Class" olusturup ihtiyaciniz olan methodu icinde olusturunuz
         ve "Method Reference" kullanininz.!!!!  */
    }


    //Example 2: Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens(List<Integer> nums) {

        return nums.stream().
                filter(Utils::isEven).
                map(Utils::getSquare).
                distinct().
                reduce(Math::multiplyExact).
                get();//147456

        /**Note: Soruda, kareleri tekrarsız olmalı deniyor.
         Bu nedenle distinc methodu, kareleri hesapladiktan sonra (map'ten sonra) yazildi. */

    }

    public static int getMultiplicationOfSquareOfEvens2(List<Integer> nums) {

        return nums.stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                distinct().
                reduce(1, (t, u) -> t * u);//147456
        /** Methodlarin yazilis sirasi cok ama cok önemlidir. Soruyu iyi anlamak lazim. Sonuca etki eder. !!!!!! */
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maksimum degeri ile tek sayi olan elemanlarin minimum degerinin
    //toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums) {

        int maxEven = nums.stream().distinct().filter(t -> t % 2 == 0).reduce((t, u) -> t > u ? t : u).get();
        int minOdd = nums.stream().distinct().filter(t -> t % 2 != 0).reduce((t, u) -> t < u ? t : u).get();
        return maxEven + minOdd;//15

        /** reduce() methodunu etkisiz eleman kullanmadan kullanirsak
         data tipleri uyusmadigi icin hata verir(Optional Integer verir).
         Burada reduce() methodundan sonra get() methodunu kullanmamiz gerekir
         reduce methodunu, etkisiz eleman kullanmadan kullanirsaniz. get() kullanın ki optional Int i normal int e cevirmis olalım.
         reduce(); icinde "ternary" kullandik !!!!
         Soruda tekrarsiz demedigi halde biz kod'u gelistirmek icin distinct() methodunu kullandik. */
    }

    public static int getTheSumOfEvenMaxAndOddMin2(List<Integer> nums) {

        int maxEven = nums.stream().distinct().filter(Utils::isEven).reduce(Math::max).get();
        int minOdd = nums.stream().distinct().filter(Utils::isOdd).reduce(Math::min).get();
        return maxEven + minOdd;//15
    }

    // Example 4 : Verilen bir List'Deki cift sayi olan elemanlarin 7 den kücük max degeri , tek sayi olan elemanlarin
    // 8 den büyük min degerinin toplami.
    public static int getTheSumOfEvenGreaterThanSevenMaxOddMinGreatherThanEight(List<Integer> nums) {

        int maxEven = nums.stream().distinct().filter(t -> t % 2 == 0 && t < 7).reduce((t, u) -> t > u ? t : u).get();
        int minOdd = nums.stream().distinct().filter(t -> t % 2 != 0 && t > 8).reduce((t, u) -> t < u ? t : u).get();
        return maxEven + minOdd;
        /** get(); methodu biz reduce kullaninca max ve min durumunda bize hata verir. Cünkü biz reduce ile integer
         dönmesini istedik ancak ; optional integer data type olarak görünür. Bu data type uyumsuzlugundan dolayi
         hata olusur. Bu hatayi get(); methodu ile data type'ni degistirdik. Integer'a cevirdik hata kalkti.*/
    }

    public static int getTheSumOfEvenGreaterThanSevenMaxOddMinGreatherThanEight2(List<Integer> nums) {

        int maxEven = nums.stream().distinct().filter(Utils::isEven).filter(Utils::kontrol).reduce(Math::max).get();
        int minOdd = nums.stream().distinct().filter(Utils::isOdd).filter(Utils::kontrol2).reduce(Math::min).get();
        return maxEven + minOdd;
    }
}




