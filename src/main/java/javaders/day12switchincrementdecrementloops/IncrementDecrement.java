package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class IncrementDecrement {


    public static void main(String[] args) {

        /*
           1) "Increment" artirmak demektir, "Decrement" azaltmak demektir.7
           2) "Incrrement" toplama ve carpma ile , "Decrement" cikarma ve bölme ile yapilabilir.
           3)"Increment" ve "Decrement" 3 yolla yapilabilir.
                 i) int i = 10; ==> i = i + 5;
                 ii) int i = 10; ==> i = i += 5;
                 iii) int i =10; ==> i++;
                        Note : 3.yol sadece 1 artirmak icin kullanilabilir.

                 i) int i = 10; ==> i = i - 5;
                 ii) int i = 10; ==> i = i -= 5;
                 iii) int i =10; ==> i--;
                        Note : 3.yol sadece 1 azaltmak icin kullanilabilir.

         */

        int age = 12;
        System.out.println(age);//12
        // Java soldan saga calistifi icin önce age görür direkt onu alir artirmayi görmez.

        //age = age++; 12 //       Atama yapmazsan 13 yazar.  "Post Increment" age++;


        age = ++age;  // burda önce artirmayi görür sonra age icine koyar.   // Pre Increment //13

        System.out.println("age = " + age);//13

        int salary = 40;

        salary = salary--;  // Ayni sayiyi verir. ama  salary = --salary; böyle olursa "Post Decrement" olur.
        System.out.println("salary = " + salary); // 40

        --salary; // Pre Decrement
        System.out.println("salary = " + salary); //39

        System.out.println();


        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangıç deger!n! g!r!n!z");
        int bas = scan.nextInt();
        System.out.println("B!t!s deger!n! g!r!n!z");
        int bit = scan.nextInt();
        int carpim = 1;
        int toplam = 0;
        if (bas <= bit) {
            for (int i = bas; i <= bit; i++) {
                toplam = toplam + i;
            }
        } else {
            for (int i = bas; i >= bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.print(carpim);
        System.out.println(toplam);


        System.out.print(toplam);
        System.out.println(carpim);














    }//main
}//class
