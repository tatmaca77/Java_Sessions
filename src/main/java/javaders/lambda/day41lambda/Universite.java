package javaders.lambda.day41lambda;

/** Bu Tarz Class'lara POJO Class ta denir */

/** Yani icinde hersey var , variable, method, class, constructor,getter ve setter ile diger class'lardan görmemizi saglar.
    toString ile bütün hepsini görmemizi saglar, Override eder. Hersey burdadir.  */

public class Universite {

    private String name;
    private String bolum;
    private int ogrenciSayisi;
    private int gpa;

    // Normalde Default Constructor vardi Ama Parametreli olunca o öldü. Yeni parametresiz constructor olusturmaliyiz !!
    public Universite() {

    }

    public Universite(String name, String bolum, int ogrenciSayisi, int gpa) { // Parametreli Constructor
        this.name = name;
        this.bolum = bolum;
        this.ogrenciSayisi = ogrenciSayisi;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "name='" + name + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", gpa=" + gpa +
                '}';
    }
}
