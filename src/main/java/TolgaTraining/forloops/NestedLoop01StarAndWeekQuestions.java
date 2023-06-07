package TolgaTraining.forloops;

import java.util.Scanner;

public class NestedLoop01StarAndWeekQuestions {

    public static void main(String[] args) {  // Ic ice Loop olursa NestedLoop olur.
                          // Nested Javayi yavaslatir cok zaman ayirir bu yüzden cok tercih edilmez.
                  // Eger cok sart degilse Nested Loop kullanilmaz mecbursan kullan.

        // 1.Example:           Type code to get the output like
        //                        Week: 1
        //                          Day: 1
        //                          Day: 2
        //                          Day: 3
        //                          .....
        //                        Week: 2
        //                          Day: 1
        //                          Day: 2
        //                          Day: 3
        //                          ....
        //                        Week: 3
        //                          Day: 1
        //                          Day: 2
        //                          Day: 3
        //                          ....

        // Nested for-loop :
        for(int i = 1; i <= 4 ; i++ ){         //Dis Loop // Week icin yazilan yerdir. Week icini yazmaliyiz yani Days leri.
            System.out.println("Week: " + i);            // Nested Loop genellikle for ile kullanilir !!!!!!!!

            for(int k = 1; k < 8 ; k++ ){
                System.out.println("   Day: " + k);    // Ic loop   // Burasida loop'un icindeki loop icine günleri verir.
            }
        }

        // Nested while-loop :
        int i = 1;

        while(i < 4){
            System.out.println("Week: " + i);
            int k = 1;                                     // For yapisini while yapisina cevirmis olduk.

            while(k < 8){
                System.out.println("   Day: " + k);
                k++;
            }
            i++;
        }

        System.out.println();

        //2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        //****
                        //****
                        //****
        //Note: Get the number of the rows and the columns from user
                                                         // Bu tarz sekil cizdirme sorulari INTERVIEW de cikar.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rows = input.nextInt();
        System.out.println("Please enter number of columns");
        int columns = input.nextInt();

        for(int r = 1; r <=rows; r++){

            for(int c = 1; c <= columns; c++){
                System.out.print("* ");
            }
            System.out.println();  // Sadece alt satira gecmesi icin bos sout attik arasina.

        }

        System.out.println();


        /*3.Example: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

        System.out.println("Please enter row number");
        int row = input.nextInt();
        //System.out.println("Please enter number of column");  // Kullanicidan bunlari almaya gerek yok cünkü degisiyor. Satir sayisi.
        //int columns1 = input.nextInt();

        for(int m = 1; m <= row; m++){

            for(int n = 1; n <= m ; n++){
                System.out.print(n + " ");
            }
            System.out.println();

        }







    }
}
