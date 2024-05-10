public class Table implements Furniture {
    private final int basePrice;
    private final int dimensions;

    public Table(int basePrice, int dimensions) {
        this.basePrice = basePrice;
        this.dimensions = dimensions;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getDimensions() {
        return dimensions;
    }
}
