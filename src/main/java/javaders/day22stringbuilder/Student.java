package javaders.day22stringbuilder;

public class Student {

    /** stdName public oldugu icin diger Class'lardan ulasilabilir. **/
    public String stdName = "Tolga Han";

    /** Access Modifier'i "default" olan ile "public" olan class member'lar ayni package icinde
     * kullanildiklarinda ayni özellikleri gösterirler.
     * Fakat farkli package'a gectiginizde, "public" olanlara ulasilabilir, ancak "default" olanlara ulasilamaz. !!!!!
     */
    int age = 23;

    /** Acces Modifier'i "private" olan Classs member'lar sadece olusturulduklari class icinden gorulebilir.
     * Olusturulduklari class'in disina ciktiginizda gorunmez, ulasilamaz olurlar. **/

    private String healthCondition = "Cancer";

    /** Acces Modifier'i "protected" olan Class member'lar ayni package icinde iken "public" gibidir. **/
    /** Farkli bir package icinde oldugunuzda "protected" olanlar sadece child class'lardan gorulebilirler. **/
    protected int salary = 5000;

    /** Note : Class'lar public ve default olabilirler, ancak private and protected olamazlar. !!!! **/




}
