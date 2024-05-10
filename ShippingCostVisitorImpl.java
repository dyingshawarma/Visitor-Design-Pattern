public class ShippingCostVisitorImpl implements ShippingCostVisitor {

    @Override
    public int visit(Chair chair) {
        int basePrice = chair.getBasePrice();
        // Apply flat shipping rate for chairs
        return basePrice + 50;
    }

    @Override
    public int visit(Sofa sofa) {
        int basePrice = sofa.getBasePrice();
        int weight = sofa.getWeight();
        // Apply distance-based shipping cost calculation for sofas
        return basePrice + weight * 2;
    }

    @Override
    public int visit(Table table) {
        int basePrice = table.getBasePrice();
        int dimensions = table.getDimensions();
        // Apply volume-based shipping cost calculation for tables
        return basePrice + dimensions * dimensions * dimensions;
    }
}
