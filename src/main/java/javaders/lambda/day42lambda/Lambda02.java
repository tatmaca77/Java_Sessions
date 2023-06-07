package javaders.lambda.day42lambda;

/** Eger tekrarlanan bir CODE var ise disarda bir method olustur ve direkt onu kullanin. Cok onemlidir. !!!!! */

import javaders.lambda.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {

    /** List olmadan Lambda kullanacagiz !!!! */

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(10, 7)); // 34
        //System.out.println(getSumInTheGivenRange(70, 10)); // bu sekilde calismaz 0 verir. start end den buyuk olamaz.
        System.out.println();
        System.out.println(getMultiplicationInTheGivenRange(7,10)); // 5040
        System.out.println();
        System.out.println(getSumOfDigitIsInTheGivenRange(45,47)); // 30


        /*
          if (starting > ending){    // SWAP islemidir bu.
            starting =  starting + ending;
            ending = starting - ending;
            starting = starting - ending;
             */
        /** Sadece bu sekilde olusturursak evet bir degisim yapilmis ancak o degisimi bize vermez bu yüzden
            bir List icine koyup return etmek zorundayiz. Yani ;

         private static void swap(int starting, int ending) {
         List<Integer> list = new ArrayList<>();
         if (starting > ending){    // SWAP islemidir bu.
         starting =  starting + ending;
         ending = starting - ending;
         starting = starting - ending;
         }
         list.add(starting);
         list.add(ending);
         return list;

         YAPMALIYIZ !!!!!!!!
         */
        }
       /* Bu method cok kez tekrar edildigi icin method olusturup methodu cagirdik.Bu sekilde daha kolay olmus olur.
        Cok fazla kod yazmamis oluruz. Bu yüzden o methodu tekrar kullaninca direkt methodun ismini cagirdik.
         */




    /** Burda range(); ve rangeClose(); methodlari kullanildiginda kullanici tarafindan starting ve ending degerleri
         yanlis yerlere koyabilir. Yani starting , ending'ten büyük olabilir. Biz bu yanlisligi ortadan kaldirmak
         icin ve o sekilde de bile code'umuzun calismasini istedigimizde bir "SWAP" kullaniriz. Yani datalrin yerlerini
         degistiririz. Ve bu methodu cok kez kullanacagim icin tekrara düsmemek adina ve okunabilirlik adina
         bu Swap methodunu List'e ekleriz ve kolaylikla kullaniriz.
         Bu sekilde yapmak dogrudur. Ayni Code'lar tekrar tekrar methodlar icinde kullanilmamalidir.
         Ve bu islemi yaparken aslinda kolaylikla method icinde method kullanilmis oluruz kolay olur.
     */

    // Swap icin bir tane private method olustur.
    private static List<Integer> swap(int starting, int ending) {
        List<Integer> list = new ArrayList<>();
        if (starting > ending){                            // SWAP islemidir bu.
            starting =  starting + ending;                 // Datalarin yerini degistirir. Tekrar tekrar kullanacaksakta
            ending = starting - ending;                    // bizi tekrarli code kullanmaktan kurtarir. !!!!!
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;

        /** Yani aslinda starting ve ending 2 farkli data'dir.
         Biz coklu datalari List icinde depolariz. !!! Bu yüzden
         List kullandik ve List icinde starting ve ending depoladik.
         */
    }

    // Example 1 : 7'den 10'a kadar tam sayilarin toplamini hesaplayan methodu olusturunuz.

    /*public static int getSum (int a, int b){
         bU sekilde yapmadik cünkü tekrar yapilabilir olmali. bu yüzden  farkli yapicaz.
         Alttaki method daha iyidir.
    }
*/
    public static int getSumInTheGivenRange(int starting, int ending) {
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0),list.get(1)).sum();
        /** Bu sekilde "swap" yapmis olduk. Bu sekilde olursa star ve ending uyumsuzlugu olursa cozmus oluruz.
            Ve disardaki methodu List'e koymustuk ve tekrarli code blogu kullanmaktan kacindik.
            Ve bize Swap yani degistirme islemini return etmis oldu yani bize göstermis oldu. */

        // IntStream bir Interface'dir. List olmadan kullanirken yaptik. Yani sayilari direkt bana stream ile akisa al dedim.
        // sinirlamasinida range method'lari ile kullaniriz. ve rangeClosed ile de sinirlama yapariz.
        // sum ile direkt toplama methodu gelir.
    }

    // Example 2 : 7'den 10'a kadar tam sayilarin carspimini hesaplayan methodu olusturunuz.
    public static int getMultiplicationInTheGivenRange(int starting, int ending) {
                                              /** List olusturmadan disarda swap methodu olusturup icerden cagirmak. */
        swap(starting, ending);

        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();

        // Burda carpma methodu range'den sonra yoktu. Bu yüzden reduce()kullandik ve icinde Math class'a gidip carpma kullandik.

    }

    // Example 3 : 45'den 47'ye kadar tamsayilarin rakamlari toplamini hesaplayan methodu olusturunuz.
    // 45 46 47 ==? 4+5+4+6+4++7 = 30
    public static int getSumOfDigitIsInTheGivenRange (int starting, int ending){

        if (starting > ending){                 /** CODE'un ilk hali  */
            starting =  starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }

        return IntStream.rangeClosed(starting, ending).map(Utils::getSumOfDigits).sum();
    }
