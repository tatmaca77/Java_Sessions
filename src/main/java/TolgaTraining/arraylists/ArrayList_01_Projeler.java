package TolgaTraining.arraylists;

import java.util.ArrayList;

public class ArrayList_01_Projeler<T> {

    public static void main(String[] args) {

        //ArrayList le (4,5,2,3,4,5) hepsini sadece bir kere yaz   == 2 3 4 5

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);

        sayilar.clear();
        System.out.println(sayilar);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(3);
        System.out.println("sayilar = " + sayilar);

        System.out.println();

        /*
          Soru-01: Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir METHOD create ediniz.
            Ör: Input : 50
            Bolenler : 2,5,10,20,50
            Asal Bolenler: 2,5
            En buyuk asal carpan: 5
         */
        int enBuyukAsal = enBuyukAsalCarpan(50);
        System.out.println("En büyük asal çarpan: " + enBuyukAsal);

    }

    public static int enBuyukAsalCarpan(int sayi) {
        int enBuyukAsal = 1;
        for (int i = 2; i <= sayi / i; i++) {
            if (sayi % i == 0) {
                enBuyukAsal = i;
                sayi /= i;
            }
        }
        if (sayi > 1) {
            enBuyukAsal = sayi;
        }
        return enBuyukAsal;

    }

}

