package replit_questions.switch_case;

import java.util.Scanner;

public class C02_Switch_Case {

    public static void main(String[] args) {

        /*
        Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leap Year)

        Sample:

          INPUT:

        Input a month number: 2

        Input a year: 2016

          OUTPUT  :

        February 2016 has 29 days
          NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month number");
        int month = input.nextInt();
        System.out.println("Please enter the year");
        int year = input.nextInt();

        switch (month){
            case 1:
                System.out.println("January " + year + "has 31 days");
                break;
            case 2:
                if (year % 4 == 0){
                    System.out.println("February " + year + " has 29 days");
                }else{
                    System.out.println("February " + year + " has 28 days");
                }
                break;
            case 3:
                System.out.println("March" + year + " has 31 days");
                break;
            case 4:
                System.out.println("April" + year + " has 30 days");
                break;
                case 5:
                    System.out.println("May" + year + "has 31 days");
                    break;
            case 6:
                System.out.println("June" + year + "has 30 days");
                break;
            case 7:
                System.out.println("July" + year + "has 31 days");
                break;
                case 8:
                    System.out.println("August" + year + "has 31 days");
                    break;
            case 9:
                System.out.println("September" + year + "has 30 days");
                break;
            case 10:
                System.out.println("October" + year + "has 30 days");
                break;
                case 11:
                    System.out.println("November" + year + "has 31 days");
                    break;
                    case 12:
                        System.out.println("December" + year + "has 31 days");
                        break;
            default :
                System.out.println("Invalid month number");



        }













    }
}
