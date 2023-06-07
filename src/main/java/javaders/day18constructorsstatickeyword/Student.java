package javaders.day18constructorsstatickeyword;

public class Student {

    /**
     1) "static" "class members" lar tum object'ler tarafindan paylasilir. Yani ortak degeridir.
         ( GÖKTEKI AY )
     2) "static" "class members" lardaki degisiklikler tum object'ler tarafindan otomatik olarak görülür.
     3) "static" "class members"lar gökteki ay'in dünyaya bagli oldugu gibi, class'a baglidirlar.
         bu sebeple; "static variable"lara "class variable" da denir.
     4) "static" "class members"larin nasil calistigini anlamak icin cizim yapip static olanlari class'a
         olmayanlari object'e baglayarak dusunmek bu konuyu kolaylastirir.
     5) "static" "class members"'lari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez.
     6) "non-static" "class members"'lari cagirmak icin object olusturmak sarttir. !!!!!
     **/

    public static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student() {
        num++;
        numOfRegisteredStd++;
    }

    public static void main(String[] args) {

        System.out.println(numOfRegisteredStd);

        Student s1 = new Student();
        System.out.println(numOfRegisteredStd);

        Student s2 = new Student();
        System.out.println(numOfRegisteredStd);

        Student s3 = new Student();
        System.out.println(numOfRegisteredStd);

        System.out.println(s1.num); // 1
    }
}
