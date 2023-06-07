package javaders.day22stringbuilder;

public class StudentRunner {

    public static void main(String[] args) {

        /** Burda direkt Class ismi ile methodlara ulasamadim, cünkü static degil, bu yüzden Student class ile Object
         * olusturdum ve o sekilde methodlari cagirdim. Eger Class tan direkt cagirirsan o "static"
         * Object ile methodlari cagiriyorsan "non-static" tir. !!!!!!1
         */
        Student std1 = new Student();
        System.out.println(std1.stdName); // Tolga Han

        System.out.println(std1.age);







    }
}
