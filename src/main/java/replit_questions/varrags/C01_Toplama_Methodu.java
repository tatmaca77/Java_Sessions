package replit_questions.varrags;

public class C01_Toplama_Methodu {

    public static void main(String[] args) {

        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2));


    }

    public static int sum(int ... i){

        int sum = 0;
        for ( int w : i ) {
            sum = sum + w;
        }
        return sum;
    }



}
