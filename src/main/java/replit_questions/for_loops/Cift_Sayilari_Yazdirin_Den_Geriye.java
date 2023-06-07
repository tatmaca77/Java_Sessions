package replit_questions.for_loops;

public class Cift_Sayilari_Yazdirin_Den_Geriye {

    public static void main(String[] args) {

        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT  :
100 98 96 94 92 … … … … 2 0
         */

        int number = 100;

        while (number >= 0) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
            number -= 1;
        }




    }
}