//Aslinda burda elemanlari degistirmis oluyoruz.map kullaniriz.
    // range starting büyük oldugunda calismaz.
}






























    /*Example 1:
    Verilen sayilarin toplamini hesaplayan bir method isteniyor. Methodu int olarak olusturduk.
    Methodumuzun parametresi icine tek tek sayilari yazmamiz dogru olmaz cunku methodumuz tekrar kullanilabilir
olmali.(reuseable) Boyle olunca parametrelerimiz soruya uygun olarak soyle oldu: int starting, int ending
    verilen araliktaki sayilari toplayacagiz. Bu sekilde dinamik bir method olusturduk. Bu soruda bir listten bahsedilmiyor. Java IntStream isimli bir interface olusturmus. IntStream, integerlari bir stream icinde bize verecek.
    IntStream. yapinca methodlari gorduk. rangeClosed methodunu sectik. Cunku ilk sayi dahil, ikinci sayi haric olacak.
    method parantezi icine starting, ending yazdik.
    Boylece eger 7 ve 10 sayisi verilirse 7 dahil, 10 haric olur. Eger rangeClosed yerine range methodunu secseydik
7 haric olacakti.
    method body'si icine sirasiyla return IntStream.rangeClosed(starting, ending).sum(); yazdik.

    sum methodu ile toplama yapabildik. Main method icinde methodumuzu cagirdik ve parametre olarak sirasiyla 7,10 yazip sout ile calistirinca sonucta bize 40'i verdi.
    Example 2:
Bu soruda verilen sayilarin carpimini hesaplayan method olusturulmasi istenmis.
Yine int data type'inda methodumuz olusturduk.
Method body'si icinde sirasiyla; return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact)
.getAsInt();

getAsInt() Integer gibi al demis oluyoruz bu methodla. Main method icinde methodumuzu cagirdik, parametreler7 ve 10. Yazdirdigimizda 5040 gorduk. Kullanici 7 ve 10 yerine 70 ve 10 verseydi sonuc 0 olurdu. rangeClosed
methodu ilk sayi buyukse calismiyor. Bu durumda javaya method body'sinin basinda soyle demeliyiz:
if(starting>ending) {
statring=starting + ending;
ending=starting-ending;
starting=starting-ending;
} Bunu yaparak ilk sayi ikinciden buyukse yerlerini degistirmelerini sagladik ve rangeClosed methodu calismis oldu.
Example 3:
Bu soruda verilen sayi araligindaki sayilarin rakamlarinin toplamini hesaplayan method olusturmamiz isteniyor.
45 46 47==? 4+5+4+6+4+7=30
methdoumuz parametreleri: int starting, int ending

method icinde sirasiyle IntStream.rangeClosed(starting, ending).map(Utils::getSumOfDigits).sum();

elemanlari degistireceksek map methodunu kullaniriz. Burada sayilarin rakamlarinin toplami alinacak. Utils
class'imiza giderek sayilarin rakamlari toplamini alabilecegimiz yeni bir method olusturduk.
public static int getSumOfDigits(int a){
int sum=0;
while(a>0){
sum=sum+a%10;
a=a/10:
}
return sum;
tekrar LambdaMethodlari clasimiza donduk ve map icine Utils::getSumOfDigits) yazdik.

return sonrasi stream methodu ile elemanlar stream yapisi icinde alt alta siralandi. map icindeki methodumuz ile sayilarin rakamlari birer birer toplandi ve alt alta siralandi. Daha sonra sum methodu ile hepsi toplandi.
Methodu azdirdigimizda ekranda 30 gorduk. Ancak oncesinde rangeClosed methodunun calismama ihtimaline  karsi bir onceki soru cozumunde yazdigimiz if statement'imiz ve devamini method body'si basina yerlestirdik.
Her zaman kullanilmayan bir kodu private yapmaliyiz. swap methodumuzu(if statement olarak yazdigimiz) private yaptik. Cunku sikca kullanmadigimiz bir method. */