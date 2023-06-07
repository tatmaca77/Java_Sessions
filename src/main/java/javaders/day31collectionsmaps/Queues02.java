package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {

    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();

        line.add("Milk");
        line.add("Meat");
        line.add("Tomatoes");
        line.add("Egg");
        line.add("Orange");
        System.out.println(line); // [Egg, Meat, Tomatoes, Milk, Orange]

        // Deque ==> Double ended Queue ==> iki uclu queq
        Deque<String> d = new LinkedList<>();
        //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur

        d.add("Milk");
        d.add("Meat");
        d.add("Tomatoes");
        d.add("Egg");
        d.add("Orange");
        System.out.println("d = " + d);
        
        
    }
}
