package javaders.day36exceptions;

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

    /**
      1) Run Button'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
         * "Aritmetic Exception" * "NullPointerException" * "NumberFormatException" * "ArrayIndexOutOfBoundsException"
         *StringIndexOutOfBoundsException'lar "Runtime Exception" a örnektir.
         "Runtime Exception" lara "Unchecked Exception" da denir.

      2) Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir. bunlara "Compile Time Exception" denir.
         * "FileNotFoundException" * "IOException"  "Compile Time Exception" a örnektir.
         "Compile Time Exception" lara "Checked Exception" da denir.

      3) FileNotFoundException(Dosya bulunamadi hatasi): Java'ya bir dosyayi bul dedigimizde, Java "dosyanin adresi" ve
         "dosyanin varligi" konusunda hata olusursa ne yapmasi gerektigini söylemenizi ister.

      4) IOException: "IO" Input Output demektir.
                      Note: "IOException", "FileNotFoundException" nin parent'idir.

      5) Java da hata'lar temelde 2 ye ayrilir:
         i) Exceptions              ii) Errors : a) StackOverflow Error b) Out Of Memory Error(Heap Memory ile alakali)
                                                 c) Virtual Machine Error
          Handle edilebilir    AMA    Erorrs asla handle edilemezler.
     **/

    public static void main(String[] args) throws IOException {

        /** 1.WAY : Exception'i method sognature satirina ekledik. */
        FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exceptions/TextFile");

        int i = 0;

        while((i = fis.read())!= -1){  //read(); karakterlerin Ascii degerlerini verir.Bütün TextFile icindeki okumasi icin loop kullan.

            System.out.print((char)i); // Ascii egeri char'a cevirdik.
        }



    }


}

