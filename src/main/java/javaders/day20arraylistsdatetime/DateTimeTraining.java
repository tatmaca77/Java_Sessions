package javaders.day20arraylistsdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeTraining {
    public static void main(String[] args) {

        /*
           Example 1 : Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz,
                       Kullanicidan alidginiz tarih gelecege ait ise "Zamani girebilirsiniz" diyiniz.
         */
        Scanner input = new Scanner(System.in);
        int counter = 0 ;
        do {
            if (counter == 3){
                System.out.println("Yeter amk");
                break;
            }
            System.out.println("Please enter year, month and day numbers in the given order... ");
            int year = input.nextInt();
            int month = input.nextInt();
            int day = input.nextInt();

            LocalDate givenDate = LocalDate.of(year, month, day);
            counter++;

            if (givenDate.isBefore(LocalDate.now())) {
                System.out.println(givenDate + " Invalid Date");
            } else {
                System.out.println("Enter time for the ticket");
            }

        }while (true);
    }
}
