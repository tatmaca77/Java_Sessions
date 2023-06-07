package javaders.day37exceptions;

public class IllegalGradeException extends Exception { // Bu sekilde kendimiz bir Exception olustururuz.

    /**
     1) Custom Exception Class (Kendimiz olusturursak yani kendi olusturdugumuz hersey Custom dir)
        olusturmak icin Exception Class'a extend etmeliyiz.
        Exception Class'a extend ederek olusturdugunuz Exception, "Compile Time Exception(checked)" olur.

     2) Custom Exception Class olustururken "constructor" olusturmalisniz. Bu "Constructor" parent'daki
        constructor'i cagirmalidir. Bu "Constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir.

     3) "Custom Exception Class" olusturdugunuzda ismin sonunda "Exception" kelimesini mutlaka kullanmalisniz. !
         IllegalGradeException 'da oldugu gibi.
     */

    public IllegalGradeException(String message){           // Constructor olusturduk. Return type olmaz !!
        super(message);
    }
    public IllegalGradeException(){                        // Class'larin icinde bir den fazla Constructor olabilir.
        super();
    }

}
