package practices.interview_questions.advance_01_practice;

import java.util.LinkedHashMap;

public class Rus_Ruleti_HashMap_Cozumu {

    public static void main(String[] args) {
        System.out.println(hm(456, 219));

    }

    public static int hm(int a, int b) {
        LinkedHashMap<Integer, Integer> hshMp = new LinkedHashMap<>();
        hshMp.put(a, b);
        do {
            a /= 2;
            b *= 2;
            hshMp.put(a, b);

        } while (a >= 1);

        int sum = 0;
        for (int w : hshMp.keySet()) {
            if (w % 2 == 1) {
                sum = sum + hshMp.get(w);
            }
        }
        return sum;
    }
}
