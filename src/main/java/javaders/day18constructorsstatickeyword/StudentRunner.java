package javaders.day18constructorsstatickeyword;

public class StudentRunner {

    /**INTERVIEW
    // Class ismi ile static olmayanlari göremem. Obje olusturmaliyim
    // Static olanlar Class ismi ile cagirilir.
    // Static olmayan object ile cagirilir.
     **/

    public static void main(String[] args) {
       // Static olan "numOfRegisteredStd" variabl'ini cagirmak icin sadece class ismini kullandik. Object olusturmadik.
        System.out.println(Student.numOfRegisteredStd); // 0

        //Static olmayan "num" variable'ini cagirmak icin Object olusturduk.
        Student s1 = new Student();
        System.out.println(s1.num); // 0

        // Static olan "numOfRegisteredStd" variabl'ina object üzerinden de ulasilabilir ancak yapilmamalidir. !!!!
        System.out.println(s1.numOfRegisteredStd);// Bu calisir ama yanlis bir uygulamadir. !!!!!!


    }
}
