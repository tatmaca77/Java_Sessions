package javaders.day34exceptions;

public class E02 {

    public static void main(String[] args) {

        String a[] = {"A", "V", "A", "J"};
        System.out.println(getElement(a,3));
        System.out.println(getElement(a,1));
        System.out.println(getElement(a,4));
        System.out.println(getElement(a,2));

        System.out.println(getElement(a,6));
        System.out.println(getElement(a,-3));

        // Hata Raporu = ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4




    }

    // Bir String Array'den istenilen bir elemani eleman sirasi ile alan method olusturunuz.
    public static String getElement(String[] a, int numOfElement) {

        // return a[numOfElement-1]; // index kullanildigi icin -1 dedik yani verdigim indexi alabilmek icin -1.
        String result = "";
        try {
            result = a[numOfElement - 1];
        }catch(ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException array islemlerinde olmayan index kullanildiginda atilir.

            if (numOfElement - 1 < 0) {
                result = a[0];
            } else {
                result = a[a.length - 1];
            }
        }
        return result;

    }

}
