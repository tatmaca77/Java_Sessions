package javaders.day29collections;

// INTERVIEW da Collections anlattirirlar. !!!!!

import java.util.LinkedList;

public class LinkedList01 {

    /**
       1) LinkedList'ler "node" silme ve eklemede cok basarili olduklari icin silme ve ekleme islemlerini coklukla
          yapacaginiz zaman "LinkedList" kullaniniz.
       2) ArrayList'ler index'leri adres gibi kullanir. Bu yüzden ArrayList'ler "search" islemlerinde cok 
          basarilidirlar.
       Note: Ihtiyaciniz olan Collection cogunlukla silme ve ekleme islemleri yapacaksa "Müze Ziyaretcileri" gibi
          "LinkedList" , search islemleri yapacaksa "Amerika Eyaletleri" gibi "ArrayList" kullaniniz.
     **/
    
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();

        s.add("Tolga");
        s.add("Steve");
        s.add("Ajda");
        s.add("Müge");
        s.add("Cüneyt");
        s.add("Tolga");
        s.add(2,"Mahmut"); 
        s.addFirst("Ayse"); 
        s.addLast("Selahattin");
        System.out.println("s = " + s); // [Ayse, Steve, Ajda, Mahmut, Müge, Cüneyt, Tolga, Selahattin]
        
        //s.remove(2);
        System.out.println("s = " + s);
        
        //s.remove("Mahmut");
        System.out.println("s = " + s);

        //s.remove();  // icine bir sey yazmazsan ilk elemani siler.
        System.out.println("s = " + s); // [Steve, Müge, Cüneyt, Tolga, Selahattin]
        
        //s.removeFirstOccurrence("Tolga"); // Ilk görülen Tolga silindi.
        System.out.println("s = " + s); 
        
        //s.removeLastOccurrence("Tolga");
        System.out.println("s = " + s); // en son gördügü Tolga da silindi.


        /**
         Retrieves, but does not remove, the head (first element) of this list.
         Returns:
         the head of this list, or null if this list is empty  ( ama list bos oldugunda null verir. )
         **/
        String r1 = s.peek(); // Bu method size ilk elemani(node) getirir ama silmez. (copy+ paste)
        System.out.println("r1 = " + r1); // Ayse
        System.out.println(s); // [Ayse, Tolga, Steve, Mahmut, Ajda, Müge, Cüneyt, Tolga, Selahattin]


        /**
         Retrieves and removes the head (first element) of this list.
         Returns: the head of this list, or null if this list is empty  ( list bos ise null verir )
         */
        String r2 = s.poll();   // Ilk elemani(node) verir ve sonra list'den siler . ( cut+ paste)
        System.out.println("r2 = " + r2);
        System.out.println(s);  // [Tolga, Steve, Mahmut, Ajda, Müge, Cüneyt, Tolga, Selahattin]

        /**
         Retrieves, but does not remove, the first element of this list.
         Throws: NoSuchElementException – if this list is empty   ( eger List bossa hata verir.)
         Note : peek() ile element() ikiside ilk elemani silmeden size verir. Ama peek() List bos oldugunda
               size "null" verir, element() ise hata verir.
         **/
        String r3 = s.element();  // peek ile aynidir. Ilk elemani verir ve silmez.
        System.out.println("r3 = " + r3);  // Ilk elemani verdi. Tolga
        System.out.println(s);  // Tolga'yi silmedi direkt verdi.


        /**
          Removes and returns the first element of this list.
         This method is equivalent to removeFirst().
         Returns: the element at the front of this list (which is the top of the stack represented by this list)
         Throws:NoSuchElementException – if this list is empty  ( eger list bos ise hata verir. )
         ( ilk elemani verir ve siler. ( cut +paste )
         Note : poll() ile pop() ikiside ilk elemani siler size verir. Ama poll() List bos oldugunda
         size "null" verir, pop() ise hata verir.
         */
        String r4 = s.pop();
        System.out.println("r4 = " + r4); // Tolga
        System.out.println(s); // [Steve, Mahmut, Ajda, Müge, Cüneyt, Tolga, Selahattin]

    }
}
