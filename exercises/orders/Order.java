package exercises.orders;

import java.util.List;

public class Order {
    private List<String> items;
    private double totalAmount;

    public Order(List<String> items) {
        this.items = items;
    }
    public List<String> getItems() {
        return items;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
   
    
}
