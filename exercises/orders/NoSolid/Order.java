package exercises.orders.NoSolid;

import java.util.List;

public class Order {
    private List<String> items;
    private double totalAmount;

    public Order(List<String> items) {
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        // Lógica para calcular el total de la orden
        return 100.0; // simplificado
    }

    public void printOrder() {
        // Lógica para imprimir la orden
    }

    public void saveToDatabase() {
        // Lógica para guardar la orden en la base de datos
    }
}