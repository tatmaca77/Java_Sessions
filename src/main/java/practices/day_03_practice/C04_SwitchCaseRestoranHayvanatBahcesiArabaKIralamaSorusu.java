package practices.day_03_practice;

import java.util.Scanner;

public class C04_SwitchCaseRestoranHayvanatBahcesiArabaKIralamaSorusu {

    public static void main(String[] args) {

            /*

Bir restoranda, müşteriler menüden yemeklerini seçerler.
Restoran, müşterilerin seçtiği yemeği pişirmek için bir
program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
belirlendigi bir program yaziniz
hamburger 200 tl
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a menu");
        String yemek = input.nextLine().toLowerCase();

        switch(yemek){
            case "hamburger":
                System.out.println("Hamburger menüsü 200 TL");
                break;
                case "pizza":
                    System.out.println("Pizza menüsü 100 TL");
                    break;
                    case "burrito":
                        System.out.println("Buritto menüsü 150 TL");
                        break;
            default:
                System.out.println("Menüde bu yemek yok.");
        }

        /*
        Bir arac kiralama sitesinde secilen araba markasina göre ve kiralama ücretine
        göre toplam ödenecek fiyati gösteren code'u yaziniz.

        SUV ==> 500.0
        SEDA ==> 400.0
        HATCBACK ==> 350.0
        geriye kalanlar ==> 300.0
        double toplamUcret = kiralamaUcreti * kiralanacakGunSayisi;
         */


        String marka = "SUV";
        int kiralanacakGunSayisi = 5;
        double kiralamaUcreti ;

        switch(marka){
            case "SUV":
                kiralamaUcreti= 500.0;
                break;
            case "SEDA":
                kiralamaUcreti = 400.0;
                break;
            case "HATCBACK":
                kiralamaUcreti = 350.0;
                break;
            default :
                kiralamaUcreti =300.0;
                break;
        }
        double toplamUcret = (kiralamaUcreti * kiralanacakGunSayisi);
        System.out.println("toplamUcret = " + toplamUcret);

        /*
Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
kontrol eden bir program yaziniz
                               (elephant, lion , giraffe)
                               default ==> belirli hayvan bulunamadi
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi hayvanı beslemek istersiniz");
        String animal = scanner.next().toLowerCase();

        switch(animal){
            case "elephant":
                System.out.println("Fili besle");
                break;
            case "lion":
                System.out.println("Aslani besle");
                break;
            case "giraffe":
                System.out.println("Zürafayi besle");
                break;
            default:
                System.out.println("Belirsiz bir hayvan ismi");
        }
    }
}
