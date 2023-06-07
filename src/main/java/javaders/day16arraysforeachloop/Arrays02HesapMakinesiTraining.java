package javaders.day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02HesapMakinesiTraining {

    public static void main(String[] args) {

        // Example 1 : +, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */



        /** Bu soruda öncelikle ; soruyu anlamaya calisip üzerinde ne ile calisacagimi anlamaliyim.
            Önce Data almak icin Scanner object olusturulur.
            Sonra bos bir "char" olusturulur.
            Ve do-while ile bu sorunun iskeleti olusturulur.
            Kullaniciya yapacagi islemi girmesi icin mesaj verilir.
            Sonra eger kullanicinin verdigi data 'q' ya esitse loop break ile kirilir.
            Sonra karsilastirma operatorleri ile boolean bir sonuc aliriz.
         Eger kullanici verilen islem sembollerinden farkli birsey girerse, Tanimlanamdi mesaji verilir ve loop kirilir.
            Sonrasinda kullanicinin islem yapmasi icin kullanicidan önce ilk sonra ikinci sayi alini.
            Son oalrakta bu verilen sayilarin switch ile beraber islemlerin yapilmasini saglariz.
            While() kisminin parantezine true yazariz.

        **/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen islemi durdurmak icin q ya basin");
        char opr = ' ';

        do {
            System.out.println("Lutfen yapacaginiz islemi : +, -, *, /, % icinden seciniz." );
            opr = input.next().charAt(0);

            if (opr == 'q'){
                break;
            }

            boolean r = opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%';
            if(!r){
                System.out.println("Tanimlanamadi");
                break;
            }
            System.out.println("Lutfen ilk sayiyi giriniz");
            int n1 = input.nextInt();
            System.out.println("Lutfen ikinci sayiyi giriniz");
            int n2 = input.nextInt();

            switch(opr) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                case '/':
                    System.out.println(n1 / n2);
                    break;
                case '%':
                    System.out.println(n1 * n2 / 100);
            }
        }while(true);







    }
}
