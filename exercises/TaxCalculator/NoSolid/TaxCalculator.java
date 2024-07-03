package NoSolid;


public class TaxCalculator {
    public double calculateTax(String country) {
        if (country.equals("USA")) {
            // Lógica para calcular el impuesto en USA
            return 0.1;
        } else if (country.equals("UK")) {
            // Lógica para calcular el impuesto en UK
            return 0.2;
        }
        return 0;
    }
}