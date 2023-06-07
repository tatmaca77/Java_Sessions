package javaders.lambda.Lambda_Recap;

public class Utils {

    public static void yazdir(Object a) {    // burda normalde int a veya String str de diyebilirdik parametreye.
        System.out.print(a + " ");          // Ama data type'lar her zaman degisken olabilecegi icin
    }                                         // Biz hem String hem int yazdirabiliriz o yüzden onlarin
    // babalarini kullandim Object a yaptim. !!!!!!


public static int kareBul (int a) {
        return a*a;
}

public static int birlerBasamagi (int a) {

        int sum = 0;

    while (a > 0){
        sum = sum + a % 10;  // Sayinin son rakamini alir

        a =  a / 10;   // Sayiyi kücültür.
    }
    return sum;
}

public static int toplama(int a) {
        return a+a;
}

public static boolean ciftMi(int a) {
        return a % 2 == 0;
}


}