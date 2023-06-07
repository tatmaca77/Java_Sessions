package practices.interview_questions.advance_04_practice;

public class Student {


    private String name;  // private yaparak Encapsulation'dan yararlanmis olduk. Bilgilerin gizliligi geregi.
    private String gender;
    private double height;
    private double weight;


    public Student(){

    }

    public Student(String name, String gender, double height, double weight) {
        this.name = name;       // Sana isim olarak veya digerler datalari al ve (this) bu class'taki varible'lara ekle dedik.
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {    // Burda bir veri degisikligi olamayacagi icin sadece getter ile get methodlari aldik.
        return name;             // Setter kullanmaya gerek yok.
    }


    public String getGender() {
        return gender;
    }


    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {   // Bu bütün bilgileri döndürüp ekranda görmemizi saglar.
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
