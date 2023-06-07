package practices.day_15_practice;

public class Ustabasi extends Isci {

    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", \n saatUcreti=" + saatUcreti +
                ", \nstatu='" + statu + '\'' +
                ", \nmaas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Ustabasi ustabasi1 = new Ustabasi();
        ustabasi1.isim = "Murat"; // personel
        ustabasi1.soyisim = "Gokcek"; // personel
        ustabasi1.saatUcreti = 15; // muhasebe
        ustabasi1.maas = ustabasi1.maasHesapla(); // muhasebe
        ustabasi1.statu = "Isci"; // muhasebe
        ustabasi1.isciStatu = "Ustabasi"; // isci
        ustabasi1.mesai(); // isci
        System.out.println(ustabasi1.isim); //Murat
        System.out.println(ustabasi1.toString());
    }

}
