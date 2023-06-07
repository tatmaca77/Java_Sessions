package javaders.day35exceptions;

public class E01 {

    public static void main(String[] args) {

        convertStringToInt("123");

        System.out.println(convertStringToInt("123")+2);

        System.out.println(convertStringToInt("12ab")+2); // NumberFormatException (Sayi Formati Hatasi)



    }
    // Bir String'i Integer'a ceviren method olusturunuz.
    public static int convertStringToInt(String str) {

        try {
            return Integer.valueOf(str);
        }catch(NumberFormatException e){// NumberFormatException valueof() methodu non-digit character iceren bir String ile kullanildiginda atilir.
            str = str.replaceAll("[^0-9]","");
            return Integer.valueOf(str);

            //System.out.println("Do not use non-digit characters");
            /** Requiemnet Document'a göre try-catch blocks icini yazmaliyiz. !!! */
        }
    }



}
