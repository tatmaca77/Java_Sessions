package javaders.day35exceptions;

public class E03 {

    /**
      1) "try block"dan sonra coklu "catch block" kullanilabilir.
         catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
         Yani tüm Exception'larin Parent'i olan "Exception e" yoksa normal siralanabilir.
         catch block'lar arasinda parent-child iliskisi varsa child üstte olmalidir.

       2) "Exceptions Class" tüm Exception'larin Parent'idir.
           Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi sürece tek catch block'i
           "Exception Class" ile kullanabilirsiniz.

       3) "try + 1 catch" olur, "try + coklu catch" -olur, "try" tek basina kullanilamaz.
           Cocuga bu sorulari cöz deriz cocuk cözemezse ne olacagini bilmeli bize sorar cözemezsem ne olacak diye
           o sordugu kisim catch block'tur. Bu sebeple tek basina "try" kullanamayiz. !!!!!!!
       4) "try" catch olmadan kullanilabilir mi?  !!!!!!!
           "try + finally" olabilir.
     */

    public static void main(String[] args) {

        //System.out.println(convertStringToIntDivideByLength("Learn Java earn money"));
        /** Burda NumberFormatException hatasi verdi. Cünkü String icine rakamlardan olusan String girmedik. !! */
        //System.out.println(convertStringToIntDivideByLength(""));
        /** Burda NumberFormatException hatasi verdi. Cünkü String icine rakamlardan olusan String girmedik bos ici. ! */

        /** valueOf(); method'una mutlaka rakam vermeliyiz. Yoksa Exception verir. !! */

        //System.out.println(convertStringToIntDivideByLength("2"));
        /** Burda ArithmeticException verir. */

        // Yani bir method'tan 2 farkli Exception alma ihtimalimiz var. Ikisinide "Handle" etmeliyiz.
        // Yani tatile ciktiniz lastik patladi ve benzin bitti !!!!!

        System.out.println(convertStringToIntDivideByLength1("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));
        System.out.println(convertStringToIntDivideByLength3("6"));


    }

   // Example 1: Bir String'i Integer'a ceviren ve bu integer'i String'in length 'inin 1 eksigine bolen method'u olusturunuz.
    public static int convertStringToIntDivideByLength1(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result =  a / (str.length()-1);
        }catch(NumberFormatException e){
            System.out.println("Non-digit character cannot be used in valueOf()");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());  // e.getMessage() methodu teknik mesaji yazar. Yani Java nin mesaji.
        }
        return result;
    }


    public static int convertStringToIntDivideByLength2(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result =  a / (str.length()-1);
        }catch (Exception e){   // Bütün Exception'lari Handle eder. Bu yüzden özellikle Exception belirtmeye gerek yok.
            System.out.println(e.getMessage());
        }
        return result;
    }

    /** catch (Exception e) 911 gibidir her hataya kosar ve halleder. Ama Exception'lara özel mesajlar yazilmasi
     gerekiyorsa Requirement Document icinde bu sefer yalnizca Exception e kullanamam. Cünkü bu sefer her Exception
     icin ayni mesaji verir bu da yanlis olur. !!!
     Ya da her Exception icin kullaniciya mesaj ver derse Exception e kullanip e.getMessage() kullanip mesaj veririz.*/


    public static int convertStringToIntDivideByLength3(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result =  a / (str.length()-1);
        }catch (ArithmeticException e) {
            System.out.println("Jump");
        }
        catch (Exception e){  // Bu kisim yani Exception e diger bütün Exception'larin Parent'idir. Ve buyzden altta kalmali.
            System.out.println(e.getMessage()); // Exception Class'larin ismi genellestikce Parent olurlar.
        }
        return result;
    }

}
