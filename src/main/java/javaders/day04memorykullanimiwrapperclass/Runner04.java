package javaders.day04memorykullanimiwrapperclass;

public class Runner04 {

    // Main Method sadece Runner Class ta olur. Diger class larda main olmasina gerek yok.

    public static void main(String[] args) {

        OgrenciEmrah ogrenci = new OgrenciEmrah();

        System.out.println(ogrenci.brans);
        System.out.println(ogrenci.name);
        System.out.println(ogrenci.age);
        ogrenci.study();
        ogrenci.derseDevam();

        /*     Runner Class özellikleri.

          1) Icerisinde Main Method'ubarindirir.
          2) Hangi Class'in ve o Class'in icindeki Variables ve Methods calismasini istiyorsan o Class ile Object olusturmalisin.

          OgrenciEmrah  ogrenci = new OgrenciEmrah();

          3) Aslinda Best Practice'dir ama biraz zor olabilir.
          Cünkü her yazilan Class'a ait kendi Main Method'u olunca hepsi kendi icinde calisir.
          Bu sekilde düzenli olur Kod uzamaz ve istedigin zaman sadece Runner Class icinde
          istedigin Class icin Object olusturup calistirabilirsin.
         */
    }//main
}//class
