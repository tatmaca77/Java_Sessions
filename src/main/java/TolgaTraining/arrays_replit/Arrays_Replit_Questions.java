package TolgaTraining.arrays_replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Replit_Questions {

    public static void main(String[] args) {

        /*
        Example : 1
        Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
input :
Learning java is easy
output:
maximum occurring character is : a
         */

        /*String s = "Learning java is easy";
        s = s.toLowerCase(),
        String [] yeniS = s.split(" ");
        System.out.println(Arrays.toString(yeniS));

        int maxCount = 0;
        char mostRepeatedChar = ' ';

        for (String w : yeniS) {
            for (int i = 0; i < w.length(); i++) {
                int count = 0;
                char currentChar = w.charAt(i);
                for (int j = i + 1; j < w.length(); j++) {
                    if (w.charAt(j) == currentChar) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    mostRepeatedChar = currentChar;
                }
            }
            System.out.println("En çok tekrar eden karakter: " + mostRepeatedChar);
        }*/

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        // Metindeki karakterleri küçük harfe çevirerek, büyük/küçük harf farkını yok sayıyoruz
        metin = metin.toLowerCase();

        // Her karakterin frekansını tutmak için bir dizi oluşturuyoruz
        int[] karakterFrekanslari = new int[256];

        // Metindeki her karakterin frekansını hesaplıyoruz
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            karakterFrekanslari[karakter]++;
        }

        // En fazla tekrar eden karakteri buluyoruz
        char enFazlaTekrarEdenKarakter = ' ';
        int enFazlaTekrarSayisi = 0;
        for (int i = 0; i < karakterFrekanslari.length; i++) {
            if (karakterFrekanslari[i] > enFazlaTekrarSayisi) {
                enFazlaTekrarSayisi = karakterFrekanslari[i];
                enFazlaTekrarEdenKarakter = (char) i;
            }
        }

        System.out.println("En fazla tekrar eden karakter: " + enFazlaTekrarEdenKarakter);



        String metin1 = "Learning java is easy";

        // Metindeki karakterleri küçük harfe çevirerek, büyük/küçük harf farkını yok sayıyoruz
        metin1 = metin1.toLowerCase();

        // Her karakterin frekansını tutmak için bir dizi oluşturuyoruz
        int[] karakterFrekanslari1 = new int[256];

        // Metindeki her karakterin frekansını hesaplıyoruz
        for (int i = 0; i < metin1.length(); i++) {
            char karakter1 = metin1.charAt(i);
            karakterFrekanslari1[karakter1]++;
        }

        // En fazla tekrar eden karakteri buluyoruz
        char enFazlaTekrarEdenKarakter1 = ' ';
        int enFazlaTekrarSayisi1 = 0;
        for (int i = 0; i < karakterFrekanslari1.length; i++) {
            if (karakterFrekanslari1[i] > enFazlaTekrarSayisi1) {
                enFazlaTekrarSayisi1 = karakterFrekanslari1[i];
                enFazlaTekrarEdenKarakter1 = (char) i;
            }
        }

        System.out.println("En fazla tekrar eden karakter: " + enFazlaTekrarEdenKarakter1);
    }



    }


















