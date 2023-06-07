package replit_questions.for_loops;

public class For_Loops_Tekrar_Eden_Karakterler {

    public static void main(String[] args) {

        /*Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

        Input :

        String str=“Javaisalsoeasy”

        Output: a s
        */

        String str = "Javaisalsoeasy";
        String result = " ";

        for (int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch) && !result.contains("" + ch)){
                result = result + ch;
            }
        }
        System.out.print(result);






    }
}
