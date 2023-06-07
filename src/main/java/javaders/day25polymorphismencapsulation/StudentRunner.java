package javaders.day25polymorphismencapsulation;

public class StudentRunner {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.getStdId());  // AC2023102T  Bu sekilde private olmasina ragmen get olusturdum bu classta gördüm.

        System.out.println(s1.getGpa());  // 3.87  Getter olusturduktan sonra private methodu baska class'ta gördüm.

        System.out.println(s1.isSuccessful()); // false

        // Gpa 3.87 den 3.99 ile degistirildi.
        s1.setGpa(3.99);
        System.out.println(s1.getGpa()); // 3.99







    }
}
