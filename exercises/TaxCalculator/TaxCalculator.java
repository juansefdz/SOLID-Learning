public class TaxCalculator {

    private final TaxStrategy taxStrategy;

    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        return this.taxStrategy.calculateTax();
    }

}