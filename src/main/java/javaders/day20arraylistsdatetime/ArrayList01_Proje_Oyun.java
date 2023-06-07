package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01_Proje_Oyun {

    /**
        1) String Class kullanmak tercih edilir cünkü String Class Method acisindan cok zengindir.
        2) List.of() kullanarak kisa yoldan List olusturulabulir ancak
           i) bu List'in elemanlari degistirilemez. set() kullanilmaz
           ii) Bu List'lere yeni eleman eklenemez.  add() kullanilmaz.
           iii) Bu List'lere var olan elemani silemezsiniz. remove() kullanilamaz.

    **/
    /*
       Kullanicinin girdigi harf list'te var ise o harfi "Buldum!"'a cevir yoksa o harfi list'e ekleyin.

     */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();  /** List.of() ile olusturlan elemanlar degistirilemez !!!! **/
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size = myList.size();

        Scanner input = new Scanner(System.in);
                                                     // do-while ile döngüye aldik ve islem hep tekrarlar.Oyun yani.,
        int counter = 0;
        do {
            if (counter == size){
                System.out.println(myList);
                break;
            }
            System.out.println("Please enter a letter...");
            String letter = input.next().toUpperCase().substring(0, 1);  // Kucuk harf buyuk harf duyarliligi icin to UpperCase ile hepsini büyttüm.

            if (myList.contains(letter)) {                      // Liste te varsa degistir yoksa ekle.

                myList.set(myList.indexOf(letter), "Buldum!");
            } else {
                myList.add(letter);                      // Z yani olmayan elemani girince sonuna ekler.
            }

            counter++;
        }while(true);

        List<String> list = new ArrayList<>();  /** List.of() ile olusturlan elemanlar degistirilemez !!!! **/
        list.add("A");
        list.add("H");
        list.add("J");
        list.add("K");
        list.add("M");

        Scanner input1 = new Scanner(System.in);

        int counter1 = 0;
        int can = 3;
        do {
            if (counter1 == can){
                System.out.println(list);
                break;
            }
            System.out.println("Please enter a letter...");
            String letter1 = input1.next().toUpperCase().substring(0, 1);  // Kucuk harf buyuk harf duyarliligi icin to UpperCase ile hepsini büyttüm.

            if (list.contains(letter1)) {                      // Liste te varsa degistir yoksa ekle.

                list.set(list.indexOf(letter1), "Buldum!");
            } else {
                list.add(letter1);                      // Z yani olmayan elemani girince sonuna ekler.
            }

            counter1++;
        }while(true);










    }

}
