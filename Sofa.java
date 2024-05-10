public class Sofa implements Furniture {
    private final int basePrice;
    private final int weight;

    public Sofa(int basePrice, int weight) {
        this.basePrice = basePrice;
        this.weight = weight;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getWeight() {
        return weight;
    }
}
