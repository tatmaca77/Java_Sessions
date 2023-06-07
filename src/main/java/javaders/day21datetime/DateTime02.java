package javaders.day21datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("ldt = " + ldt); // 2023-03-18T01:29:52.369659700

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
        String formattedLdt = dtf1.format(ldt);
        System.out.println("formattedLdt = " + formattedLdt); // 3/18/2023 - 01:34 vorm.







        
    }
}
