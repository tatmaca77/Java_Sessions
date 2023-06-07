package javaders.day15loopsarrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedLoopTraining {

    public static void main(String[] args) {


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

           // 1.WAY Nested for-loop
        for (int i = 1; i < 5 ; i++){
            System.out.println(" Week : " + i);

            for(int k = 1; k< 8; k++){
                System.out.println("   Day : " + k);
            }
        }
        System.out.println();
        //2.WAY Nested while-loop

        int i =1;

        while(i < 4){
            System.out.println(" Week : " + i);

            int k = 1;

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

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns");
        int columns = input.nextInt();


        for (int t = 1 ; t <= rows; t++){

            for (int z = 1; z <= columns; z++){
                System.out.print("*");

            }
            System.out.println();
        }


        System.out.println();


        //2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
        //1
        //12
        //123
        //1234
        //Note: Get the number of the rows and the columns from user
        System.out.println("Please enter the number of rows");
        int rowss = input.nextInt();

        for(int m = 1; m <= rowss; m++){

            for (int n = 1 ; n <= m; n++){
                System.out.print(n + " ");
            }
            System.out.println();
        }









    }

}



