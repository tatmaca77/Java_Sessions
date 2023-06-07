package javaders.day38enumsiterators;

import java.util.Arrays;

public enum UsStatesEnum {

    /**
      Enum'lar hic bir zaman degismeyecek olan data'lari depolamak icin kullanilir. Mesela Gün Isimleri. Ay isimleri de
      Amerika'daki eyalet isimleri de hepsini "Enum" icine depolariz.
      Cünkü bunu App kendi basina ayakta durmasi gerekir. (Stand Alone) olmalidir. Herseyi Google'a baglamayiz.
      Google batarsa ne olcak o yüzden saglam data'lar icin Enum icine koymaliyiz.

     Eyaletin bilgileri icin bir "variable" olusturulur ve bu yüzden final keyword kullaniriz. !!!

     Parantez icine kac tane data ve bilgi koyarsaniz her birisi icin variable olusturmaliyim. !!!!

     final yaptigimiz icin getter olustururuz, setter olusturamayiz yani degistirilemez final oldugu icin.

     **** final variable" lar degistirelemez. !!!!!!

     Degismeyen sabit data isimleri her zaman büyük harfle yazilir.
     */

    ALABAMA("Alabama","AL", "Montgomery"),   // virgül koyup herseyi istedigin her bilgisi eklersin nüfus vs...
    ALASKA("Alaska","AK", "Juneau"),
    AMERICAN_SAMOA("American Samoa", "AS", "Pago Pago"),
    ARIZONA("Arizona", "AZ", "Phoenix"),
    ARKANSAS("Arkansas", "AR", "Little Rock"),
    CALIFORNIA("California", "CA", "Sacramento"),
    COLORADO("Colorado", "CO", "Denver"),
    CONNECTICUT("Connecticut", "CT", "Hartford"),
    DELAWARE("Delaware", "DE", "Dover"),
    DISTRICT_OF_COLUMBIA("District of Columbia", "DC", "Washington"),
    FLORIDA("Florida", "FL", "Tallahassee"),
    GEORGIA("Georgia", "GA", "Atlanta"),
    GUAM("Guam", "GU", "Hagatna"),
    HAWAII("Hawaii", "HI", "Honolulu"),
    IDAHO("Idaho", "ID", "Boise"),
    ILLINOIS("Illinois", "IL", "Springfield"),
    INDIANA("Indiana", "IN", "Indianapolis"),
    IOWA("Iowa", "IA", "Des Moines"),
    KANSAS("Kansas", "KS", "Topeka"),
    KENTUCKY("Kentucky", "KY", "Frankfort"),
    LOUISIANA("Louisiana", "LA", "Baton Rouge"),
    MAINE("Maine", "ME", "Augusta"),
    MARSHALL_ISLANDS("Marshall Islands", "", "Majuro"),
    MARYLAND("Maryland", "MD", "Annapolis"),
    MASSACHUSETTS("Massachusetts", "MA", "Boston"),
    MICHIGAN("Michigan", "MI", "Lansing"),
    MINNESOTA("Minnesota", "MN", "Saint Paul"),
    MISSISSIPPI("Mississippi", "MS", "Jackson"),
    MISSOURI("Missouri", "MO", "Jefferson City"),
    MONTANA("Montana", "MT", "Helena"),
    NEBRASKA("Nebraska", "NE", "Lincoln"),
    NEVADA("Nevada", "NV", "Carson City"),
    NEW_HAMPSHIRE("New Hampshire", "NH", "Concord"),
    NEW_JERSEY("New Jersey", "NJ", "Trenton"),
    NEW_MEXICO("New Mexico", "NM", "Santa Fe"),
    NEW_YORK("New York", "NY", "Albany"),
    NORTH_CAROLINA("North Carolina", "NC", "Raleigh"),
    NORTH_DAKOTA("North Dakota", "ND", "Bismarck"),
    NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands", "MP", "Saipan"),
    OHIO("Ohio", "OH", "Columbus"),
    OKLAHOMA("Oklahoma", "OK", "Oklahoma City"),
    OREGON("Oregon", "OR", "Salem"),
    PENNSYLVANIA("Pennsylvania", "PA", "Harrisburg"),
    PUERTO_RICO("Puerto Rico", "PR", "San Juan"),
    RHODE_ISLAND("Rhode Island", "RI","Providence"),
    SOUTH_CAROLINA("South Carolina", "SC", "Columbia"),
    SOUTH_DAKOTA("South Dakota", "SD", "Pierre"),
    TENNESSEE("Tennessee", "TN", "Nashville"),
    TEXAS("Texas", "TX", "Austin"),
    US_VIRGIN_ISLANDS("US Virgin Islands", "VI", "Charlotte Amalie"),
    UTAH("Utah", "UT", "Salt Lake City"),
    VERMONT("Vermont", "VT", "Montpelier"),
    VIRGINIA("Virginia", "VA", "Richmond"),
    WASHINGTON("Washington", "WA", "Olympia"),
    WEST_VIRGINIA("West Virginia", "WV", "Charleston"),
    WISCONSIN("Wisconsin", "WI", "Madison"),
    WYOMING("Wyoming", "WY", "Cheyenne");

    private final String stateName;
    private final String abbreviation;               // Variable'lar olmali !!!
    private final String capital;

    UsStatesEnum(String stateName, String abbreviation, String capital) {  // Constructor olmali !!!
        this.stateName = stateName;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getStateName() {  // Getter'lar mutlaka olmali !!!!
        return stateName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }      // Getter olmali !!!!

    public String getCapital() {
        return capital;
    }

    /** Enum isimiyle detaylara ulasabilmem icin static yaptik methodu . */
    //State kisaltmasini verince state'in ismini veren method
    public static String getStateNameByUsingAbbreviation(String abbreviation){ // Ihtiyacimiz olan method !!!!!
        return Arrays.stream(values())
                .filter(usState -> usState.getAbbreviation().equals(abbreviation))
                .findFirst().get().getStateName(); // Return den itibaren olan code Lambda code'dur.
    }

    //State ismini verince state'in kisaltmasini veren method
    public static String getAbbreviationForStateName(String stateName) {  // Ihtiyacimiz olan method !!!!!
        return Arrays.stream(values())
                .filter(usState -> usState.getStateName().equals(stateName))
                .findFirst().get().getAbbreviation();
    }
    // Eger ilerde baskent isim , isim baskent bilgisine ihtiyacimiz olursa olusturabilir cok kolayca..
    // static yaptik cünkü methodlara "Enum" ismi ile ulasiyoruz. !!!!
}