package javaders.day27interface;

public class CarRunner {

    public static void main(String[] args) {


        Engine.stop();  /** stop() method'u static oldugunda "interface" ismi ile ulastim. !!! **/



        //Engine e = new Engine(); interface icinde abstract method lar oldugu icin obje de yarim olur izin yoktur.

        Honda h = new Honda();

        h.eco(); /** eco() method'u static olmadigi icin (default method oldugu icin) child'dan "object" ile ulastim. !!! **/





    }
}
