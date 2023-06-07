package javaders.day25polymorphismencapsulation;

public class Runner_Training {

    public static void main(String[] args) {

        Encapsulation_Training obj1 = new Encapsulation_Training(11.5,7,9);
        obj1.powerSwitch();
        System.out.println(obj1.channelTuning(2)); // 54.89

        obj1.powerSwitch();
        System.out.println(obj1.decreaseVolume()); // 11

        obj1.powerSwitch();
       // System.out.println(obj1.width); width acc modifier'i private bu yüzden baska class'tan görünmez.

    }
}
