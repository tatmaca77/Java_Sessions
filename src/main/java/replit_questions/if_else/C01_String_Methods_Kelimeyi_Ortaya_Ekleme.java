package replit_questions.if_else;

public class C01_String_Methods_Kelimeyi_Ortaya_Ekleme {

    public static void main(String[] args) {

        /*
        Create 2 words : name1 and name2

if the name1 has even numbers of characters,

then insert the second word in the middle of the first name

if the first word has odd numbers

Then print the “Name2 cannot be inserted in the name1”

e.g:

name1= mehmet

name2= ahmet

Print ==> mehahmetmet
         */
        String name1 = "mehmet";
        String name2 = "ahmet";
        int name1Length = name1.length();

        if (name1Length % 2 == 0) {
            int middleIndex = name1Length / 2;
            String newName = name1.substring(0, middleIndex) + name2 + name1.substring(middleIndex);
            System.out.println(newName);
        } else {
            System.out.println("Name2 cannot be inserted in the name1");
        }

        /**
         1. Adim = İlk önce, "name1" ve "name2" adında iki String değişkeni tanımlıyoruz ve "name1" değişkenine "mehmet" değerini atıyoruz:
         2.Adim = "name1" kelimesinin uzunluğunu hesaplamak için "name1.length()" fonksiyonunu kullanıyoruz ve sonucu "name1Length" değişkenine atıyoruz
         3.Adim =  "name1" kelimesinin karakter sayısına göre kontrol yapıyoruz. Eğer karakter sayısı çift ise,
                   "name2" kelimesini "name1" kelimesinin ortasına ekliyoruz. Bunun için önce "name1" kelimesinin orta karakterinin indeksini ("middleIndex") hesaplıyoruz
         4.Adim = String fonksiyonları olan "substring()" fonksiyonunu kullanarak "name1" kelimesinin ortasına "name2" kelimesini ekliyoruz.
                  "substring()" fonksiyonu, bir String'in belli bir aralığındaki karakterleri alır.
                 Örneğin, "name1.substring(0, middleIndex)" ifadesi, "name1" kelimesinin başlangıcından "middleIndex" değerine kadar olan karakterleri alır
         5.Adim = Eğer "name1" kelimesinin uzunluğu tek sayı ise, "Name2 cannot be inserted in the name1" çıktısını veriyoruz
         6.Adim = Böylece, kodumuz "name1" kelimesi çift karakter sayısına sahipse, "name2" kelimesini "name1" kelimesinin ortasına ekleyecek
                 ve yeni kelimeyi ekrana yazdıracak. Ancak, "name1" kelimesi tek karakter sayısına sahipse, "Name2 cannot be inserted in the name1" çıktısını verecek.
         **/








    }
}
