package practices.day_13_practice;

public class C02_StaticKeyword {

    // Bu Class calistiginda output ne olur ve calisma mantigi nedir

    static int y;

    int x;

    public C02_StaticKeyword(int i) {  // Class icinde Parametreli Constructor olunca "default constructor" kullandirmaz.
        x+=i;
        y+=i;
    }

    public static void main(String[] args) {

        C02_StaticKeyword obj1 = new C02_StaticKeyword(2);

        C02_StaticKeyword obj2 = new C02_StaticKeyword(3);

        System.out.println(obj1.x + ", " + obj2.x + ", " + obj2.y); // 2, 3, 5





    }


}
