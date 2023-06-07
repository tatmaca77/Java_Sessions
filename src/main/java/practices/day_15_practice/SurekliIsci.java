package practices.day_15_practice;

public class SurekliIsci extends Isci {

    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SurekliIsci surIc1 = new SurekliIsci();
        surIc1.persNo = 5001; // personel
        surIc1.isim = "Cem";  // personel
        surIc1.soyisim = "Oz"; // personel
        surIc1.statu = "Isci";  // muhasebe
        surIc1.saatUcreti = 11;  // muhasebe
        surIc1.maas = surIc1.maasHesapla();  // muhasebe
        System.out.println(surIc1.persNo); // 5001
        System.out.println(surIc1.toString());

    }

}