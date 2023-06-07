package introduction.day02datatypesmethodcreation;

public class MethodCreatin01tekrar {


    public static void main(String[] args) {

        int sonuc = messiGoalsRonaldoGoals(988,981) ;
        System.out.println("sonuc = " + sonuc);
        
        double cubeSonuc = getCube(81);
        System.out.println("cubeSonuc = " + cubeSonuc);

        capitalCity("ANKARA");



    }

    public static int messiGoalsRonaldoGoals( int d, int e  ){ return d+e; }


    // Verilen bir ondalikli sayinin küpünü hesaplayan method olusturup kullaniniz.
    private static double getCube (double v){ return v*v*v ;}


    // Bir kelimelik method olusturunuz. Ve onu yazdiriniz. Ve kelimenin3.harfinide kullanip yazdirin.
    public static void capitalCity (String str){System.out.println(str);}



    
    
}


