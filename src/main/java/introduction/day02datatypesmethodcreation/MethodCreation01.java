package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
   /*
   javada method nasil olusturulur.

   1)main method'un disinda olusturulur.
   2)Access Modifier + Return Type + Method ismi + ( ) + {}
                    (static) eger methodu main methoda uygulayacaksan kullan.
   Olusturulan methodlar nasil kullanilir ?
   1)main method'un icinden kullanilir.
   2)methodun ismi + ( ) yazin
   3)islem yapacaginiz parametler parantezin icine koyulur.
   == main method static oldugu icin main method icerisinde kullanacaginiz her sey static olmalidir.
*/
   public static void main(String[] args) {
      int sonuc = toplamaYap(30, 60 );
      System.out.println(sonuc);

      long carpmaSonuc = multiply(3 ,5) ;
       System.out.println(carpmaSonuc);


       int ucluSonuc = firstTwoMultiplyThirdAdd(2 ,5 ,8 ) ;
       System.out.println(ucluSonuc);

       double resultCube = getCube(5) ;
       System.out.println(resultCube);

       print("Hello World");
       
       int result = onceToplaSonraCikartSonraCarpSonraBol (8, 9, 10, 2, 3);
       System.out.println("result = " + result);


   }

   //Ornek 1 : toplama islemi yapan bir method olusturunuz.
    public static int toplamaYap (int a , int b) {
      return a+b ;
   }

    //Ornek 2 : sayiyi carpma islemi yapan bir method olusturunuz.
    protected static long multiply(int a, int b) {
     return a*b;
    }


    //Ornek 3 : Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c ) {
       return a*b+c ;

    }

    //Ornek 4 : Verilen bir ondalikli sayinin küpünü hesaplayan method olusturup kullaniniz.
    //Note : Access Modifier'i eger default yapmak isterseniz access modifier yazmayiniz. Yani default yazmana gerek yok.

    static double getCube(double a ){
       return a*a*a ;
   }

   //Ornek 5 : Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    //Note : return type void oldugunda keyword kullanilmaz.
    public static void print(String str){
        System.out.println(str);
    }
    
    
    public static int onceToplaSonraCikartSonraCarpSonraBol(int a, int b, int c, int d, int e){return a+b-c/d*e ; }

}



