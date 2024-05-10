public class Chair implements Furniture {
    private final int basePrice;

    public Chair(int basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }

    public int getBasePrice() {
        return basePrice;
    }
}
