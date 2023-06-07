package javaders.day15loopsarrays;

import java.util.Arrays;

public class ArraysTraining {

    public static void main(String[] args) {

        // Example 1 : stdNames Array'indeki her ismin sonuna "*" koyarak console'a yazdiriniz.

        String[] stdNames = new String[5];

        stdNames [0] = "Tolgahan";
        stdNames [1] = "Oguzhan";
        stdNames [2] = "Aysem";
        stdNames [3] = "Selahattin";
        stdNames [4] = "Atmaca";
        System.out.println(Arrays.toString(stdNames));

        // First Way :
        for (String w : stdNames){
            System.out.println(w + "*");
        }

        // Second Way :
        for ( int i = 0; i < stdNames.length; i++){
            System.out.println(stdNames[i] + "*");
        }


        //Example 2 : Bir Integer Array olusturunuz , 5 eleman ekleyiniz, elemanlarin toplamini yazdiriniz.

        int ages[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(ages));

        int sum = 0;

        for( int w : ages){

            sum = sum + w ;

        }
        System.out.println(sum);

        //Example 3 : Bir char Array olusturunuz , 3 eleman ekleyiniz, elemanlarin carpimini yaz.

        char ch [] = new char[3];
        ch[0] = 'A';
        ch[1] = 'B';
        ch[2] = 'C';
        System.out.println(Arrays.toString(ch));

        int result = 1;

        for(int w : ch){

            result = result * w;
        }
        System.out.println(result);


        // Example 1 : grades Array'indeki en kucuk ve en buyuk grade'in toplamini yaziniz.

        int grades[] = new int[4];
        grades[0] = 90;
        grades[1] = 80;
        grades[2] = 70;
        grades[3] = 60;
        System.out.println(Arrays.toString(grades)); // [90, 80, 70, 60]

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades)); // [60, 70, 80, 90]
        System.out.println(grades[0] + grades[grades.length-1]); // 60+90 ==> 150
        System.out.println(grades[0] + grades[3]); // 60+90 ==> 150

        // Example 2 : Size verilen bir String Array'Deki isimlerden 5 karakterden az karakter icerenleri yazdiriniz.

        String[] names = {"Tolgahan", "Oguz", "Ayse", "Selo", "Atmaca"};
        System.out.println(Arrays.toString(names));

        for(String w : names){

            if (w.length() < 5){
                System.out.println(w);
            }
        }

        // Example 3 : Size verilen bir String Array'Deki isimlerden alfabetik siraya koyduktan sonra T ile baslayan
        // isimlerden onceki isimleri yazdiriniz.

        String[] names2 = new String[5];
        names2[0] = "Eyup";
        names2[1] = "Sabri";
        names2[2] = "Tuncer";
        names2[3] = "Mahmut";
        names2[4] = "Tolga";
        System.out.println(Arrays.toString(names2));

        Arrays.sort(names2);

        for(String w : names2){

            if(w.startsWith("T")){
                continue;
            }
            System.out.println(w);

        }

        // Example 4 : Size verilen bir String Array'Deki isimlerden alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden onceki isimleri ve "F" ile baslayanlari yazdiriniz.

        String [] name = {"Ahmet", "Faruk", "Ziya", "Umut", "Erdem"};

        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        for(String w : name){

            System.out.println(w);

            if (w.startsWith("F")){     // Alfabetik yaptik F ye kadar hepsini azdi F ye gelince yazdi sonra kirdi.
                break;
            }

        }

        // Example 5 : Size verilen bir String Array'Deki isimlerden alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden haric diger isimleri yazdiriniz.

        String [] name3 = {"Fatih", "Faruk", "Ziya", "Umut", "Erdem"};

        Arrays.sort(name3);
        System.out.println(Arrays.toString(name3));

        for(String w : name3){

            if(!w.startsWith("F")){                          // if (w.startsWith("F")){
                                                             //          continue;}
                System.out.println(w);                       //    else{
            }                                                // System.out.println(w);}
        }


    }
}
