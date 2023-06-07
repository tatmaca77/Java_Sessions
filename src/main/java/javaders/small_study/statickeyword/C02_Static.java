package javaders.small_study.statickeyword;

public class C02_Static {
    //soru2) assagidaki classlar calistirildiginda ne olur inceleyelim
    int x;
    static int y;
    C02_Static (int i){
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        new C02_Static(2);
        C02_Static dnm=new C02_Static(3);
        System.out.println(dnm.x+","+dnm.y);
        C02_Static dnm2=new C02_Static(7);
        System.out.println(dnm2.x+","+dnm2.y);
    }
}
