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
    public class CalculateTotal {
        private double calculateTotal() {
            // Lógica para calcular el total de la orden
            return 100;
        }
    }
    public class OrderPrinter {
        public void printOrder() {
            // Lógica para imprimir la orden
        }
    
    }
    public class SaveToDatabase {
        public void saveToDatabase (){
            // Lógica para guardar la orden en la base de datos
    
        }
    
    }
    
}
