package javaders.day02printmethodcreation;

public class PrintPrintln {

    public static void main(String[] args) {

        /*
        1) \n == bir alt satira gecirir.
        2) \t == bir tab bosluk birakir. ( Space e göre biraz daha bosluk birakir )
        3) \" == ekrana " yazdirir.
        4) CTRL+ALT+L == sayfayi düzenler.
         */

        //"TECHPRO EDUCATION" yazisini yukaridan asagiya harf harf yazdiriniz.

        //1.Yol CTRL + D sout cogalmis olur.
        System.out.println("********* 1.Yol ******");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" "); // HICLIKTE OLUR. BOSLUKLARDA BIR KARAKTERDIR ONU DA YAZDIRIYOUZ BU YÜZDEN.
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");


        //"TECHPRO EDUCATION" yazisini TEK BIR SOUT ile yukaridan asagiya harf harf yazdiriniz.

        //2.Yol
        System.out.println("****** 2. Yol ******");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");



        //JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira yazdiran kodu tek bir sout ile yazdiriniz.
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");


        //JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini 1 tab bosluk birakan kodu tek bir sout ile yazdiriniz.
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");



        // "Techpro" ile java cok 'kolay' tek bir sout ile yazdiran bir kod yaziniz.
        System.out.println("Techpro ile java cok kolay"); // Techpro ile java cok kolay
        System.out.println("\"Techpro \" ile java cok ' kolay '"); // " Techpro " ile java cok 'kolay'



        // " MAHARET" hic 'DUSMEMEK' degil;
        //  "Her dustugunde kalkabilmektir"
        // seklindeki noktali virgulden sonra 3 satir alttan paragraf basi yaparak yazdiran kod olusturunuz.
        System.out.println("\" MAHARET\" hic 'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");



        // Print ile Println arasindaki fark.

        System.out.println("Hayat Techpro ile cok güzel");//Bir alt satirda yazdirir.
        System.out.println("Ama Nasil baktiginiza bagli");
        System.out.print("Yeter ki siz isteyin"); // ayni satirda yanyana yazar
        System.out.println("Tolgahan");

    }//main
}//class
