package practices.interview_questions.advance_05_practice;

import java.util.HashMap;

public class Order {

    private static int orderCount = 1000; // siparisin sayaci -- static yaptik cünkü bütün herkes icin gorunmesi icin.Ay
    private int orderCode;//siparis kodu  -- bir kez olusturulsun diye orderCode static yapilmadi !!!!!!
    private HashMap<MenuItem, Integer> items = new HashMap<>();
    // items HashMapin icinde(pizza,2 adet)
    private double totalAmount = 0;

    public Order() {
        orderCode = orderCount++;
    }

    public void addItem( MenuItem item,int adet){
        items.put(item,adet);//items secenekler HashMap'ine arguman olarak verilen item secenek eklenir
        totalAmount +=item.getPrice()*adet;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {
        //yiyecekler ve kacar adet siparis verildigi bilgisi var
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
