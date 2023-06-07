package introduction.day03scanner;

public class Car {

    //Variable'lar olusturalim.
    public String model = "Corolla";
    public int fiyat = 20000;

    //Method'lar olusturalim.
    //Note : "return type" void oldugu zaman method icinde "return" keyword u kullanilmaz.
    //Eger bir method yeni bir data üretmiyorsa sadece belli bir islem yapiyorsa return type "void" olur.
    public void hareket (){
        System.out.println("Corolla hizli hareket eder...");


    }

    public void dur (){
        System.out.println("Corolla güvenli bir sekilde durur...");

    }

}
