package practices.day_15_practice;

public class Memur extends Muhasebe{

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
    // toString() methodu objelerin tum ozelliklerini yazdırmak icin pratik bir yontem
    public static void main(String[] args) {
        Memur memur1 = new Memur();
/**
memur1 objesi, memur class'ının objesi olmasına ragmen
inherit ettigi muhasebe ve onunda parent'ı olan personel
class'larındaki tum dataları alabilir.
 */
        // personel class'ından
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepe";
        memur1.adres="Ankara";
        memur1.tel="312456785";
        // muhasebe class'ından
        memur1.saatUcreti=10;
        memur1.statu="Memur";
        memur1.maas=memur1.maasHesapla();
        System.out.println(memur1.persNo); // 1001
        System.out.println(memur1.maas); // 2400
        System.out.println(memur1.toString());

        Memur memur2 = new Memur();
        memur2.persNo=1002; // personel
        memur2.saatUcreti=10; // muhasebe
        memur2.maas=memur2.maasHesapla(); // muhasebe
        System.out.println(memur2.toString());
        // artık bu fabrikada istedigimiz kadar memur uretebiliriz
        // urettigimiz her memur, muhasebe class'ındaki ve personel class'ındaki tum ozellikleri inherit etmis olur
    }

}
