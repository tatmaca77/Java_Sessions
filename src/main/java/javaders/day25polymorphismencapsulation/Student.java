package javaders.day25polymorphismencapsulation;

public class Student {

    public String stdName = "Tolgahan";
    public int age = 23;


    // Encapsulation nedir ? ==> Data saklamaktir.!! (Data hiding)
    // Data'yi nasil saklarsin ? ==> Access Modifier'ini "private" yaparak.
    private  String stdId = "AC2023102T";
    private double gpa = 3.87;  // Diploma Not Ortalmasi "gpa"
    private boolean successful = false;

    /** Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz
     Nasil okuruz ? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz. **/
    // i) get method'lari hep "public" olur.
    // ii) get method'larinin return type'i okundugu variable'in return type'i ile ayni olur.
    // iii) get method bir boolean variable icin olusturulduysa ismi "is" ile baslar.
    // iv) "get method" larin diger adi "Getter" dir.

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    /** Encapsulation yapilan Variable'in Data Type'i "boolean" ise get method ismi "is" ile baslar.**/
    public boolean isSuccessful() {
        return successful;
    }

    /** Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistirebiliriz. **/
    // Nasil degistirebiliriz? "set method" olusturarak Encapsulate edilmis data'nin degerini degistirebiliriz
    // i) "set method"lari hep "public" olur.
    // ii) "set method"un "return type"i hep "void" olur.
    // iii) "set method" parametre kullanir, parametre'nin data type'i variable ile ayni olur.
    // iv) "set method" kullanilarak varolan object üzerinde degisiklikler yaparak o object'i sanki
    // yeni bir object'mis gibi kullanabiliriz.
    // v) "set method"larin diger ismi "Setter" dir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
