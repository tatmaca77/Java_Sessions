package practices.interview_questions.advance_04_practice;

import practices.interview_questions.advance_04_practice.Ogrenci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Secilmis_Ogrenciler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisini giriniz...");
        int ogrenciSayisi = input.nextInt();

        List<Ogrenci> ogrenciler = new ArrayList<>();

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println("isim : ");
            String isim = input.next().toLowerCase();
            System.out.println("cinsiyet : ");
            String cinsiyet = input.next().toLowerCase().trim().substring(0,1);

            System.out.println("boy : ");
            double boy = input.nextDouble();
            System.out.println("kilo : ");
            double kilo = input.nextDouble();

            Ogrenci ogrenci = new Ogrenci(isim,cinsiyet,boy,kilo);

            ogrenciler.add(ogrenci);
        }// for body

        List<Ogrenci> secilmisOgrenciler = new ArrayList<>();

        for (Ogrenci ogrenci : ogrenciler) {
            if (ogrenci.getCinsiyet().equals("k") && ogrenci.getBoy() > 1.50 && ogrenci.getKilo() > 50 && ogrenci.getKilo()<70) {
                secilmisOgrenciler.add(ogrenci);
            } // if body
            else if (ogrenci.getCinsiyet().equals("e") && ogrenci.getBoy()>1.60 && ogrenci.getKilo()>70 && ogrenci.getKilo()<90){
                secilmisOgrenciler.add(ogrenci);
            } // else if body
        } // for each body

        System.out.println("********** Kursa Secilmis Ogrenciler **********");

        if (secilmisOgrenciler.size() == 0){
            System.out.println("Malesef kurs gereksinimlerini karsilayan ogrenci bulunamadi");
        }else {
            for (Ogrenci ogrenci : secilmisOgrenciler){
                System.out.println(ogrenci.toString());
            }
        }


    }// main body
}// class body
