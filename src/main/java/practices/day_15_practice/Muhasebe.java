package practices.day_15_practice;

public class Muhasebe extends Personal{

    protected int saatUcreti;
    protected  String statu;
    protected int maas;
    protected int maasHesapla(){
        int maas=saatUcreti*8*30;
        return maas;
    }

}
