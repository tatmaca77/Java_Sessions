package practices.interview_questions.advance_05_practice;

public class MenuItem {//menu secenekleri
    //Yiyeceklerin kodu, ismi ve ücreti olsun.

    private int code;
    private String name;                 // Variable'lar
    private  double price;

    public MenuItem() {          // default Construector

    }

    public MenuItem(int code, String name, double price) {  // Parametreli ( Custom Constructor )
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }
    public String getName() {            // Getter'lar
        return name;
    }
    public double getPrice() {
        return price;
    }
}
