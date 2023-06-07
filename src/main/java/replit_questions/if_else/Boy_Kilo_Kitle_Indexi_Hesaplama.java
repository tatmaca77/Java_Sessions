package replit_questions.if_else;

import java.util.Scanner;

public class Boy_Kilo_Kitle_Indexi_Hesaplama {

    public static void main(String[] args) {

        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)


BMI 18,5'in altındaysa zayıfsınız

BMI 18,5 ile 25 arasında ise kilonuz idealdir

BMI 25-30 arasındaysa şişmansınız

BMI 30'dan büyük veya eşitse, obez


Input:

Output:

Agirlik : 71

Boy : 1.72

BMI : 23.99945916711736

Zayifsiniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight");
        int weight = input.nextInt();
        System.out.println("Please enter your height");
        double height = input.nextDouble();

        double bmi = weight / (height*height);
        System.out.println("Agirlik: " + weight);
        System.out.println("Boy: " + height);
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5){
            System.out.println("Zayifsiniz");
        }else if (bmi > 18.5 && bmi < 25){
            System.out.println("Kilonuz idealdir");
        }else if (bmi > 25 && bmi < 30){
            System.out.println("şişmansınız");
        }else if (bmi >= 30){
            System.out.println("Obez");
        }




    }
}
