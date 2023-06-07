package practices.day_14_practice;

public class Child extends Parent {

    protected void method4(){
        System.out.println("child instance method4");
    }
    public static void main(String[] args) {
        /**
        static variable'lari ve static methodlari farkli bir class'dan
        cagırabilmek icin class ismi kullanılır.
        Fakat bu iki class arasında parent child iliskisi varsa direk kullanılabilir
         */
        System.out.println(Parent.isim); // Ali
        System.out.println(isim); // Ali
        isim="Veli";
        System.out.println(isim); // Veli
        System.out.println(soyisim); // Can
        soyisim="Tan";
        System.out.println(soyisim); // Tan
        method1(); // parent static method1
        method2();  // parent static method2

        Child obj1 = new Child();
        System.out.println(obj1.yas);  // 30
        obj1.method3(); // parent instance method3
        obj1.method4(); // child instance method4

        Parent obj2 = new Parent();
        obj2.method4(); // parent instance method4
    }
}
