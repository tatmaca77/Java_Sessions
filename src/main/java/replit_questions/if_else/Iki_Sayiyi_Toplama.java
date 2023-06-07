package replit_questions.if_else;

public class Iki_Sayiyi_Toplama {

    public static void main(String[] args) {

        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT      :

25

46

OUTPUT :

Numaralarin Toplami:

71
         */

        long sayi1 = 25;
        long sayi2 = 46;

        long toplam = sayi1 + sayi2;

        if (toplam >= 0 || toplam <= 999999999L){
            System.out.println("Numaralarin Toplami: " + toplam);
        }else {
            System.out.println("OverFlow");
        }



    }

}
