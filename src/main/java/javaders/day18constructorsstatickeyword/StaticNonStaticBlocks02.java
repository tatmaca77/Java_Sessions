package javaders.day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){
        System.out.println("Constructor 1");
    }
    public StaticNonStaticBlocks02(int price){
        System.out.println("Constructor 2");
    }
    public StaticNonStaticBlocks02(String name){
        System.out.println("Constructor 3");
    }
    public StaticNonStaticBlocks02(boolean isOld){
        System.out.println("Constructor 4");
    }
    // non-static block constructor'larda calistirilmasi gereken ortak kodlari icerir.
    // non-static block icine yazilan kod'lar her constructor icin calistirilir.
    // Bir den fazla non-static block varsa üstteki once calisir.
    {
        System.out.println("I am Constructor - ikinci");   // Non-Static attik tekrardan kurtulmak icin. !! Her Constructor da calisir.
                                                // Calismasi gereken ortak olanlari bütün hepsinde calistirir.
    }
    {
        System.out.println("I am Constructor - ilk");
    }

    public static void main(String[] args) {

        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);
    }







}
