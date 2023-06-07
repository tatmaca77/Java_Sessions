package javaders.day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {


        // Google gibi Vikipedi gibi istedigimiz bilgiyi direkt bize verir. !!!
        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois); // Springfield
        
        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println("abbreviationOfFlorida = " + abbreviationOfFlorida); // FL

        System.out.println(UsStatesEnum.ALASKA); // get vermeden böyle yaparsak direkt büyk harfli verir ALASKA

        //Normalde Alaska String gibi duruyor ancak onu String yapinca kizardi.
        // Variable tipini degistirme uyarisini sectik
        //ve duzeldi. String yerine enum'in ismi yazildi. Ornek: UsStatesEnum state=UsStatesEnum.Alaska
        UsStatesEnum state = UsStatesEnum.ALASKA; // Hata mesajinin verdigi düzeltmeyi kullan !!!!
        System.out.println(state);// ALASKA

        String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName); // Alaska

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska); // AK

    }
}
