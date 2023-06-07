package practices.interview_questions.advance_04_practice;

public class Ogrenci {

    /** ------1.Adim-------- istenilen datalar icin Variable'lar olusturduk. */
   private  String isim;
   private  String cinsiyet;
   private  double boy;
   private  double kilo;

   public Ogrenci() {

   }

   /** ------- 2.Adim-------- Bu Variable'lari kullanaabilmek icin parametreli Constructor olusturduk. */
    public  Ogrenci(String isim, String cinsiyet, double boy, double kilo) {
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.boy = boy;
        this.kilo = kilo;
    }

    /** ---------- 3.Adim ----------- Direkt verileri degistirmeden girildigi gibi alacagim icin getter olusturuldu
                                      Veriler üzerinde degisiklik yapmayacagimiz icin setter olusturulmadi. !!! */

    public String getIsim() {
        return isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public double getBoy() {
        return boy;
    }

    public double getKilo() {
        return kilo;
    }


    /** --------- 4.Adim --------- Bu verileri ekranda görebilmek icin Override edildi ve toString kullanildi. */
    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", boy=" + boy +
                ", kilo=" + kilo +
                '}';
    }
}
