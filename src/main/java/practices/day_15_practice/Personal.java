package practices.day_15_practice;

public class Personal {

    // bir fabrikada gerekli olan departmanları;
    // Personel, Muhasebe, Memur, Isci, Surekliİsci, Ustabasi olarak farklı classlara ayırınız
    // Muhasebe departmanı, Personel departmanına baglı olacak
    // Memur ve Isci departmanları, Muhasebe departmanına baglı olacak
    // Surekliİsci ve UstaBasi departmanları, İsci departmanına baglı olacak
    // Memur, Surekliİsci ve UstaBası departmanlarından obje olusturarak, variable'lara kendi departmanlarına gore deger atayınız ve yazdırınız
    // personel class'ı en ust class oldugu icin herkes icin var olan dataları burada olusturabiliriz
    protected int persNo;
    protected String isim;
    protected String soyisim;
    protected String adres="adres girilmedi";
    protected String tel="tel girilmedi";
}
