package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

//Queue ==> Ilk giren urun ilk cikmalidir.  First In First Out .Bankalardaki numaralandirma sistemi bu sekildedir.

public class Queues01 {

    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println("wareHouse = " + wareHouse); // [Milk, Meat, Bread, Egg, Cheese]
        
        wareHouse.remove(); // First Out yapti. Ilk eleman gitti.
        System.out.println("wareHouse = " + wareHouse); //  [Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek()); // Meat  -- Ilk elemani silmeden verir.
        System.out.println(wareHouse); // [Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element()); // Meat
        System.out.println(wareHouse); // [Meat, Bread, Egg, Cheese]    -- Eger List bos olsaydi hata verirdi.

        System.out.println(wareHouse.poll()); // Meat    -- Ilk elemani verdi ve sildi.
        System.out.println(wareHouse); // [Bread, Egg, Cheese]

        /** Burda List icini bosalttim **/
        wareHouse.clear();

        /** Bos List icinde poll = null verdi, remove = hata verdi **/
        System.out.println(wareHouse.poll()); // null
        System.out.println(wareHouse.remove()); // Hata verir. Exception





    }
}
