package javaders.day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02HesapMakinesi {

    public static void main(String[] args) {

            // Example 1 : +, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
            //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */
            Scanner input = new Scanner(System.in);
            System.out.println("To stop calculation press 'q' ");
            char opr = ' ';

            do {
                System.out.println("Please enter the operation among +, -, *, /, %");
                opr = input.next().toLowerCase().charAt(0);

                if (opr == 'q') {
                    System.out.println("See you again");
                    break;
                }
                boolean r = opr == '+' || opr== '-' || opr== '*' || opr== '/' || opr== '%';
                if(!r){
                    System.out.println("Undefined operation");
                    break;
                }
                System.out.println("Enter the first number");
                int n1 = input.nextInt();

                System.out.println("Enter the second number");
                int n2 = input.nextInt();

                switch (opr) {
                    case '+':
                        System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                        break;
                    case '-':
                        System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                        break;
                    case '*':
                        System.out.println(n1 + "x" + n2 + "=" + (n1 * n2));
                        break;
                    case '/':
                        System.out.println(n1 + ":" + n2 + "=" + (n1 / n2));
                        break;
                    case '%':
                        System.out.println(n1 + "%" + n2 + "=" + (n1 * n2) / 100);
                        break;
                }

            } while (true);


        }
    }

