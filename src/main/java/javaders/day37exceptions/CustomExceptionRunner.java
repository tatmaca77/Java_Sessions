package javaders.day37exceptions;

/**
Kodumuz icinde else kisminda throw new yazarken ismini verdigimiz exception'i exceptionlar arasinda gorduk ve sectik.
Burada IllegalGradeException altinda kirmizi cizgi cikti. Bu cizgi uzerine gelince
iki ihtimal gorduk ya try catch'i sececegiz ya da main method yanina throws olarak exception atilmasini saglariz.
Biz bu ikinci yolu sectik.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

    /**
     1) try kullandigimizda her senaryo icin calismasini istedigimiz kodlari "finally block" icine koyariz.
        "finally block" catch olmadan da kullanilir ama 3'ü bir arada daha iyidir.

     2) "final", "finally", "finalize" aciklar misiniz ?  ***** INTERVIEW ***** KESIN OGREN !!!!!

        "finalize" : "Garbage Collector" memory'i temiz tutmak icin surekli memory'i tarar ve silinmesi gerekeni siler.
                      "Garbage Collector" silmeden önce silecegi data'lari "finalize" eder ve sonra siler.

     *** Asla ihlalinin yapilmasini istemedigimiz durumlarda Exception  olustururuz. Bu sekilde App icin yapilmasini
         istemedigimiz hatalari bu sekilde mesaj ile bildirmis oluruz.

        2 tür Custom Exception vardir. RunTimeException(extends Exceptions) ve CompileTimeException.(extends Exceptions)
        Mesaj versin istersen Constructor olusturup mesaji icine yazarsin.
     */

    public static void main(String[] args) throws IllegalGradeException {

        System.out.println(getGrades());

        try {
            printAge(-45);
        }catch (IllegalAgeException e) {
            System.out.println(e.getMessage()); // Technische Nachricht => Ages cannot be negative
        }finally{
            System.out.println("I always work");
        }
        /** Her senaryo icin calismasini istediginiz code olursa finally atarsin. */



    }
// Example 1 : Ogrenci notlarini bir List'e ekleyen methodu olusturunuz.
    public static List<String> getGrades() throws IllegalGradeException{

        List<String> grades = new ArrayList<>();
        String grade = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the grade. To stop entering press q...");
            grade = input.next();

            int intGrade = 0;

            if (!grade.equals("q")){
                intGrade = Integer.valueOf(grade);
            }

            if (grade.equals("q")){
                break;
            }else if(intGrade >= 0 && intGrade <= 100) {
                grades.add(grade);
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }

        }while(!grade.equals("q"));

        return grades;


    }

    // Example 2 : Kullanicinin yasini console 'a yazdirin methodu olusturnuz.
    public static void printAge(int age){
        if(age < 0){
            throw new IllegalAgeException("Ages cannot be negative.");
        }
        System.out.println(age);
    }


}
