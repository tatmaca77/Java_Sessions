package javaders.day37exceptions;

public class IllegalAgeException extends RuntimeException {  // extends Exception yapmadik cünkü o sadece CompileTime
    //Biz bu exception'i runtime exception yapmak istedik. Bunun icin olusturdugumuz  class'i extends keywordu
    //ile RunTimeException'in child'i yaptik.
    //Iki exception constructor olusturduk.
    // Birini mesajsiz, digerini mesajli yaptik.
    // Mesaj constructor body'si icinde ilk satirdaki super methodu icine yazildi.

    /**
     1) Eger "RunTime Custom Exception" üretmek isterseniz RunTimeException Class'a extend etmelisiniz.
     **/

    public IllegalAgeException(){
        super();
    }

    public IllegalAgeException(String message){
        super(message);
    }
}
