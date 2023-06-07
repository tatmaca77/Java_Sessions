package javaders.small_study.statickeyword;

public class Counter {
    int count;
    static int stCount;
    public Counter() {
        count++;
        stCount++;
    }
    public int getCount(){
        return count;
    }
    public static int getStCount()
    { return stCount;
    }
    public static void main(String[] args) {
        Counter cs1 = new Counter();
        Counter cs2 = new Counter();
        Counter cs3 = new Counter();
        Counter cs4 = new Counter();
        Counter cs5 = new Counter();
        System.out.println("stCount is: "+ cs5.getStCount());//5;
        Counter cs6 = new Counter();
        System.out.println("count is: "+ cs1.getCount());//1
        System.out.println("count is: "+ cs2.getCount());//1
        System.out.println("count is: "+ cs6.getCount());//1
        System.out.println("stCount is: "+ cs6.getStCount());//6
        System.out.println("stCount is: "+ cs1.getStCount());//6
        System.out.println("stCount is: "+ cs2.getStCount());//6
    }
}
