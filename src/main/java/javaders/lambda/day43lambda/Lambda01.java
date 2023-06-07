package javaders.lambda.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    /** Lambda "Object" lerle nasil calisir ? */

    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish Daytime QA",213,"Spring",97);
        Course turkishNight = new Course("Turkish Nighttime QA",245,"Winter",98);
        Course englishDay = new Course("English Daytime Java Dev",121,"Spring",91);
        Course englishNight = new Course("English Nighttime Java Dev",137,"Winter",95);

        //List<Course> courses = new ArrayList<>(Arrays.asList(turkishDay,turkishNight,englishDay,englishNight));
        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);


        System.out.println(isAverageScoreGreaterThanANumber(courseList,90)); // true
        System.out.println();
        System.out.println(isAnyCourseNameContainsQa(courseList,"QA")); // true
        System.out.println();
        System.out.println(getCourseNamesWhoseAvgMax(courseList)); // Turkish Nighttime QA
        System.out.println();
        System.out.println(getCourseBetterThanLastTwo(courseList));
        System.out.println();
        System.out.println(getHighestThird(courseList));
        //Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}
        System.out.println();
        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList,150));


    }

    //Example 1 : Tum average score'larin 90 dan buyuk olup olmadigini kontrol eden method'u olusturunuz.
    /**
    public static boolean isAverageScoreGreaterThanANumber (List<Course> courseList){
        return courseList.stream().allMatch(t->t.getAverageScore() > 90);
     */
/*
    Bu sekilde olusturdugumuz method sadece 90 dan buyuk olanlar icin calisir. Evet soruda oyle istiyor ancak
      Biz her senaryoda calismasini istedigimiz icin degitirelebilir ve yenilenebilir "Mutable" yapmaliyiz.
      Asagidaki  gibi :
     */
    public static boolean isAverageScoreGreaterThanANumber( List<Course> courseList, int avg){
        return courseList.stream().allMatch(t->t.getAverageScore() > avg);
    }

    // Example 2 : En az bir kurs isminin QA icerip icermedigini kontrol eden method'u olusturunuz.
    public static boolean isAnyCourseNameContainsQa (List<Course> courseList, String word){
        return courseList.stream().anyMatch(t->t.getCourseName().contains(word));
    }

    // Example 3 : En yüksek average score'a sahip kurs ismini veren code'u yainiz.
    public static String getCourseNamesWhoseAvgMax (List<Course> courseList){
         Course course = courseList.stream().
                 sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                 findFirst().
                 get();
         return course.getCourseName();
         /*
         Eger yaptigimiz islemi bir kere kullanmayacaksak bu sekilde bir yol izlemeliyiz. Yani bize ayni soruda
         season isminide ögrenmek isteyebilirdi. Bu sekilde cok kolay bir sekilde hepsini cagirabiliriz.
         return course.getSeason();
         return course.getNumOfStudents(); gibi.
         Ama bir kere kullanacaksak soruda istedigi gibi :

         return courseList.stream().
                 sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                 findFirst().
                 get().getCourseName();  olur.
          */
         /** Burda yaptigimiz islemde dedik ki :
             course'u stream ile akisa al ve Average'a göre tersten bir siralama yap.
             Bu sekilde bize en büyük avrega score sahip elemani ilk basta verir yani
             buyukten kucuge dogru siralar.
           Sonrasinda:
             findFirst() method'u ile biz ilk siradaki elemani aliriz. Bu method bize
              Optional Int verdigi icin get() methodu ile o uyumsuzlugu cozduk.
             Ve bu islemleri course icine koyduk.
           En Sonda : o icine koydugumuz bilgilerin return course.getCourseName() ile
            return ettik ve ilk siradaki elemanin icindeki datalardan sadece kurs
          ismini almis olduk.
          */
    }

    // Example 4 : Average Score'u en dusuk olan ilk iki course disindaki tum kurslari return eden method'u olusturunuz.
    public static List<Course> getCourseBetterThanLastTwo (List<Course> courseList){
        //return type'i List yaptik cunku birden cok data istiyor. Coklu Datalar List'de depolanir. !!!!
         return courseList.stream().
                 sorted(Comparator.comparing(Course::getAverageScore)).
                 skip(2). // Verilen degere gore kac kere atlatma yapacagini belirlersin. Es gec !!!
                 collect(Collectors.toList());

         /** Biz burda Averaga Score'a göre en iyi olan iki tane kursu almis olduk.
              Stream() ile akisa aldik.
              sorted() ile natural order da Avreaga Score'a gore siralama yaptik.
              skip(); methodu ile atlatma yaptik. Icine "int" bir deger yazariz. Yani index'e gore calisti.
              collect(Collectors.toList()); methodu ile sonucu bir List icinde verdik.
              Tüm islemleri return icinde yapmis olduk. */

    }

    // Example 5 : Average Score'u ucuncu olan kursu veren methodu olusturunuz.
    public static Course getHighestThird (List<Course> courseList){
        //return type'i ni List yapmaya gerek yok. Cünkü bizden sadece bir tane data istiyor.
        return courseList.stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);

        /** Bu soruda; ustten 3.dedigi icin en büyükleri en basa almam gerekiyor. Bu yüzden; sorted() methodu icinde
            reversed() methodu ile tersten büyükten kücüge dogru siraladim.
            skip() methodu ile ilk iki datayi es gectim.
            limit (); method'u ile birlikte sonraki ilk elemani aldik.
             collect ile List'e koyduk. Sonrasinda bize Compiletime Exception verdi. Cünkü data type List degildi.
             Bizde 0. index'i al dedik get(0); method'u ile birlikte.
         */

    }

    // Example 6 : Ogrenci sayisi 150'den az olan kurslari return eden method'u olusturunuz.
    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber (List<Course> courseList, int a){
        return courseList.stream().
                filter(t->t.getNumOfStudents() < a).
                collect(Collectors.toList());
    }
}
