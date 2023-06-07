package introduction.day03scanner;

//Java'nin util Library den Scanner Class import edildi demektir. Disardakileri iceriye almis oluyor. Ithal ediyor !!!
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. Adim : Scanner Class'tan bir obje olustur.
        Scanner input = new Scanner(System.in);
        //Obje ismini input yaptik cünkü bu object kullanicidan alinan datayi benim kodlarimin icine koyacak.

        //2. Adim : Kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz...");

        //3. Adim : Uygun Method'u kullanarak kullanicinin verdigi data'yi Memory'e yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);



    }
}
