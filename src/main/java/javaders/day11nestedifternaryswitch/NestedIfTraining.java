package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIfTraining {

    public static void main(String[] args) {

        /*
        Example 1:  Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
        //Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
        //Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        byte age = input.nextByte();

        System.out.println("Please enter your gender");
        String gender =input.next();

        if (age<0 || age>120){
            System.out.println("Negative ages or ages greater than 120 are invalid");
        }
        else if (gender.equalsIgnoreCase("male")){

            if (age > 65){
                System.out.println("Can be retired");
            }
            else {
                System.out.println("Can not be retired");
            }
        }
        else if (gender.equalsIgnoreCase("female")){

            if (age > 60 ){
                System.out.println("Can be retired");
            }
            else {
                System.out.println("Can not be retired");
            }

        }
        else{
            System.out.println("Undefined gender");
        }





    }
}
