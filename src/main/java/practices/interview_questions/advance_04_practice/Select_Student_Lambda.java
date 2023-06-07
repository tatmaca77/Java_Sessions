package practices.interview_questions.advance_04_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Select_Student_Lambda {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ögrenci sayisini giriniz...");
        int numStd = input.nextInt();                      // Tek bir variable var yoksa bir List'e ihtiyacimiz vardir.

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

       List<Student> selectedStudent =  Stream.concat(   students.  // concat ile ikisini birlestirdim. filtreledigim objeslerimi k ve e leri toparladim.
                        stream().
                        filter(t -> t.getGender().equals("K") && t.getHeight() > 1.50
                                && t.getWeight() > 50 && t.getWeight() < 70),
                students.
                        stream().
                        filter(t -> t.getGender().equals("E") && t.getHeight() > 1.60
                                && t.getWeight() > 70 && t.getWeight() < 90)).
                collect(Collectors.toList()); // burda bir List icinde toparladim

        if (selectedStudent.isEmpty()) {

            System.out.println("============ Kursa secilen Ogrenciler =================");

            System.out.println("Malesef kurs gereksinimlerini karsilayan ogrenci bulunamadi");
        }else {
           selectedStudent.forEach(t-> System.out.println("isim : " + t.getName()+ " cinsiyet : " + t.getGender() +
                   " boy : " + t.getHeight() + " kilo : " + t.getWeight()));
        }
        
        long time2 = System.nanoTime();
        long funtionalProgramming = time2 - time1;
        System.out.println("funtionalProgramming = " + funtionalProgramming/1000+" nano saniye"); //71027 nano saniye
        
        
    }// main body
}
