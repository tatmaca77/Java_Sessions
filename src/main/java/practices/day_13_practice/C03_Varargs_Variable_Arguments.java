package practices.day_13_practice;

public class C03_Varargs_Variable_Arguments {

    public static void main(String[] args) {

        // kac tane kelime verilirse verilsin (bu ifade Varargs yapisidir)
        // iclerinden en uzun olani yazdiran method olusturun

        // bu methodu access modifier'ini default yapip ayni package'daki farkli bir class'dan calistirniz.

        // bu methodu access modifier'ini protected yapip farkli bir package'daki farkli bir class'dan calistir.

        // bu methodu access modifier'ini public yapip farkli bir package'daki farkli bir class'dan calistir.


        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Ahmet";
        String str4 = "Abdullah";
        String str5 = "Tolgahan Atmaca";

        enUzunKelime(str1, str2, str3, str4, str5);



    } // main body

    private static void enUzunKelime(String ... str) {

        String enUzunKelime = "";

        for (String w : str) {
            if (w.length() > enUzunKelime.length()) {
                enUzunKelime = w;
            }
        }
        System.out.println("en uzun kelime : " + enUzunKelime);

    }

    //private static void enUzunKelime(String str1, String str2, String str3, String str4) {  Varargs ile yapacagim


}
