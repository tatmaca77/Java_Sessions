package javaders.day21datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {
        
        
        /** Anlik zamani nasil aliriz ? **/
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println("myCurrentTime = " + myCurrentTime); // 20:44:21.115401
        
        /** Anlik zamanda bilesenler nasil alinir? **/
        int hour = myCurrentTime.getHour();
        System.out.println("hour = " + hour); // 20
        int minute = myCurrentTime.getMinute();
        System.out.println("minute = " + minute); //46
        int second = myCurrentTime.getSecond();
        System.out.println("second = " + second); //32
        int nano = myCurrentTime.getNano();
        System.out.println("nano = " + nano); // Bu Nano Saniye'dir.

        /** Gelecek ve Gecmis zamana nasil gidilir? **/
        LocalTime next = myCurrentTime.plusMinutes(10).minusSeconds(11);
        System.out.println("next = " + next);

        /** Zaman formati nasil degistirilir? **/  //Yani burda Nano dan kurtulabilir, saat seklini degistirebiliriz. Hersey olur.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        // "HH" 24'luk saat sistemini, "hh" 12'lik saat sistemini kullanir.
        // "HH:mm a" ifadesindeki " a" 12'lik saat sisteminde "AM" , "PM" yazilmasini saglar.
        // "mm" dakikayi "ss" ise saniyeyi gösterir.
        // "mm" "minute" demektir. Eger "MM" olursa "month" demek olur.
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println("formattedMyCurrent Time = " + formattedMyCurrentTime); // 21.00

        LocalTime losAngeles=LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(losAngeles);
        DateTimeFormatter bdr=DateTimeFormatter.ofPattern("hh:mm a");
        String formattedbdr = bdr.format(losAngeles);
        System.out.println("formattedbdr = " + formattedbdr);

        LocalDate dogu=LocalDate.of(1996,4,9);
        DayOfWeek gun=dogu.getDayOfWeek();
        System.out.println("gun = " + gun);

        /**Date formati nasil degistirilir? **/ 
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println("myCurrentDate = " + myCurrentDate); //  2022-08-25

        /** Tarihi Ay/Gun/Yil sekline ceviriniz. **/
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println("formattedMyCurrentDate = " + formattedMyCurrentDate); // 08/25/2022

        /** Tarihi Gun/Ay isminin ilk 3 harfi/Yil sekline ceviriniz. **/   
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println("formattedMyCurrentDate2 = " + formattedMyCurrentDate2); // 25/Aug/22

        /** Tarihi Gun/Ay ismi ilk 3 harfi/Yil sekline ceviriniz. **/
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println("formattedMyCurrentDate3 = " + formattedMyCurrentDate3); // 25/August/2022

        /** Baska bir zaman dilimindeki tarih ve zamani nasil aliriz? **/

        // Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateInTokyo = " + dateInTokyo);

        // Istanbul'da ayin kaci?
        LocalDate dateInIstanbul = LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("dateInIstanbul = " + dateInIstanbul);

        // Tokyo'da saat kac ?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInTokyo = " + timeInTokyo); // 09:21:16.331507100
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("HH:mm: a");
        String formattedTimeTokyo = dtf5.format(timeInTokyo);
        System.out.println("formattedTimeTokyo = " + formattedTimeTokyo); // 09:21: vorm.

        // Stuttgart'ta saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("timeInStuttgart = " + timeInBerlin);

        
        


    }
}
