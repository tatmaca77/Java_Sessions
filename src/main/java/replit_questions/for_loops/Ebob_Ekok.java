package replit_questions.for_loops;


import java.util.Scanner;

public class Ebob_Ekok {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30

40

	Beklenen Cikti:

30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
         */

        Scanner scan = new Scanner(System.in);
        int ebob = 1;
        int ekok = 1;
        int max;
        System.out.println("Please enter first number...");
        int num1 = scan.nextInt();
        System.out.println("Please enter second number...");
        int num2 = scan.nextInt();
        max= num1*num2;

        for (int i = 1 ; i <= num1 && i <= num2; i++){

            if (num1 % i == 0 && num2 % i == 0){
                ebob = i;
            }
        }
        for(int j = max; j > 0 ; j--){

            if (j % num1 == 0 && j % num2 == 0){
                ekok = j;
            }
        }
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);



    }
}
