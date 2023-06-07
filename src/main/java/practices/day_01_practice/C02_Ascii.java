package practices.day_01_practice;

public class C02_Ascii {

    public static void main(String[] args) {

        // Rakam kullanmadan 65, 66, 67, 68, 69, 70 sayilarinin toplamını bulunuz


        //***** First Way *****//   //
        char ch = 'A';
        char ch1 = 'B';
        char ch2 = 'C';
        char ch3 = 'D';
        char ch4 = 'E';
        char ch5 = 'F';
        System.out.println(ch+ch1+ch2+ch3+ch4+ch5); // Bu sekilde de yapilan´bilir. Ama uzun olur.

        //***** Second Way *****//   // Type Casting ile çalıştırılıyoruz. Int'e cevirerek Ascii degerleri aldik.
        System.out.println((int)'A' + (int)'B' + (int)'C' + (int)'D' + (int)'E'+ (int)'F');  // Type Casting ile int yap.

        //***** Third Way *****//   // Type Casting ile çalıştı
        System.out.println('A'+ 'B' + 'C' + 'D' + 'E' + 'F'); // yada direkt yazarsan Ascii degerleri toplar.

    }//main
}//class
