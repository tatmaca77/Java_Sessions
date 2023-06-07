package javaders.day24inheritancepolymorphism;

public class CarRunner {

    public static void main(String[] args) {

        //Toyota t1 = new Toyota("Prius");
        //t1.model = "Prius";
        //System.out.println("t1.model = " + t1.model);

        Honda h1 = new Honda();
        String s = "Ali";

        Volvo v1 = new Volvo();
        v1.move();   // Override ettik bu yüzden Parent'daki move methodunu degil özellestirilen child'daki move kullandi.







    }
}
