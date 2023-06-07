package javaders.day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        /** Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz ? **/
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println("myCurrentDate = " + myCurrentDate); // 2023-03-15 --- Bugün'nün tarihi
        
        /** Tarihten istedigimiz bileseni nasil aliriz ? **/
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println("monthValue = " + monthValue); // 3
        int yearValue = myCurrentDate.getYear();
        System.out.println("yearValue = " + yearValue); // 2023
        int dayOfMonth = myCurrentDate.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth); // 15

        /** Asagidaki "Month" bir Enum 'dir. **/
        /** Enum , Java'da sabit degerleri(Ay isimleri, Gün isimleri, Ulkedeki sehir isimleri) depolamak icin kullanilir. **/
        Month monthName = myCurrentDate.getMonth();
        System.out.println("monthName = " + monthName); // MARCH

        /** Asagidaki "DayOfWeek" bir "Enum"'dir. **/
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println("dayName = " + dayName); // WEDNESDAY
        
        /** Ileriki tarihe nasil gidilir ? **/
        System.out.println(myCurrentDate.plusDays(14).plusMonths(2).plusYears(4)); // 2027-05-20

        /** Gecmis zamana nasil gidilir ? **/
        LocalDate gecmis = myCurrentDate.minusDays(1).minusMonths(1).minusYears(28);
        System.out.println("gecmis = " + gecmis); // 1995-02-14

        /** Specific bir tarih objesi nasil olusturulur ? **/
        LocalDate tolgaDateOfBirth = LocalDate.of(1995, 4,28);
        LocalDate ayseDateOfBirth = LocalDate.of(1967, 4, 23);

        /** Bir tarihin bir tarihten sonra olup olmadigi nasil kontrol edilir ? **/
        boolean r1 = tolgaDateOfBirth.isAfter(ayseDateOfBirth);
        System.out.println("r1 = " + r1); // true

        /** Bir tarihin bir tarihten önce olup olmadigi nasil kontrol edilir ? **/
        boolean r2 = ayseDateOfBirth.isBefore(tolgaDateOfBirth);
        System.out.println("r2 = " + r2); // true

        /** Bir tarihin bir tarihe esit olup olmadigi nasil kontrol edilir ? **/
        boolean r3 = tolgaDateOfBirth.isEqual(ayseDateOfBirth);
        System.out.println("r3 = " + r3); //false         // Hem ay hem yil hem gün tamamen ayni olmasi lazim yoksa false


        /*
           Example 1 : Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz,
                       Kullanicidan alidginiz tarih gelecege ait ise "Zamani girebilirsiniz" diyiniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order... ");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

            if (givenDate.isBefore(LocalDate.now())) {
                System.out.println(givenDate + " Invalid Date");
            } else {
                System.out.println("Enter time for the ticket");
            }

         /** Ayin kac gün oldugunu buluruz **/
        int lengthOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println("lengthOfMonth = " + lengthOfMonth);


        /*
           Example 2 : Kullanicinin girdigi tarihin gün ismini bulan kodu yaziniz.
         */

        System.out.println("Please enter year, month and day numbers in the given order... ");
        int yil = input.nextInt();
        int ay = input.nextInt();
        int gun = input.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
        System.out.println(date.getDayOfWeek());  // Burda gecmis tarihin gününü bulduk. Dogum tarihi günü gibi.


        










    }
}
