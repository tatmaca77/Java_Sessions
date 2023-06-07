package javaders.day24inheritancepolymorphism;

public class Toyota extends Car {

    public void hybrid(){
        System.out.println("Toyota uses hybrid engine...");
    }
    public Toyota () {
        System.out.println("Toyota constructor 1");
    }
    public Toyota (String s){
        super(5);
        System.out.println("Toyota constructor 2");
    }

}
