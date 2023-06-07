package practices.interview_questions.advance_04_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// karakteri alirken eger char ise charAt kullanirsin String ise substring kullan

public class Select_Student {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ögrenci sayisini giriniz...");
        int numStd = input.nextInt();                      // Tek bir variable yoksa bir List'e ihtiyacimiz vardir.

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numStd; i++) {  // for icine aldik cünkü tekrar tekrar sorsun ogrenci saysisina kadar sorsun.
            System.out.println("isim : "); // tolga
            String name = input.next();
            System.out.println("cinsiyet : "); // erkek
            String gender = input.next().toUpperCase().trim().substring(0,1);

            System.out.println("boy : "); // 1.78
            double height = input.nextDouble();
            System.out.println("kilo : ");
            double weight = input.nextDouble(); // 78

            Student student = new Student(name,gender,height,weight);

            students.add(student);  // olusturdugum student objeyi icinde verileriyle beraber students Listine ekledik.
        }//for body

        long time1 = System.nanoTime();

        List<Student> selectedStudents = new ArrayList<>();  // secilmis ögrenci listesine eklemek icin List olustruduk.

        for (Student student : students) {
            if (student.getGender().equals("K") && student.getHeight() > 1.50
                    && student.getWeight() > 50 && student.getWeight() < 70){
                selectedStudents.add(student);
            } else if (student.getGender().equals("E") && student.getHeight() > 1.60
                    && student.getWeight() > 70 && student.getWeight() < 90) {
                selectedStudents.add(student);
            }
        } // for each

        System.out.println("============ Kursa secilen Ogrenciler =================");

        if (selectedStudents.size() == 0) {  // yani hic ögrenci secilmemis ise
            System.out.println("Malesef kurs gereksinimlerini karsilayan ogrenci bulunamadi");
        }else {
            for (Student student : selectedStudents) {
                System.out.println(student.toString());
            }
        }

        long time2 = System.nanoTime();
        long structuredProgramming = time2 - time1;
        System.out.println("structuredProgramming = " + structuredProgramming/1000+ " nano saniye");// 60988 nano saniye



    }// main body
}// class body
