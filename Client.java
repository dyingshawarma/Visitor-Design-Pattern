public class Client {
    public static void main(String[] args) {
        Furniture[] furnitureItems = {
                new Chair(100),
                new Sofa(500, 30),
                new Table(200, 50)
        };

        ShippingCostVisitor visitor = new ShippingCostVisitorImpl();

        for (Furniture furniture : furniture
