package javaders.day14loops;

import java.util.Scanner;

public class Loop03 {

    public static void main(String[] args) {


        //While loop
        int i = 1;

        while (i<1){  // while loop'da loop body'sinin hic calismamasi mumkundur. (Zero execution is possible)
            System.out.println("while loop");   // Bu sekilde ekrana hic birsey yazmaz.
            i++;                                // Once dusunur sonra code'u calistirir. Bu yüzden ekrana yazmaz.
        }

        //do-while loop

        int k = 1;

        do{   // do-while lopp'da loop body'si en az bir kere calisir.
            System.out.println("do-while loop");  // Bu calisti. !!!!!!!
            k++;                                  // do-while loop önce code calisir sonra düsünür.
        }while (k<1);                             // Bu yüzden ekrana yazar.



        // Kullanici bir sayi girsin, sayi 100 den kucuk ise kullanici "kazandiniz" mesaji alsin
        // diger durumlarda "kaybettiniz" mesaji alsin.

        Scanner input = new Scanner(System.in);
                                                //Bunu oyun gibi gör sürekli 100 alti girinc yeni deger ister sürekli calisir.
        do{                                  // 100 den büyük olunca loop kirilacak ve oyun bitecek !!!!!!!
            System.out.println("Please enter a number: ");    // do icinde olmalidir. Kullanici sayiyi verdikten sonra loop'a koy.
            int n = input.nextInt();

        if(n<100){
            System.out.println("Won!");
        }else{
            System.out.println("Lost!");
            break;                                 // 100 den büyük sayi girince loop kirilir ve baska oyun hakki kalmaz.
        }
        }while(true);


        // Kullanicidan alinan bir cümlenin buyuk harfle baslayip nokta ile bittigini kontrol eden code'u yaziniz.


        do{
            System.out.println("Please enter a word");   // Tekrarlanmasini istedigim code'u do icine koydum.
            String s = input.next();

            if (s.endsWith(".") && (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')){
                System.out.println("Your sentence is correct grammatically");
            }else{
                System.out.println("Your sentence has grammatically mistake");
                break;
            }
        }while(true);           // while icini true yapiyorum cunku her sart saglandiginda tekrar yazma hakki olsun.
                                // Eger false dersem kullaniciya sadece 1 kere veri girmesini saglarim.
                                // Öyle olursada loop yapmaya gerek kalmaz.
                                // Bir döngüye girmesini istedigim icin loop ve sartina true dedim.


















    }
}
