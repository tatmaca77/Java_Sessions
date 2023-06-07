package practices.day_14_practice;

public class C01_Varargs {

    public static void main(String[] args) {

        /*
        parametre olarak bir int ve istediginiz kadar String olan bir method olusturun,
        en uzun String'in harf sayisi ile int parametre degeri carpıp sonucu yazdırın
         */

        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";

        carpim(sayi, str1, str2, str3);

    }

    private static void carpim(int sayi, String ...str) {

        String enUzunKelime = "";

        for (String w : str) {
            if (w.length() > enUzunKelime.length()) {
                 enUzunKelime = w;
            }
        }
        System.out.println(enUzunKelime.length()*sayi);
    }


}
