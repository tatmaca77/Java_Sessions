package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {


        /*
        If Statement (); : yapisi bazen kodlarin calismasi belirli kosullara baglidir.
        Mesela cok calisirsam, Java ogrenecegim.
        Java ogrenme eylemi cok calisma eylemine baglanmistir.
        1.eylem gerceklesmedden ikinci eylem gerceklesmez.
        if(){}
        ()  parantez icine sart yazilir eger true dondururse { } body arasindaki
        kod calisir.Aksi halde if body disina cikar class'ta sonraki kodlari
        okumaya devam eder.

         */
        // INTERWIEW QUESTIONS USA QA
        // String str ="abbccdc" tekrarsiz karakterleri ekrana yazdiriniz

        String str ="aacde";
        char ch =str.charAt(0);
        if(str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println(ch); // false verir bu sebeple CODE calismaz. 'a' harfini görmez.
        }//if body
        char ch1 = str.charAt(1);
        if(str.indexOf(ch1) == str.lastIndexOf(ch1)){
            System.out.println(ch1); //false gelir buda calismaz.
        }//if body
        char ch2=str.charAt(2);
        if(str.indexOf(ch2) == str.lastIndexOf(ch2)){
            System.out.println(ch2); // true 'dur.Bu sebeple java calisir. Tekrarsizdir.Baska c yoktur.
                                                // Ekrana c yazdirir.
        } //if body
        char ch3 = str.charAt(3);
        if(str.indexOf(ch3) == str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        char ch4 = str.charAt(4);
        if(str.indexOf(ch4) == str.lastIndexOf(ch4)){
            System.out.println(ch4);
        }//if body




        // Ex : Sayi pozitif ise ekrana "Pozitif Sayi " yazdiran kodu yaziniz
        int num =-20;

        if(num>0){
            System.out.println("Pozitif Sayi");//Pozitif Sayi
        }
        System.out.println("*****************");



        // Ex : Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdiriniz
        // 0 1 2 3 4 5 6 7 8 9 ==>Rakam

        int number = 12;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }


        // Ex : Sayi uc basamakli ise ekrana "Sayi 3 Basamaklidir" yazdiriniz

        int n= 69;
        /*
        Math Classi onemli bir Class;tir.Icerisinde bir cok method barindirir.
        abs() methoduda icerisine arguman olarak verilen sayinin mutlak
        degerini yani pozitif halini verir

        */
        n = Math.abs(n);
        if(n>99 && n<1000){
            System.out.println("Sayi 3 Basamaklidir");
        }
        System.out.println("****************");


        int num1= -15;
        if (num1 > 0) {
            System.out.println("Pozitif Sayi");
        }else {
            System.out.println("Negatif Sayi");
        }

        int num2 = -33;
        if (num2 > 0) {
            System.out.println("Pozitif Sayi");
        }else {
            System.out.println("Negatif Sayi");
        }

        // Ex : Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdiriniz
        // 0 1 2 3 4 5 6 7 8 9 ==>Rakam

        int num3 = 9;
        if (-1<num3 && num3<10) {
            System.out.println("Verilen Data Rakamdir"); // if body calisir.
        }else {
            System.out.println("Verilen Data Rakam degildir"); //else body calismaz.
        }

        int t = -123;
        if (t>=100 && t<1000 || t>-1000 && t<-99 ) {
            System.out.println("Verilen Data 3 Basamaklidir");
        }else  {
           System.out.println("Verilen Data 3 Basamakli degildir");
        }

        int sayi =-1000;

        sayi = Math.abs(sayi);
        if(sayi>99 && sayi<1000){
            System.out.println("Verilen Data 3 Basamaklidir");// ıf body calısmaz. false dönder.
        }else {
            System.out.println("Verilen Data 3 Basamakli degildir");
        }

    }//main
}//class
