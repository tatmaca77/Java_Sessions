package practices.day_16_practice_inheritance_overriding;

public class Opel extends Araba{

    protected String hiz = "Opel arabalar max 220 km hiz yapar";
    protected String marka = "Opel";
    protected String sirketMerkezi = "Almanya";
    protected void motor(){
        System.out.println("OPEL ARABALAR OPEL MARKA MOTOR KULLANIR");
    }
    protected void garanti(){
        System.out.println("OPEL ARABALAR 2 YIL GARANTİLİDİR");
    }
}
