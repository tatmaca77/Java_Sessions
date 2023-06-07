package practices.interview_questions.advance_01_practice;

import java.util.Scanner;

public class Rus_Ruleti_Sorusu {

    /*
    ================== RUSSULETI ======================
    Birbirleriyle çarpılacak sayılar yan yana yazılır.
    ilk sayı ikiye bölünür ve sonuç hemen altına yazılır.
    sonuç küsuratlı(kesirli) çıktıysa kesir kısmıyla ilgilenilmez
    sadece tam sayı kısmı yazılır. diğer sayı ise ikiyle çarpılır
    ve sonuç hemen altına yazılır.
    bu işlem yeni sayılar için tekrarlanır,
    ta ki ilk sayı ikiye bölüne,
    bölüne 1(bir) değerine ulaşana kadar.
    birinci sütundaki çift sayıların
    ikinci sütundaki karşılıkları silinir.
    ikinci sütunda silinmeyen sayılar
    toplandığında elde edilen sonuç
    istenilen sayıdır.
    örnek:
            456 x 219 = ? 99864

            456........219
            228........438
            114........876
            57 ........1752
            28 ........3504
            14 ........7008
            7  ........14016
            3  ........28032
            1  ........56064
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Çarpılacak sayıları giriniz: ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();


        int toplam = 0;
        System.out.println(sayi1 + "\t\t" + sayi2);
        while (sayi1 != 1) {
            if (sayi1 % 2 == 0) {
                sayi1 /= 2;
                sayi2 *= 2;
            } else {
                toplam += sayi2;
                sayi1 = (sayi1 - 1) / 2;
                sayi2 *= 2;
            }
            System.out.println(sayi1 + "\t\t" + sayi2);
        }
        toplam += sayi2;
        System.out.println("\nSonuç: " + toplam);













    }
}
